package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateDeletedEvent extends ExternalComponentStateDeletedEvent {
    private final long deletedTimeInMs;

    public AutoValue_ExternalComponentStateDeletedEvent(long j) {
        this.deletedTimeInMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ExternalComponentStateDeletedEvent) && this.deletedTimeInMs == ((ExternalComponentStateDeletedEvent) obj).getDeletedTimeInMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateDeletedEvent
    public long getDeletedTimeInMs() {
        return this.deletedTimeInMs;
    }

    public int hashCode() {
        long j = this.deletedTimeInMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.deletedTimeInMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("ExternalComponentStateDeletedEvent{deletedTimeInMs="));
    }
}
