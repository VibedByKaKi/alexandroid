package com.amazon.alexa.voice.nowplaying.bridge;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class VoiceNowPlayingEventBusModule_MembersInjector implements MembersInjector<VoiceNowPlayingEventBusModule> {
    private final Provider<EventBus> eventBusProvider;

    public VoiceNowPlayingEventBusModule_MembersInjector(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static MembersInjector<VoiceNowPlayingEventBusModule> create(Provider<EventBus> provider) {
        return new VoiceNowPlayingEventBusModule_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.voice.nowplaying.bridge.VoiceNowPlayingEventBusModule.eventBus")
    public static void injectEventBus(VoiceNowPlayingEventBusModule voiceNowPlayingEventBusModule, EventBus eventBus) {
        voiceNowPlayingEventBusModule.eventBus = eventBus;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoiceNowPlayingEventBusModule voiceNowPlayingEventBusModule) {
        injectEventBus(voiceNowPlayingEventBusModule, this.eventBusProvider.get());
    }
}
