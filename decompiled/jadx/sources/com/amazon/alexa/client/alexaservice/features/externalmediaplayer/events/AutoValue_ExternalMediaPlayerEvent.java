package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalMediaPlayerEvent extends ExternalMediaPlayerEvent {
    private final PlaybackSessionIdentifier playbackSessionId;
    private final PlayerEvent playerEvent;
    private final ExternalPlayerIdentifier playerId;

    public AutoValue_ExternalMediaPlayerEvent(ExternalPlayerIdentifier externalPlayerIdentifier, PlayerEvent playerEvent, PlaybackSessionIdentifier playbackSessionIdentifier) {
        if (externalPlayerIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerId");
            throw null;
        }
        this.playerId = externalPlayerIdentifier;
        if (playerEvent == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerEvent");
            throw null;
        }
        this.playerEvent = playerEvent;
        if (playbackSessionIdentifier != null) {
            this.playbackSessionId = playbackSessionIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playbackSessionId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalMediaPlayerEvent) {
            ExternalMediaPlayerEvent externalMediaPlayerEvent = (ExternalMediaPlayerEvent) obj;
            if (this.playerId.equals(externalMediaPlayerEvent.getPlayerId()) && this.playerEvent.equals(externalMediaPlayerEvent.getPlayerEvent()) && this.playbackSessionId.equals(externalMediaPlayerEvent.getPlaybackSessionId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerEvent
    public PlaybackSessionIdentifier getPlaybackSessionId() {
        return this.playbackSessionId;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerEvent
    public PlayerEvent getPlayerEvent() {
        return this.playerEvent;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerEvent
    public ExternalPlayerIdentifier getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return this.playbackSessionId.hashCode() ^ ((((this.playerId.hashCode() ^ 1000003) * 1000003) ^ this.playerEvent.hashCode()) * 1000003);
    }

    public String toString() {
        return "ExternalMediaPlayerEvent{playerId=" + this.playerId + ", playerEvent=" + this.playerEvent + ", playbackSessionId=" + this.playbackSessionId + StringSubstitutor.DEFAULT_VAR_END;
    }
}
