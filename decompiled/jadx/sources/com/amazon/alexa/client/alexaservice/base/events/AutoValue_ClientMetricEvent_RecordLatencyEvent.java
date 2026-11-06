package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientMetricEvent_RecordLatencyEvent extends ClientMetricEvent.RecordLatencyEvent {
    private final long latency;
    private final String name;

    public AutoValue_ClientMetricEvent_RecordLatencyEvent(String str, long j) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.latency = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientMetricEvent.RecordLatencyEvent) {
            ClientMetricEvent.RecordLatencyEvent recordLatencyEvent = (ClientMetricEvent.RecordLatencyEvent) obj;
            if (this.name.equals(recordLatencyEvent.getName()) && this.latency == recordLatencyEvent.getLatency()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent.RecordLatencyEvent
    public long getLatency() {
        return this.latency;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        long j = this.latency;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecordLatencyEvent{name=");
        sb.append(this.name);
        sb.append(", latency=");
        return a$$ExternalSyntheticOutline0.m(this.latency, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
