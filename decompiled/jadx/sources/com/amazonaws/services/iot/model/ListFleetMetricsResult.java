package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListFleetMetricsResult implements Serializable {
    private List<FleetMetricNameAndArn> fleetMetrics;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListFleetMetricsResult)) {
            return false;
        }
        ListFleetMetricsResult listFleetMetricsResult = (ListFleetMetricsResult) obj;
        if ((listFleetMetricsResult.getFleetMetrics() == null) ^ (getFleetMetrics() == null)) {
            return false;
        }
        if (listFleetMetricsResult.getFleetMetrics() != null && !listFleetMetricsResult.getFleetMetrics().equals(getFleetMetrics())) {
            return false;
        }
        if ((listFleetMetricsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listFleetMetricsResult.getNextToken() == null || listFleetMetricsResult.getNextToken().equals(getNextToken());
    }

    public List<FleetMetricNameAndArn> getFleetMetrics() {
        return this.fleetMetrics;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getFleetMetrics() == null ? 0 : getFleetMetrics().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setFleetMetrics(Collection<FleetMetricNameAndArn> collection) {
        if (collection == null) {
            this.fleetMetrics = null;
        } else {
            this.fleetMetrics = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFleetMetrics() != null) {
            sb.append("fleetMetrics: " + getFleetMetrics() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListFleetMetricsResult withFleetMetrics(FleetMetricNameAndArn... fleetMetricNameAndArnArr) {
        if (getFleetMetrics() == null) {
            this.fleetMetrics = new ArrayList(fleetMetricNameAndArnArr.length);
        }
        for (FleetMetricNameAndArn fleetMetricNameAndArn : fleetMetricNameAndArnArr) {
            this.fleetMetrics.add(fleetMetricNameAndArn);
        }
        return this;
    }

    public ListFleetMetricsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListFleetMetricsResult withFleetMetrics(Collection<FleetMetricNameAndArn> collection) {
        setFleetMetrics(collection);
        return this;
    }
}
