package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricToRetain implements Serializable {
    private String metric;
    private MetricDimension metricDimension;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MetricToRetain)) {
            return false;
        }
        MetricToRetain metricToRetain = (MetricToRetain) obj;
        if ((metricToRetain.getMetric() == null) ^ (getMetric() == null)) {
            return false;
        }
        if (metricToRetain.getMetric() != null && !metricToRetain.getMetric().equals(getMetric())) {
            return false;
        }
        if ((metricToRetain.getMetricDimension() == null) ^ (getMetricDimension() == null)) {
            return false;
        }
        return metricToRetain.getMetricDimension() == null || metricToRetain.getMetricDimension().equals(getMetricDimension());
    }

    public String getMetric() {
        return this.metric;
    }

    public MetricDimension getMetricDimension() {
        return this.metricDimension;
    }

    public int hashCode() {
        return (((getMetric() == null ? 0 : getMetric().hashCode()) + 31) * 31) + (getMetricDimension() != null ? getMetricDimension().hashCode() : 0);
    }

    public void setMetric(String str) {
        this.metric = str;
    }

    public void setMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetric() != null) {
            sb.append("metric: " + getMetric() + ",");
        }
        if (getMetricDimension() != null) {
            sb.append("metricDimension: " + getMetricDimension());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MetricToRetain withMetric(String str) {
        this.metric = str;
        return this;
    }

    public MetricToRetain withMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }
}
