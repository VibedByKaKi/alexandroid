package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetDeviceResult implements Serializable {
    private DeviceType device;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetDeviceResult)) {
            return false;
        }
        GetDeviceResult getDeviceResult = (GetDeviceResult) obj;
        if ((getDeviceResult.getDevice() == null) ^ (getDevice() == null)) {
            return false;
        }
        return getDeviceResult.getDevice() == null || getDeviceResult.getDevice().equals(getDevice());
    }

    public DeviceType getDevice() {
        return this.device;
    }

    public int hashCode() {
        return 31 + (getDevice() == null ? 0 : getDevice().hashCode());
    }

    public void setDevice(DeviceType deviceType) {
        this.device = deviceType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDevice() != null) {
            sb.append("Device: " + getDevice());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetDeviceResult withDevice(DeviceType deviceType) {
        this.device = deviceType;
        return this;
    }
}
