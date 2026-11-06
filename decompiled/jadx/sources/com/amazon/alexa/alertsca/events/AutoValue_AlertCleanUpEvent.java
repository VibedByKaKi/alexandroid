package com.amazon.alexa.alertsca.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_AlertCleanUpEvent extends AlertCleanUpEvent {
    private final int alertRecordId;

    public AutoValue_AlertCleanUpEvent(int i) {
        this.alertRecordId = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AlertCleanUpEvent) && this.alertRecordId == ((AlertCleanUpEvent) obj).getAlertRecordId();
    }

    @Override // com.amazon.alexa.alertsca.events.AlertCleanUpEvent
    public int getAlertRecordId() {
        return this.alertRecordId;
    }

    public int hashCode() {
        return this.alertRecordId ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("AlertCleanUpEvent{alertRecordId="), this.alertRecordId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
