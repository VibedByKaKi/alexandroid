package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ExponentialRolloutRate implements Serializable {
    private Integer baseRatePerMinute;
    private Double incrementFactor;
    private RateIncreaseCriteria rateIncreaseCriteria;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExponentialRolloutRate)) {
            return false;
        }
        ExponentialRolloutRate exponentialRolloutRate = (ExponentialRolloutRate) obj;
        if ((exponentialRolloutRate.getBaseRatePerMinute() == null) ^ (getBaseRatePerMinute() == null)) {
            return false;
        }
        if (exponentialRolloutRate.getBaseRatePerMinute() != null && !exponentialRolloutRate.getBaseRatePerMinute().equals(getBaseRatePerMinute())) {
            return false;
        }
        if ((exponentialRolloutRate.getIncrementFactor() == null) ^ (getIncrementFactor() == null)) {
            return false;
        }
        if (exponentialRolloutRate.getIncrementFactor() != null && !exponentialRolloutRate.getIncrementFactor().equals(getIncrementFactor())) {
            return false;
        }
        if ((exponentialRolloutRate.getRateIncreaseCriteria() == null) ^ (getRateIncreaseCriteria() == null)) {
            return false;
        }
        return exponentialRolloutRate.getRateIncreaseCriteria() == null || exponentialRolloutRate.getRateIncreaseCriteria().equals(getRateIncreaseCriteria());
    }

    public Integer getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    public Double getIncrementFactor() {
        return this.incrementFactor;
    }

    public RateIncreaseCriteria getRateIncreaseCriteria() {
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

    public void setRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
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

    public ExponentialRolloutRate withBaseRatePerMinute(Integer num) {
        this.baseRatePerMinute = num;
        return this;
    }

    public ExponentialRolloutRate withIncrementFactor(Double d) {
        this.incrementFactor = d;
        return this;
    }

    public ExponentialRolloutRate withRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
        return this;
    }
}
