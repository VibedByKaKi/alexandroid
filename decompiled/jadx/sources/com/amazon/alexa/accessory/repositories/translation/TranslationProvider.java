package com.amazon.alexa.accessory.repositories.translation;

import com.amazon.alexa.accessory.protocol.Translation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface TranslationProvider {
    void providePauseTranslation(Translation.PauseTranslation pauseTranslation);

    void provideResumeTranslation(Translation.ResumeTranslation resumeTranslation);

    void provideStartTranslation(Translation.StartTranslation startTranslation);

    void provideStopTranslation(Translation.StopTranslation stopTranslation);

    void provideTranslationResult(Translation.TranslationResult translationResult);
}
