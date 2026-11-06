package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingGroupResult implements Serializable {
    private String thingGroupArn;
    private String thingGroupId;
    private String thingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingGroupResult)) {
            return false;
        }
        CreateThingGroupResult createThingGroupResult = (CreateThingGroupResult) obj;
        if ((createThingGroupResult.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (createThingGroupResult.getThingGroupName() != null && !createThingGroupResult.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((createThingGroupResult.getThingGroupArn() == null) ^ (getThingGroupArn() == null)) {
            return false;
        }
        if (createThingGroupResult.getThingGroupArn() != null && !createThingGroupResult.getThingGroupArn().equals(getThingGroupArn())) {
            return false;
        }
        if ((createThingGroupResult.getThingGroupId() == null) ^ (getThingGroupId() == null)) {
            return false;
        }
        return createThingGroupResult.getThingGroupId() == null || createThingGroupResult.getThingGroupId().equals(getThingGroupId());
    }

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public int hashCode() {
        return (((((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getThingGroupArn() == null ? 0 : getThingGroupArn().hashCode())) * 31) + (getThingGroupId() != null ? getThingGroupId().hashCode() : 0);
    }

    public void setThingGroupArn(String str) {
        this.thingGroupArn = str;
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
        if (getThingGroupArn() != null) {
            sb.append("thingGroupArn: " + getThingGroupArn() + ",");
        }
        if (getThingGroupId() != null) {
            sb.append("thingGroupId: " + getThingGroupId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingGroupResult withThingGroupArn(String str) {
        this.thingGroupArn = str;
        return this;
    }

    public CreateThingGroupResult withThingGroupId(String str) {
        this.thingGroupId = str;
        return this;
    }

    public CreateThingGroupResult withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }
}
