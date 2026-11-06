package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetShardIteratorRequest extends AmazonWebServiceRequest implements Serializable {
    private String shardId;
    private String shardIteratorType;
    private String startingSequenceNumber;
    private String streamName;
    private Date timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetShardIteratorRequest)) {
            return false;
        }
        GetShardIteratorRequest getShardIteratorRequest = (GetShardIteratorRequest) obj;
        if ((getShardIteratorRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (getShardIteratorRequest.getStreamName() != null && !getShardIteratorRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((getShardIteratorRequest.getShardId() == null) ^ (getShardId() == null)) {
            return false;
        }
        if (getShardIteratorRequest.getShardId() != null && !getShardIteratorRequest.getShardId().equals(getShardId())) {
            return false;
        }
        if ((getShardIteratorRequest.getShardIteratorType() == null) ^ (getShardIteratorType() == null)) {
            return false;
        }
        if (getShardIteratorRequest.getShardIteratorType() != null && !getShardIteratorRequest.getShardIteratorType().equals(getShardIteratorType())) {
            return false;
        }
        if ((getShardIteratorRequest.getStartingSequenceNumber() == null) ^ (getStartingSequenceNumber() == null)) {
            return false;
        }
        if (getShardIteratorRequest.getStartingSequenceNumber() != null && !getShardIteratorRequest.getStartingSequenceNumber().equals(getStartingSequenceNumber())) {
            return false;
        }
        if ((getShardIteratorRequest.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        return getShardIteratorRequest.getTimestamp() == null || getShardIteratorRequest.getTimestamp().equals(getTimestamp());
    }

    public String getShardId() {
        return this.shardId;
    }

    public String getShardIteratorType() {
        return this.shardIteratorType;
    }

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getShardId() == null ? 0 : getShardId().hashCode())) * 31) + (getShardIteratorType() == null ? 0 : getShardIteratorType().hashCode())) * 31) + (getStartingSequenceNumber() == null ? 0 : getStartingSequenceNumber().hashCode())) * 31) + (getTimestamp() != null ? getTimestamp().hashCode() : 0);
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
    }

    public void setStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getShardId() != null) {
            sb.append("ShardId: " + getShardId() + ",");
        }
        if (getShardIteratorType() != null) {
            sb.append("ShardIteratorType: " + getShardIteratorType() + ",");
        }
        if (getStartingSequenceNumber() != null) {
            sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() + ",");
        }
        if (getTimestamp() != null) {
            sb.append("Timestamp: " + getTimestamp());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetShardIteratorRequest withShardId(String str) {
        this.shardId = str;
        return this;
    }

    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
        return this;
    }

    public GetShardIteratorRequest withStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
        return this;
    }

    public GetShardIteratorRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public GetShardIteratorRequest withTimestamp(Date date) {
        this.timestamp = date;
        return this;
    }

    public void setShardIteratorType(String str) {
        this.shardIteratorType = str;
    }

    public GetShardIteratorRequest withShardIteratorType(String str) {
        this.shardIteratorType = str;
        return this;
    }
}
