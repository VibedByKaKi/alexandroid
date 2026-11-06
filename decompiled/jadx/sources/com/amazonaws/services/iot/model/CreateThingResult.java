package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingResult implements Serializable {
    private String thingArn;
    private String thingId;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingResult)) {
            return false;
        }
        CreateThingResult createThingResult = (CreateThingResult) obj;
        if ((createThingResult.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (createThingResult.getThingName() != null && !createThingResult.getThingName().equals(getThingName())) {
            return false;
        }
        if ((createThingResult.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (createThingResult.getThingArn() != null && !createThingResult.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((createThingResult.getThingId() == null) ^ (getThingId() == null)) {
            return false;
        }
        return createThingResult.getThingId() == null || createThingResult.getThingId().equals(getThingId());
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public String getThingId() {
        return this.thingId;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getThingName() == null ? 0 : getThingName().hashCode()) + 31) * 31) + (getThingArn() == null ? 0 : getThingArn().hashCode())) * 31) + (getThingId() != null ? getThingId().hashCode() : 0);
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setThingId(String str) {
        this.thingId = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getThingId() != null) {
            sb.append("thingId: " + getThingId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingResult withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public CreateThingResult withThingId(String str) {
        this.thingId = str;
        return this;
    }

    public CreateThingResult withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
