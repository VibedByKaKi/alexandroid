package com.amazon.alexa.client.alexaservice.features.speaker;

import android.media.AudioManager;
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
public final class VolumeAuthority_Factory implements Factory<VolumeAuthority> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<MuteStateChangedEventSender> muteStateChangedEventSenderProvider;

    public VolumeAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<AudioManager> provider2, Provider<MuteStateChangedEventSender> provider3) {
        this.alexaClientEventBusProvider = provider;
        this.audioManagerProvider = provider2;
        this.muteStateChangedEventSenderProvider = provider3;
    }

    public static VolumeAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<AudioManager> provider2, Provider<MuteStateChangedEventSender> provider3) {
        return new VolumeAuthority_Factory(provider, provider2, provider3);
    }

    public static VolumeAuthority newInstance(AlexaClientEventBus alexaClientEventBus, AudioManager audioManager, MuteStateChangedEventSender muteStateChangedEventSender) {
        return new VolumeAuthority(alexaClientEventBus, audioManager, muteStateChangedEventSender);
    }

    @Override // javax.inject.Provider
    public VolumeAuthority get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.audioManagerProvider.get(), this.muteStateChangedEventSenderProvider.get());
    }
}
