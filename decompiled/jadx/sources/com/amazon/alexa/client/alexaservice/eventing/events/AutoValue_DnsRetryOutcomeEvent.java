package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.DnsRetryOutcomeEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DnsRetryOutcomeEvent extends DnsRetryOutcomeEvent {
    private final int maxRetries;
    private final DnsRetryOutcomeEvent.Outcome outcome;

    public AutoValue_DnsRetryOutcomeEvent(int i, DnsRetryOutcomeEvent.Outcome outcome) {
        this.maxRetries = i;
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
        if (obj instanceof DnsRetryOutcomeEvent) {
            DnsRetryOutcomeEvent dnsRetryOutcomeEvent = (DnsRetryOutcomeEvent) obj;
            if (this.maxRetries == dnsRetryOutcomeEvent.getMaxRetries() && this.outcome.equals(dnsRetryOutcomeEvent.getOutcome())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DnsRetryOutcomeEvent
    public int getMaxRetries() {
        return this.maxRetries;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DnsRetryOutcomeEvent
    public DnsRetryOutcomeEvent.Outcome getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return this.outcome.hashCode() ^ ((this.maxRetries ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DnsRetryOutcomeEvent{maxRetries=" + this.maxRetries + ", outcome=" + this.outcome + StringSubstitutor.DEFAULT_VAR_END;
    }
}
