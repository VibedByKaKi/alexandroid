package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityRefreshEvent_TimedOutEvent extends CapabilityRefreshEvent.TimedOutEvent {
    private final long timeoutLengthMs;

    public AutoValue_CapabilityRefreshEvent_TimedOutEvent(long j) {
        this.timeoutLengthMs = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CapabilityRefreshEvent.TimedOutEvent) && this.timeoutLengthMs == ((CapabilityRefreshEvent.TimedOutEvent) obj).getTimeoutLengthMs();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent.TimedOutEvent
    public long getTimeoutLengthMs() {
        return this.timeoutLengthMs;
    }

    public int hashCode() {
        long j = this.timeoutLengthMs;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.timeoutLengthMs, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("TimedOutEvent{timeoutLengthMs="));
    }
}
