package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeResourcePoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer limit;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeResourcePoliciesRequest)) {
            return false;
        }
        DescribeResourcePoliciesRequest describeResourcePoliciesRequest = (DescribeResourcePoliciesRequest) obj;
        if ((describeResourcePoliciesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeResourcePoliciesRequest.getNextToken() != null && !describeResourcePoliciesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeResourcePoliciesRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeResourcePoliciesRequest.getLimit() == null || describeResourcePoliciesRequest.getLimit().equals(getLimit());
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getLimit() != null) {
            sb.append("limit: " + getLimit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeResourcePoliciesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeResourcePoliciesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
