package com.amazon.alexa.tarazed.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface AlexaTarazedService {
    void endSession();

    void initialize();

    boolean isSessionActive();

    void pauseSession();

    void resumeSession();

    void suspendSession();
}
