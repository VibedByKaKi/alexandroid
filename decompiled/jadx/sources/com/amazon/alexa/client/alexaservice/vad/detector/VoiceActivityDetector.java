package com.amazon.alexa.client.alexaservice.vad.detector;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADConfiguration;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADModelConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VoiceActivityDetector {
    @NonNull
    VADModelConfiguration getModelConfiguration();

    void initialize(@NonNull VADConfiguration vADConfiguration) throws VADInitializationException;

    float processAudio(@NonNull short[] sArr);

    void release();

    void resetStates();
}
