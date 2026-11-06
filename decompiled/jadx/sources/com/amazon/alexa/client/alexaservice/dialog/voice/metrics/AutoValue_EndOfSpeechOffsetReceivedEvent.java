package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EndOfSpeechOffsetReceivedEvent extends EndOfSpeechOffsetReceivedEvent {
    private final long endOfSpeechOffsetMilliseconds;

    public AutoValue_EndOfSpeechOffsetReceivedEvent(long j) {
        this.endOfSpeechOffsetMilliseconds = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EndOfSpeechOffsetReceivedEvent) && this.endOfSpeechOffsetMilliseconds == ((EndOfSpeechOffsetReceivedEvent) obj).getEndOfSpeechOffsetMilliseconds();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.EndOfSpeechOffsetReceivedEvent
    public long getEndOfSpeechOffsetMilliseconds() {
        return this.endOfSpeechOffsetMilliseconds;
    }

    public int hashCode() {
        long j = this.endOfSpeechOffsetMilliseconds;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.endOfSpeechOffsetMilliseconds, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("EndOfSpeechOffsetReceivedEvent{endOfSpeechOffsetMilliseconds="));
    }
}
