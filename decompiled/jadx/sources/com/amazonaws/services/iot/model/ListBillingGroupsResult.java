package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListBillingGroupsResult implements Serializable {
    private List<GroupNameAndArn> billingGroups;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListBillingGroupsResult)) {
            return false;
        }
        ListBillingGroupsResult listBillingGroupsResult = (ListBillingGroupsResult) obj;
        if ((listBillingGroupsResult.getBillingGroups() == null) ^ (getBillingGroups() == null)) {
            return false;
        }
        if (listBillingGroupsResult.getBillingGroups() != null && !listBillingGroupsResult.getBillingGroups().equals(getBillingGroups())) {
            return false;
        }
        if ((listBillingGroupsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listBillingGroupsResult.getNextToken() == null || listBillingGroupsResult.getNextToken().equals(getNextToken());
    }

    public List<GroupNameAndArn> getBillingGroups() {
        return this.billingGroups;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getBillingGroups() == null ? 0 : getBillingGroups().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setBillingGroups(Collection<GroupNameAndArn> collection) {
        if (collection == null) {
            this.billingGroups = null;
        } else {
            this.billingGroups = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroups() != null) {
            sb.append("billingGroups: " + getBillingGroups() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListBillingGroupsResult withBillingGroups(GroupNameAndArn... groupNameAndArnArr) {
        if (getBillingGroups() == null) {
            this.billingGroups = new ArrayList(groupNameAndArnArr.length);
        }
        for (GroupNameAndArn groupNameAndArn : groupNameAndArnArr) {
            this.billingGroups.add(groupNameAndArn);
        }
        return this;
    }

    public ListBillingGroupsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListBillingGroupsResult withBillingGroups(Collection<GroupNameAndArn> collection) {
        setBillingGroups(collection);
        return this;
    }
}
