package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer shardCount;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamRequest)) {
            return false;
        }
        CreateStreamRequest createStreamRequest = (CreateStreamRequest) obj;
        if ((createStreamRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (createStreamRequest.getStreamName() != null && !createStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((createStreamRequest.getShardCount() == null) ^ (getShardCount() == null)) {
            return false;
        }
        return createStreamRequest.getShardCount() == null || createStreamRequest.getShardCount().equals(getShardCount());
    }

    public Integer getShardCount() {
        return this.shardCount;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getShardCount() != null ? getShardCount().hashCode() : 0);
    }

    public void setShardCount(Integer num) {
        this.shardCount = num;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getShardCount() != null) {
            sb.append("ShardCount: " + getShardCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateStreamRequest withShardCount(Integer num) {
        this.shardCount = num;
        return this;
    }

    public CreateStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
