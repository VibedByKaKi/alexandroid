package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LivePreviewTranscriptEvent extends LivePreviewTranscriptEvent {
    private final String transcript;

    public AutoValue_LivePreviewTranscriptEvent(String str) {
        if (str != null) {
            this.transcript = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null transcript");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LivePreviewTranscriptEvent) {
            return this.transcript.equals(((LivePreviewTranscriptEvent) obj).getTranscript());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LivePreviewTranscriptEvent
    public String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        return this.transcript.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("LivePreviewTranscriptEvent{transcript="), this.transcript, StringSubstitutor.DEFAULT_VAR_END);
    }
}
