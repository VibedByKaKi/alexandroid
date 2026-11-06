package com.amazon.coral.metrics.helper;

import com.amazon.coral.metrics.Group;
import com.amazon.coral.metrics.Metrics;
import com.amazon.coral.metrics.MetricsFactory;
import javax.measure.unit.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ClosureTolerantCompatibilityMetrics extends Metrics {
    private Metrics wrappedMetrics;

    public ClosureTolerantCompatibilityMetrics(Metrics metrics) {
        this.wrappedMetrics = metrics;
    }

    @Override // com.amazon.coral.metrics.Metrics
    public MetricsFactory getMetricsFactory() {
        return this.wrappedMetrics.getMetricsFactory();
    }

    @Override // com.amazon.coral.metrics.Metrics
    public Metrics newMetrics(Group group) {
        Metrics newMetrics = this.wrappedMetrics.getMetricsFactory().newMetrics();
        try {
            Metrics newMetrics2 = newMetrics.newMetrics(group);
            newMetrics.close();
            return newMetrics2;
        } catch (Throwable th) {
            if (newMetrics != null) {
                try {
                    newMetrics.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addMetric(String str, double d, Unit<?> unit, Dimension... dimensionArr) {
    }

    @Override // com.amazon.coral.metrics.Metrics, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public Metrics newMetrics() {
        return this.wrappedMetrics.getMetricsFactory().newMetrics();
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addDate(String str, double d) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addProperty(String str, CharSequence charSequence) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addCount(String str, double d, Unit<?> unit, int i) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addLevel(String str, double d, Unit<?> unit, int i) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addRatio(String str, double d, int i, Dimension... dimensionArr) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addTime(String str, double d, Unit<?> unit, int i) {
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addMetric(String str, double d, int i, Unit<?> unit, Dimension... dimensionArr) {
    }
}
