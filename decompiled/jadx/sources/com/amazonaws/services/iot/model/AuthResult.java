package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuthResult implements Serializable {
    private Allowed allowed;
    private String authDecision;
    private AuthInfo authInfo;
    private Denied denied;
    private List<String> missingContextValues;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) obj;
        if ((authResult.getAuthInfo() == null) ^ (getAuthInfo() == null)) {
            return false;
        }
        if (authResult.getAuthInfo() != null && !authResult.getAuthInfo().equals(getAuthInfo())) {
            return false;
        }
        if ((authResult.getAllowed() == null) ^ (getAllowed() == null)) {
            return false;
        }
        if (authResult.getAllowed() != null && !authResult.getAllowed().equals(getAllowed())) {
            return false;
        }
        if ((authResult.getDenied() == null) ^ (getDenied() == null)) {
            return false;
        }
        if (authResult.getDenied() != null && !authResult.getDenied().equals(getDenied())) {
            return false;
        }
        if ((authResult.getAuthDecision() == null) ^ (getAuthDecision() == null)) {
            return false;
        }
        if (authResult.getAuthDecision() != null && !authResult.getAuthDecision().equals(getAuthDecision())) {
            return false;
        }
        if ((authResult.getMissingContextValues() == null) ^ (getMissingContextValues() == null)) {
            return false;
        }
        return authResult.getMissingContextValues() == null || authResult.getMissingContextValues().equals(getMissingContextValues());
    }

    public Allowed getAllowed() {
        return this.allowed;
    }

    public String getAuthDecision() {
        return this.authDecision;
    }

    public AuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public Denied getDenied() {
        return this.denied;
    }

    public List<String> getMissingContextValues() {
        return this.missingContextValues;
    }

    public int hashCode() {
        return (((((((((getAuthInfo() == null ? 0 : getAuthInfo().hashCode()) + 31) * 31) + (getAllowed() == null ? 0 : getAllowed().hashCode())) * 31) + (getDenied() == null ? 0 : getDenied().hashCode())) * 31) + (getAuthDecision() == null ? 0 : getAuthDecision().hashCode())) * 31) + (getMissingContextValues() != null ? getMissingContextValues().hashCode() : 0);
    }

    public void setAllowed(Allowed allowed) {
        this.allowed = allowed;
    }

    public void setAuthDecision(AuthDecision authDecision) {
        this.authDecision = authDecision.toString();
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public void setDenied(Denied denied) {
        this.denied = denied;
    }

    public void setMissingContextValues(Collection<String> collection) {
        if (collection == null) {
            this.missingContextValues = null;
        } else {
            this.missingContextValues = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthInfo() != null) {
            sb.append("authInfo: " + getAuthInfo() + ",");
        }
        if (getAllowed() != null) {
            sb.append("allowed: " + getAllowed() + ",");
        }
        if (getDenied() != null) {
            sb.append("denied: " + getDenied() + ",");
        }
        if (getAuthDecision() != null) {
            sb.append("authDecision: " + getAuthDecision() + ",");
        }
        if (getMissingContextValues() != null) {
            sb.append("missingContextValues: " + getMissingContextValues());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuthResult withAllowed(Allowed allowed) {
        this.allowed = allowed;
        return this;
    }

    public AuthResult withAuthDecision(AuthDecision authDecision) {
        this.authDecision = authDecision.toString();
        return this;
    }

    public AuthResult withAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public AuthResult withDenied(Denied denied) {
        this.denied = denied;
        return this;
    }

    public AuthResult withMissingContextValues(String... strArr) {
        if (getMissingContextValues() == null) {
            this.missingContextValues = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.missingContextValues.add(str);
        }
        return this;
    }

    public void setAuthDecision(String str) {
        this.authDecision = str;
    }

    public AuthResult withAuthDecision(String str) {
        this.authDecision = str;
        return this;
    }

    public AuthResult withMissingContextValues(Collection<String> collection) {
        setMissingContextValues(collection);
        return this;
    }
}
