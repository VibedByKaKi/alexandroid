package com.amazon.alexa.voice.events;

import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
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
public final class EventsModule_ProvideVoxUiEventProcessingServiceFactory implements Factory<VoxUiEventProcessingService> {
    private final Provider<VoxMetricEventProcessingService> metricEventProcessingServiceProvider;

    public EventsModule_ProvideVoxUiEventProcessingServiceFactory(Provider<VoxMetricEventProcessingService> provider) {
        this.metricEventProcessingServiceProvider = provider;
    }

    public static EventsModule_ProvideVoxUiEventProcessingServiceFactory create(Provider<VoxMetricEventProcessingService> provider) {
        return new EventsModule_ProvideVoxUiEventProcessingServiceFactory(provider);
    }

    public static VoxUiEventProcessingService provideVoxUiEventProcessingService(VoxMetricEventProcessingService voxMetricEventProcessingService) {
        return (VoxUiEventProcessingService) Preconditions.checkNotNullFromProvides(EventsModule.provideVoxUiEventProcessingService(voxMetricEventProcessingService));
    }

    @Override // javax.inject.Provider
    public VoxUiEventProcessingService get() {
        return provideVoxUiEventProcessingService(this.metricEventProcessingServiceProvider.get());
    }
}
