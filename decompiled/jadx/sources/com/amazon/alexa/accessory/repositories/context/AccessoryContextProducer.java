package com.amazon.alexa.accessory.repositories.context;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Moments;
import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AccessoryContextProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetCurrentAccessoryContextData(List<Moments.AccessoryContextCategory> list, Producer.Result<List<Moments.AccessoryContextDataPoint>> result);

        void handleGetTimeIntervalSinceUserLastSpoke(Producer.Result<Integer> result);

        void handleStartLiveAccessoryContextData(List<Moments.AccessoryContextCategory> list, Producer.Result<Common.ErrorCode> result);

        void handleStopLiveAccessoryContextData(List<Moments.AccessoryContextCategory> list, Producer.Result<Common.ErrorCode> result);
    }
}
