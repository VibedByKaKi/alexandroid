package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FleetMetricNameAndArn implements Serializable {
    private String metricArn;
    private String metricName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FleetMetricNameAndArn)) {
            return false;
        }
        FleetMetricNameAndArn fleetMetricNameAndArn = (FleetMetricNameAndArn) obj;
        if ((fleetMetricNameAndArn.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (fleetMetricNameAndArn.getMetricName() != null && !fleetMetricNameAndArn.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((fleetMetricNameAndArn.getMetricArn() == null) ^ (getMetricArn() == null)) {
            return false;
        }
        return fleetMetricNameAndArn.getMetricArn() == null || fleetMetricNameAndArn.getMetricArn().equals(getMetricArn());
    }

    public String getMetricArn() {
        return this.metricArn;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public int hashCode() {
        return (((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getMetricArn() != null ? getMetricArn().hashCode() : 0);
    }

    public void setMetricArn(String str) {
        this.metricArn = str;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getMetricArn() != null) {
            sb.append("metricArn: " + getMetricArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public FleetMetricNameAndArn withMetricArn(String str) {
        this.metricArn = str;
        return this;
    }

    public FleetMetricNameAndArn withMetricName(String str) {
        this.metricName = str;
        return this;
    }
}
