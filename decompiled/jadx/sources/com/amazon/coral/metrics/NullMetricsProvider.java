package com.amazon.coral.metrics;

import com.amazon.coral.metrics.NullMetricsFactory;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NullMetricsProvider implements MetricsProvider {
    private volatile Metrics metrics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Default {
        private static final NullMetricsProvider INSTANCE = new NullMetricsProvider(NullMetricsFactory.Default.get().newMetrics());

        public static final NullMetricsProvider get() {
            return INSTANCE;
        }
    }

    public NullMetricsProvider(Metrics metrics) throws IllegalArgumentException {
        setMetrics(metrics);
    }

    @Override // com.amazon.coral.metrics.MetricsProvider
    public Metrics getMetrics() {
        return this.metrics;
    }

    public final void setMetrics(Metrics metrics) throws IllegalArgumentException {
        if (metrics != null) {
            this.metrics = metrics;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("metrics is required");
        }
    }
}
