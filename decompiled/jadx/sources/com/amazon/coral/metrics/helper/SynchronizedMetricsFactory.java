package com.amazon.coral.metrics.helper;

import com.amazon.coral.metrics.Metrics;
import com.amazon.coral.metrics.MetricsFactory;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SynchronizedMetricsFactory implements MetricsFactory {
    private final MetricsFactory delegate;

    public SynchronizedMetricsFactory(MetricsFactory metricsFactory) {
        if (metricsFactory != null) {
            this.delegate = metricsFactory;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("should not get null MetricsFactory");
            throw null;
        }
    }

    @Override // com.amazon.coral.metrics.MetricsFactory
    public Metrics newMetrics() {
        return MetricsSynchronizer.synchronize(this.delegate.newMetrics());
    }
}
