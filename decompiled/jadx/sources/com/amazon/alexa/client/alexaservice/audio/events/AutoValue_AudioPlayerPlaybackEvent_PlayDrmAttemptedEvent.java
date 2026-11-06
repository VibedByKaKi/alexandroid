package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.core.PlayItem;
import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_PlayDrmAttemptedEvent extends AudioPlayerPlaybackEvent.PlayDrmAttemptedEvent {
    private final PlayItem playItem;

    public AutoValue_AudioPlayerPlaybackEvent_PlayDrmAttemptedEvent(PlayItem playItem) {
        if (playItem != null) {
            this.playItem = playItem;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playItem");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioPlayerPlaybackEvent.PlayDrmAttemptedEvent) {
            return this.playItem.equals(((AudioPlayerPlaybackEvent.PlayDrmAttemptedEvent) obj).getPlayItem());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.PlayDrmAttemptedEvent
    public PlayItem getPlayItem() {
        return this.playItem;
    }

    public int hashCode() {
        return this.playItem.hashCode() ^ 1000003;
    }

    public String toString() {
        return "PlayDrmAttemptedEvent{playItem=" + this.playItem + StringSubstitutor.DEFAULT_VAR_END;
    }
}
