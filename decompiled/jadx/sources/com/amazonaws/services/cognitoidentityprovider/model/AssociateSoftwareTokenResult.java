package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssociateSoftwareTokenResult implements Serializable {
    private String secretCode;
    private String session;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociateSoftwareTokenResult)) {
            return false;
        }
        AssociateSoftwareTokenResult associateSoftwareTokenResult = (AssociateSoftwareTokenResult) obj;
        if ((associateSoftwareTokenResult.getSecretCode() == null) ^ (getSecretCode() == null)) {
            return false;
        }
        if (associateSoftwareTokenResult.getSecretCode() != null && !associateSoftwareTokenResult.getSecretCode().equals(getSecretCode())) {
            return false;
        }
        if ((associateSoftwareTokenResult.getSession() == null) ^ (getSession() == null)) {
            return false;
        }
        return associateSoftwareTokenResult.getSession() == null || associateSoftwareTokenResult.getSession().equals(getSession());
    }

    public String getSecretCode() {
        return this.secretCode;
    }

    public String getSession() {
        return this.session;
    }

    public int hashCode() {
        return (((getSecretCode() == null ? 0 : getSecretCode().hashCode()) + 31) * 31) + (getSession() != null ? getSession().hashCode() : 0);
    }

    public void setSecretCode(String str) {
        this.secretCode = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecretCode() != null) {
            sb.append("SecretCode: " + getSecretCode() + ",");
        }
        if (getSession() != null) {
            sb.append("Session: " + getSession());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AssociateSoftwareTokenResult withSecretCode(String str) {
        this.secretCode = str;
        return this;
    }

    public AssociateSoftwareTokenResult withSession(String str) {
        this.session = str;
        return this;
    }
}
