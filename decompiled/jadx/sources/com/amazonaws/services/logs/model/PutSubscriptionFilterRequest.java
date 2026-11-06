package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutSubscriptionFilterRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationArn;
    private String distribution;
    private String filterName;
    private String filterPattern;
    private String logGroupName;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutSubscriptionFilterRequest)) {
            return false;
        }
        PutSubscriptionFilterRequest putSubscriptionFilterRequest = (PutSubscriptionFilterRequest) obj;
        if ((putSubscriptionFilterRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (putSubscriptionFilterRequest.getLogGroupName() != null && !putSubscriptionFilterRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((putSubscriptionFilterRequest.getFilterName() == null) ^ (getFilterName() == null)) {
            return false;
        }
        if (putSubscriptionFilterRequest.getFilterName() != null && !putSubscriptionFilterRequest.getFilterName().equals(getFilterName())) {
            return false;
        }
        if ((putSubscriptionFilterRequest.getFilterPattern() == null) ^ (getFilterPattern() == null)) {
            return false;
        }
        if (putSubscriptionFilterRequest.getFilterPattern() != null && !putSubscriptionFilterRequest.getFilterPattern().equals(getFilterPattern())) {
            return false;
        }
        if ((putSubscriptionFilterRequest.getDestinationArn() == null) ^ (getDestinationArn() == null)) {
            return false;
        }
        if (putSubscriptionFilterRequest.getDestinationArn() != null && !putSubscriptionFilterRequest.getDestinationArn().equals(getDestinationArn())) {
            return false;
        }
        if ((putSubscriptionFilterRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (putSubscriptionFilterRequest.getRoleArn() != null && !putSubscriptionFilterRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((putSubscriptionFilterRequest.getDistribution() == null) ^ (getDistribution() == null)) {
            return false;
        }
        return putSubscriptionFilterRequest.getDistribution() == null || putSubscriptionFilterRequest.getDistribution().equals(getDistribution());
    }

    public String getDestinationArn() {
        return this.destinationArn;
    }

    public String getDistribution() {
        return this.distribution;
    }

    public String getFilterName() {
        return this.filterName;
    }

    public String getFilterPattern() {
        return this.filterPattern;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getFilterName() == null ? 0 : getFilterName().hashCode())) * 31) + (getFilterPattern() == null ? 0 : getFilterPattern().hashCode())) * 31) + (getDestinationArn() == null ? 0 : getDestinationArn().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getDistribution() != null ? getDistribution().hashCode() : 0);
    }

    public void setDestinationArn(String str) {
        this.destinationArn = str;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
    }

    public void setFilterName(String str) {
        this.filterName = str;
    }

    public void setFilterPattern(String str) {
        this.filterPattern = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getFilterName() != null) {
            sb.append("filterName: " + getFilterName() + ",");
        }
        if (getFilterPattern() != null) {
            sb.append("filterPattern: " + getFilterPattern() + ",");
        }
        if (getDestinationArn() != null) {
            sb.append("destinationArn: " + getDestinationArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getDistribution() != null) {
            sb.append("distribution: " + getDistribution());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutSubscriptionFilterRequest withDestinationArn(String str) {
        this.destinationArn = str;
        return this;
    }

    public PutSubscriptionFilterRequest withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
        return this;
    }

    public PutSubscriptionFilterRequest withFilterName(String str) {
        this.filterName = str;
        return this;
    }

    public PutSubscriptionFilterRequest withFilterPattern(String str) {
        this.filterPattern = str;
        return this;
    }

    public PutSubscriptionFilterRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public PutSubscriptionFilterRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public void setDistribution(String str) {
        this.distribution = str;
    }

    public PutSubscriptionFilterRequest withDistribution(String str) {
        this.distribution = str;
        return this;
    }
}
