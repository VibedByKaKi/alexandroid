package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Policy implements Serializable {
    private String policyArn;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) obj;
        if ((policy.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (policy.getPolicyName() != null && !policy.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((policy.getPolicyArn() == null) ^ (getPolicyArn() == null)) {
            return false;
        }
        return policy.getPolicyArn() == null || policy.getPolicyArn().equals(getPolicyArn());
    }

    public String getPolicyArn() {
        return this.policyArn;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyArn() != null ? getPolicyArn().hashCode() : 0);
    }

    public void setPolicyArn(String str) {
        this.policyArn = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getPolicyArn() != null) {
            sb.append("policyArn: " + getPolicyArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Policy withPolicyArn(String str) {
        this.policyArn = str;
        return this;
    }

    public Policy withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
