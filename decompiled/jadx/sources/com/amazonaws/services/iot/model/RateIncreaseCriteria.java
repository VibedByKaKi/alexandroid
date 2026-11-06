package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RateIncreaseCriteria implements Serializable {
    private Integer numberOfNotifiedThings;
    private Integer numberOfSucceededThings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RateIncreaseCriteria)) {
            return false;
        }
        RateIncreaseCriteria rateIncreaseCriteria = (RateIncreaseCriteria) obj;
        if ((rateIncreaseCriteria.getNumberOfNotifiedThings() == null) ^ (getNumberOfNotifiedThings() == null)) {
            return false;
        }
        if (rateIncreaseCriteria.getNumberOfNotifiedThings() != null && !rateIncreaseCriteria.getNumberOfNotifiedThings().equals(getNumberOfNotifiedThings())) {
            return false;
        }
        if ((rateIncreaseCriteria.getNumberOfSucceededThings() == null) ^ (getNumberOfSucceededThings() == null)) {
            return false;
        }
        return rateIncreaseCriteria.getNumberOfSucceededThings() == null || rateIncreaseCriteria.getNumberOfSucceededThings().equals(getNumberOfSucceededThings());
    }

    public Integer getNumberOfNotifiedThings() {
        return this.numberOfNotifiedThings;
    }

    public Integer getNumberOfSucceededThings() {
        return this.numberOfSucceededThings;
    }

    public int hashCode() {
        return (((getNumberOfNotifiedThings() == null ? 0 : getNumberOfNotifiedThings().hashCode()) + 31) * 31) + (getNumberOfSucceededThings() != null ? getNumberOfSucceededThings().hashCode() : 0);
    }

    public void setNumberOfNotifiedThings(Integer num) {
        this.numberOfNotifiedThings = num;
    }

    public void setNumberOfSucceededThings(Integer num) {
        this.numberOfSucceededThings = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNumberOfNotifiedThings() != null) {
            sb.append("numberOfNotifiedThings: " + getNumberOfNotifiedThings() + ",");
        }
        if (getNumberOfSucceededThings() != null) {
            sb.append("numberOfSucceededThings: " + getNumberOfSucceededThings());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RateIncreaseCriteria withNumberOfNotifiedThings(Integer num) {
        this.numberOfNotifiedThings = num;
        return this;
    }

    public RateIncreaseCriteria withNumberOfSucceededThings(Integer num) {
        this.numberOfSucceededThings = num;
        return this;
    }
}
