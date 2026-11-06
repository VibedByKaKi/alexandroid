package com.amazon.alexa.accessory.repositories.translation;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Translation;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface TranslationProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handlePauseTranslation(String str, Producer.Result<Common.ErrorCode> result);

        void handleResumeTranslation(String str, Producer.Result<Common.ErrorCode> result);

        void handleStartTranslation(String str, Producer.Result<Common.ErrorCode> result);

        void handleStopTranslation(String str, Translation.TranslationErrorCode translationErrorCode, Producer.Result<Common.ErrorCode> result);

        void handleTranslationResult(String str, Translation.TranslationErrorCode translationErrorCode, Translation.TranslationAction translationAction, Producer.Result<Common.ErrorCode> result);
    }
}
