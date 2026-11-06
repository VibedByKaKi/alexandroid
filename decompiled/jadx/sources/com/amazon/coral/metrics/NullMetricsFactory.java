package com.amazon.coral.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NullMetricsFactory implements MetricsFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Default {
        private static final NullMetricsFactory INSTANCE = new NullMetricsFactory();

        public static final NullMetricsFactory get() {
            return INSTANCE;
        }
    }

    @Override // com.amazon.coral.metrics.MetricsFactory
    public Metrics newMetrics() {
        return new NullMetrics(this);
    }
}
