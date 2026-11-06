package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MissedExternalCapabilityAddedEvent extends MissedExternalCapabilityAddedEvent {
    private final int numberOfCapabilities;

    public AutoValue_MissedExternalCapabilityAddedEvent(int i) {
        this.numberOfCapabilities = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MissedExternalCapabilityAddedEvent) && this.numberOfCapabilities == ((MissedExternalCapabilityAddedEvent) obj).getNumberOfCapabilities();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.MissedExternalCapabilityAddedEvent
    public int getNumberOfCapabilities() {
        return this.numberOfCapabilities;
    }

    public int hashCode() {
        return this.numberOfCapabilities ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("MissedExternalCapabilityAddedEvent{numberOfCapabilities="), this.numberOfCapabilities, StringSubstitutor.DEFAULT_VAR_END);
    }
}
