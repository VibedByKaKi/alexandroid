package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResourceIdentifier implements Serializable {
    private String account;
    private String caCertificateId;
    private String clientId;
    private String cognitoIdentityPoolId;
    private String deviceCertificateArn;
    private String deviceCertificateId;
    private String iamRoleArn;
    private IssuerCertificateIdentifier issuerCertificateIdentifier;
    private PolicyVersionIdentifier policyVersionIdentifier;
    private String roleAliasArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResourceIdentifier)) {
            return false;
        }
        ResourceIdentifier resourceIdentifier = (ResourceIdentifier) obj;
        if ((resourceIdentifier.getDeviceCertificateId() == null) ^ (getDeviceCertificateId() == null)) {
            return false;
        }
        if (resourceIdentifier.getDeviceCertificateId() != null && !resourceIdentifier.getDeviceCertificateId().equals(getDeviceCertificateId())) {
            return false;
        }
        if ((resourceIdentifier.getCaCertificateId() == null) ^ (getCaCertificateId() == null)) {
            return false;
        }
        if (resourceIdentifier.getCaCertificateId() != null && !resourceIdentifier.getCaCertificateId().equals(getCaCertificateId())) {
            return false;
        }
        if ((resourceIdentifier.getCognitoIdentityPoolId() == null) ^ (getCognitoIdentityPoolId() == null)) {
            return false;
        }
        if (resourceIdentifier.getCognitoIdentityPoolId() != null && !resourceIdentifier.getCognitoIdentityPoolId().equals(getCognitoIdentityPoolId())) {
            return false;
        }
        if ((resourceIdentifier.getClientId() == null) ^ (getClientId() == null)) {
            return false;
        }
        if (resourceIdentifier.getClientId() != null && !resourceIdentifier.getClientId().equals(getClientId())) {
            return false;
        }
        if ((resourceIdentifier.getPolicyVersionIdentifier() == null) ^ (getPolicyVersionIdentifier() == null)) {
            return false;
        }
        if (resourceIdentifier.getPolicyVersionIdentifier() != null && !resourceIdentifier.getPolicyVersionIdentifier().equals(getPolicyVersionIdentifier())) {
            return false;
        }
        if ((resourceIdentifier.getAccount() == null) ^ (getAccount() == null)) {
            return false;
        }
        if (resourceIdentifier.getAccount() != null && !resourceIdentifier.getAccount().equals(getAccount())) {
            return false;
        }
        if ((resourceIdentifier.getIamRoleArn() == null) ^ (getIamRoleArn() == null)) {
            return false;
        }
        if (resourceIdentifier.getIamRoleArn() != null && !resourceIdentifier.getIamRoleArn().equals(getIamRoleArn())) {
            return false;
        }
        if ((resourceIdentifier.getRoleAliasArn() == null) ^ (getRoleAliasArn() == null)) {
            return false;
        }
        if (resourceIdentifier.getRoleAliasArn() != null && !resourceIdentifier.getRoleAliasArn().equals(getRoleAliasArn())) {
            return false;
        }
        if ((resourceIdentifier.getIssuerCertificateIdentifier() == null) ^ (getIssuerCertificateIdentifier() == null)) {
            return false;
        }
        if (resourceIdentifier.getIssuerCertificateIdentifier() != null && !resourceIdentifier.getIssuerCertificateIdentifier().equals(getIssuerCertificateIdentifier())) {
            return false;
        }
        if ((resourceIdentifier.getDeviceCertificateArn() == null) ^ (getDeviceCertificateArn() == null)) {
            return false;
        }
        return resourceIdentifier.getDeviceCertificateArn() == null || resourceIdentifier.getDeviceCertificateArn().equals(getDeviceCertificateArn());
    }

    public String getAccount() {
        return this.account;
    }

    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getCognitoIdentityPoolId() {
        return this.cognitoIdentityPoolId;
    }

    public String getDeviceCertificateArn() {
        return this.deviceCertificateArn;
    }

    public String getDeviceCertificateId() {
        return this.deviceCertificateId;
    }

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    public IssuerCertificateIdentifier getIssuerCertificateIdentifier() {
        return this.issuerCertificateIdentifier;
    }

    public PolicyVersionIdentifier getPolicyVersionIdentifier() {
        return this.policyVersionIdentifier;
    }

    public String getRoleAliasArn() {
        return this.roleAliasArn;
    }

    public int hashCode() {
        return (((((((((((((((((((getDeviceCertificateId() == null ? 0 : getDeviceCertificateId().hashCode()) + 31) * 31) + (getCaCertificateId() == null ? 0 : getCaCertificateId().hashCode())) * 31) + (getCognitoIdentityPoolId() == null ? 0 : getCognitoIdentityPoolId().hashCode())) * 31) + (getClientId() == null ? 0 : getClientId().hashCode())) * 31) + (getPolicyVersionIdentifier() == null ? 0 : getPolicyVersionIdentifier().hashCode())) * 31) + (getAccount() == null ? 0 : getAccount().hashCode())) * 31) + (getIamRoleArn() == null ? 0 : getIamRoleArn().hashCode())) * 31) + (getRoleAliasArn() == null ? 0 : getRoleAliasArn().hashCode())) * 31) + (getIssuerCertificateIdentifier() == null ? 0 : getIssuerCertificateIdentifier().hashCode())) * 31) + (getDeviceCertificateArn() != null ? getDeviceCertificateArn().hashCode() : 0);
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public void setCaCertificateId(String str) {
        this.caCertificateId = str;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setCognitoIdentityPoolId(String str) {
        this.cognitoIdentityPoolId = str;
    }

    public void setDeviceCertificateArn(String str) {
        this.deviceCertificateArn = str;
    }

    public void setDeviceCertificateId(String str) {
        this.deviceCertificateId = str;
    }

    public void setIamRoleArn(String str) {
        this.iamRoleArn = str;
    }

    public void setIssuerCertificateIdentifier(IssuerCertificateIdentifier issuerCertificateIdentifier) {
        this.issuerCertificateIdentifier = issuerCertificateIdentifier;
    }

    public void setPolicyVersionIdentifier(PolicyVersionIdentifier policyVersionIdentifier) {
        this.policyVersionIdentifier = policyVersionIdentifier;
    }

    public void setRoleAliasArn(String str) {
        this.roleAliasArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeviceCertificateId() != null) {
            sb.append("deviceCertificateId: " + getDeviceCertificateId() + ",");
        }
        if (getCaCertificateId() != null) {
            sb.append("caCertificateId: " + getCaCertificateId() + ",");
        }
        if (getCognitoIdentityPoolId() != null) {
            sb.append("cognitoIdentityPoolId: " + getCognitoIdentityPoolId() + ",");
        }
        if (getClientId() != null) {
            sb.append("clientId: " + getClientId() + ",");
        }
        if (getPolicyVersionIdentifier() != null) {
            sb.append("policyVersionIdentifier: " + getPolicyVersionIdentifier() + ",");
        }
        if (getAccount() != null) {
            sb.append("account: " + getAccount() + ",");
        }
        if (getIamRoleArn() != null) {
            sb.append("iamRoleArn: " + getIamRoleArn() + ",");
        }
        if (getRoleAliasArn() != null) {
            sb.append("roleAliasArn: " + getRoleAliasArn() + ",");
        }
        if (getIssuerCertificateIdentifier() != null) {
            sb.append("issuerCertificateIdentifier: " + getIssuerCertificateIdentifier() + ",");
        }
        if (getDeviceCertificateArn() != null) {
            sb.append("deviceCertificateArn: " + getDeviceCertificateArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ResourceIdentifier withAccount(String str) {
        this.account = str;
        return this;
    }

    public ResourceIdentifier withCaCertificateId(String str) {
        this.caCertificateId = str;
        return this;
    }

    public ResourceIdentifier withClientId(String str) {
        this.clientId = str;
        return this;
    }

    public ResourceIdentifier withCognitoIdentityPoolId(String str) {
        this.cognitoIdentityPoolId = str;
        return this;
    }

    public ResourceIdentifier withDeviceCertificateArn(String str) {
        this.deviceCertificateArn = str;
        return this;
    }

    public ResourceIdentifier withDeviceCertificateId(String str) {
        this.deviceCertificateId = str;
        return this;
    }

    public ResourceIdentifier withIamRoleArn(String str) {
        this.iamRoleArn = str;
        return this;
    }

    public ResourceIdentifier withIssuerCertificateIdentifier(IssuerCertificateIdentifier issuerCertificateIdentifier) {
        this.issuerCertificateIdentifier = issuerCertificateIdentifier;
        return this;
    }

    public ResourceIdentifier withPolicyVersionIdentifier(PolicyVersionIdentifier policyVersionIdentifier) {
        this.policyVersionIdentifier = policyVersionIdentifier;
        return this;
    }

    public ResourceIdentifier withRoleAliasArn(String str) {
        this.roleAliasArn = str;
        return this;
    }
}
