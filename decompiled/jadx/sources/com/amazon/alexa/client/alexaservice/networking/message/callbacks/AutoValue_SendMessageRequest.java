package com.amazon.alexa.client.alexaservice.networking.message.callbacks;

import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SendMessageRequest extends SendMessageRequest {
    private final SendMessageEvent event;
    private final RequestIdentifier requestId;

    public AutoValue_SendMessageRequest(RequestIdentifier requestIdentifier, SendMessageEvent sendMessageEvent) {
        if (requestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null requestId");
            throw null;
        }
        this.requestId = requestIdentifier;
        if (sendMessageEvent != null) {
            this.event = sendMessageEvent;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null event");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendMessageRequest) {
            SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
            if (this.requestId.equals(sendMessageRequest.getRequestId()) && this.event.equals(sendMessageRequest.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageRequest
    public SendMessageEvent getEvent() {
        return this.event;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageRequest
    public RequestIdentifier getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.event.hashCode() ^ ((this.requestId.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SendMessageRequest{requestId=" + this.requestId + ", event=" + this.event + StringSubstitutor.DEFAULT_VAR_END;
    }
}
