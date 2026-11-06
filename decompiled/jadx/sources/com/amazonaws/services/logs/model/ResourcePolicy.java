package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResourcePolicy implements Serializable {
    private Long lastUpdatedTime;
    private String policyDocument;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResourcePolicy)) {
            return false;
        }
        ResourcePolicy resourcePolicy = (ResourcePolicy) obj;
        if ((resourcePolicy.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (resourcePolicy.getPolicyName() != null && !resourcePolicy.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((resourcePolicy.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        if (resourcePolicy.getPolicyDocument() != null && !resourcePolicy.getPolicyDocument().equals(getPolicyDocument())) {
            return false;
        }
        if ((resourcePolicy.getLastUpdatedTime() == null) ^ (getLastUpdatedTime() == null)) {
            return false;
        }
        return resourcePolicy.getLastUpdatedTime() == null || resourcePolicy.getLastUpdatedTime().equals(getLastUpdatedTime());
    }

    public Long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyDocument() == null ? 0 : getPolicyDocument().hashCode())) * 31) + (getLastUpdatedTime() != null ? getLastUpdatedTime().hashCode() : 0);
    }

    public void setLastUpdatedTime(Long l) {
        this.lastUpdatedTime = l;
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
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        }
        if (getLastUpdatedTime() != null) {
            sb.append("lastUpdatedTime: " + getLastUpdatedTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ResourcePolicy withLastUpdatedTime(Long l) {
        this.lastUpdatedTime = l;
        return this;
    }

    public ResourcePolicy withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public ResourcePolicy withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
