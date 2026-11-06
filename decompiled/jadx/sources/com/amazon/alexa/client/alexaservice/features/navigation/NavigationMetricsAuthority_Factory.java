package com.amazon.alexa.client.alexaservice.features.navigation;

import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class NavigationMetricsAuthority_Factory implements Factory<NavigationMetricsAuthority> {
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public NavigationMetricsAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<MetricsService> provider2) {
        this.eventBusProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static NavigationMetricsAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<MetricsService> provider2) {
        return new NavigationMetricsAuthority_Factory(provider, provider2);
    }

    public static NavigationMetricsAuthority newInstance(AlexaClientEventBus alexaClientEventBus, MetricsService metricsService) {
        return new NavigationMetricsAuthority(alexaClientEventBus, metricsService);
    }

    @Override // javax.inject.Provider
    public NavigationMetricsAuthority get() {
        return newInstance(this.eventBusProvider.get(), this.metricsServiceProvider.get());
    }
}
