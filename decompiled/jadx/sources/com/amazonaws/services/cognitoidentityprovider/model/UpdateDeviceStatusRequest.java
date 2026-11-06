package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateDeviceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String deviceKey;
    private String deviceRememberedStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateDeviceStatusRequest)) {
            return false;
        }
        UpdateDeviceStatusRequest updateDeviceStatusRequest = (UpdateDeviceStatusRequest) obj;
        if ((updateDeviceStatusRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (updateDeviceStatusRequest.getAccessToken() != null && !updateDeviceStatusRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((updateDeviceStatusRequest.getDeviceKey() == null) ^ (getDeviceKey() == null)) {
            return false;
        }
        if (updateDeviceStatusRequest.getDeviceKey() != null && !updateDeviceStatusRequest.getDeviceKey().equals(getDeviceKey())) {
            return false;
        }
        if ((updateDeviceStatusRequest.getDeviceRememberedStatus() == null) ^ (getDeviceRememberedStatus() == null)) {
            return false;
        }
        return updateDeviceStatusRequest.getDeviceRememberedStatus() == null || updateDeviceStatusRequest.getDeviceRememberedStatus().equals(getDeviceRememberedStatus());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getDeviceKey() {
        return this.deviceKey;
    }

    public String getDeviceRememberedStatus() {
        return this.deviceRememberedStatus;
    }

    public int hashCode() {
        return (((((getAccessToken() == null ? 0 : getAccessToken().hashCode()) + 31) * 31) + (getDeviceKey() == null ? 0 : getDeviceKey().hashCode())) * 31) + (getDeviceRememberedStatus() != null ? getDeviceRememberedStatus().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDeviceKey(String str) {
        this.deviceKey = str;
    }

    public void setDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatusType) {
        this.deviceRememberedStatus = deviceRememberedStatusType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getDeviceKey() != null) {
            sb.append("DeviceKey: " + getDeviceKey() + ",");
        }
        if (getDeviceRememberedStatus() != null) {
            sb.append("DeviceRememberedStatus: " + getDeviceRememberedStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateDeviceStatusRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public UpdateDeviceStatusRequest withDeviceKey(String str) {
        this.deviceKey = str;
        return this;
    }

    public UpdateDeviceStatusRequest withDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatusType) {
        this.deviceRememberedStatus = deviceRememberedStatusType.toString();
        return this;
    }

    public void setDeviceRememberedStatus(String str) {
        this.deviceRememberedStatus = str;
    }

    public UpdateDeviceStatusRequest withDeviceRememberedStatus(String str) {
        this.deviceRememberedStatus = str;
        return this;
    }
}
