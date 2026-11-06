package com.amazon.dee.app.ui.web;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DeviceInfo {
    public final String accountName;
    public final String deviceType;
    public final String serialNumber;

    public DeviceInfo(String str, String str2, String str3) {
        this.accountName = str;
        this.serialNumber = str2;
        this.deviceType = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (this.accountName.equals(deviceInfo.accountName) && this.serialNumber.equals(deviceInfo.serialNumber)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.serialNumber.hashCode() + (this.accountName.hashCode() * 31);
    }
}
