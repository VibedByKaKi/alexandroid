package com.amazon.alexa.assistant.opusencoder.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.opus.OpusEncoder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/DefaultOpusEncoderWrapper;", "Lcom/amazon/alexa/assistant/opusencoder/model/OpusEncoderWrapper;", "<init>", "()V", "opusEncoder", "Lcom/amazon/opus/OpusEncoder;", "init", "", "sampleRate", "", "channels", "application", "setBitrate", "bitrate", "useVbr", "setComplexity", "complexity", "encode", "pcm", "", "frameSize", ContactsModuleConstants.OUTPUT, "", "close", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultOpusEncoderWrapper implements OpusEncoderWrapper {

    @NotNull
    private final OpusEncoder opusEncoder = new OpusEncoder();

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public void close() {
        this.opusEncoder.close();
    }

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public int encode(@NotNull short[] pcm, int frameSize, @NotNull byte[] output) {
        pcm.getClass();
        output.getClass();
        return this.opusEncoder.encode(pcm, frameSize, output);
    }

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public void init(int sampleRate, int channels, int application) {
        this.opusEncoder.init(sampleRate, channels, application);
    }

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public void setBitrate(int bitrate) {
        this.opusEncoder.setBitrate(bitrate);
    }

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public void setComplexity(int complexity) {
        this.opusEncoder.setComplexity(complexity);
    }

    @Override // com.amazon.alexa.assistant.opusencoder.model.OpusEncoderWrapper
    public void useVbr(int useVbr) {
        this.opusEncoder.useVbr(useVbr);
    }
}
