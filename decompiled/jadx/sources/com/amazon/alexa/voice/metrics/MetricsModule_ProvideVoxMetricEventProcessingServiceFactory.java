package com.amazon.alexa.voice.metrics;

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
public final class MetricsModule_ProvideVoxMetricEventProcessingServiceFactory implements Factory<VoxMetricEventProcessingService> {
    private final Provider<MetricsService> metricsServiceProvider;

    public MetricsModule_ProvideVoxMetricEventProcessingServiceFactory(Provider<MetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static MetricsModule_ProvideVoxMetricEventProcessingServiceFactory create(Provider<MetricsService> provider) {
        return new MetricsModule_ProvideVoxMetricEventProcessingServiceFactory(provider);
    }

    public static VoxMetricEventProcessingService provideVoxMetricEventProcessingService(MetricsService metricsService) {
        return (VoxMetricEventProcessingService) Preconditions.checkNotNullFromProvides(MetricsModule.provideVoxMetricEventProcessingService(metricsService));
    }

    @Override // javax.inject.Provider
    public VoxMetricEventProcessingService get() {
        return provideVoxMetricEventProcessingService(this.metricsServiceProvider.get());
    }
}
