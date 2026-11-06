package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsRecordMode;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.metrics.MetricType;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class MetricsReporter {
    private static final String METRIC_SOURCE = "FetchFalcoRemoteJob";
    private final Context mContext;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    @Inject
    public MetricsReporter(@NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull Context context) {
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mContext = context;
    }

    public void reportFetchFalcoRemoteConfigJobDeserializationFailure() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED.getValue()).withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_DESERIALIZATION_FAILURE.getValue()).withPercentileMetricFailure(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_SUCCESS.getValue()).emit(MetricsRecordMode.FORCE_RECORD, this.mContext);
    }

    public void reportFetchFalcoRemoteConfigJobFinishedSuccessfully() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED.getValue()).withPercentileMetricSuccess(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_SUCCESS.getValue()).emit(MetricsRecordMode.FORCE_RECORD, this.mContext);
    }

    public void reportFetchFalcoRemoteConfigJobFinishedWithFailure() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED.getValue()).withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_FAILURE.getValue()).withPercentileMetricFailure(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_SUCCESS.getValue()).emit(MetricsRecordMode.FORCE_RECORD, this.mContext);
    }

    public void reportFetchFalcoRemoteConfigJobStarted() {
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(METRIC_SOURCE, MetricType.FETCH_FALCO_REMOTE_CONFIG_JOB_STARTED.getValue()).emit(MetricsRecordMode.FORCE_RECORD, this.mContext);
    }
}
