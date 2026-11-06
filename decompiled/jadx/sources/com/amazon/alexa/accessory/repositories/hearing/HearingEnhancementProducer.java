package com.amazon.alexa.accessory.repositories.hearing;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.protocol.Hearing;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface HearingEnhancementProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetAudiogram(int i, Producer.Result<Hearing.Audiogram> result);

        void handleGetMediaEnhancementCorrectionAmount(int i, Producer.Result<Hearing.MediaEnhancementCorrectionAmount> result);

        void handleSetAudiogram(Hearing.Audiogram audiogram, Producer.Result<CompletableResult.Value> result);

        void handleSetMediaEnhancementCorrectionAmount(Hearing.MediaEnhancementCorrectionAmount mediaEnhancementCorrectionAmount, Producer.Result<CompletableResult.Value> result);
    }
}
