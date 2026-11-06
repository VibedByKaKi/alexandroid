package com.amazon.alexa.accessory.speechapi.voicesdk.speech;

import com.amazon.alexa.accessory.speechapi.speech.AccessorySink;
import com.amazon.alexa.api.AlexaAudioSink;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/speech/VoxAudioSink;", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessorySink;", "audioSink", "Lcom/amazon/alexa/api/AlexaAudioSink;", "<init>", "(Lcom/amazon/alexa/api/AlexaAudioSink;)V", "getAudioSink", "()Lcom/amazon/alexa/api/AlexaAudioSink;", "getAccessoryOutputStream", "Ljava/io/OutputStream;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxAudioSink implements AccessorySink {

    @NotNull
    private final AlexaAudioSink audioSink;

    public /* synthetic */ VoxAudioSink(AlexaAudioSink alexaAudioSink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AlexaAudioSink() : alexaAudioSink);
    }

    @Override // com.amazon.alexa.accessory.speechapi.speech.AccessorySink
    @NotNull
    public OutputStream getAccessoryOutputStream() {
        OutputStream openForWriting = this.audioSink.openForWriting();
        openForWriting.getClass();
        return openForWriting;
    }

    @NotNull
    public final AlexaAudioSink getAudioSink() {
        return this.audioSink;
    }

    public VoxAudioSink(@NotNull AlexaAudioSink alexaAudioSink) {
        alexaAudioSink.getClass();
        this.audioSink = alexaAudioSink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoxAudioSink() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
