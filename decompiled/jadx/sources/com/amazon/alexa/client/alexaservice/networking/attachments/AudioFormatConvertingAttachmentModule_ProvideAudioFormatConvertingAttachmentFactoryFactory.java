package com.amazon.alexa.client.alexaservice.networking.attachments;

import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusAuthority;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AudioFormatConvertingAttachmentModule_ProvideAudioFormatConvertingAttachmentFactoryFactory implements Factory<AudioFormatConvertingAttachmentFactory> {
    private final AudioFormatConvertingAttachmentModule module;
    private final Provider<OpusAuthority> opusAuthorityProvider;

    public AudioFormatConvertingAttachmentModule_ProvideAudioFormatConvertingAttachmentFactoryFactory(AudioFormatConvertingAttachmentModule audioFormatConvertingAttachmentModule, Provider<OpusAuthority> provider) {
        this.module = audioFormatConvertingAttachmentModule;
        this.opusAuthorityProvider = provider;
    }

    public static AudioFormatConvertingAttachmentModule_ProvideAudioFormatConvertingAttachmentFactoryFactory create(AudioFormatConvertingAttachmentModule audioFormatConvertingAttachmentModule, Provider<OpusAuthority> provider) {
        return new AudioFormatConvertingAttachmentModule_ProvideAudioFormatConvertingAttachmentFactoryFactory(audioFormatConvertingAttachmentModule, provider);
    }

    public static AudioFormatConvertingAttachmentFactory provideAudioFormatConvertingAttachmentFactory(AudioFormatConvertingAttachmentModule audioFormatConvertingAttachmentModule, OpusAuthority opusAuthority) {
        return (AudioFormatConvertingAttachmentFactory) Preconditions.checkNotNullFromProvides(audioFormatConvertingAttachmentModule.provideAudioFormatConvertingAttachmentFactory(opusAuthority));
    }

    @Override // javax.inject.Provider
    public AudioFormatConvertingAttachmentFactory get() {
        return provideAudioFormatConvertingAttachmentFactory(this.module, this.opusAuthorityProvider.get());
    }
}
