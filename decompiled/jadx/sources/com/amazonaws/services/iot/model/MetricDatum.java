package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricDatum implements Serializable {
    private Date timestamp;
    private MetricValue value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MetricDatum)) {
            return false;
        }
        MetricDatum metricDatum = (MetricDatum) obj;
        if ((metricDatum.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (metricDatum.getTimestamp() != null && !metricDatum.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((metricDatum.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        return metricDatum.getValue() == null || metricDatum.getValue().equals(getValue());
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public MetricValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getValue() != null ? getValue().hashCode() : 0);
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public void setValue(MetricValue metricValue) {
        this.value = metricValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTimestamp() != null) {
            sb.append("timestamp: " + getTimestamp() + ",");
        }
        if (getValue() != null) {
            sb.append("value: " + getValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MetricDatum withTimestamp(Date date) {
        this.timestamp = date;
        return this;
    }

    public MetricDatum withValue(MetricValue metricValue) {
        this.value = metricValue;
        return this;
    }
}
