package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatus;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelAvailabilityChangedEvent extends DownchannelAvailabilityChangedEvent {
    private final DownchannelStatus status;

    public AutoValue_DownchannelAvailabilityChangedEvent(DownchannelStatus downchannelStatus) {
        if (downchannelStatus != null) {
            this.status = downchannelStatus;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null status");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelAvailabilityChangedEvent) {
            return this.status.equals(((DownchannelAvailabilityChangedEvent) obj).getStatus());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelAvailabilityChangedEvent
    public DownchannelStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DownchannelAvailabilityChangedEvent{status=" + this.status + StringSubstitutor.DEFAULT_VAR_END;
    }
}
