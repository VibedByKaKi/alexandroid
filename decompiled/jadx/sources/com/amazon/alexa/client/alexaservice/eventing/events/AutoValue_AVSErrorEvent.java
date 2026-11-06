package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AVSErrorEvent extends AVSErrorEvent {
    private final int errorCode;

    public AutoValue_AVSErrorEvent(int i) {
        this.errorCode = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AVSErrorEvent) && this.errorCode == ((AVSErrorEvent) obj).getErrorCode();
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AVSErrorEvent
    public int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return this.errorCode ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("AVSErrorEvent{errorCode="), this.errorCode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
