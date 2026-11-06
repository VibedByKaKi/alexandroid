package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateCustomMetricRequest extends AmazonWebServiceRequest implements Serializable {
    private String displayName;
    private String metricName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateCustomMetricRequest)) {
            return false;
        }
        UpdateCustomMetricRequest updateCustomMetricRequest = (UpdateCustomMetricRequest) obj;
        if ((updateCustomMetricRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (updateCustomMetricRequest.getMetricName() != null && !updateCustomMetricRequest.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((updateCustomMetricRequest.getDisplayName() == null) ^ (getDisplayName() == null)) {
            return false;
        }
        return updateCustomMetricRequest.getDisplayName() == null || updateCustomMetricRequest.getDisplayName().equals(getDisplayName());
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public int hashCode() {
        return (((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getDisplayName() != null ? getDisplayName().hashCode() : 0);
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getDisplayName() != null) {
            sb.append("displayName: " + getDisplayName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateCustomMetricRequest withDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public UpdateCustomMetricRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }
}
