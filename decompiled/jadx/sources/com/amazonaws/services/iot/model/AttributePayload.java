package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AttributePayload implements Serializable {
    private Map<String, String> attributes;
    private Boolean merge;

    public AttributePayload addattributesEntry(String str, String str2) {
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        if (this.attributes.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.attributes.put(str, str2);
        return this;
    }

    public AttributePayload clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AttributePayload)) {
            return false;
        }
        AttributePayload attributePayload = (AttributePayload) obj;
        if ((attributePayload.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (attributePayload.getAttributes() != null && !attributePayload.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((attributePayload.getMerge() == null) ^ (getMerge() == null)) {
            return false;
        }
        return attributePayload.getMerge() == null || attributePayload.getMerge().equals(getMerge());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public Boolean getMerge() {
        return this.merge;
    }

    public int hashCode() {
        return (((getAttributes() == null ? 0 : getAttributes().hashCode()) + 31) * 31) + (getMerge() != null ? getMerge().hashCode() : 0);
    }

    public Boolean isMerge() {
        return this.merge;
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setMerge(Boolean bool) {
        this.merge = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes() + ",");
        }
        if (getMerge() != null) {
            sb.append("merge: " + getMerge());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AttributePayload withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public AttributePayload withMerge(Boolean bool) {
        this.merge = bool;
        return this;
    }
}
