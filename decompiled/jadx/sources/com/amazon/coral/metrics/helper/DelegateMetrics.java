package com.amazon.coral.metrics.helper;

import com.amazon.coral.metrics.Group;
import com.amazon.coral.metrics.Metrics;
import com.amazon.coral.metrics.MetricsFactory;
import javax.measure.unit.Unit;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DelegateMetrics extends Metrics {
    private volatile Metrics delegate;

    public DelegateMetrics(Metrics metrics) {
        if (metrics != null) {
            this.delegate = metrics;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addCount(String str, double d, Unit<?> unit, int i) {
        this.delegate.addCount(str, d, unit, i);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addDate(String str, double d) {
        this.delegate.addDate(str, d);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addLevel(String str, double d, Unit<?> unit, int i) {
        this.delegate.addLevel(str, d, unit, i);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addMetric(String str, double d, Unit<?> unit, Dimension... dimensionArr) {
        this.delegate.addMetric(str, d, unit, dimensionArr);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addProperty(String str, CharSequence charSequence) {
        this.delegate.addProperty(str, charSequence);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addRatio(String str, double d, int i, Dimension... dimensionArr) {
        this.delegate.addRatio(str, d, i, dimensionArr);
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addTime(String str, double d, Unit<?> unit, int i) {
        this.delegate.addTime(str, d, unit, i);
    }

    @Override // com.amazon.coral.metrics.Metrics, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // com.amazon.coral.metrics.Metrics
    public boolean discard() {
        return this.delegate.discard();
    }

    public Metrics getMetrics() {
        return this.delegate;
    }

    @Override // com.amazon.coral.metrics.Metrics
    @Deprecated
    public MetricsFactory getMetricsFactory() {
        return this.delegate.getMetricsFactory();
    }

    @Override // com.amazon.coral.metrics.Metrics
    public Metrics newMetrics(Group group) {
        return this.delegate.newMetrics(group);
    }

    public void setMetrics(Metrics metrics) {
        this.delegate = metrics;
    }

    @Override // com.amazon.coral.metrics.Metrics
    public void addMetric(String str, double d, int i, Unit<?> unit, Dimension... dimensionArr) {
        this.delegate.addMetric(str, d, i, unit, dimensionArr);
    }
}
