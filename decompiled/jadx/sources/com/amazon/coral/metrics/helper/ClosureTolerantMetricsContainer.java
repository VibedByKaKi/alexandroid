package com.amazon.coral.metrics.helper;

import com.amazon.coral.metrics.Metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ClosureTolerantMetricsContainer extends DelegateMetrics {
    private ClosureTolerantCompatibilityMetrics compatibilityMetrics;

    public ClosureTolerantMetricsContainer(Metrics metrics) {
        super(metrics);
        this.compatibilityMetrics = new ClosureTolerantCompatibilityMetrics(metrics);
    }

    @Override // com.amazon.coral.metrics.helper.DelegateMetrics, com.amazon.coral.metrics.Metrics, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Metrics metrics = super.getMetrics();
        super.setMetrics(this.compatibilityMetrics);
        metrics.close();
    }
}
