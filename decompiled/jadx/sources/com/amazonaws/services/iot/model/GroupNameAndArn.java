package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GroupNameAndArn implements Serializable {
    private String groupArn;
    private String groupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GroupNameAndArn)) {
            return false;
        }
        GroupNameAndArn groupNameAndArn = (GroupNameAndArn) obj;
        if ((groupNameAndArn.getGroupName() == null) ^ (getGroupName() == null)) {
            return false;
        }
        if (groupNameAndArn.getGroupName() != null && !groupNameAndArn.getGroupName().equals(getGroupName())) {
            return false;
        }
        if ((groupNameAndArn.getGroupArn() == null) ^ (getGroupArn() == null)) {
            return false;
        }
        return groupNameAndArn.getGroupArn() == null || groupNameAndArn.getGroupArn().equals(getGroupArn());
    }

    public String getGroupArn() {
        return this.groupArn;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int hashCode() {
        return (((getGroupName() == null ? 0 : getGroupName().hashCode()) + 31) * 31) + (getGroupArn() != null ? getGroupArn().hashCode() : 0);
    }

    public void setGroupArn(String str) {
        this.groupArn = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getGroupName() != null) {
            sb.append("groupName: " + getGroupName() + ",");
        }
        if (getGroupArn() != null) {
            sb.append("groupArn: " + getGroupArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GroupNameAndArn withGroupArn(String str) {
        this.groupArn = str;
        return this;
    }

    public GroupNameAndArn withGroupName(String str) {
        this.groupName = str;
        return this;
    }
}
