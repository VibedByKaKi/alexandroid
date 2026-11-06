package com.amazon.deecomms.remoteConfig;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.api.metrics.TimerMetric;
import com.amazon.deecomms.auth.Stage;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.receiver.CommsConnectivityMonitor;
import com.amazon.deecomms.common.service.CommsJobIntentService;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;
import com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback;
import com.amazonaws.mobileconnectors.remoteconfiguration.RemoteConfigurationManager;
import com.google.common.base.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConfigurationSyncService extends CommsJobIntentService {
    public static final String ACTION_SYNC_CONFIG = "com.amazon.remoteconfig.demo.action.SYNC_CONFIG";
    public static final String EXTRA_RETRY_ATTEMPT = "com.amazon.deecomms.receiver.SYNC_RETRY_ATTEMPT";
    public static final String PREF_LAST_SUCCESSFUL_SYNC = "com.amazon.deecomms.pref.LAST_SUCCESSFUL_SYNC";
    public static final String PREF_LAST_SYNC_ATTEMPT = "com.amazon.deecomms.pref.LAST_SYNC_ATTEMPT";
    private static final String SUCCESSFUL_MODIFIED = "successful_modified";
    private static final String SUCCESSFUL_UNMODIFIED = "successful_unmodified";

    @Inject
    CommsConnectivityMonitor commsConnectivityMonitor;

    @Inject
    Stage stage;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ConfigurationSyncService.class);
    private static final int JOB_ID = CommsJobIntentService.generateJobId(ConfigurationSyncService.class);
    private static final AtomicBoolean mJobRunning = new AtomicBoolean(false);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SyncServiceConfigurationCallback implements ConfigurationSyncCallback {
        private final int mAttemptNumber;
        private final Context mContext;
        final CountDownLatch mLatch;
        private final int mMaxAttempts;

        public SyncServiceConfigurationCallback(@NonNull Context context, @NonNull CountDownLatch countDownLatch, int i, int i2) {
            Preconditions.checkNotNull(context, "The Context may not be null.");
            Preconditions.checkNotNull(countDownLatch, "The CountDownLatch may not be null");
            this.mContext = context.getApplicationContext();
            this.mLatch = countDownLatch;
            this.mAttemptNumber = i;
            this.mMaxAttempts = i2;
        }

        @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
        public void onConfigurationModified(Configuration configuration) {
            ConfigurationSyncService.LOG.i("Configuration was modified");
            ConfigurationSyncService.registerLastSyncTime(this.mContext, true);
            PeriodicConfigSyncUtils.updatePeriodicConfigSyncingSchedule(this.mContext);
            this.mLatch.countDown();
            ConfigurationSyncService.stopArcusLatencyTimer();
            ConfigurationSyncService.recordSyncMetric(0.0d, 0.0d, 0.0d, ConfigurationSyncService.SUCCESSFUL_MODIFIED, null);
        }

        @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
        public void onConfigurationUnmodified(Configuration configuration) {
            ConfigurationSyncService.LOG.i("Configuration has not been modified on the server");
            ConfigurationSyncService.registerLastSyncTime(this.mContext, true);
            this.mLatch.countDown();
            ConfigurationSyncService.stopArcusLatencyTimer();
            ConfigurationSyncService.recordSyncMetric(0.0d, 0.0d, 0.0d, ConfigurationSyncService.SUCCESSFUL_UNMODIFIED, null);
        }

        @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
        public void onFailure(Exception exc) {
            ConfigurationSyncService.LOG.i("Failure to sync configuration", exc);
            ConfigurationSyncService.registerLastSyncTime(this.mContext, false);
            ConfigurationSyncService.scheduleSyncRetry(this.mContext, this.mAttemptNumber, this.mMaxAttempts);
            this.mLatch.countDown();
            ConfigurationSyncService.stopArcusLatencyTimer();
            ConfigurationSyncService.recordSyncMetric(0.0d, 1.0d, 0.0d, "error", " " + exc + " cause: " + exc.getCause());
        }

        @Override // com.amazonaws.mobileconnectors.remoteconfiguration.ConfigurationSyncCallback
        public void onThrottle(long j) {
            ConfigurationSyncService.LOG.i("Configuration Sync request was throttled");
            ConfigurationSyncService.registerLastSyncTime(this.mContext, false);
            ConfigurationSyncService.scheduleSyncRetry(this.mContext, this.mAttemptNumber, this.mMaxAttempts);
            this.mLatch.countDown();
            ConfigurationSyncService.stopArcusLatencyTimer();
            ConfigurationSyncService.recordSyncMetric(1.0d, 0.0d, 0.0d, null, null);
        }
    }

    public ConfigurationSyncService() {
        CommsDaggerWrapper.getComponent().inject(this);
    }

    private static boolean arcusSyncRequired() {
        ArcusConfig arcusConfig = CommsDaggerWrapper.getComponent().getArcusConfig();
        Context context = CommsDaggerWrapper.getComponent().getContext();
        long intValue = arcusConfig.getConfigInteger(RemoteConfigKeys.ARCUS_SYNC_RETRY_INTERVAL_MILLISEC).intValue();
        long intValue2 = arcusConfig.getConfigInteger(RemoteConfigKeys.ARCUS_SYNC_REPEAT_INTERVAL_MILLISEC).intValue();
        boolean isLastAttemptSyncCurrent = isLastAttemptSyncCurrent(context, intValue);
        boolean isLastSuccessfulSyncCurrent = isLastSuccessfulSyncCurrent(context, intValue2);
        CommsLogger commsLogger = LOG;
        commsLogger.i("lastAttemptedSyncIsRecent " + isLastAttemptSyncCurrent);
        commsLogger.i("lastSuccessfulSyncIsRecent " + isLastSuccessfulSyncCurrent);
        return (isLastAttemptSyncCurrent || isLastSuccessfulSyncCurrent) ? false : true;
    }

    public static synchronized void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        synchronized (ConfigurationSyncService.class) {
            if (!arcusSyncRequired()) {
                LOG.i("Configuration Sync Service work not enqueued, Configuration Sync was recently completed.");
                return;
            }
            if (!mJobRunning.compareAndSet(false, true)) {
                LOG.i("Configuration Sync Service work not enqueued, job is already running.");
                return;
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            int size = jobScheduler.getAllPendingJobs().size();
            LOG.d("Number of scheduled jobs: " + size);
            if (size >= 99) {
                jobScheduler.cancelAll();
            }
            JobIntentService.enqueueWork(context, (Class<?>) ConfigurationSyncService.class, JOB_ID, intent);
        }
    }

    private static boolean isLastAttemptSyncCurrent(Context context, long j) {
        boolean z = j > System.currentTimeMillis() - PreferenceManager.getDefaultSharedPreferences(context).getLong(PREF_LAST_SYNC_ATTEMPT, 0L);
        LOG.d("Last sync attempt is still recent: " + z);
        return z;
    }

    private static boolean isLastSuccessfulSyncCurrent(Context context, long j) {
        boolean z = j > System.currentTimeMillis() - PreferenceManager.getDefaultSharedPreferences(context).getLong(PREF_LAST_SUCCESSFUL_SYNC, 0L);
        LOG.d("Last successful sync is still current: " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recordSyncMetric(double d, double d2, double d3, @Nullable String str, @Nullable String str2) {
        CounterMetric generateClickstream = CounterMetric.generateClickstream(MetricKeys.ARCUS_LOAD_CANCEL);
        CounterMetric generateClickstream2 = CounterMetric.generateClickstream(MetricKeys.ARCUS_LOAD_FAIL);
        CounterMetric generateClickstream3 = CounterMetric.generateClickstream(MetricKeys.ARCUS_LOAD_NETWORK);
        if (str != null) {
            generateClickstream.getMetadata().put("source", str);
            generateClickstream2.getMetadata().put("source", str);
            generateClickstream3.getMetadata().put("source", str);
        }
        if (str2 != null) {
            generateClickstream.getMetadata().put("errorSource", str2);
            generateClickstream2.getMetadata().put("errorSource", str2);
            generateClickstream3.getMetadata().put("errorSource", str2);
        }
        MetricsHelper.recordCounterMetric(generateClickstream, Double.valueOf(d));
        MetricsHelper.recordCounterMetric(generateClickstream2, Double.valueOf(d2));
        MetricsHelper.recordCounterMetric(generateClickstream3, Double.valueOf(d3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void registerLastSyncTime(Context context, boolean z) {
        LOG.i("register last sync time");
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        edit.putLong(PREF_LAST_SYNC_ATTEMPT, currentTimeMillis);
        if (z) {
            edit.putLong(PREF_LAST_SUCCESSFUL_SYNC, currentTimeMillis);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void scheduleSyncRetry(Context context, int i, int i2) {
        int i3 = i + 1;
        if (i3 > i2) {
            LOG.w("Retry limit reached, no more retries scheduled. Waiting for next regular sync.");
            return;
        }
        CommsLogger commsLogger = LOG;
        commsLogger.i("Scheduling retry...");
        commsLogger.i("Next attempt number is: " + i3);
        PeriodicConfigSyncUtils.scheduleSyncRetry(context, i3);
    }

    public static void startService(Context context) {
        enqueueWork(context, new Intent(context, (Class<?>) ConfigurationSyncService.class));
        PeriodicConfigSyncUtils.initPeriodicConfigSyncing(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopArcusLatencyTimer() {
        MetricsHelper.stopTimerMetric(TimerMetric.generateOperational(MetricKeys.ARCUS_LOAD_LATENCY));
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        CommsLogger commsLogger;
        try {
            try {
                CommsLogger commsLogger2 = LOG;
                commsLogger2.i("Reached Configuration Sync Service");
                if (!arcusSyncRequired()) {
                    commsLogger2.i("Not trying to resync, Configuration Sync was recently completed.");
                    commsLogger2.i("Configuration Sync Service job completed.");
                    mJobRunning.set(false);
                    return;
                }
                getApplicationContext();
                commsLogger2.i("Trying to resync");
                if (!this.commsConnectivityMonitor.isConnected()) {
                    commsLogger2.w("Skipping this ARCUS sync attempt, due to lack of network access");
                    recordSyncMetric(0.0d, 0.0d, 1.0d, MetricKeys.VALUE_ARCUS_SYNC_SKIPPED_NO_NETWORK, null);
                    commsLogger2.i("Configuration Sync Service job completed.");
                    mJobRunning.set(false);
                    return;
                }
                RemoteConfigurationManager remoteConfigurationManager = RemoteConfigurationManager.getInstance(this.stage.getArcusConfigId());
                if (remoteConfigurationManager == null) {
                    commsLogger2.w("Remote config manager not initialized prior to sync");
                    commsLogger2.i("Configuration Sync Service job completed.");
                    mJobRunning.set(false);
                    return;
                }
                int intExtra = intent.getIntExtra(EXTRA_RETRY_ATTEMPT, 0);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                ArcusConfig arcusConfig = CommsDaggerWrapper.getComponent().getArcusConfig();
                MetricsHelper.startTimerMetric(TimerMetric.generateOperational(MetricKeys.ARCUS_LOAD_LATENCY));
                remoteConfigurationManager.sync(new SyncServiceConfigurationCallback(getApplicationContext(), countDownLatch, intExtra, arcusConfig.getConfigInteger(RemoteConfigKeys.ARCUS_RETY_MAX_ATTEMPTS).intValue()));
                if (countDownLatch.await(arcusConfig.getConfigInteger(RemoteConfigKeys.ARCUS_MAX_SYNC_DURATION_MILLISEC).intValue(), TimeUnit.MILLISECONDS)) {
                    commsLogger2.i("Configuration Sync Service success");
                    commsLogger2.i("Configuration Sync Service job completed.");
                    mJobRunning.set(false);
                } else {
                    commsLogger2.e("Timed out while waiting for the sync to end.");
                    commsLogger2.i("Configuration Sync Service job completed.");
                    mJobRunning.set(false);
                }
            } catch (InterruptedException e) {
                commsLogger = LOG;
                commsLogger.e("Configuration Sync Service - thread interrupted while waiting for the sync to end.", e);
                commsLogger.i("Configuration Sync Service job completed.");
                mJobRunning.set(false);
            } catch (RuntimeException e2) {
                commsLogger = LOG;
                commsLogger.e("Configuration Sync Service encountered a runtime error");
                recordSyncMetric(0.0d, 1.0d, 0.0d, MetricKeys.VALUE_ARCUS_FAILED_TO_INITIALIZE_EXCEPTION, e2.toString());
                commsLogger.i("Configuration Sync Service job completed.");
                mJobRunning.set(false);
            }
        } catch (Throwable th) {
            LOG.i("Configuration Sync Service job completed.");
            mJobRunning.set(false);
            throw th;
        }
    }
}
