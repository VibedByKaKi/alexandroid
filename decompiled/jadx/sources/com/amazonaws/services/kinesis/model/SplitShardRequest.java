package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SplitShardRequest extends AmazonWebServiceRequest implements Serializable {
    private String newStartingHashKey;
    private String shardToSplit;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SplitShardRequest)) {
            return false;
        }
        SplitShardRequest splitShardRequest = (SplitShardRequest) obj;
        if ((splitShardRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (splitShardRequest.getStreamName() != null && !splitShardRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((splitShardRequest.getShardToSplit() == null) ^ (getShardToSplit() == null)) {
            return false;
        }
        if (splitShardRequest.getShardToSplit() != null && !splitShardRequest.getShardToSplit().equals(getShardToSplit())) {
            return false;
        }
        if ((splitShardRequest.getNewStartingHashKey() == null) ^ (getNewStartingHashKey() == null)) {
            return false;
        }
        return splitShardRequest.getNewStartingHashKey() == null || splitShardRequest.getNewStartingHashKey().equals(getNewStartingHashKey());
    }

    public String getNewStartingHashKey() {
        return this.newStartingHashKey;
    }

    public String getShardToSplit() {
        return this.shardToSplit;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getShardToSplit() == null ? 0 : getShardToSplit().hashCode())) * 31) + (getNewStartingHashKey() != null ? getNewStartingHashKey().hashCode() : 0);
    }

    public void setNewStartingHashKey(String str) {
        this.newStartingHashKey = str;
    }

    public void setShardToSplit(String str) {
        this.shardToSplit = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getShardToSplit() != null) {
            sb.append("ShardToSplit: " + getShardToSplit() + ",");
        }
        if (getNewStartingHashKey() != null) {
            sb.append("NewStartingHashKey: " + getNewStartingHashKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SplitShardRequest withNewStartingHashKey(String str) {
        this.newStartingHashKey = str;
        return this;
    }

    public SplitShardRequest withShardToSplit(String str) {
        this.shardToSplit = str;
        return this;
    }

    public SplitShardRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
