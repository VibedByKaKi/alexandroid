package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_InitializationCompletedEvent extends InitializationCompletedEvent {
    private final long serviceInitializationTimeMs;

    public AutoValue_InitializationCompletedEvent(long j) {
        this.serviceInitializationTimeMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InitializationCompletedEvent) && this.serviceInitializationTimeMs == ((InitializationCompletedEvent) obj).getServiceInitializationTimeMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InitializationCompletedEvent
    public long getServiceInitializationTimeMs() {
        return this.serviceInitializationTimeMs;
    }

    public int hashCode() {
        long j = this.serviceInitializationTimeMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.serviceInitializationTimeMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("InitializationCompletedEvent{serviceInitializationTimeMs="));
    }
}
