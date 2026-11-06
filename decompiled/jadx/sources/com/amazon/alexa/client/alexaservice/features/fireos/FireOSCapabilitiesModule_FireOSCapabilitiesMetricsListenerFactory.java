package com.amazon.alexa.client.alexaservice.features.fireos;

import com.amazon.alexa.capabilities.FireOSCapabilitiesMetricsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FireOSCapabilitiesModule_FireOSCapabilitiesMetricsListenerFactory implements Factory<FireOSCapabilitiesMetricsListener> {
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final FireOSCapabilitiesModule module;

    public FireOSCapabilitiesModule_FireOSCapabilitiesMetricsListenerFactory(FireOSCapabilitiesModule fireOSCapabilitiesModule, Provider<AlexaClientEventBus> provider) {
        this.module = fireOSCapabilitiesModule;
        this.eventBusProvider = provider;
    }

    public static FireOSCapabilitiesModule_FireOSCapabilitiesMetricsListenerFactory create(FireOSCapabilitiesModule fireOSCapabilitiesModule, Provider<AlexaClientEventBus> provider) {
        return new FireOSCapabilitiesModule_FireOSCapabilitiesMetricsListenerFactory(fireOSCapabilitiesModule, provider);
    }

    public static FireOSCapabilitiesMetricsListener fireOSCapabilitiesMetricsListener(FireOSCapabilitiesModule fireOSCapabilitiesModule, AlexaClientEventBus alexaClientEventBus) {
        return (FireOSCapabilitiesMetricsListener) Preconditions.checkNotNullFromProvides(fireOSCapabilitiesModule.fireOSCapabilitiesMetricsListener(alexaClientEventBus));
    }

    @Override // javax.inject.Provider
    public FireOSCapabilitiesMetricsListener get() {
        return fireOSCapabilitiesMetricsListener(this.module, this.eventBusProvider.get());
    }
}
