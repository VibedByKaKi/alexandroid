package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetStatisticsResult implements Serializable {
    private Statistics statistics;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetStatisticsResult)) {
            return false;
        }
        GetStatisticsResult getStatisticsResult = (GetStatisticsResult) obj;
        if ((getStatisticsResult.getStatistics() == null) ^ (getStatistics() == null)) {
            return false;
        }
        return getStatisticsResult.getStatistics() == null || getStatisticsResult.getStatistics().equals(getStatistics());
    }

    public Statistics getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        return 31 + (getStatistics() == null ? 0 : getStatistics().hashCode());
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStatistics() != null) {
            sb.append("statistics: " + getStatistics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetStatisticsResult withStatistics(Statistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
