package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AwsJobExponentialRolloutRate implements Serializable {
    private Integer baseRatePerMinute;
    private Double incrementFactor;
    private AwsJobRateIncreaseCriteria rateIncreaseCriteria;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AwsJobExponentialRolloutRate)) {
            return false;
        }
        AwsJobExponentialRolloutRate awsJobExponentialRolloutRate = (AwsJobExponentialRolloutRate) obj;
        if ((awsJobExponentialRolloutRate.getBaseRatePerMinute() == null) ^ (getBaseRatePerMinute() == null)) {
            return false;
        }
        if (awsJobExponentialRolloutRate.getBaseRatePerMinute() != null && !awsJobExponentialRolloutRate.getBaseRatePerMinute().equals(getBaseRatePerMinute())) {
            return false;
        }
        if ((awsJobExponentialRolloutRate.getIncrementFactor() == null) ^ (getIncrementFactor() == null)) {
            return false;
        }
        if (awsJobExponentialRolloutRate.getIncrementFactor() != null && !awsJobExponentialRolloutRate.getIncrementFactor().equals(getIncrementFactor())) {
            return false;
        }
        if ((awsJobExponentialRolloutRate.getRateIncreaseCriteria() == null) ^ (getRateIncreaseCriteria() == null)) {
            return false;
        }
        return awsJobExponentialRolloutRate.getRateIncreaseCriteria() == null || awsJobExponentialRolloutRate.getRateIncreaseCriteria().equals(getRateIncreaseCriteria());
    }

    public Integer getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    public Double getIncrementFactor() {
        return this.incrementFactor;
    }

    public AwsJobRateIncreaseCriteria getRateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    public int hashCode() {
        return (((((getBaseRatePerMinute() == null ? 0 : getBaseRatePerMinute().hashCode()) + 31) * 31) + (getIncrementFactor() == null ? 0 : getIncrementFactor().hashCode())) * 31) + (getRateIncreaseCriteria() != null ? getRateIncreaseCriteria().hashCode() : 0);
    }

    public void setBaseRatePerMinute(Integer num) {
        this.baseRatePerMinute = num;
    }

    public void setIncrementFactor(Double d) {
        this.incrementFactor = d;
    }

    public void setRateIncreaseCriteria(AwsJobRateIncreaseCriteria awsJobRateIncreaseCriteria) {
        this.rateIncreaseCriteria = awsJobRateIncreaseCriteria;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBaseRatePerMinute() != null) {
            sb.append("baseRatePerMinute: " + getBaseRatePerMinute() + ",");
        }
        if (getIncrementFactor() != null) {
            sb.append("incrementFactor: " + getIncrementFactor() + ",");
        }
        if (getRateIncreaseCriteria() != null) {
            sb.append("rateIncreaseCriteria: " + getRateIncreaseCriteria());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AwsJobExponentialRolloutRate withBaseRatePerMinute(Integer num) {
        this.baseRatePerMinute = num;
        return this;
    }

    public AwsJobExponentialRolloutRate withIncrementFactor(Double d) {
        this.incrementFactor = d;
        return this;
    }

    public AwsJobExponentialRolloutRate withRateIncreaseCriteria(AwsJobRateIncreaseCriteria awsJobRateIncreaseCriteria) {
        this.rateIncreaseCriteria = awsJobRateIncreaseCriteria;
        return this;
    }
}
