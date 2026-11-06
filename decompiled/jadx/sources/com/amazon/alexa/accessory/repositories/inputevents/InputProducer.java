package com.amazon.alexa.accessory.repositories.inputevents;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.protocol.Input;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface InputProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetInputConfiguration(int i, Producer.Result<Input.InputBehaviorConfigurationSet> result);

        void handleResetInputConfiguration(int i, Producer.Result<Input.InputBehaviorConfigurationSet> result);

        void handleSetInputConfiguration(int i, Input.InputBehaviorConfiguration inputBehaviorConfiguration, Producer.Result<CompletableResult.Value> result);
    }
}
