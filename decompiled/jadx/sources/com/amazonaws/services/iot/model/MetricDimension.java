package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricDimension implements Serializable {
    private String dimensionName;
    private String operator;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MetricDimension)) {
            return false;
        }
        MetricDimension metricDimension = (MetricDimension) obj;
        if ((metricDimension.getDimensionName() == null) ^ (getDimensionName() == null)) {
            return false;
        }
        if (metricDimension.getDimensionName() != null && !metricDimension.getDimensionName().equals(getDimensionName())) {
            return false;
        }
        if ((metricDimension.getOperator() == null) ^ (getOperator() == null)) {
            return false;
        }
        return metricDimension.getOperator() == null || metricDimension.getOperator().equals(getOperator());
    }

    public String getDimensionName() {
        return this.dimensionName;
    }

    public String getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return (((getDimensionName() == null ? 0 : getDimensionName().hashCode()) + 31) * 31) + (getOperator() != null ? getOperator().hashCode() : 0);
    }

    public void setDimensionName(String str) {
        this.dimensionName = str;
    }

    public void setOperator(DimensionValueOperator dimensionValueOperator) {
        this.operator = dimensionValueOperator.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDimensionName() != null) {
            sb.append("dimensionName: " + getDimensionName() + ",");
        }
        if (getOperator() != null) {
            sb.append("operator: " + getOperator());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MetricDimension withDimensionName(String str) {
        this.dimensionName = str;
        return this;
    }

    public MetricDimension withOperator(DimensionValueOperator dimensionValueOperator) {
        this.operator = dimensionValueOperator.toString();
        return this;
    }

    public void setOperator(String str) {
        this.operator = str;
    }

    public MetricDimension withOperator(String str) {
        this.operator = str;
        return this;
    }
}
