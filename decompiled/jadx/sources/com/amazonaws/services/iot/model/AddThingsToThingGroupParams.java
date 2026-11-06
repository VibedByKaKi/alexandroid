package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddThingsToThingGroupParams implements Serializable {
    private Boolean overrideDynamicGroups;
    private List<String> thingGroupNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AddThingsToThingGroupParams)) {
            return false;
        }
        AddThingsToThingGroupParams addThingsToThingGroupParams = (AddThingsToThingGroupParams) obj;
        if ((addThingsToThingGroupParams.getThingGroupNames() == null) ^ (getThingGroupNames() == null)) {
            return false;
        }
        if (addThingsToThingGroupParams.getThingGroupNames() != null && !addThingsToThingGroupParams.getThingGroupNames().equals(getThingGroupNames())) {
            return false;
        }
        if ((addThingsToThingGroupParams.getOverrideDynamicGroups() == null) ^ (getOverrideDynamicGroups() == null)) {
            return false;
        }
        return addThingsToThingGroupParams.getOverrideDynamicGroups() == null || addThingsToThingGroupParams.getOverrideDynamicGroups().equals(getOverrideDynamicGroups());
    }

    public Boolean getOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    public List<String> getThingGroupNames() {
        return this.thingGroupNames;
    }

    public int hashCode() {
        return (((getThingGroupNames() == null ? 0 : getThingGroupNames().hashCode()) + 31) * 31) + (getOverrideDynamicGroups() != null ? getOverrideDynamicGroups().hashCode() : 0);
    }

    public Boolean isOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    public void setOverrideDynamicGroups(Boolean bool) {
        this.overrideDynamicGroups = bool;
    }

    public void setThingGroupNames(Collection<String> collection) {
        if (collection == null) {
            this.thingGroupNames = null;
        } else {
            this.thingGroupNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupNames() != null) {
            sb.append("thingGroupNames: " + getThingGroupNames() + ",");
        }
        if (getOverrideDynamicGroups() != null) {
            sb.append("overrideDynamicGroups: " + getOverrideDynamicGroups());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AddThingsToThingGroupParams withOverrideDynamicGroups(Boolean bool) {
        this.overrideDynamicGroups = bool;
        return this;
    }

    public AddThingsToThingGroupParams withThingGroupNames(String... strArr) {
        if (getThingGroupNames() == null) {
            this.thingGroupNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.thingGroupNames.add(str);
        }
        return this;
    }

    public AddThingsToThingGroupParams withThingGroupNames(Collection<String> collection) {
        setThingGroupNames(collection);
        return this;
    }
}
