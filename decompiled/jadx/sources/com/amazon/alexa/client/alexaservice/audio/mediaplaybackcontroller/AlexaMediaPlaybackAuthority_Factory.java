package com.amazon.alexa.client.alexaservice.audio.mediaplaybackcontroller;

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
public final class AlexaMediaPlaybackAuthority_Factory implements Factory<AlexaMediaPlaybackAuthority> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;

    public AlexaMediaPlaybackAuthority_Factory(Provider<AlexaClientEventBus> provider) {
        this.alexaClientEventBusProvider = provider;
    }

    public static AlexaMediaPlaybackAuthority_Factory create(Provider<AlexaClientEventBus> provider) {
        return new AlexaMediaPlaybackAuthority_Factory(provider);
    }

    public static AlexaMediaPlaybackAuthority newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new AlexaMediaPlaybackAuthority(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public AlexaMediaPlaybackAuthority get() {
        return newInstance(this.alexaClientEventBusProvider.get());
    }
}
