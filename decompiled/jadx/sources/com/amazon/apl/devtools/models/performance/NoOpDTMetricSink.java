package com.amazon.apl.devtools.models.performance;

import com.amazon.apl.android.metrics.IMetricsSink;
import com.amazon.apl.android.metrics.MetricsEvent;
import com.amazon.apl.android.utils.MetricInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpDTMetricSink implements IMetricsSink, IMetricsService {
    @Override // com.amazon.apl.devtools.models.performance.IMetricsService
    public List<MetricInfo> retrieveMetrics() {
        return new ArrayList();
    }

    @Override // com.amazon.apl.devtools.models.performance.IMetricsService
    public void clearMetrics() {
    }

    @Override // com.amazon.apl.android.metrics.IMetricsSink
    public void metricPublished(MetricsEvent metricsEvent) {
    }
}
