package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeMetricFiltersRequest extends AmazonWebServiceRequest implements Serializable {
    private String filterNamePrefix;
    private Integer limit;
    private String logGroupName;
    private String metricName;
    private String metricNamespace;
    private String nextToken;

    public DescribeMetricFiltersRequest(String str) {
        setLogGroupName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeMetricFiltersRequest)) {
            return false;
        }
        DescribeMetricFiltersRequest describeMetricFiltersRequest = (DescribeMetricFiltersRequest) obj;
        if ((describeMetricFiltersRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (describeMetricFiltersRequest.getLogGroupName() != null && !describeMetricFiltersRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((describeMetricFiltersRequest.getFilterNamePrefix() == null) ^ (getFilterNamePrefix() == null)) {
            return false;
        }
        if (describeMetricFiltersRequest.getFilterNamePrefix() != null && !describeMetricFiltersRequest.getFilterNamePrefix().equals(getFilterNamePrefix())) {
            return false;
        }
        if ((describeMetricFiltersRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeMetricFiltersRequest.getNextToken() != null && !describeMetricFiltersRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeMetricFiltersRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (describeMetricFiltersRequest.getLimit() != null && !describeMetricFiltersRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((describeMetricFiltersRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (describeMetricFiltersRequest.getMetricName() != null && !describeMetricFiltersRequest.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((describeMetricFiltersRequest.getMetricNamespace() == null) ^ (getMetricNamespace() == null)) {
            return false;
        }
        return describeMetricFiltersRequest.getMetricNamespace() == null || describeMetricFiltersRequest.getMetricNamespace().equals(getMetricNamespace());
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

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getFilterNamePrefix() == null ? 0 : getFilterNamePrefix().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getMetricName() == null ? 0 : getMetricName().hashCode())) * 31) + (getMetricNamespace() != null ? getMetricNamespace().hashCode() : 0);
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

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setMetricNamespace(String str) {
        this.metricNamespace = str;
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
            sb.append("limit: " + getLimit() + ",");
        }
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getMetricNamespace() != null) {
            sb.append("metricNamespace: " + getMetricNamespace());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeMetricFiltersRequest withFilterNamePrefix(String str) {
        this.filterNamePrefix = str;
        return this;
    }

    public DescribeMetricFiltersRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeMetricFiltersRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public DescribeMetricFiltersRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public DescribeMetricFiltersRequest withMetricNamespace(String str) {
        this.metricNamespace = str;
        return this;
    }

    public DescribeMetricFiltersRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeMetricFiltersRequest() {
    }
}
