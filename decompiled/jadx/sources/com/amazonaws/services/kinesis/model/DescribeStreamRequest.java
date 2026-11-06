package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartShardId;
    private Integer limit;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamRequest)) {
            return false;
        }
        DescribeStreamRequest describeStreamRequest = (DescribeStreamRequest) obj;
        if ((describeStreamRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (describeStreamRequest.getStreamName() != null && !describeStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((describeStreamRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (describeStreamRequest.getLimit() != null && !describeStreamRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((describeStreamRequest.getExclusiveStartShardId() == null) ^ (getExclusiveStartShardId() == null)) {
            return false;
        }
        return describeStreamRequest.getExclusiveStartShardId() == null || describeStreamRequest.getExclusiveStartShardId().equals(getExclusiveStartShardId());
    }

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getExclusiveStartShardId() != null ? getExclusiveStartShardId().hashCode() : 0);
    }

    public void setExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getExclusiveStartShardId() != null) {
            sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeStreamRequest withExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
        return this;
    }

    public DescribeStreamRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
