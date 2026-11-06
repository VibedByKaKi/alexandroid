package com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EnrollmentTerminateEvent extends EnrollmentTerminateEvent {
    private final String failureReason;

    public AutoValue_EnrollmentTerminateEvent(String str) {
        if (str != null) {
            this.failureReason = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null failureReason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EnrollmentTerminateEvent) {
            return this.failureReason.equals(((EnrollmentTerminateEvent) obj).failureReason());
        }
        return false;
    }

    @Override // com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events.EnrollmentTerminateEvent
    public String failureReason() {
        return this.failureReason;
    }

    public int hashCode() {
        return this.failureReason.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("EnrollmentTerminateEvent{failureReason="), this.failureReason, StringSubstitutor.DEFAULT_VAR_END);
    }
}
