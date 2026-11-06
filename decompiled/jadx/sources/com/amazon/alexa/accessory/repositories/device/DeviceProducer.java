package com.amazon.alexa.accessory.repositories.device;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface DeviceProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleCompleteSetup(boolean z, Producer.Result<Common.ErrorCode> result);

        void handleOverrideAssistant(boolean z, Producer.Result<Common.ErrorCode> result);

        void handleStartSetup(Producer.Result<Common.ErrorCode> result);

        void handleUpdateDeviceInformation(String str, int i, Producer.Result<Common.ErrorCode> result);
    }
}
