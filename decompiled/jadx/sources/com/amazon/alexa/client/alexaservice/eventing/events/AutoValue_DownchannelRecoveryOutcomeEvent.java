package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelRecoveryOutcomeEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelRecoveryOutcomeEvent extends DownchannelRecoveryOutcomeEvent {
    private final DownchannelRecoveryOutcomeEvent.Outcome outcome;

    public AutoValue_DownchannelRecoveryOutcomeEvent(DownchannelRecoveryOutcomeEvent.Outcome outcome) {
        if (outcome != null) {
            this.outcome = outcome;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null outcome");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelRecoveryOutcomeEvent) {
            return this.outcome.equals(((DownchannelRecoveryOutcomeEvent) obj).getOutcome());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelRecoveryOutcomeEvent
    public DownchannelRecoveryOutcomeEvent.Outcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DownchannelRecoveryOutcomeEvent{outcome=" + this.outcome + StringSubstitutor.DEFAULT_VAR_END;
    }
}
