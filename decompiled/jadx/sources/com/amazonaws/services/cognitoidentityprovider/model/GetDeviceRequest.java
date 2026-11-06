package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String deviceKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetDeviceRequest)) {
            return false;
        }
        GetDeviceRequest getDeviceRequest = (GetDeviceRequest) obj;
        if ((getDeviceRequest.getDeviceKey() == null) ^ (getDeviceKey() == null)) {
            return false;
        }
        if (getDeviceRequest.getDeviceKey() != null && !getDeviceRequest.getDeviceKey().equals(getDeviceKey())) {
            return false;
        }
        if ((getDeviceRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        return getDeviceRequest.getAccessToken() == null || getDeviceRequest.getAccessToken().equals(getAccessToken());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getDeviceKey() {
        return this.deviceKey;
    }

    public int hashCode() {
        return (((getDeviceKey() == null ? 0 : getDeviceKey().hashCode()) + 31) * 31) + (getAccessToken() != null ? getAccessToken().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDeviceKey(String str) {
        this.deviceKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeviceKey() != null) {
            sb.append("DeviceKey: " + getDeviceKey() + ",");
        }
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetDeviceRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public GetDeviceRequest withDeviceKey(String str) {
        this.deviceKey = str;
        return this;
    }
}
