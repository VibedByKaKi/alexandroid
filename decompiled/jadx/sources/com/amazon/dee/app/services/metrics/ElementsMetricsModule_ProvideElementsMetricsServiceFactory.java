package com.amazon.dee.app.services.metrics;

import com.dee.app.metrics.MetricsService;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ElementsMetricsModule_ProvideElementsMetricsServiceFactory implements Factory<MetricsServiceV2> {
    private final Provider<MetricsService> metricsServiceProvider;

    public ElementsMetricsModule_ProvideElementsMetricsServiceFactory(Provider<MetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static ElementsMetricsModule_ProvideElementsMetricsServiceFactory create(Provider<MetricsService> provider) {
        return new ElementsMetricsModule_ProvideElementsMetricsServiceFactory(provider);
    }

    public static MetricsServiceV2 provideElementsMetricsService(MetricsService metricsService) {
        return (MetricsServiceV2) Preconditions.checkNotNullFromProvides(ElementsMetricsModule.provideElementsMetricsService(metricsService));
    }

    @Override // javax.inject.Provider
    public MetricsServiceV2 get() {
        return provideElementsMetricsService(this.metricsServiceProvider.get());
    }
}
