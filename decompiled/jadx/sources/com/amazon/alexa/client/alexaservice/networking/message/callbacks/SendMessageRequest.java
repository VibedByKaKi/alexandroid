package com.amazon.alexa.client.alexaservice.networking.message.callbacks;

import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SendMessageRequest {
    public static SendMessageRequest create(RequestIdentifier requestIdentifier, SendMessageEvent sendMessageEvent) {
        return new AutoValue_SendMessageRequest(requestIdentifier, sendMessageEvent);
    }

    public abstract SendMessageEvent getEvent();

    public abstract RequestIdentifier getRequestId();
}
