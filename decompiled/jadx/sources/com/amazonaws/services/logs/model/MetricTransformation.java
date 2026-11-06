package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricTransformation implements Serializable {
    private Double defaultValue;
    private String metricName;
    private String metricNamespace;
    private String metricValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MetricTransformation)) {
            return false;
        }
        MetricTransformation metricTransformation = (MetricTransformation) obj;
        if ((metricTransformation.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (metricTransformation.getMetricName() != null && !metricTransformation.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((metricTransformation.getMetricNamespace() == null) ^ (getMetricNamespace() == null)) {
            return false;
        }
        if (metricTransformation.getMetricNamespace() != null && !metricTransformation.getMetricNamespace().equals(getMetricNamespace())) {
            return false;
        }
        if ((metricTransformation.getMetricValue() == null) ^ (getMetricValue() == null)) {
            return false;
        }
        if (metricTransformation.getMetricValue() != null && !metricTransformation.getMetricValue().equals(getMetricValue())) {
            return false;
        }
        if ((metricTransformation.getDefaultValue() == null) ^ (getDefaultValue() == null)) {
            return false;
        }
        return metricTransformation.getDefaultValue() == null || metricTransformation.getDefaultValue().equals(getDefaultValue());
    }

    public Double getDefaultValue() {
        return this.defaultValue;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    public String getMetricValue() {
        return this.metricValue;
    }

    public int hashCode() {
        return (((((((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getMetricNamespace() == null ? 0 : getMetricNamespace().hashCode())) * 31) + (getMetricValue() == null ? 0 : getMetricValue().hashCode())) * 31) + (getDefaultValue() != null ? getDefaultValue().hashCode() : 0);
    }

    public void setDefaultValue(Double d) {
        this.defaultValue = d;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setMetricNamespace(String str) {
        this.metricNamespace = str;
    }

    public void setMetricValue(String str) {
        this.metricValue = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getMetricNamespace() != null) {
            sb.append("metricNamespace: " + getMetricNamespace() + ",");
        }
        if (getMetricValue() != null) {
            sb.append("metricValue: " + getMetricValue() + ",");
        }
        if (getDefaultValue() != null) {
            sb.append("defaultValue: " + getDefaultValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MetricTransformation withDefaultValue(Double d) {
        this.defaultValue = d;
        return this;
    }

    public MetricTransformation withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public MetricTransformation withMetricNamespace(String str) {
        this.metricNamespace = str;
        return this;
    }

    public MetricTransformation withMetricValue(String str) {
        this.metricValue = str;
        return this;
    }
}
