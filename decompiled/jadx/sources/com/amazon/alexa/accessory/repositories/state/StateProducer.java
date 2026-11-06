package com.amazon.alexa.accessory.repositories.state;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface StateProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetState(StateFeature stateFeature, Producer.Result<StateOuterClass.State> result);

        void handleSetState(StateOuterClass.State state, Producer.Result<CompletableResult.Value> result);
    }
}
