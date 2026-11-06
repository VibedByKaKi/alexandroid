package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.voice.metrics.service.MetricsService;
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
/* loaded from: classes19.dex */
public final class MetricsModule_ProvideMetricsServiceFactory implements Factory<MetricsService> {
    private final Provider<Mobilytics> mobilyticsProvider;

    public MetricsModule_ProvideMetricsServiceFactory(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public static MetricsModule_ProvideMetricsServiceFactory create(Provider<Mobilytics> provider) {
        return new MetricsModule_ProvideMetricsServiceFactory(provider);
    }

    public static MetricsService provideMetricsService(Mobilytics mobilytics) {
        return (MetricsService) Preconditions.checkNotNullFromProvides(MetricsModule.provideMetricsService(mobilytics));
    }

    @Override // javax.inject.Provider
    public MetricsService get() {
        return provideMetricsService(this.mobilyticsProvider.get());
    }
}
