package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RelatedResource implements Serializable {
    private Map<String, String> additionalInfo;
    private ResourceIdentifier resourceIdentifier;
    private String resourceType;

    public RelatedResource addadditionalInfoEntry(String str, String str2) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap();
        }
        if (this.additionalInfo.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.additionalInfo.put(str, str2);
        return this;
    }

    public RelatedResource clearadditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RelatedResource)) {
            return false;
        }
        RelatedResource relatedResource = (RelatedResource) obj;
        if ((relatedResource.getResourceType() == null) ^ (getResourceType() == null)) {
            return false;
        }
        if (relatedResource.getResourceType() != null && !relatedResource.getResourceType().equals(getResourceType())) {
            return false;
        }
        if ((relatedResource.getResourceIdentifier() == null) ^ (getResourceIdentifier() == null)) {
            return false;
        }
        if (relatedResource.getResourceIdentifier() != null && !relatedResource.getResourceIdentifier().equals(getResourceIdentifier())) {
            return false;
        }
        if ((relatedResource.getAdditionalInfo() == null) ^ (getAdditionalInfo() == null)) {
            return false;
        }
        return relatedResource.getAdditionalInfo() == null || relatedResource.getAdditionalInfo().equals(getAdditionalInfo());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public int hashCode() {
        return (((((getResourceType() == null ? 0 : getResourceType().hashCode()) + 31) * 31) + (getResourceIdentifier() == null ? 0 : getResourceIdentifier().hashCode())) * 31) + (getAdditionalInfo() != null ? getAdditionalInfo().hashCode() : 0);
    }

    public void setAdditionalInfo(Map<String, String> map) {
        this.additionalInfo = map;
    }

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceType() != null) {
            sb.append("resourceType: " + getResourceType() + ",");
        }
        if (getResourceIdentifier() != null) {
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        }
        if (getAdditionalInfo() != null) {
            sb.append("additionalInfo: " + getAdditionalInfo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RelatedResource withAdditionalInfo(Map<String, String> map) {
        this.additionalInfo = map;
        return this;
    }

    public RelatedResource withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    public RelatedResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public RelatedResource withResourceType(String str) {
        this.resourceType = str;
        return this;
    }
}
