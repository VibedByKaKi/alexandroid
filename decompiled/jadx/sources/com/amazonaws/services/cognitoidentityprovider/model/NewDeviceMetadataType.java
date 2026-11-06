package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class NewDeviceMetadataType implements Serializable {
    private String deviceGroupKey;
    private String deviceKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NewDeviceMetadataType)) {
            return false;
        }
        NewDeviceMetadataType newDeviceMetadataType = (NewDeviceMetadataType) obj;
        if ((newDeviceMetadataType.getDeviceKey() == null) ^ (getDeviceKey() == null)) {
            return false;
        }
        if (newDeviceMetadataType.getDeviceKey() != null && !newDeviceMetadataType.getDeviceKey().equals(getDeviceKey())) {
            return false;
        }
        if ((newDeviceMetadataType.getDeviceGroupKey() == null) ^ (getDeviceGroupKey() == null)) {
            return false;
        }
        return newDeviceMetadataType.getDeviceGroupKey() == null || newDeviceMetadataType.getDeviceGroupKey().equals(getDeviceGroupKey());
    }

    public String getDeviceGroupKey() {
        return this.deviceGroupKey;
    }

    public String getDeviceKey() {
        return this.deviceKey;
    }

    public int hashCode() {
        return (((getDeviceKey() == null ? 0 : getDeviceKey().hashCode()) + 31) * 31) + (getDeviceGroupKey() != null ? getDeviceGroupKey().hashCode() : 0);
    }

    public void setDeviceGroupKey(String str) {
        this.deviceGroupKey = str;
    }

    public void setDeviceKey(String str) {
        this.deviceKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeviceKey() != null) {
            sb.append("DeviceKey: " + getDeviceKey() + ",");
        }
        if (getDeviceGroupKey() != null) {
            sb.append("DeviceGroupKey: " + getDeviceGroupKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public NewDeviceMetadataType withDeviceGroupKey(String str) {
        this.deviceGroupKey = str;
        return this;
    }

    public NewDeviceMetadataType withDeviceKey(String str) {
        this.deviceKey = str;
        return this;
    }
}
