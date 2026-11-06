package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CloudwatchMetricAction implements Serializable {
    private String metricName;
    private String metricNamespace;
    private String metricTimestamp;
    private String metricUnit;
    private String metricValue;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudwatchMetricAction)) {
            return false;
        }
        CloudwatchMetricAction cloudwatchMetricAction = (CloudwatchMetricAction) obj;
        if ((cloudwatchMetricAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (cloudwatchMetricAction.getRoleArn() != null && !cloudwatchMetricAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((cloudwatchMetricAction.getMetricNamespace() == null) ^ (getMetricNamespace() == null)) {
            return false;
        }
        if (cloudwatchMetricAction.getMetricNamespace() != null && !cloudwatchMetricAction.getMetricNamespace().equals(getMetricNamespace())) {
            return false;
        }
        if ((cloudwatchMetricAction.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (cloudwatchMetricAction.getMetricName() != null && !cloudwatchMetricAction.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((cloudwatchMetricAction.getMetricValue() == null) ^ (getMetricValue() == null)) {
            return false;
        }
        if (cloudwatchMetricAction.getMetricValue() != null && !cloudwatchMetricAction.getMetricValue().equals(getMetricValue())) {
            return false;
        }
        if ((cloudwatchMetricAction.getMetricUnit() == null) ^ (getMetricUnit() == null)) {
            return false;
        }
        if (cloudwatchMetricAction.getMetricUnit() != null && !cloudwatchMetricAction.getMetricUnit().equals(getMetricUnit())) {
            return false;
        }
        if ((cloudwatchMetricAction.getMetricTimestamp() == null) ^ (getMetricTimestamp() == null)) {
            return false;
        }
        return cloudwatchMetricAction.getMetricTimestamp() == null || cloudwatchMetricAction.getMetricTimestamp().equals(getMetricTimestamp());
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    public String getMetricTimestamp() {
        return this.metricTimestamp;
    }

    public String getMetricUnit() {
        return this.metricUnit;
    }

    public String getMetricValue() {
        return this.metricValue;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getMetricNamespace() == null ? 0 : getMetricNamespace().hashCode())) * 31) + (getMetricName() == null ? 0 : getMetricName().hashCode())) * 31) + (getMetricValue() == null ? 0 : getMetricValue().hashCode())) * 31) + (getMetricUnit() == null ? 0 : getMetricUnit().hashCode())) * 31) + (getMetricTimestamp() != null ? getMetricTimestamp().hashCode() : 0);
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setMetricNamespace(String str) {
        this.metricNamespace = str;
    }

    public void setMetricTimestamp(String str) {
        this.metricTimestamp = str;
    }

    public void setMetricUnit(String str) {
        this.metricUnit = str;
    }

    public void setMetricValue(String str) {
        this.metricValue = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getMetricNamespace() != null) {
            sb.append("metricNamespace: " + getMetricNamespace() + ",");
        }
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getMetricValue() != null) {
            sb.append("metricValue: " + getMetricValue() + ",");
        }
        if (getMetricUnit() != null) {
            sb.append("metricUnit: " + getMetricUnit() + ",");
        }
        if (getMetricTimestamp() != null) {
            sb.append("metricTimestamp: " + getMetricTimestamp());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CloudwatchMetricAction withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public CloudwatchMetricAction withMetricNamespace(String str) {
        this.metricNamespace = str;
        return this;
    }

    public CloudwatchMetricAction withMetricTimestamp(String str) {
        this.metricTimestamp = str;
        return this;
    }

    public CloudwatchMetricAction withMetricUnit(String str) {
        this.metricUnit = str;
        return this;
    }

    public CloudwatchMetricAction withMetricValue(String str) {
        this.metricValue = str;
        return this;
    }

    public CloudwatchMetricAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
