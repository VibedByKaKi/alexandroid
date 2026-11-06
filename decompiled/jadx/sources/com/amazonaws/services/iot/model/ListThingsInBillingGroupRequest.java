package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingsInBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupName;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingsInBillingGroupRequest)) {
            return false;
        }
        ListThingsInBillingGroupRequest listThingsInBillingGroupRequest = (ListThingsInBillingGroupRequest) obj;
        if ((listThingsInBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (listThingsInBillingGroupRequest.getBillingGroupName() != null && !listThingsInBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((listThingsInBillingGroupRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingsInBillingGroupRequest.getNextToken() != null && !listThingsInBillingGroupRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingsInBillingGroupRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listThingsInBillingGroupRequest.getMaxResults() == null || listThingsInBillingGroupRequest.getMaxResults().equals(getMaxResults());
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingsInBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public ListThingsInBillingGroupRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingsInBillingGroupRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
