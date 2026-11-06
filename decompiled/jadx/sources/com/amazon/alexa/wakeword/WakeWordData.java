package com.amazon.alexa.wakeword;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaWakeWord;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WakeWordData {
    private final AlexaWakeWord alexaWakeWord;
    private final AlexaAudioSink audioSink;
    private final byte[] metadata;

    public WakeWordData(AlexaAudioSink alexaAudioSink, AlexaWakeWord alexaWakeWord, @Nullable byte[] bArr) {
        Preconditions.notNull(alexaAudioSink, "audio sink is null");
        Preconditions.notNull(alexaWakeWord, "alexa wake word is null");
        this.audioSink = alexaAudioSink;
        this.alexaWakeWord = alexaWakeWord;
        this.metadata = bArr;
    }

    public AlexaWakeWord getAlexaWakeWord() {
        return this.alexaWakeWord;
    }

    public AlexaAudioSink getAudioSink() {
        return this.audioSink;
    }

    @Nullable
    public byte[] getMetadata() {
        return this.metadata;
    }
}
