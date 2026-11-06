package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelStateEvent extends DownchannelStateEvent {
    private final DownchannelIdentifier downchannelIdentifier;
    private final boolean isEstablished;

    public AutoValue_DownchannelStateEvent(boolean z, DownchannelIdentifier downchannelIdentifier) {
        this.isEstablished = z;
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
        if (obj instanceof DownchannelStateEvent) {
            DownchannelStateEvent downchannelStateEvent = (DownchannelStateEvent) obj;
            if (this.isEstablished == downchannelStateEvent.getIsEstablished() && this.downchannelIdentifier.equals(downchannelStateEvent.getDownchannelIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelStateEvent
    public DownchannelIdentifier getDownchannelIdentifier() {
        return this.downchannelIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelStateEvent
    public boolean getIsEstablished() {
        return this.isEstablished;
    }

    public int hashCode() {
        return this.downchannelIdentifier.hashCode() ^ (((this.isEstablished ? 1231 : 1237) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DownchannelStateEvent{isEstablished=" + this.isEstablished + ", downchannelIdentifier=" + this.downchannelIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
