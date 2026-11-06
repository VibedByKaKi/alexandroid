package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListUserPoolClientsResult implements Serializable {
    private String nextToken;
    private List<UserPoolClientDescription> userPoolClients;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListUserPoolClientsResult)) {
            return false;
        }
        ListUserPoolClientsResult listUserPoolClientsResult = (ListUserPoolClientsResult) obj;
        if ((listUserPoolClientsResult.getUserPoolClients() == null) ^ (getUserPoolClients() == null)) {
            return false;
        }
        if (listUserPoolClientsResult.getUserPoolClients() != null && !listUserPoolClientsResult.getUserPoolClients().equals(getUserPoolClients())) {
            return false;
        }
        if ((listUserPoolClientsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listUserPoolClientsResult.getNextToken() == null || listUserPoolClientsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<UserPoolClientDescription> getUserPoolClients() {
        return this.userPoolClients;
    }

    public int hashCode() {
        return (((getUserPoolClients() == null ? 0 : getUserPoolClients().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setUserPoolClients(Collection<UserPoolClientDescription> collection) {
        if (collection == null) {
            this.userPoolClients = null;
        } else {
            this.userPoolClients = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolClients() != null) {
            sb.append("UserPoolClients: " + getUserPoolClients() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListUserPoolClientsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListUserPoolClientsResult withUserPoolClients(UserPoolClientDescription... userPoolClientDescriptionArr) {
        if (getUserPoolClients() == null) {
            this.userPoolClients = new ArrayList(userPoolClientDescriptionArr.length);
        }
        for (UserPoolClientDescription userPoolClientDescription : userPoolClientDescriptionArr) {
            this.userPoolClients.add(userPoolClientDescription);
        }
        return this;
    }

    public ListUserPoolClientsResult withUserPoolClients(Collection<UserPoolClientDescription> collection) {
        setUserPoolClients(collection);
        return this;
    }
}
