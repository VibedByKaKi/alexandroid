package com.amazon.alexa.client.alexaservice.features.bmclentitlement;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConversationAvailabilityChangedEvent extends ConversationAvailabilityChangedEvent {
    private final boolean available;

    public AutoValue_ConversationAvailabilityChangedEvent(boolean z) {
        this.available = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ConversationAvailabilityChangedEvent) && this.available == ((ConversationAvailabilityChangedEvent) obj).isAvailable();
    }

    public int hashCode() {
        return (this.available ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.bmclentitlement.ConversationAvailabilityChangedEvent
    public boolean isAvailable() {
        return this.available;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ConversationAvailabilityChangedEvent{available="), this.available, StringSubstitutor.DEFAULT_VAR_END);
    }
}
