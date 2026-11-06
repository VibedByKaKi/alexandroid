package com.amazon.coral.metrics.timer;

import com.amazon.coral.metrics.ICloseable;
import com.amazon.coral.metrics.Metrics;
import javax.measure.unit.SI;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class MetricsTimer implements ICloseable {
    private boolean _closed;
    private final String _metricName;
    private final Metrics _metrics;
    private final long _startTime = System.nanoTime();

    public MetricsTimer(Metrics metrics, String str) {
        if (metrics == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("metrics cannot be null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("metricName cannot be null");
            throw null;
        }
        this._metrics = metrics;
        this._metricName = str;
    }

    @Override // com.amazon.coral.metrics.ICloseable, java.lang.AutoCloseable
    public void close() {
        if (this._closed) {
            return;
        }
        this._metrics.addTime(this._metricName, System.nanoTime() - this._startTime, SI.NANO(SI.SECOND));
        this._closed = true;
    }
}
