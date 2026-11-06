package com.amazon.alexa.client.alexaservice.audio.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ScoMetricsCounterEvent extends ScoMetricsCounterEvent {
    private final int count;
    private final String name;

    public AutoValue_ScoMetricsCounterEvent(String str, int i) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.count = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScoMetricsCounterEvent) {
            ScoMetricsCounterEvent scoMetricsCounterEvent = (ScoMetricsCounterEvent) obj;
            if (this.name.equals(scoMetricsCounterEvent.getName()) && this.count == scoMetricsCounterEvent.getCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsCounterEvent
    public int getCount() {
        return this.count;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsCounterEvent
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.count ^ ((this.name.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScoMetricsCounterEvent{name=");
        sb.append(this.name);
        sb.append(", count=");
        return a$$ExternalSyntheticOutline0.m(sb, this.count, StringSubstitutor.DEFAULT_VAR_END);
    }
}
