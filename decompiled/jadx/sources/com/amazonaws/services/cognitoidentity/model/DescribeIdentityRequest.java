package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeIdentityRequest)) {
            return false;
        }
        DescribeIdentityRequest describeIdentityRequest = (DescribeIdentityRequest) obj;
        if ((describeIdentityRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        return describeIdentityRequest.getIdentityId() == null || describeIdentityRequest.getIdentityId().equals(getIdentityId());
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return 31 + (getIdentityId() == null ? 0 : getIdentityId().hashCode());
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityId() != null) {
            sb.append("IdentityId: " + getIdentityId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeIdentityRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }
}
