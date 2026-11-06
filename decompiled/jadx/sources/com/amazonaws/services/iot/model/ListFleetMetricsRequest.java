package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListFleetMetricsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListFleetMetricsRequest)) {
            return false;
        }
        ListFleetMetricsRequest listFleetMetricsRequest = (ListFleetMetricsRequest) obj;
        if ((listFleetMetricsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listFleetMetricsRequest.getNextToken() != null && !listFleetMetricsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listFleetMetricsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listFleetMetricsRequest.getMaxResults() == null || listFleetMetricsRequest.getMaxResults().equals(getMaxResults());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
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
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListFleetMetricsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListFleetMetricsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
