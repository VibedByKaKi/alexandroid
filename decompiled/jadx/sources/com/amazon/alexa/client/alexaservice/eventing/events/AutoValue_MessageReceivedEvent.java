package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent;
import com.amazon.alexa.client.core.messages.Message;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MessageReceivedEvent extends MessageReceivedEvent {
    private final ResponseReceivedEvent.ResponseInfo getResponseInfo;
    private final Message message;

    public AutoValue_MessageReceivedEvent(Message message, ResponseReceivedEvent.ResponseInfo responseInfo) {
        if (message == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            throw null;
        }
        this.message = message;
        if (responseInfo != null) {
            this.getResponseInfo = responseInfo;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getResponseInfo");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageReceivedEvent) {
            MessageReceivedEvent messageReceivedEvent = (MessageReceivedEvent) obj;
            if (this.message.equals(messageReceivedEvent.message()) && this.getResponseInfo.equals(messageReceivedEvent.getResponseInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.MessageReceivedEvent
    public ResponseReceivedEvent.ResponseInfo getResponseInfo() {
        return this.getResponseInfo;
    }

    public int hashCode() {
        return this.getResponseInfo.hashCode() ^ ((this.message.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.MessageReceivedEvent
    public Message message() {
        return this.message;
    }

    public String toString() {
        return "MessageReceivedEvent{message=" + this.message + ", getResponseInfo=" + this.getResponseInfo + StringSubstitutor.DEFAULT_VAR_END;
    }
}
