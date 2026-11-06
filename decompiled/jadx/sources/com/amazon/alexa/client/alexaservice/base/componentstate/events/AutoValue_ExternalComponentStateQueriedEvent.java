package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateQueriedEvent extends ExternalComponentStateQueriedEvent {
    private final long queriedTimeInMs;

    public AutoValue_ExternalComponentStateQueriedEvent(long j) {
        this.queriedTimeInMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ExternalComponentStateQueriedEvent) && this.queriedTimeInMs == ((ExternalComponentStateQueriedEvent) obj).getQueriedTimeInMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateQueriedEvent
    public long getQueriedTimeInMs() {
        return this.queriedTimeInMs;
    }

    public int hashCode() {
        long j = this.queriedTimeInMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.queriedTimeInMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("ExternalComponentStateQueriedEvent{queriedTimeInMs="));
    }
}
