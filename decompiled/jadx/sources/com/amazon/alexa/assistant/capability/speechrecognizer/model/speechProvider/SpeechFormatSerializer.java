package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechFormat;
import com.amazon.alexa.assistant.opusencoder.model.OpusConstants;
import com.amazon.alexa.audiocapturer.RecordingRunnable;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormatSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechFormat;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SpeechFormatSerializer implements KSerializer<SpeechFormat> {

    @NotNull
    public static final SpeechFormatSerializer INSTANCE = new SpeechFormatSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("SpeechFormat", PrimitiveKind.STRING.INSTANCE);

    private SpeechFormatSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SpeechFormat deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        String decodeString = decoder.decodeString();
        if (Intrinsics.areEqual(decodeString, RecordingRunnable.USER_SPEECH_AUDIO_FORMAT)) {
            return SpeechFormat.Pcm.INSTANCE;
        }
        if (Intrinsics.areEqual(decodeString, OpusConstants.FORMAT)) {
            return new SpeechFormat.Opus(SpeechFormat.OpusBitrate.KBPS_32);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown SpeechFormat: ", decodeString));
        return null;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SpeechFormat value) {
        String str;
        encoder.getClass();
        value.getClass();
        if (value instanceof SpeechFormat.Pcm) {
            str = RecordingRunnable.USER_SPEECH_AUDIO_FORMAT;
        } else {
            if (!(value instanceof SpeechFormat.Opus)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            str = OpusConstants.FORMAT;
        }
        encoder.encodeString(str);
    }
}
