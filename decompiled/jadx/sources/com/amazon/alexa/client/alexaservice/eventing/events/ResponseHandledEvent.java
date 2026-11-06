package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.core.messages.Message;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ResponseHandledEvent extends Event.NotGated {
    public static ResponseHandledEvent create(DialogRequestIdentifier dialogRequestIdentifier, Message message, long j, long j2) {
        return new AutoValue_ResponseHandledEvent(dialogRequestIdentifier, message, j, j2);
    }

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract long getElapsedTimeOfResponse();

    public abstract long getElapsedTimeOfResponseFragmentFullyReceived();

    public abstract Message getMessage();
}
