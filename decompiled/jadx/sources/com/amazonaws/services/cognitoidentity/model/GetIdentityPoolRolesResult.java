package com.amazonaws.services.cognitoidentity.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetIdentityPoolRolesResult implements Serializable {
    private String identityPoolId;
    private Map<String, RoleMapping> roleMappings;
    private Map<String, String> roles;

    public GetIdentityPoolRolesResult addRoleMappingsEntry(String str, RoleMapping roleMapping) {
        if (this.roleMappings == null) {
            this.roleMappings = new HashMap();
        }
        if (this.roleMappings.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.roleMappings.put(str, roleMapping);
        return this;
    }

    public GetIdentityPoolRolesResult addRolesEntry(String str, String str2) {
        if (this.roles == null) {
            this.roles = new HashMap();
        }
        if (this.roles.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.roles.put(str, str2);
        return this;
    }

    public GetIdentityPoolRolesResult clearRoleMappingsEntries() {
        this.roleMappings = null;
        return this;
    }

    public GetIdentityPoolRolesResult clearRolesEntries() {
        this.roles = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdentityPoolRolesResult)) {
            return false;
        }
        GetIdentityPoolRolesResult getIdentityPoolRolesResult = (GetIdentityPoolRolesResult) obj;
        if ((getIdentityPoolRolesResult.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (getIdentityPoolRolesResult.getIdentityPoolId() != null && !getIdentityPoolRolesResult.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((getIdentityPoolRolesResult.getRoles() == null) ^ (getRoles() == null)) {
            return false;
        }
        if (getIdentityPoolRolesResult.getRoles() != null && !getIdentityPoolRolesResult.getRoles().equals(getRoles())) {
            return false;
        }
        if ((getIdentityPoolRolesResult.getRoleMappings() == null) ^ (getRoleMappings() == null)) {
            return false;
        }
        return getIdentityPoolRolesResult.getRoleMappings() == null || getIdentityPoolRolesResult.getRoleMappings().equals(getRoleMappings());
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Map<String, RoleMapping> getRoleMappings() {
        return this.roleMappings;
    }

    public Map<String, String> getRoles() {
        return this.roles;
    }

    public int hashCode() {
        return (((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getRoles() == null ? 0 : getRoles().hashCode())) * 31) + (getRoleMappings() != null ? getRoleMappings().hashCode() : 0);
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setRoleMappings(Map<String, RoleMapping> map) {
        this.roleMappings = map;
    }

    public void setRoles(Map<String, String> map) {
        this.roles = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIdentityPoolId() != null) {
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getRoles() != null) {
            sb.append("Roles: " + getRoles() + ",");
        }
        if (getRoleMappings() != null) {
            sb.append("RoleMappings: " + getRoleMappings());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetIdentityPoolRolesResult withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public GetIdentityPoolRolesResult withRoleMappings(Map<String, RoleMapping> map) {
        this.roleMappings = map;
        return this;
    }

    public GetIdentityPoolRolesResult withRoles(Map<String, String> map) {
        this.roles = map;
        return this;
    }
}
