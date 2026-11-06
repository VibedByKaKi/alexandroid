package com.amazon.alexa.alertsca.events;

import com.amazon.alexa.alertsca.AlertRecord;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_AlertStartedEvent extends AlertStartedEvent {
    private final AlertRecord alertRecord;

    public AutoValue_AlertStartedEvent(AlertRecord alertRecord) {
        if (alertRecord != null) {
            this.alertRecord = alertRecord;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alertRecord");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlertStartedEvent) {
            return this.alertRecord.equals(((AlertStartedEvent) obj).getAlertRecord());
        }
        return false;
    }

    @Override // com.amazon.alexa.alertsca.events.AlertEvent
    public AlertRecord getAlertRecord() {
        return this.alertRecord;
    }

    public int hashCode() {
        return this.alertRecord.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AlertStartedEvent{alertRecord=" + this.alertRecord + StringSubstitutor.DEFAULT_VAR_END;
    }
}
