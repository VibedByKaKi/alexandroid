package com.amazon.alexa.devicesetup.softap.handler;

import com.amazon.alexa.eventbus.api.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EchoSetupHandler {
    void handleEvent(Message message);

    void startListening();
}
