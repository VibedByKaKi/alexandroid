package com.amazon.alexa.client.alexaservice.features.playbackcontroller;

import com.amazon.alexa.client.alexaservice.base.componentstate.ComponentStateAuthority;
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
public final class PlaybackController_Factory implements Factory<PlaybackController> {
    private final Provider<ComponentStateAuthority> componentStateAuthorityProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public PlaybackController_Factory(Provider<AlexaClientEventBus> provider, Provider<ComponentStateAuthority> provider2) {
        this.eventBusProvider = provider;
        this.componentStateAuthorityProvider = provider2;
    }

    public static PlaybackController_Factory create(Provider<AlexaClientEventBus> provider, Provider<ComponentStateAuthority> provider2) {
        return new PlaybackController_Factory(provider, provider2);
    }

    public static PlaybackController newInstance(AlexaClientEventBus alexaClientEventBus, ComponentStateAuthority componentStateAuthority) {
        return new PlaybackController(alexaClientEventBus, componentStateAuthority);
    }

    @Override // javax.inject.Provider
    public PlaybackController get() {
        return newInstance(this.eventBusProvider.get(), this.componentStateAuthorityProvider.get());
    }
}
