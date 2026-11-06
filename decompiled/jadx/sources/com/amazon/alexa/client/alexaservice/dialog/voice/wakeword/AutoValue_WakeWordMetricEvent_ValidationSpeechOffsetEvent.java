package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_ValidationSpeechOffsetEvent extends WakeWordMetricEvent.ValidationSpeechOffsetEvent {
    private final long speechOffset;

    public AutoValue_WakeWordMetricEvent_ValidationSpeechOffsetEvent(long j) {
        this.speechOffset = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WakeWordMetricEvent.ValidationSpeechOffsetEvent) && this.speechOffset == ((WakeWordMetricEvent.ValidationSpeechOffsetEvent) obj).getSpeechOffset();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.ValidationSpeechOffsetEvent
    public long getSpeechOffset() {
        return this.speechOffset;
    }

    public int hashCode() {
        long j = this.speechOffset;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.speechOffset, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("ValidationSpeechOffsetEvent{speechOffset="));
    }
}
