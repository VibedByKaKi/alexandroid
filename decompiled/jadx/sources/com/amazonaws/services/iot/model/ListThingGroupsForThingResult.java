package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingGroupsForThingResult implements Serializable {
    private String nextToken;
    private List<GroupNameAndArn> thingGroups;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingGroupsForThingResult)) {
            return false;
        }
        ListThingGroupsForThingResult listThingGroupsForThingResult = (ListThingGroupsForThingResult) obj;
        if ((listThingGroupsForThingResult.getThingGroups() == null) ^ (getThingGroups() == null)) {
            return false;
        }
        if (listThingGroupsForThingResult.getThingGroups() != null && !listThingGroupsForThingResult.getThingGroups().equals(getThingGroups())) {
            return false;
        }
        if ((listThingGroupsForThingResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listThingGroupsForThingResult.getNextToken() == null || listThingGroupsForThingResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<GroupNameAndArn> getThingGroups() {
        return this.thingGroups;
    }

    public int hashCode() {
        return (((getThingGroups() == null ? 0 : getThingGroups().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setThingGroups(Collection<GroupNameAndArn> collection) {
        if (collection == null) {
            this.thingGroups = null;
        } else {
            this.thingGroups = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroups() != null) {
            sb.append("thingGroups: " + getThingGroups() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingGroupsForThingResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingGroupsForThingResult withThingGroups(GroupNameAndArn... groupNameAndArnArr) {
        if (getThingGroups() == null) {
            this.thingGroups = new ArrayList(groupNameAndArnArr.length);
        }
        for (GroupNameAndArn groupNameAndArn : groupNameAndArnArr) {
            this.thingGroups.add(groupNameAndArn);
        }
        return this;
    }

    public ListThingGroupsForThingResult withThingGroups(Collection<GroupNameAndArn> collection) {
        setThingGroups(collection);
        return this;
    }
}
