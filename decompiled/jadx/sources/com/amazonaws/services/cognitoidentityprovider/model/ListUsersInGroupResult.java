package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListUsersInGroupResult implements Serializable {
    private String nextToken;
    private List<UserType> users;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListUsersInGroupResult)) {
            return false;
        }
        ListUsersInGroupResult listUsersInGroupResult = (ListUsersInGroupResult) obj;
        if ((listUsersInGroupResult.getUsers() == null) ^ (getUsers() == null)) {
            return false;
        }
        if (listUsersInGroupResult.getUsers() != null && !listUsersInGroupResult.getUsers().equals(getUsers())) {
            return false;
        }
        if ((listUsersInGroupResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listUsersInGroupResult.getNextToken() == null || listUsersInGroupResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<UserType> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((getUsers() == null ? 0 : getUsers().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setUsers(Collection<UserType> collection) {
        if (collection == null) {
            this.users = null;
        } else {
            this.users = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUsers() != null) {
            sb.append("Users: " + getUsers() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListUsersInGroupResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListUsersInGroupResult withUsers(UserType... userTypeArr) {
        if (getUsers() == null) {
            this.users = new ArrayList(userTypeArr.length);
        }
        for (UserType userType : userTypeArr) {
            this.users.add(userType);
        }
        return this;
    }

    public ListUsersInGroupResult withUsers(Collection<UserType> collection) {
        setUsers(collection);
        return this;
    }
}
