package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteCustomMetricRequest extends AmazonWebServiceRequest implements Serializable {
    private String metricName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteCustomMetricRequest)) {
            return false;
        }
        DeleteCustomMetricRequest deleteCustomMetricRequest = (DeleteCustomMetricRequest) obj;
        if ((deleteCustomMetricRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        return deleteCustomMetricRequest.getMetricName() == null || deleteCustomMetricRequest.getMetricName().equals(getMetricName());
    }

    public String getMetricName() {
        return this.metricName;
    }

    public int hashCode() {
        return 31 + (getMetricName() == null ? 0 : getMetricName().hashCode());
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteCustomMetricRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }
}
