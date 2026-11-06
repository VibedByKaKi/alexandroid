package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RecordingSpeechStartAtEnhancedEvent extends RecordingSpeechStartAtEnhancedEvent {
    private final long recordingSpeechStartAt;

    public AutoValue_RecordingSpeechStartAtEnhancedEvent(long j) {
        this.recordingSpeechStartAt = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RecordingSpeechStartAtEnhancedEvent) && this.recordingSpeechStartAt == ((RecordingSpeechStartAtEnhancedEvent) obj).getRecordingSpeechStartAt();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.RecordingSpeechStartAtEnhancedEvent
    public long getRecordingSpeechStartAt() {
        return this.recordingSpeechStartAt;
    }

    public int hashCode() {
        long j = this.recordingSpeechStartAt;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.recordingSpeechStartAt, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("RecordingSpeechStartAtEnhancedEvent{recordingSpeechStartAt="));
    }
}
