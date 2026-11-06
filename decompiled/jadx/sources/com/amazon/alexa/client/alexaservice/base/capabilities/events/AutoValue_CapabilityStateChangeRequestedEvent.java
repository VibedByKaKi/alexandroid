package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityStateChangeRequestedEvent extends CapabilityStateChangeRequestedEvent {
    private final CapabilityRefreshEvent.FinishedEvent event;

    public AutoValue_CapabilityStateChangeRequestedEvent(CapabilityRefreshEvent.FinishedEvent finishedEvent) {
        if (finishedEvent != null) {
            this.event = finishedEvent;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null event");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CapabilityStateChangeRequestedEvent) {
            return this.event.equals(((CapabilityStateChangeRequestedEvent) obj).getEvent());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityStateChangeRequestedEvent
    public CapabilityRefreshEvent.FinishedEvent getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode() ^ 1000003;
    }

    public String toString() {
        return "CapabilityStateChangeRequestedEvent{event=" + this.event + StringSubstitutor.DEFAULT_VAR_END;
    }
}
