package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.api.AlexaPlayerInfoState;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioItemStateChangedEvent extends AudioItemStateChangedEvent {
    private final AudioItemIdentifier audioItemIdentifier;
    private final long offset;
    private final AlexaPlayerInfoState playerInfoState;

    public AutoValue_AudioItemStateChangedEvent(AlexaPlayerInfoState alexaPlayerInfoState, AudioItemIdentifier audioItemIdentifier, long j) {
        if (alexaPlayerInfoState == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null playerInfoState");
            throw null;
        }
        this.playerInfoState = alexaPlayerInfoState;
        if (audioItemIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioItemIdentifier");
            throw null;
        }
        this.audioItemIdentifier = audioItemIdentifier;
        this.offset = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioItemStateChangedEvent) {
            AudioItemStateChangedEvent audioItemStateChangedEvent = (AudioItemStateChangedEvent) obj;
            if (this.playerInfoState.equals(audioItemStateChangedEvent.getPlayerInfoState()) && this.audioItemIdentifier.equals(audioItemStateChangedEvent.getAudioItemIdentifier()) && this.offset == audioItemStateChangedEvent.getOffset()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemStateChangedEvent
    public AudioItemIdentifier getAudioItemIdentifier() {
        return this.audioItemIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemStateChangedEvent
    public long getOffset() {
        return this.offset;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemStateChangedEvent
    public AlexaPlayerInfoState getPlayerInfoState() {
        return this.playerInfoState;
    }

    public int hashCode() {
        int hashCode = (((this.playerInfoState.hashCode() ^ 1000003) * 1000003) ^ this.audioItemIdentifier.hashCode()) * 1000003;
        long j = this.offset;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioItemStateChangedEvent{playerInfoState=");
        sb.append(this.playerInfoState);
        sb.append(", audioItemIdentifier=");
        sb.append(this.audioItemIdentifier);
        sb.append(", offset=");
        return a$$ExternalSyntheticOutline0.m(this.offset, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
