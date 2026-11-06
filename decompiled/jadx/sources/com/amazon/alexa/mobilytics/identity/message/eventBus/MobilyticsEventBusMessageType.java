package com.amazon.alexa.mobilytics.identity.message.eventBus;

import com.amazon.alexa.redesign.utils.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum MobilyticsEventBusMessageType {
    SERVICES_CAN_START(Constants.SERVICES_CAN_START),
    BMCL_INITIALIZE("app:authenticated");

    private String message;

    MobilyticsEventBusMessageType(String str) {
        this.message = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.message;
    }
}
