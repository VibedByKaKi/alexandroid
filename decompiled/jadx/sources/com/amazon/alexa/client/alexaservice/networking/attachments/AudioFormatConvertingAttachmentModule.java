package com.amazon.alexa.client.alexaservice.networking.attachments;

import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusAuthority;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class AudioFormatConvertingAttachmentModule {
    private static final String TAG = "AudioFormatConvertingAttachmentModule";

    @Provides
    @Singleton
    public AudioFormatConvertingAttachmentFactory provideAudioFormatConvertingAttachmentFactory(OpusAuthority opusAuthority) {
        return new AudioFormatConvertingAttachmentFactoryImpl(opusAuthority);
    }
}
