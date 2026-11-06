package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeRoleAliasRequest extends AmazonWebServiceRequest implements Serializable {
    private String roleAlias;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeRoleAliasRequest)) {
            return false;
        }
        DescribeRoleAliasRequest describeRoleAliasRequest = (DescribeRoleAliasRequest) obj;
        if ((describeRoleAliasRequest.getRoleAlias() == null) ^ (getRoleAlias() == null)) {
            return false;
        }
        return describeRoleAliasRequest.getRoleAlias() == null || describeRoleAliasRequest.getRoleAlias().equals(getRoleAlias());
    }

    public String getRoleAlias() {
        return this.roleAlias;
    }

    public int hashCode() {
        return 31 + (getRoleAlias() == null ? 0 : getRoleAlias().hashCode());
    }

    public void setRoleAlias(String str) {
        this.roleAlias = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleAlias() != null) {
            sb.append("roleAlias: " + getRoleAlias());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeRoleAliasRequest withRoleAlias(String str) {
        this.roleAlias = str;
        return this;
    }
}
