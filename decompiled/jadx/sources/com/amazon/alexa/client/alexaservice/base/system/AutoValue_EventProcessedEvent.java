package com.amazon.alexa.client.alexaservice.base.system;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EventProcessedEvent extends EventProcessedEvent {
    private final String eventCorrelationToken;

    public AutoValue_EventProcessedEvent(String str) {
        if (str != null) {
            this.eventCorrelationToken = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventCorrelationToken");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventProcessedEvent) {
            return this.eventCorrelationToken.equals(((EventProcessedEvent) obj).getEventCorrelationToken());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.EventProcessedEvent
    public String getEventCorrelationToken() {
        return this.eventCorrelationToken;
    }

    public int hashCode() {
        return this.eventCorrelationToken.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("EventProcessedEvent{eventCorrelationToken="), this.eventCorrelationToken, StringSubstitutor.DEFAULT_VAR_END);
    }
}
