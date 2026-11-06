package com.amazon.alexa.client.alexaservice;

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
public final class ClientConnectionsAuthority_Factory implements Factory<ClientConnectionsAuthority> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public ClientConnectionsAuthority_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static ClientConnectionsAuthority_Factory create(Provider<AlexaClientEventBus> provider) {
        return new ClientConnectionsAuthority_Factory(provider);
    }

    public static ClientConnectionsAuthority newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new ClientConnectionsAuthority(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public ClientConnectionsAuthority get() {
        return newInstance(this.eventBusProvider.get());
    }
}
