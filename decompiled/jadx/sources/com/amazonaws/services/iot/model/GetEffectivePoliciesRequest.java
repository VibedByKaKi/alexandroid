package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetEffectivePoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    private String cognitoIdentityPoolId;
    private String principal;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetEffectivePoliciesRequest)) {
            return false;
        }
        GetEffectivePoliciesRequest getEffectivePoliciesRequest = (GetEffectivePoliciesRequest) obj;
        if ((getEffectivePoliciesRequest.getPrincipal() == null) ^ (getPrincipal() == null)) {
            return false;
        }
        if (getEffectivePoliciesRequest.getPrincipal() != null && !getEffectivePoliciesRequest.getPrincipal().equals(getPrincipal())) {
            return false;
        }
        if ((getEffectivePoliciesRequest.getCognitoIdentityPoolId() == null) ^ (getCognitoIdentityPoolId() == null)) {
            return false;
        }
        if (getEffectivePoliciesRequest.getCognitoIdentityPoolId() != null && !getEffectivePoliciesRequest.getCognitoIdentityPoolId().equals(getCognitoIdentityPoolId())) {
            return false;
        }
        if ((getEffectivePoliciesRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        return getEffectivePoliciesRequest.getThingName() == null || getEffectivePoliciesRequest.getThingName().equals(getThingName());
    }

    public String getCognitoIdentityPoolId() {
        return this.cognitoIdentityPoolId;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getPrincipal() == null ? 0 : getPrincipal().hashCode()) + 31) * 31) + (getCognitoIdentityPoolId() == null ? 0 : getCognitoIdentityPoolId().hashCode())) * 31) + (getThingName() != null ? getThingName().hashCode() : 0);
    }

    public void setCognitoIdentityPoolId(String str) {
        this.cognitoIdentityPoolId = str;
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPrincipal() != null) {
            sb.append("principal: " + getPrincipal() + ",");
        }
        if (getCognitoIdentityPoolId() != null) {
            sb.append("cognitoIdentityPoolId: " + getCognitoIdentityPoolId() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetEffectivePoliciesRequest withCognitoIdentityPoolId(String str) {
        this.cognitoIdentityPoolId = str;
        return this;
    }

    public GetEffectivePoliciesRequest withPrincipal(String str) {
        this.principal = str;
        return this;
    }

    public GetEffectivePoliciesRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
