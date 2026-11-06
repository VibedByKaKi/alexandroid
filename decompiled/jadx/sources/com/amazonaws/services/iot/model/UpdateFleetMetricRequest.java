package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateFleetMetricRequest extends AmazonWebServiceRequest implements Serializable {
    private String aggregationField;
    private AggregationType aggregationType;
    private String description;
    private Long expectedVersion;
    private String indexName;
    private String metricName;
    private Integer period;
    private String queryString;
    private String queryVersion;
    private String unit;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateFleetMetricRequest)) {
            return false;
        }
        UpdateFleetMetricRequest updateFleetMetricRequest = (UpdateFleetMetricRequest) obj;
        if ((updateFleetMetricRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getMetricName() != null && !updateFleetMetricRequest.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((updateFleetMetricRequest.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getQueryString() != null && !updateFleetMetricRequest.getQueryString().equals(getQueryString())) {
            return false;
        }
        if ((updateFleetMetricRequest.getAggregationType() == null) ^ (getAggregationType() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getAggregationType() != null && !updateFleetMetricRequest.getAggregationType().equals(getAggregationType())) {
            return false;
        }
        if ((updateFleetMetricRequest.getPeriod() == null) ^ (getPeriod() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getPeriod() != null && !updateFleetMetricRequest.getPeriod().equals(getPeriod())) {
            return false;
        }
        if ((updateFleetMetricRequest.getAggregationField() == null) ^ (getAggregationField() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getAggregationField() != null && !updateFleetMetricRequest.getAggregationField().equals(getAggregationField())) {
            return false;
        }
        if ((updateFleetMetricRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getDescription() != null && !updateFleetMetricRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((updateFleetMetricRequest.getQueryVersion() == null) ^ (getQueryVersion() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getQueryVersion() != null && !updateFleetMetricRequest.getQueryVersion().equals(getQueryVersion())) {
            return false;
        }
        if ((updateFleetMetricRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getIndexName() != null && !updateFleetMetricRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((updateFleetMetricRequest.getUnit() == null) ^ (getUnit() == null)) {
            return false;
        }
        if (updateFleetMetricRequest.getUnit() != null && !updateFleetMetricRequest.getUnit().equals(getUnit())) {
            return false;
        }
        if ((updateFleetMetricRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return updateFleetMetricRequest.getExpectedVersion() == null || updateFleetMetricRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public String getAggregationField() {
        return this.aggregationField;
    }

    public AggregationType getAggregationType() {
        return this.aggregationType;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getQueryVersion() {
        return this.queryVersion;
    }

    public String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return (((((((((((((((((((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getQueryString() == null ? 0 : getQueryString().hashCode())) * 31) + (getAggregationType() == null ? 0 : getAggregationType().hashCode())) * 31) + (getPeriod() == null ? 0 : getPeriod().hashCode())) * 31) + (getAggregationField() == null ? 0 : getAggregationField().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getQueryVersion() == null ? 0 : getQueryVersion().hashCode())) * 31) + (getIndexName() == null ? 0 : getIndexName().hashCode())) * 31) + (getUnit() == null ? 0 : getUnit().hashCode())) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setAggregationField(String str) {
        this.aggregationField = str;
    }

    public void setAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setPeriod(Integer num) {
        this.period = num;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public void setQueryVersion(String str) {
        this.queryVersion = str;
    }

    public void setUnit(FleetMetricUnit fleetMetricUnit) {
        this.unit = fleetMetricUnit.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getQueryString() != null) {
            sb.append("queryString: " + getQueryString() + ",");
        }
        if (getAggregationType() != null) {
            sb.append("aggregationType: " + getAggregationType() + ",");
        }
        if (getPeriod() != null) {
            sb.append("period: " + getPeriod() + ",");
        }
        if (getAggregationField() != null) {
            sb.append("aggregationField: " + getAggregationField() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getQueryVersion() != null) {
            sb.append("queryVersion: " + getQueryVersion() + ",");
        }
        if (getIndexName() != null) {
            sb.append("indexName: " + getIndexName() + ",");
        }
        if (getUnit() != null) {
            sb.append("unit: " + getUnit() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateFleetMetricRequest withAggregationField(String str) {
        this.aggregationField = str;
        return this;
    }

    public UpdateFleetMetricRequest withAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public UpdateFleetMetricRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateFleetMetricRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public UpdateFleetMetricRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public UpdateFleetMetricRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public UpdateFleetMetricRequest withPeriod(Integer num) {
        this.period = num;
        return this;
    }

    public UpdateFleetMetricRequest withQueryString(String str) {
        this.queryString = str;
        return this;
    }

    public UpdateFleetMetricRequest withQueryVersion(String str) {
        this.queryVersion = str;
        return this;
    }

    public UpdateFleetMetricRequest withUnit(FleetMetricUnit fleetMetricUnit) {
        this.unit = fleetMetricUnit.toString();
        return this;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public UpdateFleetMetricRequest withUnit(String str) {
        this.unit = str;
        return this;
    }
}
