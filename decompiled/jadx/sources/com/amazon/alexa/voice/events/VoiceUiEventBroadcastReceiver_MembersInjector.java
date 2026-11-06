package com.amazon.alexa.voice.events;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class VoiceUiEventBroadcastReceiver_MembersInjector implements MembersInjector<VoiceUiEventBroadcastReceiver> {
    private final Provider<VoxUiEventProcessingService> eventProcessingServiceProvider;

    public VoiceUiEventBroadcastReceiver_MembersInjector(Provider<VoxUiEventProcessingService> provider) {
        this.eventProcessingServiceProvider = provider;
    }

    public static MembersInjector<VoiceUiEventBroadcastReceiver> create(Provider<VoxUiEventProcessingService> provider) {
        return new VoiceUiEventBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.voice.events.VoiceUiEventBroadcastReceiver.eventProcessingService")
    public static void injectEventProcessingService(VoiceUiEventBroadcastReceiver voiceUiEventBroadcastReceiver, VoxUiEventProcessingService voxUiEventProcessingService) {
        voiceUiEventBroadcastReceiver.eventProcessingService = voxUiEventProcessingService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoiceUiEventBroadcastReceiver voiceUiEventBroadcastReceiver) {
        injectEventProcessingService(voiceUiEventBroadcastReceiver, this.eventProcessingServiceProvider.get());
    }
}
