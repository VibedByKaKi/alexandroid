package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateUserPoolClientResult implements Serializable {
    private UserPoolClientType userPoolClient;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateUserPoolClientResult)) {
            return false;
        }
        UpdateUserPoolClientResult updateUserPoolClientResult = (UpdateUserPoolClientResult) obj;
        if ((updateUserPoolClientResult.getUserPoolClient() == null) ^ (getUserPoolClient() == null)) {
            return false;
        }
        return updateUserPoolClientResult.getUserPoolClient() == null || updateUserPoolClientResult.getUserPoolClient().equals(getUserPoolClient());
    }

    public UserPoolClientType getUserPoolClient() {
        return this.userPoolClient;
    }

    public int hashCode() {
        return 31 + (getUserPoolClient() == null ? 0 : getUserPoolClient().hashCode());
    }

    public void setUserPoolClient(UserPoolClientType userPoolClientType) {
        this.userPoolClient = userPoolClientType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolClient() != null) {
            sb.append("UserPoolClient: " + getUserPoolClient());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateUserPoolClientResult withUserPoolClient(UserPoolClientType userPoolClientType) {
        this.userPoolClient = userPoolClientType;
        return this;
    }
}
