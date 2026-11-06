package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingTypeProperties implements Serializable {
    private List<String> searchableAttributes;
    private String thingTypeDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingTypeProperties)) {
            return false;
        }
        ThingTypeProperties thingTypeProperties = (ThingTypeProperties) obj;
        if ((thingTypeProperties.getThingTypeDescription() == null) ^ (getThingTypeDescription() == null)) {
            return false;
        }
        if (thingTypeProperties.getThingTypeDescription() != null && !thingTypeProperties.getThingTypeDescription().equals(getThingTypeDescription())) {
            return false;
        }
        if ((thingTypeProperties.getSearchableAttributes() == null) ^ (getSearchableAttributes() == null)) {
            return false;
        }
        return thingTypeProperties.getSearchableAttributes() == null || thingTypeProperties.getSearchableAttributes().equals(getSearchableAttributes());
    }

    public List<String> getSearchableAttributes() {
        return this.searchableAttributes;
    }

    public String getThingTypeDescription() {
        return this.thingTypeDescription;
    }

    public int hashCode() {
        return (((getThingTypeDescription() == null ? 0 : getThingTypeDescription().hashCode()) + 31) * 31) + (getSearchableAttributes() != null ? getSearchableAttributes().hashCode() : 0);
    }

    public void setSearchableAttributes(Collection<String> collection) {
        if (collection == null) {
            this.searchableAttributes = null;
        } else {
            this.searchableAttributes = new ArrayList(collection);
        }
    }

    public void setThingTypeDescription(String str) {
        this.thingTypeDescription = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeDescription() != null) {
            sb.append("thingTypeDescription: " + getThingTypeDescription() + ",");
        }
        if (getSearchableAttributes() != null) {
            sb.append("searchableAttributes: " + getSearchableAttributes());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingTypeProperties withSearchableAttributes(String... strArr) {
        if (getSearchableAttributes() == null) {
            this.searchableAttributes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.searchableAttributes.add(str);
        }
        return this;
    }

    public ThingTypeProperties withThingTypeDescription(String str) {
        this.thingTypeDescription = str;
        return this;
    }

    public ThingTypeProperties withSearchableAttributes(Collection<String> collection) {
        setSearchableAttributes(collection);
        return this;
    }
}
