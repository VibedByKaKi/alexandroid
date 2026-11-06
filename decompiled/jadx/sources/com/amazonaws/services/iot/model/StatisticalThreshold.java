package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StatisticalThreshold implements Serializable {
    private String statistic;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StatisticalThreshold)) {
            return false;
        }
        StatisticalThreshold statisticalThreshold = (StatisticalThreshold) obj;
        if ((statisticalThreshold.getStatistic() == null) ^ (getStatistic() == null)) {
            return false;
        }
        return statisticalThreshold.getStatistic() == null || statisticalThreshold.getStatistic().equals(getStatistic());
    }

    public String getStatistic() {
        return this.statistic;
    }

    public int hashCode() {
        return 31 + (getStatistic() == null ? 0 : getStatistic().hashCode());
    }

    public void setStatistic(String str) {
        this.statistic = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStatistic() != null) {
            sb.append("statistic: " + getStatistic());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StatisticalThreshold withStatistic(String str) {
        this.statistic = str;
        return this;
    }
}
