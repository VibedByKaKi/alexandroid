package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateRoleAliasRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer credentialDurationSeconds;
    private String roleAlias;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateRoleAliasRequest)) {
            return false;
        }
        UpdateRoleAliasRequest updateRoleAliasRequest = (UpdateRoleAliasRequest) obj;
        if ((updateRoleAliasRequest.getRoleAlias() == null) ^ (getRoleAlias() == null)) {
            return false;
        }
        if (updateRoleAliasRequest.getRoleAlias() != null && !updateRoleAliasRequest.getRoleAlias().equals(getRoleAlias())) {
            return false;
        }
        if ((updateRoleAliasRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (updateRoleAliasRequest.getRoleArn() != null && !updateRoleAliasRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((updateRoleAliasRequest.getCredentialDurationSeconds() == null) ^ (getCredentialDurationSeconds() == null)) {
            return false;
        }
        return updateRoleAliasRequest.getCredentialDurationSeconds() == null || updateRoleAliasRequest.getCredentialDurationSeconds().equals(getCredentialDurationSeconds());
    }

    public Integer getCredentialDurationSeconds() {
        return this.credentialDurationSeconds;
    }

    public String getRoleAlias() {
        return this.roleAlias;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((getRoleAlias() == null ? 0 : getRoleAlias().hashCode()) + 31) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getCredentialDurationSeconds() != null ? getCredentialDurationSeconds().hashCode() : 0);
    }

    public void setCredentialDurationSeconds(Integer num) {
        this.credentialDurationSeconds = num;
    }

    public void setRoleAlias(String str) {
        this.roleAlias = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleAlias() != null) {
            sb.append("roleAlias: " + getRoleAlias() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getCredentialDurationSeconds() != null) {
            sb.append("credentialDurationSeconds: " + getCredentialDurationSeconds());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateRoleAliasRequest withCredentialDurationSeconds(Integer num) {
        this.credentialDurationSeconds = num;
        return this;
    }

    public UpdateRoleAliasRequest withRoleAlias(String str) {
        this.roleAlias = str;
        return this;
    }

    public UpdateRoleAliasRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
