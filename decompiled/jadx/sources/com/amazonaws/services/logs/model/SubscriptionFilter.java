package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SubscriptionFilter implements Serializable {
    private Long creationTime;
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
        if (obj == null || !(obj instanceof SubscriptionFilter)) {
            return false;
        }
        SubscriptionFilter subscriptionFilter = (SubscriptionFilter) obj;
        if ((subscriptionFilter.getFilterName() == null) ^ (getFilterName() == null)) {
            return false;
        }
        if (subscriptionFilter.getFilterName() != null && !subscriptionFilter.getFilterName().equals(getFilterName())) {
            return false;
        }
        if ((subscriptionFilter.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (subscriptionFilter.getLogGroupName() != null && !subscriptionFilter.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((subscriptionFilter.getFilterPattern() == null) ^ (getFilterPattern() == null)) {
            return false;
        }
        if (subscriptionFilter.getFilterPattern() != null && !subscriptionFilter.getFilterPattern().equals(getFilterPattern())) {
            return false;
        }
        if ((subscriptionFilter.getDestinationArn() == null) ^ (getDestinationArn() == null)) {
            return false;
        }
        if (subscriptionFilter.getDestinationArn() != null && !subscriptionFilter.getDestinationArn().equals(getDestinationArn())) {
            return false;
        }
        if ((subscriptionFilter.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (subscriptionFilter.getRoleArn() != null && !subscriptionFilter.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((subscriptionFilter.getDistribution() == null) ^ (getDistribution() == null)) {
            return false;
        }
        if (subscriptionFilter.getDistribution() != null && !subscriptionFilter.getDistribution().equals(getDistribution())) {
            return false;
        }
        if ((subscriptionFilter.getCreationTime() == null) ^ (getCreationTime() == null)) {
            return false;
        }
        return subscriptionFilter.getCreationTime() == null || subscriptionFilter.getCreationTime().equals(getCreationTime());
    }

    public Long getCreationTime() {
        return this.creationTime;
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
        return (((((((((((((getFilterName() == null ? 0 : getFilterName().hashCode()) + 31) * 31) + (getLogGroupName() == null ? 0 : getLogGroupName().hashCode())) * 31) + (getFilterPattern() == null ? 0 : getFilterPattern().hashCode())) * 31) + (getDestinationArn() == null ? 0 : getDestinationArn().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getDistribution() == null ? 0 : getDistribution().hashCode())) * 31) + (getCreationTime() != null ? getCreationTime().hashCode() : 0);
    }

    public void setCreationTime(Long l) {
        this.creationTime = l;
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
        if (getFilterName() != null) {
            sb.append("filterName: " + getFilterName() + ",");
        }
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
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
            sb.append("distribution: " + getDistribution() + ",");
        }
        if (getCreationTime() != null) {
            sb.append("creationTime: " + getCreationTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SubscriptionFilter withCreationTime(Long l) {
        this.creationTime = l;
        return this;
    }

    public SubscriptionFilter withDestinationArn(String str) {
        this.destinationArn = str;
        return this;
    }

    public SubscriptionFilter withDistribution(Distribution distribution) {
        this.distribution = distribution.toString();
        return this;
    }

    public SubscriptionFilter withFilterName(String str) {
        this.filterName = str;
        return this;
    }

    public SubscriptionFilter withFilterPattern(String str) {
        this.filterPattern = str;
        return this;
    }

    public SubscriptionFilter withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public SubscriptionFilter withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public void setDistribution(String str) {
        this.distribution = str;
    }

    public SubscriptionFilter withDistribution(String str) {
        this.distribution = str;
        return this;
    }
}
