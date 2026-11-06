package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ThingTypeDefinition implements Serializable {
    private String thingTypeArn;
    private ThingTypeMetadata thingTypeMetadata;
    private String thingTypeName;
    private ThingTypeProperties thingTypeProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ThingTypeDefinition)) {
            return false;
        }
        ThingTypeDefinition thingTypeDefinition = (ThingTypeDefinition) obj;
        if ((thingTypeDefinition.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (thingTypeDefinition.getThingTypeName() != null && !thingTypeDefinition.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((thingTypeDefinition.getThingTypeArn() == null) ^ (getThingTypeArn() == null)) {
            return false;
        }
        if (thingTypeDefinition.getThingTypeArn() != null && !thingTypeDefinition.getThingTypeArn().equals(getThingTypeArn())) {
            return false;
        }
        if ((thingTypeDefinition.getThingTypeProperties() == null) ^ (getThingTypeProperties() == null)) {
            return false;
        }
        if (thingTypeDefinition.getThingTypeProperties() != null && !thingTypeDefinition.getThingTypeProperties().equals(getThingTypeProperties())) {
            return false;
        }
        if ((thingTypeDefinition.getThingTypeMetadata() == null) ^ (getThingTypeMetadata() == null)) {
            return false;
        }
        return thingTypeDefinition.getThingTypeMetadata() == null || thingTypeDefinition.getThingTypeMetadata().equals(getThingTypeMetadata());
    }

    public String getThingTypeArn() {
        return this.thingTypeArn;
    }

    public ThingTypeMetadata getThingTypeMetadata() {
        return this.thingTypeMetadata;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public ThingTypeProperties getThingTypeProperties() {
        return this.thingTypeProperties;
    }

    public int hashCode() {
        return (((((((getThingTypeName() == null ? 0 : getThingTypeName().hashCode()) + 31) * 31) + (getThingTypeArn() == null ? 0 : getThingTypeArn().hashCode())) * 31) + (getThingTypeProperties() == null ? 0 : getThingTypeProperties().hashCode())) * 31) + (getThingTypeMetadata() != null ? getThingTypeMetadata().hashCode() : 0);
    }

    public void setThingTypeArn(String str) {
        this.thingTypeArn = str;
    }

    public void setThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getThingTypeArn() != null) {
            sb.append("thingTypeArn: " + getThingTypeArn() + ",");
        }
        if (getThingTypeProperties() != null) {
            sb.append("thingTypeProperties: " + getThingTypeProperties() + ",");
        }
        if (getThingTypeMetadata() != null) {
            sb.append("thingTypeMetadata: " + getThingTypeMetadata());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ThingTypeDefinition withThingTypeArn(String str) {
        this.thingTypeArn = str;
        return this;
    }

    public ThingTypeDefinition withThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
        return this;
    }

    public ThingTypeDefinition withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }

    public ThingTypeDefinition withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
        return this;
    }
}
