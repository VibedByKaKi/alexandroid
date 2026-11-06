package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelPingFailedEvent extends DownchannelPingFailedEvent {
    private final DownchannelIdentifier downchannelIdentifier;

    public AutoValue_DownchannelPingFailedEvent(DownchannelIdentifier downchannelIdentifier) {
        if (downchannelIdentifier != null) {
            this.downchannelIdentifier = downchannelIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null downchannelIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelPingFailedEvent) {
            return this.downchannelIdentifier.equals(((DownchannelPingFailedEvent) obj).getDownchannelIdentifier());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelPingFailedEvent
    public DownchannelIdentifier getDownchannelIdentifier() {
        return this.downchannelIdentifier;
    }

    public int hashCode() {
        return this.downchannelIdentifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DownchannelPingFailedEvent{downchannelIdentifier=" + this.downchannelIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
