package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.wakeword.pryon.WakeWordDetectionCallbacks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface WakeWordValidationCallbacks extends WakeWordDetectionCallbacks {
    void onWakeWordDetectionFailure(Throwable th);

    void onWakeWordEngineFailure(Throwable th);

    void onWakeWordInputAudioFailure(Throwable th);
}
