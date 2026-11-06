package com.amazon.alexa.handsfree.metrics.interprocess;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.metrics.interprocess.InterProcessMetric;
import com.amazon.alexa.handsfree.protocols.metrics.interprocess.InterProcessMetricReporter;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InterProcessMetricReportingJobIntentService extends SafeDequeueJobIntentService {
    private static final String INTER_PROCESS_METRIC_JOB_PREFIX = "InterProcessMetricJobPrefix";
    private static final String INVALID_METRIC = "InvalidMetric";
    private static final int JOB_ID = 3205;
    private static final String MISSING_EXTRA = "MissingExtra";
    private static final String SEPARATOR = ":";
    private static final String TAG = "InterProcessMetricJob";
    private final Initializer mInitializer;
    private MetricsBuilderProvider mMetricsBuilderProvider;

    public InterProcessMetricReportingJobIntentService() {
        this.mInitializer = InitializerProvider.getInitializer();
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) InterProcessMetricReportingJobIntentService.class, JOB_ID, intent);
    }

    @VisibleForTesting
    public String createPMETName(@NonNull String str) {
        return a$$ExternalSyntheticOutline0.m("InterProcessMetricJobPrefix:", str);
    }

    @VisibleForTesting
    public void logInvalidMetric() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(createPMETName(INVALID_METRIC), TAG).emit(this);
    }

    @VisibleForTesting
    public void logMissingExtraMetric() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(createPMETName(MISSING_EXTRA), TAG).emit(this);
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mInitializer.initialize(this);
        this.mMetricsBuilderProvider = MetricsBuilderProvider.getInstance(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        InterProcessMetric interProcessMetric = (InterProcessMetric) intent.getParcelableExtra(InterProcessMetricReporter.PAYLOAD_IDENTIFIER);
        if (interProcessMetric == null) {
            Log.w(TAG, "Unable to get Inter process metric payload even though received correct action");
            logMissingExtraMetric();
            return;
        }
        Log.d(TAG, "Inter process metric payload received");
        MetricsBuilder populateMetricsBuilder = interProcessMetric.populateMetricsBuilder(this.mMetricsBuilderProvider.newBuilder());
        if (populateMetricsBuilder != null) {
            populateMetricsBuilder.emit(this);
        } else {
            Log.e(TAG, "Unable to log metric as it was invalid");
            logInvalidMetric();
        }
    }

    public InterProcessMetricReportingJobIntentService(@NonNull Initializer initializer, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        this.mInitializer = initializer;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }
}
