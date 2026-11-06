package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_PlayDrmManifestLoadedEvent extends AudioPlayerPlaybackEvent.PlayDrmManifestLoadedEvent {
    private final long durationInMs;

    public AutoValue_AudioPlayerPlaybackEvent_PlayDrmManifestLoadedEvent(long j) {
        this.durationInMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AudioPlayerPlaybackEvent.PlayDrmManifestLoadedEvent) && this.durationInMs == ((AudioPlayerPlaybackEvent.PlayDrmManifestLoadedEvent) obj).getDurationInMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.PlayDrmManifestLoadedEvent
    public long getDurationInMs() {
        return this.durationInMs;
    }

    public int hashCode() {
        long j = this.durationInMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.durationInMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("PlayDrmManifestLoadedEvent{durationInMs="));
    }
}
