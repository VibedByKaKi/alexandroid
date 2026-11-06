package com.amazon.alexa.wakeword;

import com.amazon.alexa.api.AlexaWakeWord;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EnrollmentData {
    private final AlexaWakeWord alexaWakeWord;
    private final short[] example;
    private final byte[] metadata;

    public EnrollmentData(AlexaWakeWord alexaWakeWord, short[] sArr, byte[] bArr) {
        Preconditions.notNull(alexaWakeWord, "alexa wake word is null");
        Preconditions.notNull(sArr, "example is null");
        Preconditions.notNull(bArr, "metadata is null");
        this.alexaWakeWord = alexaWakeWord;
        this.example = sArr;
        this.metadata = bArr;
    }

    public AlexaWakeWord getAlexaWakeWord() {
        return this.alexaWakeWord;
    }

    public short[] getExample() {
        return this.example;
    }

    public byte[] getMetadata() {
        return this.metadata;
    }
}
