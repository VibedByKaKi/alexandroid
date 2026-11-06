package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssociateSoftwareTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;
    private String session;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociateSoftwareTokenRequest)) {
            return false;
        }
        AssociateSoftwareTokenRequest associateSoftwareTokenRequest = (AssociateSoftwareTokenRequest) obj;
        if ((associateSoftwareTokenRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        if (associateSoftwareTokenRequest.getAccessToken() != null && !associateSoftwareTokenRequest.getAccessToken().equals(getAccessToken())) {
            return false;
        }
        if ((associateSoftwareTokenRequest.getSession() == null) ^ (getSession() == null)) {
            return false;
        }
        return associateSoftwareTokenRequest.getSession() == null || associateSoftwareTokenRequest.getSession().equals(getSession());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getSession() {
        return this.session;
    }

    public int hashCode() {
        return (((getAccessToken() == null ? 0 : getAccessToken().hashCode()) + 31) * 31) + (getSession() != null ? getSession().hashCode() : 0);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken() + ",");
        }
        if (getSession() != null) {
            sb.append("Session: " + getSession());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AssociateSoftwareTokenRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public AssociateSoftwareTokenRequest withSession(String str) {
        this.session = str;
        return this;
    }
}
