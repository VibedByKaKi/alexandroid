package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ServiceCreatedEvent extends ServiceCreatedEvent {
    private final long serviceCreationEndTimeMs;
    private final long serviceCreationStartTimeMs;

    public AutoValue_ServiceCreatedEvent(long j, long j2) {
        this.serviceCreationStartTimeMs = j;
        this.serviceCreationEndTimeMs = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ServiceCreatedEvent) {
            ServiceCreatedEvent serviceCreatedEvent = (ServiceCreatedEvent) obj;
            if (this.serviceCreationStartTimeMs == serviceCreatedEvent.getServiceCreationStartTimeMs() && this.serviceCreationEndTimeMs == serviceCreatedEvent.getServiceCreationEndTimeMs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ServiceCreatedEvent
    public long getServiceCreationEndTimeMs() {
        return this.serviceCreationEndTimeMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ServiceCreatedEvent
    public long getServiceCreationStartTimeMs() {
        return this.serviceCreationStartTimeMs;
    }

    public int hashCode() {
        long j = this.serviceCreationStartTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.serviceCreationEndTimeMs;
        return ((int) ((j2 >>> 32) ^ j2)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServiceCreatedEvent{serviceCreationStartTimeMs=");
        sb.append(this.serviceCreationStartTimeMs);
        sb.append(", serviceCreationEndTimeMs=");
        return a$$ExternalSyntheticOutline0.m(this.serviceCreationEndTimeMs, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
