package com.amazon.alexa.client.alexaservice.networking.attachments;

import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusAuthority;
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
public final class AudioFormatConvertingAttachmentFactoryImpl_Factory implements Factory<AudioFormatConvertingAttachmentFactoryImpl> {
    private final Provider<OpusAuthority> opusAuthorityProvider;

    public AudioFormatConvertingAttachmentFactoryImpl_Factory(Provider<OpusAuthority> provider) {
        this.opusAuthorityProvider = provider;
    }

    public static AudioFormatConvertingAttachmentFactoryImpl_Factory create(Provider<OpusAuthority> provider) {
        return new AudioFormatConvertingAttachmentFactoryImpl_Factory(provider);
    }

    public static AudioFormatConvertingAttachmentFactoryImpl newInstance(OpusAuthority opusAuthority) {
        return new AudioFormatConvertingAttachmentFactoryImpl(opusAuthority);
    }

    @Override // javax.inject.Provider
    public AudioFormatConvertingAttachmentFactoryImpl get() {
        return newInstance(this.opusAuthorityProvider.get());
    }
}
