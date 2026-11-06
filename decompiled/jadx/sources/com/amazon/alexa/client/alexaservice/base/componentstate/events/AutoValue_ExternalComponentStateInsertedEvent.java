package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateInsertedEvent extends ExternalComponentStateInsertedEvent {
    private final long insertedTimeMs;

    public AutoValue_ExternalComponentStateInsertedEvent(long j) {
        this.insertedTimeMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ExternalComponentStateInsertedEvent) && this.insertedTimeMs == ((ExternalComponentStateInsertedEvent) obj).getInsertedTimeMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateInsertedEvent
    public long getInsertedTimeMs() {
        return this.insertedTimeMs;
    }

    public int hashCode() {
        long j = this.insertedTimeMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.insertedTimeMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("ExternalComponentStateInsertedEvent{insertedTimeMs="));
    }
}
