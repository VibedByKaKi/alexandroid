package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MediaBrowserSessionDestroyedEvent extends MediaBrowserSessionDestroyedEvent {
    private final ExternalPlayerIdentifier playerId;

    public AutoValue_MediaBrowserSessionDestroyedEvent(ExternalPlayerIdentifier externalPlayerIdentifier) {
        if (externalPlayerIdentifier != null) {
            this.playerId = externalPlayerIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaBrowserSessionDestroyedEvent) {
            return this.playerId.equals(((MediaBrowserSessionDestroyedEvent) obj).getPlayerId());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaBrowserSessionDestroyedEvent
    public ExternalPlayerIdentifier getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return this.playerId.hashCode() ^ 1000003;
    }

    public String toString() {
        return "MediaBrowserSessionDestroyedEvent{playerId=" + this.playerId + StringSubstitutor.DEFAULT_VAR_END;
    }
}
