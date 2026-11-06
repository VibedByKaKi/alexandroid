package com.amazon.devicesetup.provisioning.ble.events;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisionableEventNotification {
    private final int eventKey;
    private final int eventType;

    public ProvisionableEventNotification(int i, int i2) {
        this.eventKey = i;
        this.eventType = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisionableEventNotification provisionableEventNotification = (ProvisionableEventNotification) obj;
            if (this.eventKey == provisionableEventNotification.eventKey && this.eventType == provisionableEventNotification.eventType) {
                return true;
            }
        }
        return false;
    }

    public int getEventKey() {
        return this.eventKey;
    }

    public int getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return (this.eventKey * 31) + this.eventType;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(this.eventKey, this.eventType, "ProvisioningEventNotification [key=", ", type=", MarkdownConstants.RIGHT_BRACKET);
    }
}
