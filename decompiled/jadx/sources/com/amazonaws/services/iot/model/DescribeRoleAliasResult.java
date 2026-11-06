package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeRoleAliasResult implements Serializable {
    private RoleAliasDescription roleAliasDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeRoleAliasResult)) {
            return false;
        }
        DescribeRoleAliasResult describeRoleAliasResult = (DescribeRoleAliasResult) obj;
        if ((describeRoleAliasResult.getRoleAliasDescription() == null) ^ (getRoleAliasDescription() == null)) {
            return false;
        }
        return describeRoleAliasResult.getRoleAliasDescription() == null || describeRoleAliasResult.getRoleAliasDescription().equals(getRoleAliasDescription());
    }

    public RoleAliasDescription getRoleAliasDescription() {
        return this.roleAliasDescription;
    }

    public int hashCode() {
        return 31 + (getRoleAliasDescription() == null ? 0 : getRoleAliasDescription().hashCode());
    }

    public void setRoleAliasDescription(RoleAliasDescription roleAliasDescription) {
        this.roleAliasDescription = roleAliasDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleAliasDescription() != null) {
            sb.append("roleAliasDescription: " + getRoleAliasDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeRoleAliasResult withRoleAliasDescription(RoleAliasDescription roleAliasDescription) {
        this.roleAliasDescription = roleAliasDescription;
        return this;
    }
}
