package com.amazon.matter.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MatterMetricsService_Factory implements Factory<MatterMetricsService> {
    private final Provider<Mobilytics> mobilyticsProvider;

    public MatterMetricsService_Factory(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public static MatterMetricsService_Factory create(Provider<Mobilytics> provider) {
        return new MatterMetricsService_Factory(provider);
    }

    public static MatterMetricsService newInstance(Mobilytics mobilytics) {
        return new MatterMetricsService(mobilytics);
    }

    @Override // javax.inject.Provider
    public MatterMetricsService get() {
        return newInstance(this.mobilyticsProvider.get());
    }
}
