package com.amazon.alexa.client.core.capabilities;

import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MessageBundle {
    public static MessageBundle create(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        return new AutoValue_MessageBundle(message, messageProcessingCallbacks);
    }

    public abstract MessageProcessingCallbacks getCallbacks();

    public abstract Message getMessage();
}
