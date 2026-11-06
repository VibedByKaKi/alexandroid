package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_WakeWordMetricEvent_ValidationLatencyEvent extends WakeWordMetricEvent.ValidationLatencyEvent {
    private final long latency;
    private final long startTimestamp;

    public AutoValue_WakeWordMetricEvent_ValidationLatencyEvent(long j, long j2) {
        this.latency = j;
        this.startTimestamp = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WakeWordMetricEvent.ValidationLatencyEvent) {
            WakeWordMetricEvent.ValidationLatencyEvent validationLatencyEvent = (WakeWordMetricEvent.ValidationLatencyEvent) obj;
            if (this.latency == validationLatencyEvent.getLatency() && this.startTimestamp == validationLatencyEvent.getStartTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.ValidationLatencyEvent
    public long getLatency() {
        return this.latency;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent.ValidationLatencyEvent
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        long j = this.latency;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.startTimestamp;
        return ((int) ((j2 >>> 32) ^ j2)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ValidationLatencyEvent{latency=");
        sb.append(this.latency);
        sb.append(", startTimestamp=");
        return a$$ExternalSyntheticOutline0.m(this.startTimestamp, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
