package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MediaBrowserConnectionStatusEvent extends MediaBrowserConnectionStatusEvent {
    private final boolean isConnected;
    private final int numberOfAttempts;
    private final ExternalPlayerIdentifier playerId;

    public AutoValue_MediaBrowserConnectionStatusEvent(ExternalPlayerIdentifier externalPlayerIdentifier, boolean z, int i) {
        if (externalPlayerIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerId");
            throw null;
        }
        this.playerId = externalPlayerIdentifier;
        this.isConnected = z;
        this.numberOfAttempts = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaBrowserConnectionStatusEvent) {
            MediaBrowserConnectionStatusEvent mediaBrowserConnectionStatusEvent = (MediaBrowserConnectionStatusEvent) obj;
            if (this.playerId.equals(mediaBrowserConnectionStatusEvent.getPlayerId()) && this.isConnected == mediaBrowserConnectionStatusEvent.getIsConnected() && this.numberOfAttempts == mediaBrowserConnectionStatusEvent.getNumberOfAttempts()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaBrowserConnectionStatusEvent
    public boolean getIsConnected() {
        return this.isConnected;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaBrowserConnectionStatusEvent
    public int getNumberOfAttempts() {
        return this.numberOfAttempts;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaBrowserConnectionStatusEvent
    public ExternalPlayerIdentifier getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return this.numberOfAttempts ^ ((((this.playerId.hashCode() ^ 1000003) * 1000003) ^ (this.isConnected ? 1231 : 1237)) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaBrowserConnectionStatusEvent{playerId=");
        sb.append(this.playerId);
        sb.append(", isConnected=");
        sb.append(this.isConnected);
        sb.append(", numberOfAttempts=");
        return a$$ExternalSyntheticOutline0.m(sb, this.numberOfAttempts, StringSubstitutor.DEFAULT_VAR_END);
    }
}
