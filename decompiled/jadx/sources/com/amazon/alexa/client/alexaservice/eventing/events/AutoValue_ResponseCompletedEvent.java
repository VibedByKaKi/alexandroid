package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCompletedEvent extends ResponseCompletedEvent {
    private final RequestIdentifier requestIdentifier;

    public AutoValue_ResponseCompletedEvent(RequestIdentifier requestIdentifier) {
        if (requestIdentifier != null) {
            this.requestIdentifier = requestIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null requestIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCompletedEvent) {
            return this.requestIdentifier.equals(((ResponseCompletedEvent) obj).getRequestIdentifier());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseCompletedEvent
    public RequestIdentifier getRequestIdentifier() {
        return this.requestIdentifier;
    }

    public int hashCode() {
        return this.requestIdentifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ResponseCompletedEvent{requestIdentifier=" + this.requestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
