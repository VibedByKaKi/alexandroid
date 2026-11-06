package com.amazon.alexa.assistant.capability.speechrecognizer;

import com.amazon.alexa.assistant.foundation.model.AudioEncoder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/DefaultAudioEncoder;", "Lcom/amazon/alexa/assistant/foundation/model/AudioEncoder;", "<init>", "()V", "format", "", "getFormat", "()Ljava/lang/String;", "encode", "", "source", "encoderDestroy", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultAudioEncoder implements AudioEncoder {

    @NotNull
    public static final String PCM = "PCM";

    @NotNull
    private final String format = PCM;

    @Override // com.amazon.alexa.assistant.foundation.model.AudioEncoder
    @NotNull
    public byte[] encode(@NotNull byte[] source) {
        source.getClass();
        return source;
    }

    @Override // com.amazon.alexa.assistant.foundation.model.AudioEncoder
    @NotNull
    public String getFormat() {
        return this.format;
    }

    @Override // com.amazon.alexa.assistant.foundation.model.AudioEncoder
    public void encoderDestroy() {
    }
}
