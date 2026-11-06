package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDestinationsRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationNamePrefix;
    private Integer limit;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDestinationsRequest)) {
            return false;
        }
        DescribeDestinationsRequest describeDestinationsRequest = (DescribeDestinationsRequest) obj;
        if ((describeDestinationsRequest.getDestinationNamePrefix() == null) ^ (getDestinationNamePrefix() == null)) {
            return false;
        }
        if (describeDestinationsRequest.getDestinationNamePrefix() != null && !describeDestinationsRequest.getDestinationNamePrefix().equals(getDestinationNamePrefix())) {
            return false;
        }
        if ((describeDestinationsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeDestinationsRequest.getNextToken() != null && !describeDestinationsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeDestinationsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeDestinationsRequest.getLimit() == null || describeDestinationsRequest.getLimit().equals(getLimit());
    }

    public String getDestinationNamePrefix() {
        return this.destinationNamePrefix;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getDestinationNamePrefix() == null ? 0 : getDestinationNamePrefix().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setDestinationNamePrefix(String str) {
        this.destinationNamePrefix = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationNamePrefix() != null) {
            sb.append("DestinationNamePrefix: " + getDestinationNamePrefix() + ",");
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

    public DescribeDestinationsRequest withDestinationNamePrefix(String str) {
        this.destinationNamePrefix = str;
        return this;
    }

    public DescribeDestinationsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeDestinationsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
