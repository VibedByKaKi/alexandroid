package com.amazon.deecomms.ndt.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum DropInDisableReason {
    BluetoothNotConnected("BLUETOOTH_NOT_CONNECTED"),
    AuxConnected("AUX_CONNECTED"),
    NotInShowMode("NOT_IN_SHOW_MODE"),
    DeviceNotRegistered("DEVICE_NOT_REGISTERED"),
    DND("DO_NOT_DISTURB_ON"),
    Offline("DEVICE_OFFLINE"),
    CommsSettingOff("COMMS_SETTING_OFF"),
    DropInSettingOff("DROP_IN_SETTING_OFF"),
    DropInUnavailable("DROP_IN_UNAVAILABLE_ON_DEVICE"),
    InCall("DEVICE_ALREADY_IN_CALL"),
    Unavailable("STATUS_UNAVAILABLE"),
    Unknown("UNKNOWN");

    private static final Map<String, DropInDisableReason> lookupMap = new HashMap();
    private String reason;

    static {
        for (DropInDisableReason dropInDisableReason : values()) {
            lookupMap.put(dropInDisableReason.getReason(), dropInDisableReason);
        }
    }

    DropInDisableReason(String str) {
        this.reason = str;
    }

    public static DropInDisableReason lookup(String str) {
        DropInDisableReason dropInDisableReason = Unknown;
        Map<String, DropInDisableReason> map = lookupMap;
        return map.containsKey(str) ? map.get(str) : dropInDisableReason;
    }

    public String getReason() {
        return this.reason;
    }
}
