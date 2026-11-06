package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateUserPoolResult implements Serializable {
    private UserPoolType userPool;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateUserPoolResult)) {
            return false;
        }
        CreateUserPoolResult createUserPoolResult = (CreateUserPoolResult) obj;
        if ((createUserPoolResult.getUserPool() == null) ^ (getUserPool() == null)) {
            return false;
        }
        return createUserPoolResult.getUserPool() == null || createUserPoolResult.getUserPool().equals(getUserPool());
    }

    public UserPoolType getUserPool() {
        return this.userPool;
    }

    public int hashCode() {
        return 31 + (getUserPool() == null ? 0 : getUserPool().hashCode());
    }

    public void setUserPool(UserPoolType userPoolType) {
        this.userPool = userPoolType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPool() != null) {
            sb.append("UserPool: " + getUserPool());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateUserPoolResult withUserPool(UserPoolType userPoolType) {
        this.userPool = userPoolType;
        return this;
    }
}
