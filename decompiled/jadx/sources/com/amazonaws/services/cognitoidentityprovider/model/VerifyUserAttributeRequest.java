package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class VerifyUserAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String attributeName;
    private String code;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VerifyUserAttributeRequest)) {
            return false;
        }
        VerifyUserAttributeRequest verifyUserAttributeRequest = (VerifyUserAttributeRequest) obj;
        if ((verifyUserAttributeRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (verifyUserAttributeRequest.getAccessToken() != null && !verifyUserAttributeRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((verifyUserAttributeRequest.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        if (verifyUserAttributeRequest.getAttributeName() != null && !verifyUserAttributeRequest.getAttributeName().equals(getAttributeName())) {
            return false;
        }
        if ((verifyUserAttributeRequest.getCode() == null) ^ (getCode() == null)) {
            return false;
        }
        return verifyUserAttributeRequest.getCode() == null || verifyUserAttributeRequest.getCode().equals(getCode());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getCode() {
        return this.code;
    }

    public int hashCode() {
        return (((((getAccessToken() == null ? 0 : getAccessToken().hashCode()) + 31) * 31) + (getAttributeName() == null ? 0 : getAttributeName().hashCode())) * 31) + (getCode() != null ? getCode().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getAttributeName() != null) {
            sb.append("AttributeName: " + getAttributeName() + ",");
        }
        if (getCode() != null) {
            sb.append("Code: " + getCode());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public VerifyUserAttributeRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public VerifyUserAttributeRequest withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public VerifyUserAttributeRequest withCode(String str) {
        this.code = str;
        return this;
    }
}
