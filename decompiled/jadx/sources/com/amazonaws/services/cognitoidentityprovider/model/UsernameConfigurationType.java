package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UsernameConfigurationType implements Serializable {
    private Boolean caseSensitive;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UsernameConfigurationType)) {
            return false;
        }
        UsernameConfigurationType usernameConfigurationType = (UsernameConfigurationType) obj;
        if ((usernameConfigurationType.getCaseSensitive() == null) ^ (getCaseSensitive() == null)) {
            return false;
        }
        return usernameConfigurationType.getCaseSensitive() == null || usernameConfigurationType.getCaseSensitive().equals(getCaseSensitive());
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public int hashCode() {
        return 31 + (getCaseSensitive() == null ? 0 : getCaseSensitive().hashCode());
    }

    public Boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    public void setCaseSensitive(Boolean bool) {
        this.caseSensitive = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCaseSensitive() != null) {
            sb.append("CaseSensitive: " + getCaseSensitive());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UsernameConfigurationType withCaseSensitive(Boolean bool) {
        this.caseSensitive = bool;
        return this;
    }
}
