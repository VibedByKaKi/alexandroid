package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetUserAttributeVerificationCodeRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String attributeName;
    private Map<String, String> clientMetadata;

    public GetUserAttributeVerificationCodeRequest addClientMetadataEntry(String str, String str2) {
        if (this.clientMetadata == null) {
            this.clientMetadata = new HashMap();
        }
        if (this.clientMetadata.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.clientMetadata.put(str, str2);
        return this;
    }

    public GetUserAttributeVerificationCodeRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetUserAttributeVerificationCodeRequest)) {
            return false;
        }
        GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest = (GetUserAttributeVerificationCodeRequest) obj;
        if ((getUserAttributeVerificationCodeRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (getUserAttributeVerificationCodeRequest.getAccessToken() != null && !getUserAttributeVerificationCodeRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((getUserAttributeVerificationCodeRequest.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        if (getUserAttributeVerificationCodeRequest.getAttributeName() != null && !getUserAttributeVerificationCodeRequest.getAttributeName().equals(getAttributeName())) {
            return false;
        }
        if ((getUserAttributeVerificationCodeRequest.getClientMetadata() == null) ^ (getClientMetadata() == null)) {
            return false;
        }
        return getUserAttributeVerificationCodeRequest.getClientMetadata() == null || getUserAttributeVerificationCodeRequest.getClientMetadata().equals(getClientMetadata());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public int hashCode() {
        return (((((getAccessToken() == null ? 0 : getAccessToken().hashCode()) + 31) * 31) + (getAttributeName() == null ? 0 : getAttributeName().hashCode())) * 31) + (getClientMetadata() != null ? getClientMetadata().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getAttributeName() != null) {
            sb.append("AttributeName: " + getAttributeName() + ",");
        }
        if (getClientMetadata() != null) {
            sb.append("ClientMetadata: " + getClientMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetUserAttributeVerificationCodeRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public GetUserAttributeVerificationCodeRequest withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public GetUserAttributeVerificationCodeRequest withClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
        return this;
    }
}
