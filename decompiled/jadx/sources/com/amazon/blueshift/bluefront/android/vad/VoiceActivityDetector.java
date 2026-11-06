package com.amazon.blueshift.bluefront.android.vad;

import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface VoiceActivityDetector extends Closeable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VADState {
        NOT_STARTPOINTED,
        STARTPOINTED,
        ENDPOINTED
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    VADState processSamples(short[] sArr, int i) throws VADException;
}
