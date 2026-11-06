package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent;
import com.amazon.alexa.client.core.messages.Message;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MessageReceivedEvent extends Event.NotGated {
    public static MessageReceivedEvent create(Message message, ResponseReceivedEvent.ResponseInfo responseInfo) {
        return new AutoValue_MessageReceivedEvent(message, responseInfo);
    }

    public abstract ResponseReceivedEvent.ResponseInfo getResponseInfo();

    public abstract Message message();
}
