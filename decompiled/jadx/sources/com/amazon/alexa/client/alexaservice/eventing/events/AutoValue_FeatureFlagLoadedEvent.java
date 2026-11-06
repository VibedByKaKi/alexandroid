package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FeatureFlagLoadedEvent extends FeatureFlagLoadedEvent {
    private final long latencyInMilliseconds;

    public AutoValue_FeatureFlagLoadedEvent(long j) {
        this.latencyInMilliseconds = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FeatureFlagLoadedEvent) && this.latencyInMilliseconds == ((FeatureFlagLoadedEvent) obj).getLatencyInMilliseconds();
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FeatureFlagLoadedEvent
    public long getLatencyInMilliseconds() {
        return this.latencyInMilliseconds;
    }

    public int hashCode() {
        long j = this.latencyInMilliseconds;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.latencyInMilliseconds, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("FeatureFlagLoadedEvent{latencyInMilliseconds="));
    }
}
