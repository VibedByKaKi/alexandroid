package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListSecurityProfilesRequest extends AmazonWebServiceRequest implements Serializable {
    private String dimensionName;
    private Integer maxResults;
    private String metricName;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListSecurityProfilesRequest)) {
            return false;
        }
        ListSecurityProfilesRequest listSecurityProfilesRequest = (ListSecurityProfilesRequest) obj;
        if ((listSecurityProfilesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listSecurityProfilesRequest.getNextToken() != null && !listSecurityProfilesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listSecurityProfilesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listSecurityProfilesRequest.getMaxResults() != null && !listSecurityProfilesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listSecurityProfilesRequest.getDimensionName() == null) ^ (getDimensionName() == null)) {
            return false;
        }
        if (listSecurityProfilesRequest.getDimensionName() != null && !listSecurityProfilesRequest.getDimensionName().equals(getDimensionName())) {
            return false;
        }
        if ((listSecurityProfilesRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        return listSecurityProfilesRequest.getMetricName() == null || listSecurityProfilesRequest.getMetricName().equals(getMetricName());
    }

    public String getDimensionName() {
        return this.dimensionName;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getDimensionName() == null ? 0 : getDimensionName().hashCode())) * 31) + (getMetricName() != null ? getMetricName().hashCode() : 0);
    }

    public void setDimensionName(String str) {
        this.dimensionName = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getDimensionName() != null) {
            sb.append("dimensionName: " + getDimensionName() + ",");
        }
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListSecurityProfilesRequest withDimensionName(String str) {
        this.dimensionName = str;
        return this;
    }

    public ListSecurityProfilesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListSecurityProfilesRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public ListSecurityProfilesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
