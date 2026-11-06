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
public final class AlexaUserSpeechAuthority_Factory implements Factory<AlexaUserSpeechAuthority> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public AlexaUserSpeechAuthority_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static AlexaUserSpeechAuthority_Factory create(Provider<AlexaClientEventBus> provider) {
        return new AlexaUserSpeechAuthority_Factory(provider);
    }

    public static AlexaUserSpeechAuthority newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new AlexaUserSpeechAuthority(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public AlexaUserSpeechAuthority get() {
        return newInstance(this.eventBusProvider.get());
    }
}
