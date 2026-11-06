package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeLogStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean descending;
    private Integer limit;
    private String logGroupName;
    private String logStreamNamePrefix;
    private String nextToken;
    private String orderBy;

    public DescribeLogStreamsRequest(String str) {
        setLogGroupName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLogStreamsRequest)) {
            return false;
        }
        DescribeLogStreamsRequest describeLogStreamsRequest = (DescribeLogStreamsRequest) obj;
        if ((describeLogStreamsRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (describeLogStreamsRequest.getLogGroupName() != null && !describeLogStreamsRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((describeLogStreamsRequest.getLogStreamNamePrefix() == null) ^ (getLogStreamNamePrefix() == null)) {
            return false;
        }
        if (describeLogStreamsRequest.getLogStreamNamePrefix() != null && !describeLogStreamsRequest.getLogStreamNamePrefix().equals(getLogStreamNamePrefix())) {
            return false;
        }
        if ((describeLogStreamsRequest.getOrderBy() == null) ^ (getOrderBy() == null)) {
            return false;
        }
        if (describeLogStreamsRequest.getOrderBy() != null && !describeLogStreamsRequest.getOrderBy().equals(getOrderBy())) {
            return false;
        }
        if ((describeLogStreamsRequest.getDescending() == null) ^ (getDescending() == null)) {
            return false;
        }
        if (describeLogStreamsRequest.getDescending() != null && !describeLogStreamsRequest.getDescending().equals(getDescending())) {
            return false;
        }
        if ((describeLogStreamsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeLogStreamsRequest.getNextToken() != null && !describeLogStreamsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeLogStreamsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeLogStreamsRequest.getLimit() == null || describeLogStreamsRequest.getLimit().equals(getLimit());
    }

    public Boolean getDescending() {
        return this.descending;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public int hashCode() {
        return (((((((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getLogStreamNamePrefix() == null ? 0 : getLogStreamNamePrefix().hashCode())) * 31) + (getOrderBy() == null ? 0 : getOrderBy().hashCode())) * 31) + (getDescending() == null ? 0 : getDescending().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public Boolean isDescending() {
        return this.descending;
    }

    public void setDescending(Boolean bool) {
        this.descending = bool;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setLogStreamNamePrefix(String str) {
        this.logStreamNamePrefix = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getLogStreamNamePrefix() != null) {
            sb.append("logStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        }
        if (getOrderBy() != null) {
            sb.append("orderBy: " + getOrderBy() + ",");
        }
        if (getDescending() != null) {
            sb.append("descending: " + getDescending() + ",");
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

    public DescribeLogStreamsRequest withDescending(Boolean bool) {
        this.descending = bool;
        return this;
    }

    public DescribeLogStreamsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeLogStreamsRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public DescribeLogStreamsRequest withLogStreamNamePrefix(String str) {
        this.logStreamNamePrefix = str;
        return this;
    }

    public DescribeLogStreamsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeLogStreamsRequest withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
        return this;
    }

    public DescribeLogStreamsRequest() {
    }

    public void setOrderBy(String str) {
        this.orderBy = str;
    }

    public DescribeLogStreamsRequest withOrderBy(String str) {
        this.orderBy = str;
        return this;
    }
}
