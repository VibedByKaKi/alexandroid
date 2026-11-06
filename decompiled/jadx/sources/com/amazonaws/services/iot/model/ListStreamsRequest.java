package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsRequest)) {
            return false;
        }
        ListStreamsRequest listStreamsRequest = (ListStreamsRequest) obj;
        if ((listStreamsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listStreamsRequest.getMaxResults() != null && !listStreamsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listStreamsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listStreamsRequest.getNextToken() != null && !listStreamsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listStreamsRequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        return listStreamsRequest.getAscendingOrder() == null || listStreamsRequest.getAscendingOrder().equals(getAscendingOrder());
    }

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getMaxResults() == null ? 0 : getMaxResults().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getAscendingOrder() != null ? getAscendingOrder().hashCode() : 0);
    }

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    public void setAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getAscendingOrder() != null) {
            sb.append("ascendingOrder: " + getAscendingOrder());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListStreamsRequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListStreamsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListStreamsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
