package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.InternalAlexaState;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaStateChangedEvent extends AlexaStateChangedEvent {
    private final InternalAlexaState alexaState;

    public AutoValue_AlexaStateChangedEvent(InternalAlexaState internalAlexaState) {
        if (internalAlexaState != null) {
            this.alexaState = internalAlexaState;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaState");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaStateChangedEvent) {
            return this.alexaState.equals(((AlexaStateChangedEvent) obj).getAlexaState());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AlexaStateChangedEvent
    public InternalAlexaState getAlexaState() {
        return this.alexaState;
    }

    public int hashCode() {
        return this.alexaState.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AlexaStateChangedEvent{alexaState=" + this.alexaState + StringSubstitutor.DEFAULT_VAR_END;
    }
}
