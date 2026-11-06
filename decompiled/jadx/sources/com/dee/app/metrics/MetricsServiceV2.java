package com.dee.app.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public interface MetricsServiceV2 {
    void recordAvailable(MetricDescriptor metricDescriptor);

    void recordCount(MetricDescriptor metricDescriptor, double d);

    void recordData(MetricDescriptor metricDescriptor, Object obj);

    void recordFailure(MetricDescriptor metricDescriptor, String str);

    void recordLimit(MetricDescriptor metricDescriptor, boolean z);

    void recordSuccess(MetricDescriptor metricDescriptor);

    void recordTime(MetricDescriptor metricDescriptor, long j);

    void recordUnavailable(MetricDescriptor metricDescriptor);
}
