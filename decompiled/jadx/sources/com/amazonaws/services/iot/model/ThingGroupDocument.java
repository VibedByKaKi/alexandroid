package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingGroupDocument implements Serializable {
    private Map<String, String> attributes;
    private List<String> parentGroupNames;
    private String thingGroupDescription;
    private String thingGroupId;
    private String thingGroupName;

    public ThingGroupDocument addattributesEntry(String str, String str2) {
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

    public ThingGroupDocument clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingGroupDocument)) {
            return false;
        }
        ThingGroupDocument thingGroupDocument = (ThingGroupDocument) obj;
        if ((thingGroupDocument.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (thingGroupDocument.getThingGroupName() != null && !thingGroupDocument.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((thingGroupDocument.getThingGroupId() == null) ^ (getThingGroupId() == null)) {
            return false;
        }
        if (thingGroupDocument.getThingGroupId() != null && !thingGroupDocument.getThingGroupId().equals(getThingGroupId())) {
            return false;
        }
        if ((thingGroupDocument.getThingGroupDescription() == null) ^ (getThingGroupDescription() == null)) {
            return false;
        }
        if (thingGroupDocument.getThingGroupDescription() != null && !thingGroupDocument.getThingGroupDescription().equals(getThingGroupDescription())) {
            return false;
        }
        if ((thingGroupDocument.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (thingGroupDocument.getAttributes() != null && !thingGroupDocument.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((thingGroupDocument.getParentGroupNames() == null) ^ (getParentGroupNames() == null)) {
            return false;
        }
        return thingGroupDocument.getParentGroupNames() == null || thingGroupDocument.getParentGroupNames().equals(getParentGroupNames());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public List<String> getParentGroupNames() {
        return this.parentGroupNames;
    }

    public String getThingGroupDescription() {
        return this.thingGroupDescription;
    }

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public int hashCode() {
        return (((((((((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getThingGroupId() == null ? 0 : getThingGroupId().hashCode())) * 31) + (getThingGroupDescription() == null ? 0 : getThingGroupDescription().hashCode())) * 31) + (getAttributes() == null ? 0 : getAttributes().hashCode())) * 31) + (getParentGroupNames() != null ? getParentGroupNames().hashCode() : 0);
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setParentGroupNames(Collection<String> collection) {
        if (collection == null) {
            this.parentGroupNames = null;
        } else {
            this.parentGroupNames = new ArrayList(collection);
        }
    }

    public void setThingGroupDescription(String str) {
        this.thingGroupDescription = str;
    }

    public void setThingGroupId(String str) {
        this.thingGroupId = str;
    }

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        }
        if (getThingGroupId() != null) {
            sb.append("thingGroupId: " + getThingGroupId() + ",");
        }
        if (getThingGroupDescription() != null) {
            sb.append("thingGroupDescription: " + getThingGroupDescription() + ",");
        }
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes() + ",");
        }
        if (getParentGroupNames() != null) {
            sb.append("parentGroupNames: " + getParentGroupNames());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingGroupDocument withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public ThingGroupDocument withParentGroupNames(String... strArr) {
        if (getParentGroupNames() == null) {
            this.parentGroupNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.parentGroupNames.add(str);
        }
        return this;
    }

    public ThingGroupDocument withThingGroupDescription(String str) {
        this.thingGroupDescription = str;
        return this;
    }

    public ThingGroupDocument withThingGroupId(String str) {
        this.thingGroupId = str;
        return this;
    }

    public ThingGroupDocument withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }

    public ThingGroupDocument withParentGroupNames(Collection<String> collection) {
        setParentGroupNames(collection);
        return this;
    }
}
