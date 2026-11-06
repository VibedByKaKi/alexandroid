package com.amazon.alexa.voice.ui.speech;

import com.amazon.alexa.voice.ui.util.BooleanProperty;
import com.amazon.alexa.voice.ui.util.FloatProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SpeechController {
    void cancel();

    FloatProperty getSoundLevel();

    boolean hasMinimumRequiredPermission();

    BooleanProperty isListening();

    boolean isMultiturn();

    BooleanProperty isProcessing();

    BooleanProperty isSpeaking();

    void recognizeSpeech();
}
