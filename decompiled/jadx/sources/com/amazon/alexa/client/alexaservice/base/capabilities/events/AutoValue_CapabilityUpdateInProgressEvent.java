package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityUpdateInProgressEvent extends CapabilityUpdateInProgressEvent {
    private final String capabilityRefreshId;

    public AutoValue_CapabilityUpdateInProgressEvent(String str) {
        if (str != null) {
            this.capabilityRefreshId = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null capabilityRefreshId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CapabilityUpdateInProgressEvent) {
            return this.capabilityRefreshId.equals(((CapabilityUpdateInProgressEvent) obj).getCapabilityRefreshId());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityUpdateInProgressEvent
    public String getCapabilityRefreshId() {
        return this.capabilityRefreshId;
    }

    public int hashCode() {
        return this.capabilityRefreshId.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("CapabilityUpdateInProgressEvent{capabilityRefreshId="), this.capabilityRefreshId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
