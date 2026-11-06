package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeResourceServerRequest extends AmazonWebServiceRequest implements Serializable {
    private String identifier;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeResourceServerRequest)) {
            return false;
        }
        DescribeResourceServerRequest describeResourceServerRequest = (DescribeResourceServerRequest) obj;
        if ((describeResourceServerRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (describeResourceServerRequest.getUserPoolId() != null && !describeResourceServerRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((describeResourceServerRequest.getIdentifier() == null) ^ (getIdentifier() == null)) {
            return false;
        }
        return describeResourceServerRequest.getIdentifier() == null || describeResourceServerRequest.getIdentifier().equals(getIdentifier());
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getIdentifier() != null ? getIdentifier().hashCode() : 0);
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getIdentifier() != null) {
            sb.append("Identifier: " + getIdentifier());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeResourceServerRequest withIdentifier(String str) {
        this.identifier = str;
        return this;
    }

    public DescribeResourceServerRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
