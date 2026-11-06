package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_WakeWordModelDownloadInterruptedEvent extends WakeWordMetricEvent.WakeWordModelDownloadInterruptedEvent {
    private final long requestDuration;

    public AutoValue_WakeWordMetricEvent_WakeWordModelDownloadInterruptedEvent(long j) {
        this.requestDuration = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WakeWordMetricEvent.WakeWordModelDownloadInterruptedEvent) && this.requestDuration == ((WakeWordMetricEvent.WakeWordModelDownloadInterruptedEvent) obj).getRequestDuration();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.WakeWordModelDownloadInterruptedEvent
    public long getRequestDuration() {
        return this.requestDuration;
    }

    public int hashCode() {
        long j = this.requestDuration;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.requestDuration, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("WakeWordModelDownloadInterruptedEvent{requestDuration="));
    }
}
