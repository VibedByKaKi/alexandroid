package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddThingToThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean overrideDynamicGroups;
    private String thingArn;
    private String thingGroupArn;
    private String thingGroupName;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AddThingToThingGroupRequest)) {
            return false;
        }
        AddThingToThingGroupRequest addThingToThingGroupRequest = (AddThingToThingGroupRequest) obj;
        if ((addThingToThingGroupRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (addThingToThingGroupRequest.getThingGroupName() != null && !addThingToThingGroupRequest.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((addThingToThingGroupRequest.getThingGroupArn() == null) ^ (getThingGroupArn() == null)) {
            return false;
        }
        if (addThingToThingGroupRequest.getThingGroupArn() != null && !addThingToThingGroupRequest.getThingGroupArn().equals(getThingGroupArn())) {
            return false;
        }
        if ((addThingToThingGroupRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (addThingToThingGroupRequest.getThingName() != null && !addThingToThingGroupRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((addThingToThingGroupRequest.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (addThingToThingGroupRequest.getThingArn() != null && !addThingToThingGroupRequest.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((addThingToThingGroupRequest.getOverrideDynamicGroups() == null) ^ (getOverrideDynamicGroups() == null)) {
            return false;
        }
        return addThingToThingGroupRequest.getOverrideDynamicGroups() == null || addThingToThingGroupRequest.getOverrideDynamicGroups().equals(getOverrideDynamicGroups());
    }

    public Boolean getOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((((((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getThingGroupArn() == null ? 0 : getThingGroupArn().hashCode())) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getThingArn() == null ? 0 : getThingArn().hashCode())) * 31) + (getOverrideDynamicGroups() != null ? getOverrideDynamicGroups().hashCode() : 0);
    }

    public Boolean isOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    public void setOverrideDynamicGroups(Boolean bool) {
        this.overrideDynamicGroups = bool;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setThingGroupArn(String str) {
        this.thingGroupArn = str;
    }

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        }
        if (getThingGroupArn() != null) {
            sb.append("thingGroupArn: " + getThingGroupArn() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getOverrideDynamicGroups() != null) {
            sb.append("overrideDynamicGroups: " + getOverrideDynamicGroups());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AddThingToThingGroupRequest withOverrideDynamicGroups(Boolean bool) {
        this.overrideDynamicGroups = bool;
        return this;
    }

    public AddThingToThingGroupRequest withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public AddThingToThingGroupRequest withThingGroupArn(String str) {
        this.thingGroupArn = str;
        return this;
    }

    public AddThingToThingGroupRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }

    public AddThingToThingGroupRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
