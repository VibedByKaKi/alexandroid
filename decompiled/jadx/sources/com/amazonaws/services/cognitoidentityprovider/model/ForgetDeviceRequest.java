package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ForgetDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String deviceKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ForgetDeviceRequest)) {
            return false;
        }
        ForgetDeviceRequest forgetDeviceRequest = (ForgetDeviceRequest) obj;
        if ((forgetDeviceRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (forgetDeviceRequest.getAccessToken() != null && !forgetDeviceRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((forgetDeviceRequest.getDeviceKey() == null) ^ (getDeviceKey() == null)) {
            return false;
        }
        return forgetDeviceRequest.getDeviceKey() == null || forgetDeviceRequest.getDeviceKey().equals(getDeviceKey());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getDeviceKey() {
        return this.deviceKey;
    }

    public int hashCode() {
        return (((getAccessToken() == null ? 0 : getAccessToken().hashCode()) + 31) * 31) + (getDeviceKey() != null ? getDeviceKey().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDeviceKey(String str) {
        this.deviceKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getDeviceKey() != null) {
            sb.append("DeviceKey: " + getDeviceKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ForgetDeviceRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public ForgetDeviceRequest withDeviceKey(String str) {
        this.deviceKey = str;
        return this;
    }
}
