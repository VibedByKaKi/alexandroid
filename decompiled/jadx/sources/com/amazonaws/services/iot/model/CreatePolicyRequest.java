package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String policyDocument;
    private String policyName;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreatePolicyRequest)) {
            return false;
        }
        CreatePolicyRequest createPolicyRequest = (CreatePolicyRequest) obj;
        if ((createPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (createPolicyRequest.getPolicyName() != null && !createPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((createPolicyRequest.getPolicyDocument() == null) ^ (getPolicyDocument() == null)) {
            return false;
        }
        if (createPolicyRequest.getPolicyDocument() != null && !createPolicyRequest.getPolicyDocument().equals(getPolicyDocument())) {
            return false;
        }
        if ((createPolicyRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createPolicyRequest.getTags() == null || createPolicyRequest.getTags().equals(getTags());
    }

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getPolicyDocument() == null ? 0 : getPolicyDocument().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setPolicyDocument(String str) {
        this.policyDocument = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
        }
        if (getPolicyDocument() != null) {
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreatePolicyRequest withPolicyDocument(String str) {
        this.policyDocument = str;
        return this;
    }

    public CreatePolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }

    public CreatePolicyRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreatePolicyRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
