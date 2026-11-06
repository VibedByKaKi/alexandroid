package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteUserRequest extends AmazonWebServiceRequest implements Serializable {
    private String accessToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteUserRequest)) {
            return false;
        }
        DeleteUserRequest deleteUserRequest = (DeleteUserRequest) obj;
        if ((deleteUserRequest.getAccessToken() == null) ^ (getAccessToken() == null)) {
            return false;
        }
        return deleteUserRequest.getAccessToken() == null || deleteUserRequest.getAccessToken().equals(getAccessToken());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public int hashCode() {
        return 31 + (getAccessToken() == null ? 0 : getAccessToken().hashCode());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAccessToken() != null) {
            sb.append("AccessToken: " + getAccessToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteUserRequest withAccessToken(String str) {
        this.accessToken = str;
        return this;
    }
}
