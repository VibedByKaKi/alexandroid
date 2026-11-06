package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.core.messages.Message;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseHandledEvent extends ResponseHandledEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final long elapsedTimeOfResponse;
    private final long elapsedTimeOfResponseFragmentFullyReceived;
    private final Message message;

    public AutoValue_ResponseHandledEvent(DialogRequestIdentifier dialogRequestIdentifier, Message message, long j, long j2) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (message == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            throw null;
        }
        this.message = message;
        this.elapsedTimeOfResponse = j;
        this.elapsedTimeOfResponseFragmentFullyReceived = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseHandledEvent) {
            ResponseHandledEvent responseHandledEvent = (ResponseHandledEvent) obj;
            if (this.dialogRequestIdentifier.equals(responseHandledEvent.getDialogRequestIdentifier()) && this.message.equals(responseHandledEvent.getMessage()) && this.elapsedTimeOfResponse == responseHandledEvent.getElapsedTimeOfResponse() && this.elapsedTimeOfResponseFragmentFullyReceived == responseHandledEvent.getElapsedTimeOfResponseFragmentFullyReceived()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseHandledEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseHandledEvent
    public long getElapsedTimeOfResponse() {
        return this.elapsedTimeOfResponse;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseHandledEvent
    public long getElapsedTimeOfResponseFragmentFullyReceived() {
        return this.elapsedTimeOfResponseFragmentFullyReceived;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseHandledEvent
    public Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = (((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.message.hashCode()) * 1000003;
        long j = this.elapsedTimeOfResponse;
        long j2 = this.elapsedTimeOfResponseFragmentFullyReceived;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseHandledEvent{dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", elapsedTimeOfResponse=");
        sb.append(this.elapsedTimeOfResponse);
        sb.append(", elapsedTimeOfResponseFragmentFullyReceived=");
        return a$$ExternalSyntheticOutline0.m(this.elapsedTimeOfResponseFragmentFullyReceived, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
