package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteFleetMetricRequest extends AmazonWebServiceRequest implements Serializable {
    private Long expectedVersion;
    private String metricName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteFleetMetricRequest)) {
            return false;
        }
        DeleteFleetMetricRequest deleteFleetMetricRequest = (DeleteFleetMetricRequest) obj;
        if ((deleteFleetMetricRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (deleteFleetMetricRequest.getMetricName() != null && !deleteFleetMetricRequest.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((deleteFleetMetricRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return deleteFleetMetricRequest.getExpectedVersion() == null || deleteFleetMetricRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public int hashCode() {
        return (((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteFleetMetricRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public DeleteFleetMetricRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }
}
