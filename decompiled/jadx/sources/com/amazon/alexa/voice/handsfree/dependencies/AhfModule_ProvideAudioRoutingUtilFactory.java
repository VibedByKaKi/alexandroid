package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.protocols.utils.AudioRoutingUtil;
import com.amazon.alexa.handsfree.protocols.utils.VoiceAppStatusProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AhfModule_ProvideAudioRoutingUtilFactory implements Factory<AudioRoutingUtil> {
    private final Provider<Context> contextProvider;
    private final AhfModule module;
    private final Provider<VoiceAppStatusProvider> voiceAppStatusProvider;

    public AhfModule_ProvideAudioRoutingUtilFactory(AhfModule ahfModule, Provider<Context> provider, Provider<VoiceAppStatusProvider> provider2) {
        this.module = ahfModule;
        this.contextProvider = provider;
        this.voiceAppStatusProvider = provider2;
    }

    public static AhfModule_ProvideAudioRoutingUtilFactory create(AhfModule ahfModule, Provider<Context> provider, Provider<VoiceAppStatusProvider> provider2) {
        return new AhfModule_ProvideAudioRoutingUtilFactory(ahfModule, provider, provider2);
    }

    public static AudioRoutingUtil provideAudioRoutingUtil(AhfModule ahfModule, Context context, VoiceAppStatusProvider voiceAppStatusProvider) {
        return (AudioRoutingUtil) Preconditions.checkNotNull(ahfModule.provideAudioRoutingUtil(context, voiceAppStatusProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public AudioRoutingUtil get() {
        return provideAudioRoutingUtil(this.module, this.contextProvider.get(), this.voiceAppStatusProvider.get());
    }
}
