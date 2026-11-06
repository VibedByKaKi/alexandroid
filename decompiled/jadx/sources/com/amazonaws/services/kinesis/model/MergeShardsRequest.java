package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MergeShardsRequest extends AmazonWebServiceRequest implements Serializable {
    private String adjacentShardToMerge;
    private String shardToMerge;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MergeShardsRequest)) {
            return false;
        }
        MergeShardsRequest mergeShardsRequest = (MergeShardsRequest) obj;
        if ((mergeShardsRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (mergeShardsRequest.getStreamName() != null && !mergeShardsRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((mergeShardsRequest.getShardToMerge() == null) ^ (getShardToMerge() == null)) {
            return false;
        }
        if (mergeShardsRequest.getShardToMerge() != null && !mergeShardsRequest.getShardToMerge().equals(getShardToMerge())) {
            return false;
        }
        if ((mergeShardsRequest.getAdjacentShardToMerge() == null) ^ (getAdjacentShardToMerge() == null)) {
            return false;
        }
        return mergeShardsRequest.getAdjacentShardToMerge() == null || mergeShardsRequest.getAdjacentShardToMerge().equals(getAdjacentShardToMerge());
    }

    public String getAdjacentShardToMerge() {
        return this.adjacentShardToMerge;
    }

    public String getShardToMerge() {
        return this.shardToMerge;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getShardToMerge() == null ? 0 : getShardToMerge().hashCode())) * 31) + (getAdjacentShardToMerge() != null ? getAdjacentShardToMerge().hashCode() : 0);
    }

    public void setAdjacentShardToMerge(String str) {
        this.adjacentShardToMerge = str;
    }

    public void setShardToMerge(String str) {
        this.shardToMerge = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getShardToMerge() != null) {
            sb.append("ShardToMerge: " + getShardToMerge() + ",");
        }
        if (getAdjacentShardToMerge() != null) {
            sb.append("AdjacentShardToMerge: " + getAdjacentShardToMerge());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MergeShardsRequest withAdjacentShardToMerge(String str) {
        this.adjacentShardToMerge = str;
        return this;
    }

    public MergeShardsRequest withShardToMerge(String str) {
        this.shardToMerge = str;
        return this;
    }

    public MergeShardsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
