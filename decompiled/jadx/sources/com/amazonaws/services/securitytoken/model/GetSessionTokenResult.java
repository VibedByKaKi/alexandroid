package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetSessionTokenResult implements Serializable {
    private Credentials credentials;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSessionTokenResult)) {
            return false;
        }
        GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) obj;
        if ((getSessionTokenResult.getCredentials() == null) ^ (getCredentials() == null)) {
            return false;
        }
        return getSessionTokenResult.getCredentials() == null || getSessionTokenResult.getCredentials().equals(getCredentials());
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public int hashCode() {
        return 31 + (getCredentials() == null ? 0 : getCredentials().hashCode());
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCredentials() != null) {
            sb.append("Credentials: " + getCredentials());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetSessionTokenResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
}
