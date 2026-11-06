package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.PlayerError;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalMediaPlayerErrorEvent extends ExternalMediaPlayerErrorEvent {
    private final PlayerError playerError;
    private final ExternalPlayerIdentifier playerId;

    public AutoValue_ExternalMediaPlayerErrorEvent(@Nullable ExternalPlayerIdentifier externalPlayerIdentifier, PlayerError playerError) {
        this.playerId = externalPlayerIdentifier;
        if (playerError != null) {
            this.playerError = playerError;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerError");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalMediaPlayerErrorEvent) {
            ExternalMediaPlayerErrorEvent externalMediaPlayerErrorEvent = (ExternalMediaPlayerErrorEvent) obj;
            ExternalPlayerIdentifier externalPlayerIdentifier = this.playerId;
            if (externalPlayerIdentifier != null ? externalPlayerIdentifier.equals(externalMediaPlayerErrorEvent.getPlayerId()) : externalMediaPlayerErrorEvent.getPlayerId() == null) {
                if (this.playerError.equals(externalMediaPlayerErrorEvent.getPlayerError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerErrorEvent
    public PlayerError getPlayerError() {
        return this.playerError;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerErrorEvent
    @Nullable
    public ExternalPlayerIdentifier getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        ExternalPlayerIdentifier externalPlayerIdentifier = this.playerId;
        return this.playerError.hashCode() ^ (((externalPlayerIdentifier == null ? 0 : externalPlayerIdentifier.hashCode()) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ExternalMediaPlayerErrorEvent{playerId=" + this.playerId + ", playerError=" + this.playerError + StringSubstitutor.DEFAULT_VAR_END;
    }
}
