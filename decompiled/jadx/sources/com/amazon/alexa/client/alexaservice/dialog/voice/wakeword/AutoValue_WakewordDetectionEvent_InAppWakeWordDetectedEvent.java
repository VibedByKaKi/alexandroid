package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakewordDetectionEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakewordDetectionEvent_InAppWakeWordDetectedEvent extends WakewordDetectionEvent.InAppWakeWordDetectedEvent {
    private final long wakewordDetectionTimeMs;

    public AutoValue_WakewordDetectionEvent_InAppWakeWordDetectedEvent(long j) {
        this.wakewordDetectionTimeMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WakewordDetectionEvent.InAppWakeWordDetectedEvent) && this.wakewordDetectionTimeMs == ((WakewordDetectionEvent.InAppWakeWordDetectedEvent) obj).getWakewordDetectionTimeMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakewordDetectionEvent.InAppWakeWordDetectedEvent
    public long getWakewordDetectionTimeMs() {
        return this.wakewordDetectionTimeMs;
    }

    public int hashCode() {
        long j = this.wakewordDetectionTimeMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.wakewordDetectionTimeMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("InAppWakeWordDetectedEvent{wakewordDetectionTimeMs="));
    }
}
