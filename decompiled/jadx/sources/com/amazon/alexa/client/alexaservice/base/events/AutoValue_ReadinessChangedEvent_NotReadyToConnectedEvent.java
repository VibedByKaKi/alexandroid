package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.base.events.ReadinessChangedEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ReadinessChangedEvent_NotReadyToConnectedEvent extends ReadinessChangedEvent.NotReadyToConnectedEvent {
    private final long timeElapsedMs;

    public AutoValue_ReadinessChangedEvent_NotReadyToConnectedEvent(long j) {
        this.timeElapsedMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ReadinessChangedEvent.NotReadyToConnectedEvent) && this.timeElapsedMs == ((ReadinessChangedEvent.NotReadyToConnectedEvent) obj).timeElapsedMs();
    }

    public int hashCode() {
        long j = this.timeElapsedMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ReadinessChangedEvent
    public long timeElapsedMs() {
        return this.timeElapsedMs;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.timeElapsedMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("NotReadyToConnectedEvent{timeElapsedMs="));
    }
}
