package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer data;
    private String explicitHashKey;
    private String partitionKey;
    private String sequenceNumberForOrdering;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordRequest)) {
            return false;
        }
        PutRecordRequest putRecordRequest = (PutRecordRequest) obj;
        if ((putRecordRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (putRecordRequest.getStreamName() != null && !putRecordRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((putRecordRequest.getData() == null) ^ (getData() == null)) {
            return false;
        }
        if (putRecordRequest.getData() != null && !putRecordRequest.getData().equals(getData())) {
            return false;
        }
        if ((putRecordRequest.getPartitionKey() == null) ^ (getPartitionKey() == null)) {
            return false;
        }
        if (putRecordRequest.getPartitionKey() != null && !putRecordRequest.getPartitionKey().equals(getPartitionKey())) {
            return false;
        }
        if ((putRecordRequest.getExplicitHashKey() == null) ^ (getExplicitHashKey() == null)) {
            return false;
        }
        if (putRecordRequest.getExplicitHashKey() != null && !putRecordRequest.getExplicitHashKey().equals(getExplicitHashKey())) {
            return false;
        }
        if ((putRecordRequest.getSequenceNumberForOrdering() == null) ^ (getSequenceNumberForOrdering() == null)) {
            return false;
        }
        return putRecordRequest.getSequenceNumberForOrdering() == null || putRecordRequest.getSequenceNumberForOrdering().equals(getSequenceNumberForOrdering());
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String getExplicitHashKey() {
        return this.explicitHashKey;
    }

    public String getPartitionKey() {
        return this.partitionKey;
    }

    public String getSequenceNumberForOrdering() {
        return this.sequenceNumberForOrdering;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getData() == null ? 0 : getData().hashCode())) * 31) + (getPartitionKey() == null ? 0 : getPartitionKey().hashCode())) * 31) + (getExplicitHashKey() == null ? 0 : getExplicitHashKey().hashCode())) * 31) + (getSequenceNumberForOrdering() != null ? getSequenceNumberForOrdering().hashCode() : 0);
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setExplicitHashKey(String str) {
        this.explicitHashKey = str;
    }

    public void setPartitionKey(String str) {
        this.partitionKey = str;
    }

    public void setSequenceNumberForOrdering(String str) {
        this.sequenceNumberForOrdering = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getData() != null) {
            sb.append("Data: " + getData() + ",");
        }
        if (getPartitionKey() != null) {
            sb.append("PartitionKey: " + getPartitionKey() + ",");
        }
        if (getExplicitHashKey() != null) {
            sb.append("ExplicitHashKey: " + getExplicitHashKey() + ",");
        }
        if (getSequenceNumberForOrdering() != null) {
            sb.append("SequenceNumberForOrdering: " + getSequenceNumberForOrdering());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordRequest withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public PutRecordRequest withExplicitHashKey(String str) {
        this.explicitHashKey = str;
        return this;
    }

    public PutRecordRequest withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }

    public PutRecordRequest withSequenceNumberForOrdering(String str) {
        this.sequenceNumberForOrdering = str;
        return this;
    }

    public PutRecordRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
