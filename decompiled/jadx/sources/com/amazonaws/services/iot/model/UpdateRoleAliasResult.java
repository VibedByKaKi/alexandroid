package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateRoleAliasResult implements Serializable {
    private String roleAlias;
    private String roleAliasArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateRoleAliasResult)) {
            return false;
        }
        UpdateRoleAliasResult updateRoleAliasResult = (UpdateRoleAliasResult) obj;
        if ((updateRoleAliasResult.getRoleAlias() == null) ^ (getRoleAlias() == null)) {
            return false;
        }
        if (updateRoleAliasResult.getRoleAlias() != null && !updateRoleAliasResult.getRoleAlias().equals(getRoleAlias())) {
            return false;
        }
        if ((updateRoleAliasResult.getRoleAliasArn() == null) ^ (getRoleAliasArn() == null)) {
            return false;
        }
        return updateRoleAliasResult.getRoleAliasArn() == null || updateRoleAliasResult.getRoleAliasArn().equals(getRoleAliasArn());
    }

    public String getRoleAlias() {
        return this.roleAlias;
    }

    public String getRoleAliasArn() {
        return this.roleAliasArn;
    }

    public int hashCode() {
        return (((getRoleAlias() == null ? 0 : getRoleAlias().hashCode()) + 31) * 31) + (getRoleAliasArn() != null ? getRoleAliasArn().hashCode() : 0);
    }

    public void setRoleAlias(String str) {
        this.roleAlias = str;
    }

    public void setRoleAliasArn(String str) {
        this.roleAliasArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleAlias() != null) {
            sb.append("roleAlias: " + getRoleAlias() + ",");
        }
        if (getRoleAliasArn() != null) {
            sb.append("roleAliasArn: " + getRoleAliasArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateRoleAliasResult withRoleAlias(String str) {
        this.roleAlias = str;
        return this;
    }

    public UpdateRoleAliasResult withRoleAliasArn(String str) {
        this.roleAliasArn = str;
        return this;
    }
}
