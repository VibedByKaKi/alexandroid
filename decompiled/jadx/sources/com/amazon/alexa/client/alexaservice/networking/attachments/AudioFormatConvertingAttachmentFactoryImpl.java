package com.amazon.alexa.client.alexaservice.networking.attachments;

import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusAuthority;
import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusEncodingInputStream;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AudioFormatConvertingAttachmentFactoryImpl implements AudioFormatConvertingAttachmentFactory {
    private final OpusAuthority opusAuthority;

    @Inject
    public AudioFormatConvertingAttachmentFactoryImpl(OpusAuthority opusAuthority) {
        this.opusAuthority = opusAuthority;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.AudioFormatConvertingAttachmentFactory
    public Attachment createAudioFormatConvertingAttachment(Attachment attachment) {
        return (this.opusAuthority.enableOpus() && OpusEncodingInputStream.isSupported(attachment.getDataFormat())) ? new AudioFormatConvertingAttachment(attachment) : attachment;
    }
}
