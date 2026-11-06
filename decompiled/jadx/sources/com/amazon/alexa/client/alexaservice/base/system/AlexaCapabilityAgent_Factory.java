package com.amazon.alexa.client.alexaservice.base.system;

import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
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
public final class AlexaCapabilityAgent_Factory implements Factory<AlexaCapabilityAgent> {
    private final Provider<DiscoveryFeatureChecker> discoveryFeatureCheckerProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public AlexaCapabilityAgent_Factory(Provider<AlexaClientEventBus> provider, Provider<DiscoveryFeatureChecker> provider2) {
        this.eventBusProvider = provider;
        this.discoveryFeatureCheckerProvider = provider2;
    }

    public static AlexaCapabilityAgent_Factory create(Provider<AlexaClientEventBus> provider, Provider<DiscoveryFeatureChecker> provider2) {
        return new AlexaCapabilityAgent_Factory(provider, provider2);
    }

    public static AlexaCapabilityAgent newInstance(AlexaClientEventBus alexaClientEventBus, DiscoveryFeatureChecker discoveryFeatureChecker) {
        return new AlexaCapabilityAgent(alexaClientEventBus, discoveryFeatureChecker);
    }

    @Override // javax.inject.Provider
    public AlexaCapabilityAgent get() {
        return newInstance(this.eventBusProvider.get(), this.discoveryFeatureCheckerProvider.get());
    }
}
