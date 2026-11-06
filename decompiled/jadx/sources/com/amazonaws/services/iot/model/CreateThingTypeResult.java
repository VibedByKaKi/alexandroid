package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingTypeResult implements Serializable {
    private String thingTypeArn;
    private String thingTypeId;
    private String thingTypeName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingTypeResult)) {
            return false;
        }
        CreateThingTypeResult createThingTypeResult = (CreateThingTypeResult) obj;
        if ((createThingTypeResult.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (createThingTypeResult.getThingTypeName() != null && !createThingTypeResult.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((createThingTypeResult.getThingTypeArn() == null) ^ (getThingTypeArn() == null)) {
            return false;
        }
        if (createThingTypeResult.getThingTypeArn() != null && !createThingTypeResult.getThingTypeArn().equals(getThingTypeArn())) {
            return false;
        }
        if ((createThingTypeResult.getThingTypeId() == null) ^ (getThingTypeId() == null)) {
            return false;
        }
        return createThingTypeResult.getThingTypeId() == null || createThingTypeResult.getThingTypeId().equals(getThingTypeId());
    }

    public String getThingTypeArn() {
        return this.thingTypeArn;
    }

    public String getThingTypeId() {
        return this.thingTypeId;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public int hashCode() {
        return (((((getThingTypeName() == null ? 0 : getThingTypeName().hashCode()) + 31) * 31) + (getThingTypeArn() == null ? 0 : getThingTypeArn().hashCode())) * 31) + (getThingTypeId() != null ? getThingTypeId().hashCode() : 0);
    }

    public void setThingTypeArn(String str) {
        this.thingTypeArn = str;
    }

    public void setThingTypeId(String str) {
        this.thingTypeId = str;
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getThingTypeArn() != null) {
            sb.append("thingTypeArn: " + getThingTypeArn() + ",");
        }
        if (getThingTypeId() != null) {
            sb.append("thingTypeId: " + getThingTypeId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingTypeResult withThingTypeArn(String str) {
        this.thingTypeArn = str;
        return this;
    }

    public CreateThingTypeResult withThingTypeId(String str) {
        this.thingTypeId = str;
        return this;
    }

    public CreateThingTypeResult withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }
}
