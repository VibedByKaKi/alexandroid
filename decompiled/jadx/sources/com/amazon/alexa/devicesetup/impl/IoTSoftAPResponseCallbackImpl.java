package com.amazon.alexa.devicesetup.impl;

import com.amazon.alexa.devicesetup.util.EventBusUtil;
import com.amazon.dee.sdk.iotsoftap.IoTSoftApResponseCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class IoTSoftAPResponseCallbackImpl implements IoTSoftApResponseCallback {
    @Override // com.amazon.dee.sdk.iotsoftap.IoTSoftApResponseCallback
    public void error(String str) {
        EventBusUtil.instance().sendMessageToEventBus(str);
    }

    @Override // com.amazon.dee.sdk.iotsoftap.IoTSoftApResponseCallback
    public void success(String str) {
        EventBusUtil.instance().sendMessageToEventBus(str);
    }

    @Override // com.amazon.dee.sdk.iotsoftap.IoTSoftApResponseCallback
    public void error(String str, String str2) {
        EventBusUtil.instance().sendMessageToEventBus(str, str2);
    }

    @Override // com.amazon.dee.sdk.iotsoftap.IoTSoftApResponseCallback
    public void success(String str, String str2) {
        EventBusUtil.instance().sendMessageToEventBus(str, str2);
    }
}
