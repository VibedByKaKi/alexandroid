package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.MicrophoneMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MicrophoneMetricEvent_MicrophoneInitializationSuccessEvent extends MicrophoneMetricEvent.MicrophoneInitializationSuccessEvent {
    private final long initializationTime;

    public AutoValue_MicrophoneMetricEvent_MicrophoneInitializationSuccessEvent(long j) {
        this.initializationTime = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MicrophoneMetricEvent.MicrophoneInitializationSuccessEvent) && this.initializationTime == ((MicrophoneMetricEvent.MicrophoneInitializationSuccessEvent) obj).getInitializationTime();
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.MicrophoneMetricEvent.MicrophoneInitializationSuccessEvent
    public long getInitializationTime() {
        return this.initializationTime;
    }

    public int hashCode() {
        long j = this.initializationTime;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.initializationTime, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("MicrophoneInitializationSuccessEvent{initializationTime="));
    }
}
