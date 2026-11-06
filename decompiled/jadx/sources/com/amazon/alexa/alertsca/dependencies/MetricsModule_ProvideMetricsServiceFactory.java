package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class MetricsModule_ProvideMetricsServiceFactory implements Factory<MetricsService> {
    private final Provider<Mobilytics> mobilyticsProvider;
    private final MetricsModule module;

    public MetricsModule_ProvideMetricsServiceFactory(MetricsModule metricsModule, Provider<Mobilytics> provider) {
        this.module = metricsModule;
        this.mobilyticsProvider = provider;
    }

    public static MetricsModule_ProvideMetricsServiceFactory create(MetricsModule metricsModule, Provider<Mobilytics> provider) {
        return new MetricsModule_ProvideMetricsServiceFactory(metricsModule, provider);
    }

    public static MetricsService provideMetricsService(MetricsModule metricsModule, Mobilytics mobilytics) {
        return (MetricsService) Preconditions.checkNotNullFromProvides(metricsModule.provideMetricsService(mobilytics));
    }

    @Override // javax.inject.Provider
    public MetricsService get() {
        return provideMetricsService(this.module, this.mobilyticsProvider.get());
    }
}
