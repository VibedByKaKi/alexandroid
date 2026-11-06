package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlbumArtAcquiredEvent extends AlbumArtAcquiredEvent {
    private final AudioItemIdentifier audioItemIdentifier;

    public AutoValue_AlbumArtAcquiredEvent(AudioItemIdentifier audioItemIdentifier) {
        if (audioItemIdentifier != null) {
            this.audioItemIdentifier = audioItemIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioItemIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlbumArtAcquiredEvent) {
            return this.audioItemIdentifier.equals(((AlbumArtAcquiredEvent) obj).getAudioItemIdentifier());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AlbumArtAcquiredEvent
    public AudioItemIdentifier getAudioItemIdentifier() {
        return this.audioItemIdentifier;
    }

    public int hashCode() {
        return this.audioItemIdentifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AlbumArtAcquiredEvent{audioItemIdentifier=" + this.audioItemIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
