package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminCreateUserResult implements Serializable {
    private UserType user;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminCreateUserResult)) {
            return false;
        }
        AdminCreateUserResult adminCreateUserResult = (AdminCreateUserResult) obj;
        if ((adminCreateUserResult.getUser() == null) ^ (getUser() == null)) {
            return false;
        }
        return adminCreateUserResult.getUser() == null || adminCreateUserResult.getUser().equals(getUser());
    }

    public UserType getUser() {
        return this.user;
    }

    public int hashCode() {
        return 31 + (getUser() == null ? 0 : getUser().hashCode());
    }

    public void setUser(UserType userType) {
        this.user = userType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUser() != null) {
            sb.append("User: " + getUser());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminCreateUserResult withUser(UserType userType) {
        this.user = userType;
        return this;
    }
}
