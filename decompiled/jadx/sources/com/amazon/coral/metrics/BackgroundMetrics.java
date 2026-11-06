package com.amazon.coral.metrics;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class BackgroundMetrics {
    private static final AtomicReference<FactoryRef> factoryRef = new AtomicReference<>(new FactoryRef(true, new NullMetricsFactory()));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FactoryRef {
        final MetricsFactory factory;
        final boolean overridable;

        public FactoryRef(boolean z, MetricsFactory metricsFactory) {
            this.overridable = z;
            this.factory = metricsFactory;
        }
    }

    private BackgroundMetrics() {
    }

    public static Metrics newMetrics() {
        return factoryRef.get().factory.newMetrics();
    }

    public static boolean setBackgroundMetricsFactory(MetricsFactory metricsFactory, boolean z) {
        AtomicReference<FactoryRef> atomicReference = factoryRef;
        FactoryRef factoryRef2 = atomicReference.get();
        if (factoryRef2.factory == metricsFactory && factoryRef2.overridable == z) {
            return true;
        }
        if (!factoryRef2.overridable) {
            return false;
        }
        FactoryRef factoryRef3 = new FactoryRef(z, metricsFactory);
        while (!atomicReference.compareAndSet(factoryRef2, factoryRef3)) {
            if (atomicReference.get() != factoryRef2) {
                return false;
            }
        }
        return true;
    }

    public static boolean setBackgroundMetricsFactory(MetricsFactory metricsFactory) {
        return setBackgroundMetricsFactory(metricsFactory, false);
    }
}
