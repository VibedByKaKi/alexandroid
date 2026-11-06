package com.amazon.alexa.client.alexaservice.core.capabilities.agents;

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
public final class UnsupportedMessageCapabilityAgent_Factory implements Factory<UnsupportedMessageCapabilityAgent> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public UnsupportedMessageCapabilityAgent_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static UnsupportedMessageCapabilityAgent_Factory create(Provider<AlexaClientEventBus> provider) {
        return new UnsupportedMessageCapabilityAgent_Factory(provider);
    }

    public static UnsupportedMessageCapabilityAgent newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new UnsupportedMessageCapabilityAgent(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public UnsupportedMessageCapabilityAgent get() {
        return newInstance(this.eventBusProvider.get());
    }
}
