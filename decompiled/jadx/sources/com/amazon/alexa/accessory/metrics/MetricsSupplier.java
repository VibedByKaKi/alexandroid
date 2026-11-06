package com.amazon.alexa.accessory.metrics;

import com.amazon.alexa.accessory.capabilities.metrics.MetricsObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface MetricsSupplier {
    void registerObserver(MetricsObserver metricsObserver);

    void unRegisterObserver(MetricsObserver metricsObserver);
}
