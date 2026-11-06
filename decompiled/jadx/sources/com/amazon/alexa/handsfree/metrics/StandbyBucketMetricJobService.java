package com.amazon.alexa.handsfree.metrics;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class StandbyBucketMetricJobService extends JobService {
    private static final long FLEX_MILLISECONDS = 1209600000;
    private static final int JOB_ID = 30060;
    private static final String METRIC_TYPE_STANDBY_BUCKET = "AppStandbyBucket.";
    private static final long PERIOD_MILLISECONDS = 1296000000;
    private static final String TAG = "StandbyBucketMetricJobService";
    private AMPDInformationProvider mAMPDInformationProvider;
    private Context mContext;
    private final Helper mHelper;
    private final Initializer mInitializer;
    private MetricsBuilderProvider mMetricsBuilderProvider;
    private UsageStatsManager usageStatsManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Helper {
        @Inject
        public Helper() {
        }

        private JobScheduler getJobScheduler(@NonNull Context context) {
            return (JobScheduler) context.getSystemService("jobscheduler");
        }

        private boolean isJobScheduled(Context context) {
            return ((JobScheduler) context.getSystemService("jobscheduler")).getPendingJob(StandbyBucketMetricJobService.JOB_ID) != null;
        }

        @VisibleForTesting
        public void cancelJob(@NonNull Context context) {
            getJobScheduler(context).cancel(StandbyBucketMetricJobService.JOB_ID);
        }

        @VisibleForTesting
        public boolean isCompatibleWithJob() {
            return true;
        }

        public boolean scheduleJob(@NonNull Context context) {
            if (!isCompatibleWithJob() || isJobScheduled(context)) {
                return false;
            }
            JobInfo.Builder requiredNetworkType = new JobInfo.Builder(StandbyBucketMetricJobService.JOB_ID, new ComponentName(context, (Class<?>) StandbyBucketMetricJobService.class)).setRequiredNetworkType(1);
            requiredNetworkType.setPeriodic(1296000000L, StandbyBucketMetricJobService.FLEX_MILLISECONDS);
            getJobScheduler(context).schedule(requiredNetworkType.build());
            return true;
        }
    }

    public StandbyBucketMetricJobService() {
        this.mInitializer = InitializerProvider.getInitializer();
        this.mHelper = new Helper();
    }

    private void recordPerformanceMetric() {
        int standbyBucketID = getStandbyBucketID();
        String str = TAG;
        Log.d(str, "recordPerformanceMetric - emitting StandbyBucketMetric! ");
        MetricsBuilder newBuilder = this.mMetricsBuilderProvider.newBuilder();
        newBuilder.withPerformanceMetric(str, METRIC_TYPE_STANDBY_BUCKET + standbyBucketID);
        newBuilder.emit(this.mContext);
    }

    @VisibleForTesting
    public int getStandbyBucketID() {
        UsageStatsManager usageStatsManager = (UsageStatsManager) getSystemService("usagestats");
        this.usageStatsManager = usageStatsManager;
        if (usageStatsManager != null) {
            return usageStatsManager.getAppStandbyBucket();
        }
        return -1;
    }

    @VisibleForTesting
    public boolean isCompatibleWithJob() {
        return this.mHelper.isCompatibleWithJob();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mInitializer.initialize(this);
        this.mMetricsBuilderProvider = MetricsBuilderProvider.getInstance(this);
        this.mAMPDInformationProvider = AMPDInformationProvider.getInstance(this);
        this.mContext = this;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        if (!this.mAMPDInformationProvider.isHandsFreeCapable()) {
            Log.d(TAG, "onStartJob - Device is not Hands-Free, canceling job.");
            this.mHelper.cancelJob(this.mContext);
            return false;
        }
        if (isCompatibleWithJob()) {
            recordPerformanceMetric();
        } else {
            Log.d(TAG, "onStartJob - Current Device's API is < 28, canceling job.");
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @VisibleForTesting
    public StandbyBucketMetricJobService(@NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull Initializer initializer, @NonNull Helper helper, @NonNull AMPDInformationProvider aMPDInformationProvider, @NonNull Context context) {
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mInitializer = initializer;
        this.mHelper = helper;
        this.mAMPDInformationProvider = aMPDInformationProvider;
        this.mContext = context;
    }
}
