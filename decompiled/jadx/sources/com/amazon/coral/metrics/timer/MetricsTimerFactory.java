package com.amazon.coral.metrics.timer;

import com.amazon.coral.metrics.ICloseable;
import com.amazon.coral.metrics.Metrics;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MetricsTimerFactory implements IMetricsTimerFactory {
    private final String _metricName;

    public MetricsTimerFactory(String str) {
        if (str != null) {
            this._metricName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("metricName cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.metrics.timer.IMetricsTimerFactory
    public ICloseable create(Metrics metrics) {
        return new MetricsTimer(metrics, this._metricName);
    }
}
