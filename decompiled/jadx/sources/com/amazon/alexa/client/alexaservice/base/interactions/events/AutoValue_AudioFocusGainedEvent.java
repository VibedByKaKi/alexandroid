package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioFocusGainedEvent extends AudioFocusGainedEvent {
    private final AudioMetadata.AudioFocusDuration getDuration;
    private final boolean wasAnotherAppPlayingMusic;
    private final boolean wasEmpPlayingMusic;

    public AutoValue_AudioFocusGainedEvent(AudioMetadata.AudioFocusDuration audioFocusDuration, boolean z, boolean z2) {
        if (audioFocusDuration == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getDuration");
            throw null;
        }
        this.getDuration = audioFocusDuration;
        this.wasAnotherAppPlayingMusic = z;
        this.wasEmpPlayingMusic = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioFocusGainedEvent) {
            AudioFocusGainedEvent audioFocusGainedEvent = (AudioFocusGainedEvent) obj;
            if (this.getDuration.equals(audioFocusGainedEvent.getDuration()) && this.wasAnotherAppPlayingMusic == audioFocusGainedEvent.wasAnotherAppPlayingMusic() && this.wasEmpPlayingMusic == audioFocusGainedEvent.wasEmpPlayingMusic()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusGainedEvent
    public AudioMetadata.AudioFocusDuration getDuration() {
        return this.getDuration;
    }

    public int hashCode() {
        return ((((this.getDuration.hashCode() ^ 1000003) * 1000003) ^ (this.wasAnotherAppPlayingMusic ? 1231 : 1237)) * 1000003) ^ (this.wasEmpPlayingMusic ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioFocusGainedEvent{getDuration=");
        sb.append(this.getDuration);
        sb.append(", wasAnotherAppPlayingMusic=");
        sb.append(this.wasAnotherAppPlayingMusic);
        sb.append(", wasEmpPlayingMusic=");
        return a$$ExternalSyntheticOutline0.m(sb, this.wasEmpPlayingMusic, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusGainedEvent
    public boolean wasAnotherAppPlayingMusic() {
        return this.wasAnotherAppPlayingMusic;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusGainedEvent
    public boolean wasEmpPlayingMusic() {
        return this.wasEmpPlayingMusic;
    }
}
