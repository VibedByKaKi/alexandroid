package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackEndedEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SpeechPlaybackEndedEvent extends SpeechPlaybackEndedEvent {
    private final SpeechPlaybackEndedEvent.Reason reason;
    private final SpeechToken token;

    public AutoValue_SpeechPlaybackEndedEvent(SpeechToken speechToken, SpeechPlaybackEndedEvent.Reason reason) {
        if (speechToken == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null token");
            throw null;
        }
        this.token = speechToken;
        if (reason != null) {
            this.reason = reason;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null reason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpeechPlaybackEndedEvent) {
            SpeechPlaybackEndedEvent speechPlaybackEndedEvent = (SpeechPlaybackEndedEvent) obj;
            if (this.token.equals(speechPlaybackEndedEvent.getToken()) && this.reason.equals(speechPlaybackEndedEvent.getReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackEndedEvent
    public SpeechPlaybackEndedEvent.Reason getReason() {
        return this.reason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackEndedEvent
    public SpeechToken getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.reason.hashCode() ^ ((this.token.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SpeechPlaybackEndedEvent{token=" + this.token + ", reason=" + this.reason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
