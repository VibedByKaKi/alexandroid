package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreatePolicyResult implements Serializable {
    private String policyArn;
    private String policyDocument;
    private String policyName;
    private String policyVersionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreatePolicyResult)) {
            return false;
        }
        CreatePolicyResult createPolicyResult = (CreatePolicyResult) obj;
        if ((createPolicyResult.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (createPolicyResult.getPolicyName() != null && !createPolicyResult.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((createPolicyResult.getPolicyArn() == null) ^ (getPolicyArn() == null)) {
            return false;
        }
        if (createPolicyResult.getPolicyArn() != null && !createPolicyResult.getPolicyArn().equals(getPolicyArn())) {
            return false;
        }
        if ((createPolicyResult.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        if (createPolicyResult.getPolicyDocument() != null && !createPolicyResult.getPolicyDocument().equals(getPolicyDocument())) {
            return false;
        }
        if ((createPolicyResult.getPolicyVersionId() == null) ^ (getPolicyVersionId() == null)) {
            return false;
        }
        return createPolicyResult.getPolicyVersionId() == null || createPolicyResult.getPolicyVersionId().equals(getPolicyVersionId());
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

    public String getPolicyVersionId() {
        return this.policyVersionId;
    }

    public int hashCode() {
        return (((((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyArn() == null ? 0 : getPolicyArn().hashCode())) * 31) + (getPolicyDocument() == null ? 0 : getPolicyDocument().hashCode())) * 31) + (getPolicyVersionId() != null ? getPolicyVersionId().hashCode() : 0);
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

    public void setPolicyVersionId(String str) {
        this.policyVersionId = str;
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
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        }
        if (getPolicyVersionId() != null) {
            sb.append("policyVersionId: " + getPolicyVersionId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreatePolicyResult withPolicyArn(String str) {
        this.policyArn = str;
        return this;
    }

    public CreatePolicyResult withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public CreatePolicyResult withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public CreatePolicyResult withPolicyVersionId(String str) {
        this.policyVersionId = str;
        return this;
    }
}
