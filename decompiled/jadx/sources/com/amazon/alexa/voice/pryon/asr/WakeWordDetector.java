package com.amazon.alexa.voice.pryon.asr;

import com.amazon.pryon.android.asr.PryonLite2000;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface WakeWordDetector {
    boolean isActive();

    void release();

    void removePryonLiteCallbacks();

    void setPryonLiteCallbacks(PryonLite2000.Callbacks callbacks);

    int setSensitivityThreshold(int i);

    void start();

    void stop();
}
