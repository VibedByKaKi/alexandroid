package com.amazon.alexa.client.alexaservice.audio.core;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SpeechmarkDataSource {
    boolean isAvailable() throws IOException;

    void mark();

    int readBytes(byte[] bArr, int i) throws IOException;

    void reset() throws IOException;

    long skipAudioData(int i) throws IOException;
}
