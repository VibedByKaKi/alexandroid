package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeSubscriptionFiltersRequest extends AmazonWebServiceRequest implements Serializable {
    private String filterNamePrefix;
    private Integer limit;
    private String logGroupName;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeSubscriptionFiltersRequest)) {
            return false;
        }
        DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest = (DescribeSubscriptionFiltersRequest) obj;
        if ((describeSubscriptionFiltersRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (describeSubscriptionFiltersRequest.getLogGroupName() != null && !describeSubscriptionFiltersRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((describeSubscriptionFiltersRequest.getFilterNamePrefix() == null) ^ (getFilterNamePrefix() == null)) {
            return false;
        }
        if (describeSubscriptionFiltersRequest.getFilterNamePrefix() != null && !describeSubscriptionFiltersRequest.getFilterNamePrefix().equals(getFilterNamePrefix())) {
            return false;
        }
        if ((describeSubscriptionFiltersRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeSubscriptionFiltersRequest.getNextToken() != null && !describeSubscriptionFiltersRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeSubscriptionFiltersRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeSubscriptionFiltersRequest.getLimit() == null || describeSubscriptionFiltersRequest.getLimit().equals(getLimit());
    }

    public String getFilterNamePrefix() {
        return this.filterNamePrefix;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getFilterNamePrefix() == null ? 0 : getFilterNamePrefix().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setFilterNamePrefix(String str) {
        this.filterNamePrefix = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getFilterNamePrefix() != null) {
            sb.append("filterNamePrefix: " + getFilterNamePrefix() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getLimit() != null) {
            sb.append("limit: " + getLimit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeSubscriptionFiltersRequest withFilterNamePrefix(String str) {
        this.filterNamePrefix = str;
        return this;
    }

    public DescribeSubscriptionFiltersRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeSubscriptionFiltersRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public DescribeSubscriptionFiltersRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
