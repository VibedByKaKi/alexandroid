package com.amazon.alexa.accessory.repositories.ambient;

import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AmbientContextProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetCurrentSignals(List<AmbientContextCategory> list, Producer.Result<List<AmbientContextSignalData>> result);

        void handleGetSubscribedSignals(Producer.Result<List<AmbientContextSubscriptionResult>> result);

        void handleGetSupportedSignals(Producer.Result<List<AmbientContextCategory>> result);

        void handleSubscribeSignals(List<AmbientContextCategory> list, Producer.Result<List<AmbientContextSubscriptionResult>> result);

        void handleUnsubscribeSignals(List<AmbientContextCategory> list, Producer.Result<List<AmbientContextSubscriptionResult>> result);
    }
}
