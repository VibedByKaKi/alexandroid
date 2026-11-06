package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeLogGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer limit;
    private String logGroupNamePrefix;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLogGroupsRequest)) {
            return false;
        }
        DescribeLogGroupsRequest describeLogGroupsRequest = (DescribeLogGroupsRequest) obj;
        if ((describeLogGroupsRequest.getLogGroupNamePrefix() == null) ^ (getLogGroupNamePrefix() == null)) {
            return false;
        }
        if (describeLogGroupsRequest.getLogGroupNamePrefix() != null && !describeLogGroupsRequest.getLogGroupNamePrefix().equals(getLogGroupNamePrefix())) {
            return false;
        }
        if ((describeLogGroupsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeLogGroupsRequest.getNextToken() != null && !describeLogGroupsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeLogGroupsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeLogGroupsRequest.getLimit() == null || describeLogGroupsRequest.getLimit().equals(getLimit());
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getLogGroupNamePrefix() {
        return this.logGroupNamePrefix;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getLogGroupNamePrefix() == null ? 0 : getLogGroupNamePrefix().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLogGroupNamePrefix(String str) {
        this.logGroupNamePrefix = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupNamePrefix() != null) {
            sb.append("logGroupNamePrefix: " + getLogGroupNamePrefix() + ",");
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

    public DescribeLogGroupsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeLogGroupsRequest withLogGroupNamePrefix(String str) {
        this.logGroupNamePrefix = str;
        return this;
    }

    public DescribeLogGroupsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
