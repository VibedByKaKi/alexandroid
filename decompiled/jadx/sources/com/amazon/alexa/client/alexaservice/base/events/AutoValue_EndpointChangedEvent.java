package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EndpointChangedEvent extends EndpointChangedEvent {
    private final String changeReason;

    public AutoValue_EndpointChangedEvent(String str) {
        if (str != null) {
            this.changeReason = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null changeReason");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.EndpointChangedEvent
    public String changeReason() {
        return this.changeReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EndpointChangedEvent) {
            return this.changeReason.equals(((EndpointChangedEvent) obj).changeReason());
        }
        return false;
    }

    public int hashCode() {
        return this.changeReason.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("EndpointChangedEvent{changeReason="), this.changeReason, StringSubstitutor.DEFAULT_VAR_END);
    }
}
