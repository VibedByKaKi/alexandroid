package com.amazon.alexa.assistant.opusencoder.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/opusencoder/model/OpusEncoderWrapper;", "", "init", "", "sampleRate", "", "channels", "application", "setBitrate", "bitrate", "useVbr", "setComplexity", "complexity", "encode", "pcm", "", "frameSize", ContactsModuleConstants.OUTPUT, "", "close", "opusencoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OpusEncoderWrapper {
    void close();

    int encode(@NotNull short[] pcm, int frameSize, @NotNull byte[] output);

    void init(int sampleRate, int channels, int application);

    void setBitrate(int bitrate);

    void setComplexity(int complexity);

    void useVbr(int useVbr);
}
