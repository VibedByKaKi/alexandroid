package com.amazonaws.services.kms.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetKeyPolicyResult implements Serializable {
    private String policy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetKeyPolicyResult)) {
            return false;
        }
        GetKeyPolicyResult getKeyPolicyResult = (GetKeyPolicyResult) obj;
        if ((getKeyPolicyResult.getPolicy() == null) ^ (getPolicy() == null)) {
            return false;
        }
        return getKeyPolicyResult.getPolicy() == null || getKeyPolicyResult.getPolicy().equals(getPolicy());
    }

    public String getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        return 31 + (getPolicy() == null ? 0 : getPolicy().hashCode());
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicy() != null) {
            sb.append("Policy: " + getPolicy());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetKeyPolicyResult withPolicy(String str) {
        this.policy = str;
        return this;
    }
}
