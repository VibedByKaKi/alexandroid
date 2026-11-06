package com.amazon.alexa.accessory.capabilities.speech;

import com.amazon.alexa.accessory.io.Sink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SpeechSession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SpeechSessionCallback {
        void onEndpointSpeech(SpeechSession speechSession);

        void onError(SpeechSession speechSession, Throwable th);

        void onRelease(SpeechSession speechSession);
    }

    void abort();

    void addCallback(SpeechSessionCallback speechSessionCallback);

    void endpointSpeech();

    Sink getSink();

    void release();

    void removeCallback(SpeechSessionCallback speechSessionCallback);
}
