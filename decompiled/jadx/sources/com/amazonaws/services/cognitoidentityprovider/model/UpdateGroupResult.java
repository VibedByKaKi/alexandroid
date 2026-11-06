package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateGroupResult implements Serializable {
    private GroupType group;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGroupResult)) {
            return false;
        }
        UpdateGroupResult updateGroupResult = (UpdateGroupResult) obj;
        if ((updateGroupResult.getGroup() == null) ^ (getGroup() == null)) {
            return false;
        }
        return updateGroupResult.getGroup() == null || updateGroupResult.getGroup().equals(getGroup());
    }

    public GroupType getGroup() {
        return this.group;
    }

    public int hashCode() {
        return 31 + (getGroup() == null ? 0 : getGroup().hashCode());
    }

    public void setGroup(GroupType groupType) {
        this.group = groupType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getGroup() != null) {
            sb.append("Group: " + getGroup());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateGroupResult withGroup(GroupType groupType) {
        this.group = groupType;
        return this;
    }
}
