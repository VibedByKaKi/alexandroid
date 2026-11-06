package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyDocument;
    private String policyName;
    private Boolean setAsDefault;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreatePolicyVersionRequest)) {
            return false;
        }
        CreatePolicyVersionRequest createPolicyVersionRequest = (CreatePolicyVersionRequest) obj;
        if ((createPolicyVersionRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (createPolicyVersionRequest.getPolicyName() != null && !createPolicyVersionRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((createPolicyVersionRequest.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        if (createPolicyVersionRequest.getPolicyDocument() != null && !createPolicyVersionRequest.getPolicyDocument().equals(getPolicyDocument())) {
            return false;
        }
        if ((createPolicyVersionRequest.getSetAsDefault() == null) ^ (getSetAsDefault() == null)) {
            return false;
        }
        return createPolicyVersionRequest.getSetAsDefault() == null || createPolicyVersionRequest.getSetAsDefault().equals(getSetAsDefault());
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public int hashCode() {
        return (((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyDocument() == null ? 0 : getPolicyDocument().hashCode())) * 31) + (getSetAsDefault() != null ? getSetAsDefault().hashCode() : 0);
    }

    public Boolean isSetAsDefault() {
        return this.setAsDefault;
    }

    public void setPolicyDocument(String str) {
        this.policyDocument = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setSetAsDefault(Boolean bool) {
        this.setAsDefault = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getPolicyDocument() != null) {
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        }
        if (getSetAsDefault() != null) {
            sb.append("setAsDefault: " + getSetAsDefault());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreatePolicyVersionRequest withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public CreatePolicyVersionRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public CreatePolicyVersionRequest withSetAsDefault(Boolean bool) {
        this.setAsDefault = bool;
        return this;
    }
}
