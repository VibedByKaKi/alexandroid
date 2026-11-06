package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutResourcePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyDocument;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutResourcePolicyRequest)) {
            return false;
        }
        PutResourcePolicyRequest putResourcePolicyRequest = (PutResourcePolicyRequest) obj;
        if ((putResourcePolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (putResourcePolicyRequest.getPolicyName() != null && !putResourcePolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((putResourcePolicyRequest.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        return putResourcePolicyRequest.getPolicyDocument() == null || putResourcePolicyRequest.getPolicyDocument().equals(getPolicyDocument());
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyDocument() != null ? getPolicyDocument().hashCode() : 0);
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
        if (getPolicyDocument() != null) {
            sb.append("policyDocument: " + getPolicyDocument());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutResourcePolicyRequest withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public PutResourcePolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
