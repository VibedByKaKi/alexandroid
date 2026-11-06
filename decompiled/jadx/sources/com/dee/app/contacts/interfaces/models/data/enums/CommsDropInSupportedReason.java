package com.dee.app.contacts.interfaces.models.data.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum CommsDropInSupportedReason {
    BLUETOOTH_NOT_CONNECTED("BLUETOOTH_NOT_CONNECTED"),
    AUX_CONNECTED("AUX_CONNECTED"),
    STATUS_UNAVAILABLE("STATUS_UNAVAILABLE"),
    NOT_IN_SHOW_MODE("NOT_IN_SHOW_MODE"),
    DEVICE_NOT_REGISTERED("DEVICE_NOT_REGISTERED"),
    DO_NOT_DISTURB_ON("DO_NOT_DISTURB_ON"),
    DEVICE_OFFLINE("DEVICE_OFFLINE"),
    DEVICE_ALREADY_IN_CALL("DEVICE_ALREADY_IN_CALL"),
    COMMS_SETTING_OFF("COMMS_SETTING_OFF"),
    DROP_IN_SETTING_OFF("DROP_IN_SETTING_OFF"),
    DROP_IN_UNAVAILABLE_ON_DEVICE("DROP_IN_UNAVAILABLE_ON_DEVICE"),
    UNKNOWN("UNKNOWN");

    private final String reason;

    CommsDropInSupportedReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
