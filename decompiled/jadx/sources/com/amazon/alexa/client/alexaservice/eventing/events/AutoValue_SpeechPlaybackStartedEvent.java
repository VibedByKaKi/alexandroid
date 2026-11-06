package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SpeechPlaybackStartedEvent extends SpeechPlaybackStartedEvent {
    private final SpeechToken token;

    public AutoValue_SpeechPlaybackStartedEvent(SpeechToken speechToken) {
        if (speechToken != null) {
            this.token = speechToken;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null token");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpeechPlaybackStartedEvent) {
            return this.token.equals(((SpeechPlaybackStartedEvent) obj).getToken());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackStartedEvent
    public SpeechToken getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SpeechPlaybackStartedEvent{token=" + this.token + StringSubstitutor.DEFAULT_VAR_END;
    }
}
