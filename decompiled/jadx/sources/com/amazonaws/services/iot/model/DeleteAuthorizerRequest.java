package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    private String authorizerName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteAuthorizerRequest)) {
            return false;
        }
        DeleteAuthorizerRequest deleteAuthorizerRequest = (DeleteAuthorizerRequest) obj;
        if ((deleteAuthorizerRequest.getAuthorizerName() == null) ^ (getAuthorizerName() == null)) {
            return false;
        }
        return deleteAuthorizerRequest.getAuthorizerName() == null || deleteAuthorizerRequest.getAuthorizerName().equals(getAuthorizerName());
    }

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public int hashCode() {
        return 31 + (getAuthorizerName() == null ? 0 : getAuthorizerName().hashCode());
    }

    public void setAuthorizerName(String str) {
        this.authorizerName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthorizerName() != null) {
            sb.append("authorizerName: " + getAuthorizerName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteAuthorizerRequest withAuthorizerName(String str) {
        this.authorizerName = str;
        return this;
    }
}
