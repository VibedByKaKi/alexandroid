package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeUserPoolClientRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientId;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeUserPoolClientRequest)) {
            return false;
        }
        DescribeUserPoolClientRequest describeUserPoolClientRequest = (DescribeUserPoolClientRequest) obj;
        if ((describeUserPoolClientRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (describeUserPoolClientRequest.getUserPoolId() != null && !describeUserPoolClientRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((describeUserPoolClientRequest.getClientId() == null) ^ (getClientId() == null)) {
            return false;
        }
        return describeUserPoolClientRequest.getClientId() == null || describeUserPoolClientRequest.getClientId().equals(getClientId());
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getClientId() != null ? getClientId().hashCode() : 0);
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getClientId() != null) {
            sb.append("ClientId: " + getClientId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeUserPoolClientRequest withClientId(String str) {
        this.clientId = str;
        return this;
    }

    public DescribeUserPoolClientRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
