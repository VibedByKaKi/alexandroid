package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

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
public final class ExternalMediaPlayerPlaybackAuthority_Factory implements Factory<ExternalMediaPlayerPlaybackAuthority> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public ExternalMediaPlayerPlaybackAuthority_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static ExternalMediaPlayerPlaybackAuthority_Factory create(Provider<AlexaClientEventBus> provider) {
        return new ExternalMediaPlayerPlaybackAuthority_Factory(provider);
    }

    public static ExternalMediaPlayerPlaybackAuthority newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new ExternalMediaPlayerPlaybackAuthority(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public ExternalMediaPlayerPlaybackAuthority get() {
        return newInstance(this.eventBusProvider.get());
    }
}
