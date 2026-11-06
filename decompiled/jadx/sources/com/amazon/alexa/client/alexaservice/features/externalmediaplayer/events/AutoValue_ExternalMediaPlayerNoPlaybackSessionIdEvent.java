package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalMediaPlayerNoPlaybackSessionIdEvent extends ExternalMediaPlayerNoPlaybackSessionIdEvent {
    private final PlayerEvent playerEvent;

    public AutoValue_ExternalMediaPlayerNoPlaybackSessionIdEvent(PlayerEvent playerEvent) {
        if (playerEvent != null) {
            this.playerEvent = playerEvent;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerEvent");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalMediaPlayerNoPlaybackSessionIdEvent) {
            return this.playerEvent.equals(((ExternalMediaPlayerNoPlaybackSessionIdEvent) obj).getPlayerEvent());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerNoPlaybackSessionIdEvent
    public PlayerEvent getPlayerEvent() {
        return this.playerEvent;
    }

    public int hashCode() {
        return this.playerEvent.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ExternalMediaPlayerNoPlaybackSessionIdEvent{playerEvent=" + this.playerEvent + StringSubstitutor.DEFAULT_VAR_END;
    }
}
