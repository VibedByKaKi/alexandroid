package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SigV4Authorization implements Serializable {
    private String roleArn;
    private String serviceName;
    private String signingRegion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SigV4Authorization)) {
            return false;
        }
        SigV4Authorization sigV4Authorization = (SigV4Authorization) obj;
        if ((sigV4Authorization.getSigningRegion() == null) ^ (getSigningRegion() == null)) {
            return false;
        }
        if (sigV4Authorization.getSigningRegion() != null && !sigV4Authorization.getSigningRegion().equals(getSigningRegion())) {
            return false;
        }
        if ((sigV4Authorization.getServiceName() == null) ^ (getServiceName() == null)) {
            return false;
        }
        if (sigV4Authorization.getServiceName() != null && !sigV4Authorization.getServiceName().equals(getServiceName())) {
            return false;
        }
        if ((sigV4Authorization.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return sigV4Authorization.getRoleArn() == null || sigV4Authorization.getRoleArn().equals(getRoleArn());
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getSigningRegion() {
        return this.signingRegion;
    }

    public int hashCode() {
        return (((((getSigningRegion() == null ? 0 : getSigningRegion().hashCode()) + 31) * 31) + (getServiceName() == null ? 0 : getServiceName().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setSigningRegion(String str) {
        this.signingRegion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSigningRegion() != null) {
            sb.append("signingRegion: " + getSigningRegion() + ",");
        }
        if (getServiceName() != null) {
            sb.append("serviceName: " + getServiceName() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SigV4Authorization withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public SigV4Authorization withServiceName(String str) {
        this.serviceName = str;
        return this;
    }

    public SigV4Authorization withSigningRegion(String str) {
        this.signingRegion = str;
        return this;
    }
}
