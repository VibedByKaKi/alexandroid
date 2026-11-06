package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminListGroupsForUserResult implements Serializable {
    private List<GroupType> groups;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminListGroupsForUserResult)) {
            return false;
        }
        AdminListGroupsForUserResult adminListGroupsForUserResult = (AdminListGroupsForUserResult) obj;
        if ((adminListGroupsForUserResult.getGroups() == null) ^ (getGroups() == null)) {
            return false;
        }
        if (adminListGroupsForUserResult.getGroups() != null && !adminListGroupsForUserResult.getGroups().equals(getGroups())) {
            return false;
        }
        if ((adminListGroupsForUserResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return adminListGroupsForUserResult.getNextToken() == null || adminListGroupsForUserResult.getNextToken().equals(getNextToken());
    }

    public List<GroupType> getGroups() {
        return this.groups;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getGroups() == null ? 0 : getGroups().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setGroups(Collection<GroupType> collection) {
        if (collection == null) {
            this.groups = null;
        } else {
            this.groups = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getGroups() != null) {
            sb.append("Groups: " + getGroups() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminListGroupsForUserResult withGroups(GroupType... groupTypeArr) {
        if (getGroups() == null) {
            this.groups = new ArrayList(groupTypeArr.length);
        }
        for (GroupType groupType : groupTypeArr) {
            this.groups.add(groupType);
        }
        return this;
    }

    public AdminListGroupsForUserResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public AdminListGroupsForUserResult withGroups(Collection<GroupType> collection) {
        setGroups(collection);
        return this;
    }
}
