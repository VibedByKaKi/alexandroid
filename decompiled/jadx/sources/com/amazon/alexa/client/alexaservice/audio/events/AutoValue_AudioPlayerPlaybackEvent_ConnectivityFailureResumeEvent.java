package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioPlayerPlaybackEvent_ConnectivityFailureResumeEvent extends AudioPlayerPlaybackEvent.ConnectivityFailureResumeEvent {
    private final boolean didTimeoutElapse;

    public AutoValue_AudioPlayerPlaybackEvent_ConnectivityFailureResumeEvent(boolean z) {
        this.didTimeoutElapse = z;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioPlayerPlaybackEvent.ConnectivityFailureResumeEvent
    public boolean didTimeoutElapse() {
        return this.didTimeoutElapse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AudioPlayerPlaybackEvent.ConnectivityFailureResumeEvent) && this.didTimeoutElapse == ((AudioPlayerPlaybackEvent.ConnectivityFailureResumeEvent) obj).didTimeoutElapse();
    }

    public int hashCode() {
        return (this.didTimeoutElapse ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ConnectivityFailureResumeEvent{didTimeoutElapse="), this.didTimeoutElapse, StringSubstitutor.DEFAULT_VAR_END);
    }
}
