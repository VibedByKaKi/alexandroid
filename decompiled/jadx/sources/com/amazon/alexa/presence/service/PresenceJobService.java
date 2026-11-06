package com.amazon.alexa.presence.service;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Log;
import com.amazon.alexa.presence.FeatureGating;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.bleconn.identity.IdentityController;
import com.amazon.alexa.presence.library.Compatibility;
import com.amazon.alexa.presence.library.MetricsRecorder;
import com.amazon.alexa.presence.metrics.MetricsId;
import com.amazon.alexa.presence.metrics.MetricsMethod;
import com.amazon.alexa.presence.service.PresenceForegroundService;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers$$ExternalSyntheticLambda0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceJobService extends JobService {
    public static final String ACTION_REFRESH_FLUSH_KEY = "flush";
    public static final String ACTION_REFRESH_IDENTITY = "com.amazon.alexa.intent.action.PRESENCE_REFRESH_IDENTITY";
    private static final String EXTRAS_ACTION_KEY = "Action";
    private static final int IDENTITY_REFRESHER_JOB_ID = 605002;
    private static final int IDENTITY_REFRESH_CHECK_PERIOD_MS = 129600000;
    private static final String JST_FEATURE_GATE = "JST_DISCOVERABILITY_FEATURE";
    private static final int ROTATOR_JOB_ID = 200506;
    private static final int SERVICE_CONTROL_JOB_ID = 200500;
    private static final int SERVICE_DATA_ROTATION_PERIOD_MS = 1800000;
    private MetricsRecorder metrics;
    private static final String TAG = Presence.tag();
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(4);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            this.metrics = MetricsRecorder.getMetricsUtil();
        } catch (Throwable unused) {
            Log.w(TAG, "Unable to setup metrics service.");
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        final Context applicationContext = getApplicationContext();
        EXECUTOR_SERVICE.submit(new Runnable() { // from class: com.amazon.alexa.presence.service.PresenceJobService.1
            @Override // java.lang.Runnable
            public void run() {
                Boolean valueOf;
                PersistableBundle extras = jobParameters.getExtras();
                String string = extras == null ? null : extras.getString("Action");
                if (string == null) {
                    return;
                }
                String unused = PresenceJobService.TAG;
                switch (string) {
                    case "com.amazon.alexa.intent.action.PRESENCE_STOP":
                        new PresenceForegroundService.Controls(applicationContext).notifyPresenceServiceToStop();
                        break;
                    case "com.amazon.alexa.intent.action.PRESENCE_START":
                        new PresenceForegroundService.Controls(applicationContext).notifyPresenceServiceToRun();
                        break;
                    case "com.amazon.alexa.intent.action.PRESENCE_SUGGEST":
                        try {
                            if (!FeatureGating.isEnabled(PresenceJobService.JST_FEATURE_GATE)) {
                                String unused2 = PresenceJobService.TAG;
                                break;
                            } else {
                                PresenceSuggestGuestConnect presenceSuggestGuestConnect = new PresenceSuggestGuestConnect(applicationContext);
                                PresenceJobService.this.metrics.recordCount(MetricsId.CHECK_FEATURE_SUGGEST, MetricsMethod.GUARDRAILS);
                                if (presenceSuggestGuestConnect.shouldNotify()) {
                                    presenceSuggestGuestConnect.sendPresenceFeatureSuggestNotification();
                                    PresenceJobService.this.metrics.recordCount(MetricsId.SHOWED_NOTIFICATION, MetricsMethod.GUEST_CONNECT);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            Log.w(PresenceJobService.TAG, "Feature suggestion failed with exception: " + e);
                            return;
                        }
                        break;
                    case "com.amazon.alexa.intent.action.PRESENCE_ROTATE_DATA_ID":
                        new PresenceForegroundService.Controls(applicationContext).notifyPresenceServiceToRotateServiceData();
                        break;
                    case "com.amazon.alexa.intent.action.PRESENCE_REFRESH_IDENTITY":
                        IdentityController identityController = new BleConnIdentityComponent(applicationContext).getIdentityController();
                        if (extras.getBoolean(PresenceJobService.ACTION_REFRESH_FLUSH_KEY, false)) {
                            Log.i(PresenceJobService.TAG, "Executing a hard identity refresh.");
                            valueOf = Boolean.valueOf(identityController.refresh(true));
                        } else {
                            Log.i(PresenceJobService.TAG, "Executing a soft identity refresh.");
                            valueOf = Boolean.valueOf(identityController.refresh(false));
                        }
                        if (valueOf.booleanValue()) {
                            PresenceJobService.this.metrics.recordCount(MetricsId.IDENTITY_REFRESH, MetricsMethod.PHONE_ID);
                            Log.i(PresenceJobService.TAG, "Identity refreshed, scheduling service data rotation.");
                            new Helper(applicationContext).scheduleServiceDataRotation();
                            break;
                        }
                        break;
                }
            }
        });
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Helper {
        private static final String TAG = Presence.tag();
        private Context ctx;
        private JobScheduler jobScheduler;

        @Inject
        public Helper(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.ctx = applicationContext;
            this.jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        }

        private JobInfo.Builder jobInfoBuilder(int i, PersistableBundle persistableBundle) {
            return new JobInfo.Builder(i, new ComponentName(this.ctx, (Class<?>) PresenceJobService.class)).setExtras(persistableBundle).setRequiredNetworkType(0).setRequiresDeviceIdle(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Integer lambda$scheduleIdentityRefresh$1() throws Exception {
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Integer lambda$startMonitoringTokenFreshness$0() throws Exception {
            return 3;
        }

        public void scheduleForegroundServiceStart() {
            this.jobScheduler.schedule(jobInfoBuilder(PresenceForegroundService.ACTION_START_SERVICE, PresenceJobService.SERVICE_CONTROL_JOB_ID).setOverrideDeadline(0L).build());
        }

        public void scheduleForegroundServiceStop() {
            this.jobScheduler.schedule(jobInfoBuilder(PresenceForegroundService.ACTION_STOP_SERVICE, PresenceJobService.SERVICE_CONTROL_JOB_ID).setOverrideDeadline(0L).build());
        }

        public void scheduleIdentityRefresh(boolean z) {
            int intValue = Compatibility.isAndroidNOrLater() ? ((Integer) Compatibility.ifAndroidNOrLater(new AndroidSchedulers$$ExternalSyntheticLambda0(7))).intValue() : 1;
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("Action", PresenceJobService.ACTION_REFRESH_IDENTITY);
            persistableBundle.putBoolean(PresenceJobService.ACTION_REFRESH_FLUSH_KEY, z);
            this.jobScheduler.schedule(jobInfoBuilder(PresenceJobService.IDENTITY_REFRESHER_JOB_ID, persistableBundle).setOverrideDeadline(0L).setRequiredNetworkType(intValue).build());
        }

        public void schedulePresenceFeatureSuggestNotification() {
            this.jobScheduler.schedule(jobInfoBuilder(PresenceSuggestGuestConnect.PRESENCE_BASED_SUGGESTION, PresenceSuggestGuestConnect.ROAMING_SUGGESTION_NOTIFICATION_ID).setOverrideDeadline(0L).build());
        }

        public void scheduleServiceDataRotation() {
            Log.i(TAG, "Scheduling on demand service data rotation.");
            this.jobScheduler.schedule(jobInfoBuilder(PresenceForegroundService.ACTION_ROTATE_DATA, PresenceJobService.ROTATOR_JOB_ID).setMinimumLatency(100L).setOverrideDeadline(500L).build());
        }

        public void startMonitoringTokenFreshness() {
            this.jobScheduler.schedule(jobInfoBuilder(PresenceJobService.ACTION_REFRESH_IDENTITY, PresenceJobService.IDENTITY_REFRESHER_JOB_ID).setPeriodic(129600000L).setRequiredNetworkType(Compatibility.isAndroidNOrLater() ? ((Integer) Compatibility.ifAndroidNOrLater(new AndroidSchedulers$$ExternalSyntheticLambda0(6))).intValue() : 1).build());
        }

        public void startRotatingServiceData() {
            this.jobScheduler.schedule(jobInfoBuilder(PresenceForegroundService.ACTION_ROTATE_DATA, PresenceJobService.ROTATOR_JOB_ID).setPeriodic(1800000L).build());
        }

        public void stopMonitoringTokenFreshness() {
            this.jobScheduler.cancel(PresenceJobService.IDENTITY_REFRESHER_JOB_ID);
        }

        public void stopRotatingServiceData() {
            this.jobScheduler.cancel(PresenceJobService.ROTATOR_JOB_ID);
        }

        private JobInfo.Builder jobInfoBuilder(String str, int i) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("Action", str);
            return jobInfoBuilder(i, persistableBundle);
        }
    }
}
