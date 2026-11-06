package com.amazon.alexa.accessory.streams.control;

import com.amazon.alexa.accessory.protocol.Accessories;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface ControlResponseHandler {
    void onResponseReceived(ControlStream controlStream, Accessories.Command command, Accessories.Response response) throws Exception;
}
