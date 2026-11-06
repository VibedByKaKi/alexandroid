package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutResourcePolicyResult implements Serializable {
    private ResourcePolicy resourcePolicy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutResourcePolicyResult)) {
            return false;
        }
        PutResourcePolicyResult putResourcePolicyResult = (PutResourcePolicyResult) obj;
        if ((putResourcePolicyResult.getResourcePolicy() == null) ^ (getResourcePolicy() == null)) {
            return false;
        }
        return putResourcePolicyResult.getResourcePolicy() == null || putResourcePolicyResult.getResourcePolicy().equals(getResourcePolicy());
    }

    public ResourcePolicy getResourcePolicy() {
        return this.resourcePolicy;
    }

    public int hashCode() {
        return 31 + (getResourcePolicy() == null ? 0 : getResourcePolicy().hashCode());
    }

    public void setResourcePolicy(ResourcePolicy resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourcePolicy() != null) {
            sb.append("resourcePolicy: " + getResourcePolicy());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutResourcePolicyResult withResourcePolicy(ResourcePolicy resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
        return this;
    }
}
