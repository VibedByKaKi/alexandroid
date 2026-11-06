package com.amazon.alexa.client.alexaservice.audio.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ScoMetricsTimerEvent extends ScoMetricsTimerEvent {
    private final String name;
    private final long time;

    public AutoValue_ScoMetricsTimerEvent(String str, long j) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.time = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScoMetricsTimerEvent) {
            ScoMetricsTimerEvent scoMetricsTimerEvent = (ScoMetricsTimerEvent) obj;
            if (this.name.equals(scoMetricsTimerEvent.getName()) && this.time == scoMetricsTimerEvent.getTime()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsTimerEvent
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsTimerEvent
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        long j = this.time;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScoMetricsTimerEvent{name=");
        sb.append(this.name);
        sb.append(", time=");
        return a$$ExternalSyntheticOutline0.m(this.time, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
