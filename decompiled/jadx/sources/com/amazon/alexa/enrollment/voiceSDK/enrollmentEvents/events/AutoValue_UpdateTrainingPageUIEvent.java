package com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UpdateTrainingPageUIEvent extends UpdateTrainingPageUIEvent {
    private final String enrollmentState;

    public AutoValue_UpdateTrainingPageUIEvent(String str) {
        if (str != null) {
            this.enrollmentState = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null enrollmentState");
            throw null;
        }
    }

    @Override // com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events.UpdateTrainingPageUIEvent
    public String enrollmentState() {
        return this.enrollmentState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateTrainingPageUIEvent) {
            return this.enrollmentState.equals(((UpdateTrainingPageUIEvent) obj).enrollmentState());
        }
        return false;
    }

    public int hashCode() {
        return this.enrollmentState.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("UpdateTrainingPageUIEvent{enrollmentState="), this.enrollmentState, StringSubstitutor.DEFAULT_VAR_END);
    }
}
