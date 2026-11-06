package com.amazon.alexa.client.alexaservice.features.alerts;

import com.amazon.alexa.api.AlertType;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlertStoppedEvent extends AlertStoppedEvent {
    private final String alertId;
    private final AlertType alertType;

    public AutoValue_AlertStoppedEvent(String str, AlertType alertType) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alertId");
            throw null;
        }
        this.alertId = str;
        if (alertType != null) {
            this.alertType = alertType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alertType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlertStoppedEvent) {
            AlertStoppedEvent alertStoppedEvent = (AlertStoppedEvent) obj;
            if (this.alertId.equals(alertStoppedEvent.getAlertId()) && this.alertType.equals(alertStoppedEvent.getAlertType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.alerts.AlertEvent
    public String getAlertId() {
        return this.alertId;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.alerts.AlertEvent
    public AlertType getAlertType() {
        return this.alertType;
    }

    public int hashCode() {
        return this.alertType.hashCode() ^ ((this.alertId.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AlertStoppedEvent{alertId=" + this.alertId + ", alertType=" + this.alertType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
