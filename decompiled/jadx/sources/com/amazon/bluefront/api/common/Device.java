package com.amazon.bluefront.api.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Device implements Comparable<Device> {
    private String deviceNamespace;
    private String deviceSerialNumber;

    @Override // java.lang.Comparable
    public int compareTo(Device device) {
        if (device == null) {
            return -1;
        }
        if (device == this) {
            return 0;
        }
        return new CompareToBuilder().append(getDeviceNamespace(), device.getDeviceNamespace()).append(getDeviceSerialNumber(), device.getDeviceSerialNumber()).toComparison();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Device) && compareTo((Device) obj) == 0;
    }

    public String getDeviceNamespace() {
        return this.deviceNamespace;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(getDeviceNamespace()).append(getDeviceSerialNumber()).toHashCode();
    }

    public void setDeviceNamespace(String str) {
        this.deviceNamespace = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }
}
