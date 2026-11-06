package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecutionsRolloutConfig implements Serializable {
    private ExponentialRolloutRate exponentialRate;
    private Integer maximumPerMinute;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecutionsRolloutConfig)) {
            return false;
        }
        JobExecutionsRolloutConfig jobExecutionsRolloutConfig = (JobExecutionsRolloutConfig) obj;
        if ((jobExecutionsRolloutConfig.getMaximumPerMinute() == null) ^ (getMaximumPerMinute() == null)) {
            return false;
        }
        if (jobExecutionsRolloutConfig.getMaximumPerMinute() != null && !jobExecutionsRolloutConfig.getMaximumPerMinute().equals(getMaximumPerMinute())) {
            return false;
        }
        if ((jobExecutionsRolloutConfig.getExponentialRate() == null) ^ (getExponentialRate() == null)) {
            return false;
        }
        return jobExecutionsRolloutConfig.getExponentialRate() == null || jobExecutionsRolloutConfig.getExponentialRate().equals(getExponentialRate());
    }

    public ExponentialRolloutRate getExponentialRate() {
        return this.exponentialRate;
    }

    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public int hashCode() {
        return (((getMaximumPerMinute() == null ? 0 : getMaximumPerMinute().hashCode()) + 31) * 31) + (getExponentialRate() != null ? getExponentialRate().hashCode() : 0);
    }

    public void setExponentialRate(ExponentialRolloutRate exponentialRolloutRate) {
        this.exponentialRate = exponentialRolloutRate;
    }

    public void setMaximumPerMinute(Integer num) {
        this.maximumPerMinute = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaximumPerMinute() != null) {
            sb.append("maximumPerMinute: " + getMaximumPerMinute() + ",");
        }
        if (getExponentialRate() != null) {
            sb.append("exponentialRate: " + getExponentialRate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecutionsRolloutConfig withExponentialRate(ExponentialRolloutRate exponentialRolloutRate) {
        this.exponentialRate = exponentialRolloutRate;
        return this;
    }

    public JobExecutionsRolloutConfig withMaximumPerMinute(Integer num) {
        this.maximumPerMinute = num;
        return this;
    }
}
