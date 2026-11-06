package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteSubscriptionFilterRequest extends AmazonWebServiceRequest implements Serializable {
    private String filterName;
    private String logGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteSubscriptionFilterRequest)) {
            return false;
        }
        DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest = (DeleteSubscriptionFilterRequest) obj;
        if ((deleteSubscriptionFilterRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (deleteSubscriptionFilterRequest.getLogGroupName() != null && !deleteSubscriptionFilterRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((deleteSubscriptionFilterRequest.getFilterName() == null) ^ (getFilterName() == null)) {
            return false;
        }
        return deleteSubscriptionFilterRequest.getFilterName() == null || deleteSubscriptionFilterRequest.getFilterName().equals(getFilterName());
    }

    public String getFilterName() {
        return this.filterName;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public int hashCode() {
        return (((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getFilterName() != null ? getFilterName().hashCode() : 0);
    }

    public void setFilterName(String str) {
        this.filterName = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getFilterName() != null) {
            sb.append("filterName: " + getFilterName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteSubscriptionFilterRequest withFilterName(String str) {
        this.filterName = str;
        return this;
    }

    public DeleteSubscriptionFilterRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }
}
