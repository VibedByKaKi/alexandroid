package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingAttribute implements Serializable {
    private Map<String, String> attributes;
    private String thingArn;
    private String thingName;
    private String thingTypeName;
    private Long version;

    public ThingAttribute addattributesEntry(String str, String str2) {
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

    public ThingAttribute clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingAttribute)) {
            return false;
        }
        ThingAttribute thingAttribute = (ThingAttribute) obj;
        if ((thingAttribute.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (thingAttribute.getThingName() != null && !thingAttribute.getThingName().equals(getThingName())) {
            return false;
        }
        if ((thingAttribute.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (thingAttribute.getThingTypeName() != null && !thingAttribute.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((thingAttribute.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (thingAttribute.getThingArn() != null && !thingAttribute.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((thingAttribute.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (thingAttribute.getAttributes() != null && !thingAttribute.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((thingAttribute.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        return thingAttribute.getVersion() == null || thingAttribute.getVersion().equals(getVersion());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getThingTypeName() == null ? 0 : getThingTypeName().hashCode())) * 31) + (getThingArn() == null ? 0 : getThingArn().hashCode())) * 31) + (getAttributes() == null ? 0 : getAttributes().hashCode())) * 31) + (getVersion() != null ? getVersion().hashCode() : 0);
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public void setVersion(Long l) {
        this.version = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes() + ",");
        }
        if (getVersion() != null) {
            sb.append("version: " + getVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingAttribute withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public ThingAttribute withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public ThingAttribute withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public ThingAttribute withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }

    public ThingAttribute withVersion(Long l) {
        this.version = l;
        return this;
    }
}
