package com.amazon.alexa.alertsca.events;

import android.app.Notification;
import com.amazon.alexa.alertsca.AlertRecord;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_AlertNotificationEvent extends AlertNotificationEvent {
    private final AlertRecord alertRecord;
    private final Notification notification;

    public AutoValue_AlertNotificationEvent(AlertRecord alertRecord, Notification notification) {
        if (alertRecord == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alertRecord");
            throw null;
        }
        this.alertRecord = alertRecord;
        if (notification != null) {
            this.notification = notification;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null notification");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlertNotificationEvent) {
            AlertNotificationEvent alertNotificationEvent = (AlertNotificationEvent) obj;
            if (this.alertRecord.equals(alertNotificationEvent.getAlertRecord()) && this.notification.equals(alertNotificationEvent.getNotification())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.alertsca.events.AlertNotificationEvent
    public AlertRecord getAlertRecord() {
        return this.alertRecord;
    }

    @Override // com.amazon.alexa.alertsca.events.AlertNotificationEvent
    public Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode() ^ ((this.alertRecord.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AlertNotificationEvent{alertRecord=" + this.alertRecord + ", notification=" + this.notification + StringSubstitutor.DEFAULT_VAR_END;
    }
}
