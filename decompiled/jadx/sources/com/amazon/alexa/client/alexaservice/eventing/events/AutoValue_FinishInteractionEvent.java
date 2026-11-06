package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishInteractionEvent extends FinishInteractionEvent {
    private final InteractionIdentifier interactionIdentifier;

    public AutoValue_FinishInteractionEvent(InteractionIdentifier interactionIdentifier) {
        if (interactionIdentifier != null) {
            this.interactionIdentifier = interactionIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interactionIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishInteractionEvent) {
            return this.interactionIdentifier.equals(((FinishInteractionEvent) obj).getInteractionIdentifier());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishInteractionEvent
    public InteractionIdentifier getInteractionIdentifier() {
        return this.interactionIdentifier;
    }

    public int hashCode() {
        return this.interactionIdentifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "FinishInteractionEvent{interactionIdentifier=" + this.interactionIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
