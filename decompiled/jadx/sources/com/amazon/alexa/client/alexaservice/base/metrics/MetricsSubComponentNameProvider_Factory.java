package com.amazon.alexa.client.alexaservice.base.metrics;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetricsSubComponentNameProvider_Factory implements Factory<MetricsSubComponentNameProvider> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;

    public MetricsSubComponentNameProvider_Factory(Provider<AlexaClientEventBus> provider) {
        this.alexaClientEventBusProvider = provider;
    }

    public static MetricsSubComponentNameProvider_Factory create(Provider<AlexaClientEventBus> provider) {
        return new MetricsSubComponentNameProvider_Factory(provider);
    }

    public static MetricsSubComponentNameProvider newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new MetricsSubComponentNameProvider(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public MetricsSubComponentNameProvider get() {
        return newInstance(this.alexaClientEventBusProvider.get());
    }
}
