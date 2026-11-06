package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetSigningCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSigningCertificateRequest)) {
            return false;
        }
        GetSigningCertificateRequest getSigningCertificateRequest = (GetSigningCertificateRequest) obj;
        if ((getSigningCertificateRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        return getSigningCertificateRequest.getUserPoolId() == null || getSigningCertificateRequest.getUserPoolId().equals(getUserPoolId());
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return 31 + (getUserPoolId() == null ? 0 : getUserPoolId().hashCode());
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetSigningCertificateRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
