package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ProcessMessageEvent extends ProcessMessageEvent {
    private final Message message;
    private final MessageProcessingCallbacks messageProcessingCallbacks;

    public AutoValue_ProcessMessageEvent(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        if (message == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            throw null;
        }
        this.message = message;
        if (messageProcessingCallbacks != null) {
            this.messageProcessingCallbacks = messageProcessingCallbacks;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null messageProcessingCallbacks");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessMessageEvent) {
            ProcessMessageEvent processMessageEvent = (ProcessMessageEvent) obj;
            if (this.message.equals(processMessageEvent.getMessage()) && this.messageProcessingCallbacks.equals(processMessageEvent.getMessageProcessingCallbacks())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ProcessMessageEvent
    public Message getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.ProcessMessageEvent
    public MessageProcessingCallbacks getMessageProcessingCallbacks() {
        return this.messageProcessingCallbacks;
    }

    public int hashCode() {
        return this.messageProcessingCallbacks.hashCode() ^ ((this.message.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ProcessMessageEvent{message=" + this.message + ", messageProcessingCallbacks=" + this.messageProcessingCallbacks + StringSubstitutor.DEFAULT_VAR_END;
    }
}
