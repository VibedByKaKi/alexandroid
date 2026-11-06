package com.amazon.whisperjoin.provisioning;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public enum Radios {
    BLE("BluetoothLE"),
    SOFT_AP("SoftAP");

    public final String name;

    Radios(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
