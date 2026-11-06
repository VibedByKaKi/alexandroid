package com.amazon.alexa.voice.metrics;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class VoiceMetricsBroadcastReceiver_MembersInjector implements MembersInjector<VoiceMetricsBroadcastReceiver> {
    private final Provider<VoxMetricEventProcessingService> eventProcessingServiceProvider;

    public VoiceMetricsBroadcastReceiver_MembersInjector(Provider<VoxMetricEventProcessingService> provider) {
        this.eventProcessingServiceProvider = provider;
    }

    public static MembersInjector<VoiceMetricsBroadcastReceiver> create(Provider<VoxMetricEventProcessingService> provider) {
        return new VoiceMetricsBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.voice.metrics.VoiceMetricsBroadcastReceiver.eventProcessingService")
    public static void injectEventProcessingService(VoiceMetricsBroadcastReceiver voiceMetricsBroadcastReceiver, VoxMetricEventProcessingService voxMetricEventProcessingService) {
        voiceMetricsBroadcastReceiver.eventProcessingService = voxMetricEventProcessingService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoiceMetricsBroadcastReceiver voiceMetricsBroadcastReceiver) {
        injectEventProcessingService(voiceMetricsBroadcastReceiver, this.eventProcessingServiceProvider.get());
    }
}
