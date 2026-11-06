package com.amazon.alexa.handsfree.protocols.metrics;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MetricRecorder {
    void recordMetric(@NonNull Object obj, @NonNull MetricsRecordMode metricsRecordMode, @NonNull Metric metric);

    void recordMetricGroup(@NonNull Object obj, @NonNull MetricsRecordMode metricsRecordMode, @NonNull List<Metric> list);

    void recordMetricGroup(@NonNull Object obj, @NonNull MetricsRecordMode metricsRecordMode, Metric... metricArr);
}
