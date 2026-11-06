package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String groupName;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetGroupRequest)) {
            return false;
        }
        GetGroupRequest getGroupRequest = (GetGroupRequest) obj;
        if ((getGroupRequest.getGroupName() == null) ^ (getGroupName() == null)) {
            return false;
        }
        if (getGroupRequest.getGroupName() != null && !getGroupRequest.getGroupName().equals(getGroupName())) {
            return false;
        }
        if ((getGroupRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        return getGroupRequest.getUserPoolId() == null || getGroupRequest.getUserPoolId().equals(getUserPoolId());
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getGroupName() == null ? 0 : getGroupName().hashCode()) + 31) * 31) + (getUserPoolId() != null ? getUserPoolId().hashCode() : 0);
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getGroupName() != null) {
            sb.append("GroupName: " + getGroupName() + ",");
        }
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetGroupRequest withGroupName(String str) {
        this.groupName = str;
        return this;
    }

    public GetGroupRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
