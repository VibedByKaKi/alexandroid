package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PresignedUrlConfig implements Serializable {
    private Long expiresInSec;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PresignedUrlConfig)) {
            return false;
        }
        PresignedUrlConfig presignedUrlConfig = (PresignedUrlConfig) obj;
        if ((presignedUrlConfig.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (presignedUrlConfig.getRoleArn() != null && !presignedUrlConfig.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((presignedUrlConfig.getExpiresInSec() == null) ^ (getExpiresInSec() == null)) {
            return false;
        }
        return presignedUrlConfig.getExpiresInSec() == null || presignedUrlConfig.getExpiresInSec().equals(getExpiresInSec());
    }

    public Long getExpiresInSec() {
        return this.expiresInSec;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getExpiresInSec() != null ? getExpiresInSec().hashCode() : 0);
    }

    public void setExpiresInSec(Long l) {
        this.expiresInSec = l;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getExpiresInSec() != null) {
            sb.append("expiresInSec: " + getExpiresInSec());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PresignedUrlConfig withExpiresInSec(Long l) {
        this.expiresInSec = l;
        return this;
    }

    public PresignedUrlConfig withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
