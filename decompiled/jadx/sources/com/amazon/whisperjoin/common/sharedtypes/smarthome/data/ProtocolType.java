package com.amazon.whisperjoin.common.sharedtypes.smarthome.data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ProtocolType {
    ZIGBEE(com.amazon.devicesetupservice.smarthome.ProtocolType.ZIGBEE),
    WIFI(com.amazon.devicesetupservice.smarthome.ProtocolType.WIFI),
    BLE(com.amazon.devicesetupservice.smarthome.ProtocolType.BLE);

    private final String mName;

    ProtocolType(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }
}
