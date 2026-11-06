package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EffectivePolicy implements Serializable {
    private String policyArn;
    private String policyDocument;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EffectivePolicy)) {
            return false;
        }
        EffectivePolicy effectivePolicy = (EffectivePolicy) obj;
        if ((effectivePolicy.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (effectivePolicy.getPolicyName() != null && !effectivePolicy.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((effectivePolicy.getPolicyArn() == null) ^ (getPolicyArn() == null)) {
            return false;
        }
        if (effectivePolicy.getPolicyArn() != null && !effectivePolicy.getPolicyArn().equals(getPolicyArn())) {
            return false;
        }
        if ((effectivePolicy.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        return effectivePolicy.getPolicyDocument() == null || effectivePolicy.getPolicyDocument().equals(getPolicyDocument());
    }

    public String getPolicyArn() {
        return this.policyArn;
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyArn() == null ? 0 : getPolicyArn().hashCode())) * 31) + (getPolicyDocument() != null ? getPolicyDocument().hashCode() : 0);
    }

    public void setPolicyArn(String str) {
        this.policyArn = str;
    }

    public void setPolicyDocument(String str) {
        this.policyDocument = str;
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
            sb.append("policyArn: " + getPolicyArn() + ",");
        }
        if (getPolicyDocument() != null) {
            sb.append("policyDocument: " + getPolicyDocument());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public EffectivePolicy withPolicyArn(String str) {
        this.policyArn = str;
        return this;
    }

    public EffectivePolicy withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public EffectivePolicy withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
