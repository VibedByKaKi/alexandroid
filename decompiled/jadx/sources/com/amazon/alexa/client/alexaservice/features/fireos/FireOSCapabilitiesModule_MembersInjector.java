package com.amazon.alexa.client.alexaservice.features.fireos;

import com.amazon.alexa.capabilities.FireOSCapabilitiesMetricsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FireOSCapabilitiesModule_MembersInjector implements MembersInjector<FireOSCapabilitiesModule> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public FireOSCapabilitiesModule_MembersInjector(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static MembersInjector<FireOSCapabilitiesModule> create(Provider<AlexaClientEventBus> provider) {
        return new FireOSCapabilitiesModule_MembersInjector(provider);
    }

    public static FireOSCapabilitiesMetricsListener injectFireOSCapabilitiesMetricsListener(FireOSCapabilitiesModule fireOSCapabilitiesModule, AlexaClientEventBus alexaClientEventBus) {
        return fireOSCapabilitiesModule.fireOSCapabilitiesMetricsListener(alexaClientEventBus);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FireOSCapabilitiesModule fireOSCapabilitiesModule) {
        injectFireOSCapabilitiesMetricsListener(fireOSCapabilitiesModule, this.eventBusProvider.get());
    }
}
