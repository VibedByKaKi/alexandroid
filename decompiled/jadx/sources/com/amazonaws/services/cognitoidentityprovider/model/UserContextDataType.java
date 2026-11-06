package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UserContextDataType implements Serializable {
    private String encodedData;
    private String ipAddress;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContextDataType)) {
            return false;
        }
        UserContextDataType userContextDataType = (UserContextDataType) obj;
        if ((userContextDataType.getIpAddress() == null) ^ (getIpAddress() == null)) {
            return false;
        }
        if (userContextDataType.getIpAddress() != null && !userContextDataType.getIpAddress().equals(getIpAddress())) {
            return false;
        }
        if ((userContextDataType.getEncodedData() == null) ^ (getEncodedData() == null)) {
            return false;
        }
        return userContextDataType.getEncodedData() == null || userContextDataType.getEncodedData().equals(getEncodedData());
    }

    public String getEncodedData() {
        return this.encodedData;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public int hashCode() {
        return (((getIpAddress() == null ? 0 : getIpAddress().hashCode()) + 31) * 31) + (getEncodedData() != null ? getEncodedData().hashCode() : 0);
    }

    public void setEncodedData(String str) {
        this.encodedData = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIpAddress() != null) {
            sb.append("IpAddress: " + getIpAddress() + ",");
        }
        if (getEncodedData() != null) {
            sb.append("EncodedData: " + getEncodedData());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UserContextDataType withEncodedData(String str) {
        this.encodedData = str;
        return this;
    }

    public UserContextDataType withIpAddress(String str) {
        this.ipAddress = str;
        return this;
    }
}
