package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AwsJobTimeoutConfig implements Serializable {
    private Long inProgressTimeoutInMinutes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AwsJobTimeoutConfig)) {
            return false;
        }
        AwsJobTimeoutConfig awsJobTimeoutConfig = (AwsJobTimeoutConfig) obj;
        if ((awsJobTimeoutConfig.getInProgressTimeoutInMinutes() == null) ^ (getInProgressTimeoutInMinutes() == null)) {
            return false;
        }
        return awsJobTimeoutConfig.getInProgressTimeoutInMinutes() == null || awsJobTimeoutConfig.getInProgressTimeoutInMinutes().equals(getInProgressTimeoutInMinutes());
    }

    public Long getInProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    public int hashCode() {
        return 31 + (getInProgressTimeoutInMinutes() == null ? 0 : getInProgressTimeoutInMinutes().hashCode());
    }

    public void setInProgressTimeoutInMinutes(Long l) {
        this.inProgressTimeoutInMinutes = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getInProgressTimeoutInMinutes() != null) {
            sb.append("inProgressTimeoutInMinutes: " + getInProgressTimeoutInMinutes());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AwsJobTimeoutConfig withInProgressTimeoutInMinutes(Long l) {
        this.inProgressTimeoutInMinutes = l;
        return this;
    }
}
