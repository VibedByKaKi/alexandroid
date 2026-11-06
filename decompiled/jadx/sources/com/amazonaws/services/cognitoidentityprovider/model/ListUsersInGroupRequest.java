package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListUsersInGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String groupName;
    private Integer limit;
    private String nextToken;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListUsersInGroupRequest)) {
            return false;
        }
        ListUsersInGroupRequest listUsersInGroupRequest = (ListUsersInGroupRequest) obj;
        if ((listUsersInGroupRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (listUsersInGroupRequest.getUserPoolId() != null && !listUsersInGroupRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((listUsersInGroupRequest.getGroupName() == null) ^ (getGroupName() == null)) {
            return false;
        }
        if (listUsersInGroupRequest.getGroupName() != null && !listUsersInGroupRequest.getGroupName().equals(getGroupName())) {
            return false;
        }
        if ((listUsersInGroupRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listUsersInGroupRequest.getLimit() != null && !listUsersInGroupRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listUsersInGroupRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listUsersInGroupRequest.getNextToken() == null || listUsersInGroupRequest.getNextToken().equals(getNextToken());
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((((((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getGroupName() == null ? 0 : getGroupName().hashCode())) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getGroupName() != null) {
            sb.append("GroupName: " + getGroupName() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListUsersInGroupRequest withGroupName(String str) {
        this.groupName = str;
        return this;
    }

    public ListUsersInGroupRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListUsersInGroupRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListUsersInGroupRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
