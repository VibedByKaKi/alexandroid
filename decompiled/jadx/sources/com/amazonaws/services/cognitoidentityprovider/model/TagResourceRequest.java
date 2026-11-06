package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String resourceArn;
    private Map<String, String> tags;

    public TagResourceRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (this.tags.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.tags.put(str, str2);
        return this;
    }

    public TagResourceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TagResourceRequest)) {
            return false;
        }
        TagResourceRequest tagResourceRequest = (TagResourceRequest) obj;
        if ((tagResourceRequest.getResourceArn() == null) ^ (getResourceArn() == null)) {
            return false;
        }
        if (tagResourceRequest.getResourceArn() != null && !tagResourceRequest.getResourceArn().equals(getResourceArn())) {
            return false;
        }
        if ((tagResourceRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return tagResourceRequest.getTags() == null || tagResourceRequest.getTags().equals(getTags());
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getResourceArn() == null ? 0 : getResourceArn().hashCode()) + 31) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceArn() != null) {
            sb.append("ResourceArn: " + getResourceArn() + ",");
        }
        if (getTags() != null) {
            sb.append("Tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TagResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }

    public TagResourceRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }
}
