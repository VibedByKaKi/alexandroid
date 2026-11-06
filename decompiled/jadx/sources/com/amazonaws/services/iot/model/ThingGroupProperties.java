package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingGroupProperties implements Serializable {
    private AttributePayload attributePayload;
    private String thingGroupDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingGroupProperties)) {
            return false;
        }
        ThingGroupProperties thingGroupProperties = (ThingGroupProperties) obj;
        if ((thingGroupProperties.getThingGroupDescription() == null) ^ (getThingGroupDescription() == null)) {
            return false;
        }
        if (thingGroupProperties.getThingGroupDescription() != null && !thingGroupProperties.getThingGroupDescription().equals(getThingGroupDescription())) {
            return false;
        }
        if ((thingGroupProperties.getAttributePayload() == null) ^ (getAttributePayload() == null)) {
            return false;
        }
        return thingGroupProperties.getAttributePayload() == null || thingGroupProperties.getAttributePayload().equals(getAttributePayload());
    }

    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    public String getThingGroupDescription() {
        return this.thingGroupDescription;
    }

    public int hashCode() {
        return (((getThingGroupDescription() == null ? 0 : getThingGroupDescription().hashCode()) + 31) * 31) + (getAttributePayload() != null ? getAttributePayload().hashCode() : 0);
    }

    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    public void setThingGroupDescription(String str) {
        this.thingGroupDescription = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupDescription() != null) {
            sb.append("thingGroupDescription: " + getThingGroupDescription() + ",");
        }
        if (getAttributePayload() != null) {
            sb.append("attributePayload: " + getAttributePayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingGroupProperties withAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
        return this;
    }

    public ThingGroupProperties withThingGroupDescription(String str) {
        this.thingGroupDescription = str;
        return this;
    }
}
