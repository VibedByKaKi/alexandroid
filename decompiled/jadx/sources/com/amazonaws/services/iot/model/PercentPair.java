package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PercentPair implements Serializable {
    private Double percent;
    private Double value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PercentPair)) {
            return false;
        }
        PercentPair percentPair = (PercentPair) obj;
        if ((percentPair.getPercent() == null) ^ (getPercent() == null)) {
            return false;
        }
        if (percentPair.getPercent() != null && !percentPair.getPercent().equals(getPercent())) {
            return false;
        }
        if ((percentPair.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        return percentPair.getValue() == null || percentPair.getValue().equals(getValue());
    }

    public Double getPercent() {
        return this.percent;
    }

    public Double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getPercent() == null ? 0 : getPercent().hashCode()) + 31) * 31) + (getValue() != null ? getValue().hashCode() : 0);
    }

    public void setPercent(Double d) {
        this.percent = d;
    }

    public void setValue(Double d) {
        this.value = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPercent() != null) {
            sb.append("percent: " + getPercent() + ",");
        }
        if (getValue() != null) {
            sb.append("value: " + getValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PercentPair withPercent(Double d) {
        this.percent = d;
        return this;
    }

    public PercentPair withValue(Double d) {
        this.value = d;
        return this;
    }
}
