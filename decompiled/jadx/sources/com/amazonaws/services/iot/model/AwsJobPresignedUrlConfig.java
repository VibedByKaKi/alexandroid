package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AwsJobPresignedUrlConfig implements Serializable {
    private Long expiresInSec;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AwsJobPresignedUrlConfig)) {
            return false;
        }
        AwsJobPresignedUrlConfig awsJobPresignedUrlConfig = (AwsJobPresignedUrlConfig) obj;
        if ((awsJobPresignedUrlConfig.getExpiresInSec() == null) ^ (getExpiresInSec() == null)) {
            return false;
        }
        return awsJobPresignedUrlConfig.getExpiresInSec() == null || awsJobPresignedUrlConfig.getExpiresInSec().equals(getExpiresInSec());
    }

    public Long getExpiresInSec() {
        return this.expiresInSec;
    }

    public int hashCode() {
        return 31 + (getExpiresInSec() == null ? 0 : getExpiresInSec().hashCode());
    }

    public void setExpiresInSec(Long l) {
        this.expiresInSec = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getExpiresInSec() != null) {
            sb.append("expiresInSec: " + getExpiresInSec());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AwsJobPresignedUrlConfig withExpiresInSec(Long l) {
        this.expiresInSec = l;
        return this;
    }
}
