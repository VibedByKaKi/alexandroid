package com.amazon.alexa.accessory.frames.device;

import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DeviceTypeInfoStore {
    private static DeviceTypeInfoStore deviceTypeStoreInstance;
    private String deviceType;

    public static synchronized DeviceTypeInfoStore getInstance() {
        DeviceTypeInfoStore deviceTypeInfoStore;
        synchronized (DeviceTypeInfoStore.class) {
            try {
                if (deviceTypeStoreInstance == null) {
                    deviceTypeStoreInstance = new DeviceTypeInfoStore();
                }
                deviceTypeInfoStore = deviceTypeStoreInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceTypeInfoStore;
    }

    public String getDeviceType() {
        return Strings.isNullOrEmpty(this.deviceType) ? "" : this.deviceType;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }
}
