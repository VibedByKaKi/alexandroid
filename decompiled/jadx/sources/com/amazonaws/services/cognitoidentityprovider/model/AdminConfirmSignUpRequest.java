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
public class AdminConfirmSignUpRequest extends AmazonWebServiceRequest implements Serializable {
    private Map<String, String> clientMetadata;
    private String userPoolId;
    private String username;

    public AdminConfirmSignUpRequest addClientMetadataEntry(String str, String str2) {
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

    public AdminConfirmSignUpRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminConfirmSignUpRequest)) {
            return false;
        }
        AdminConfirmSignUpRequest adminConfirmSignUpRequest = (AdminConfirmSignUpRequest) obj;
        if ((adminConfirmSignUpRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (adminConfirmSignUpRequest.getUserPoolId() != null && !adminConfirmSignUpRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((adminConfirmSignUpRequest.getUsername() == null) ^ (getUsername() == null)) {
            return false;
        }
        if (adminConfirmSignUpRequest.getUsername() != null && !adminConfirmSignUpRequest.getUsername().equals(getUsername())) {
            return false;
        }
        if ((adminConfirmSignUpRequest.getClientMetadata() == null) ^ (getClientMetadata() == null)) {
            return false;
        }
        return adminConfirmSignUpRequest.getClientMetadata() == null || adminConfirmSignUpRequest.getClientMetadata().equals(getClientMetadata());
    }

    public Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getUsername() == null ? 0 : getUsername().hashCode())) * 31) + (getClientMetadata() != null ? getClientMetadata().hashCode() : 0);
    }

    public void setClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getUsername() != null) {
            sb.append("Username: " + getUsername() + ",");
        }
        if (getClientMetadata() != null) {
            sb.append("ClientMetadata: " + getClientMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminConfirmSignUpRequest withClientMetadata(Map<String, String> map) {
        this.clientMetadata = map;
        return this;
    }

    public AdminConfirmSignUpRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }

    public AdminConfirmSignUpRequest withUsername(String str) {
        this.username = str;
        return this;
    }
}
