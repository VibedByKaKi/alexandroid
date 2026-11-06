package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TestAuthorizationResult implements Serializable {
    private List<AuthResult> authResults;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TestAuthorizationResult)) {
            return false;
        }
        TestAuthorizationResult testAuthorizationResult = (TestAuthorizationResult) obj;
        if ((testAuthorizationResult.getAuthResults() == null) ^ (getAuthResults() == null)) {
            return false;
        }
        return testAuthorizationResult.getAuthResults() == null || testAuthorizationResult.getAuthResults().equals(getAuthResults());
    }

    public List<AuthResult> getAuthResults() {
        return this.authResults;
    }

    public int hashCode() {
        return 31 + (getAuthResults() == null ? 0 : getAuthResults().hashCode());
    }

    public void setAuthResults(Collection<AuthResult> collection) {
        if (collection == null) {
            this.authResults = null;
        } else {
            this.authResults = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthResults() != null) {
            sb.append("authResults: " + getAuthResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TestAuthorizationResult withAuthResults(AuthResult... authResultArr) {
        if (getAuthResults() == null) {
            this.authResults = new ArrayList(authResultArr.length);
        }
        for (AuthResult authResult : authResultArr) {
            this.authResults.add(authResult);
        }
        return this;
    }

    public TestAuthorizationResult withAuthResults(Collection<AuthResult> collection) {
        setAuthResults(collection);
        return this;
    }
}
