package com.amazon.alexa.alertsca.events;

import com.amazon.alexa.alertsca.AlertRecord;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_AlertUnscheduledEvent extends AlertUnscheduledEvent {
    private final AlertRecord alertRecord;
    private final boolean dismissedByUser;

    public AutoValue_AlertUnscheduledEvent(AlertRecord alertRecord, boolean z) {
        if (alertRecord == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alertRecord");
            throw null;
        }
        this.alertRecord = alertRecord;
        this.dismissedByUser = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlertUnscheduledEvent) {
            AlertUnscheduledEvent alertUnscheduledEvent = (AlertUnscheduledEvent) obj;
            if (this.alertRecord.equals(alertUnscheduledEvent.getAlertRecord()) && this.dismissedByUser == alertUnscheduledEvent.isDismissedByUser()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.alertsca.events.AlertEvent
    public AlertRecord getAlertRecord() {
        return this.alertRecord;
    }

    public int hashCode() {
        return (this.dismissedByUser ? 1231 : 1237) ^ ((this.alertRecord.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.alertsca.events.AlertUnscheduledEvent
    public boolean isDismissedByUser() {
        return this.dismissedByUser;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlertUnscheduledEvent{alertRecord=");
        sb.append(this.alertRecord);
        sb.append(", dismissedByUser=");
        return a$$ExternalSyntheticOutline0.m(sb, this.dismissedByUser, StringSubstitutor.DEFAULT_VAR_END);
    }
}
