package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private List<PutRecordsRequestEntry> records = new ArrayList();
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsRequest)) {
            return false;
        }
        PutRecordsRequest putRecordsRequest = (PutRecordsRequest) obj;
        if ((putRecordsRequest.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        if (putRecordsRequest.getRecords() != null && !putRecordsRequest.getRecords().equals(getRecords())) {
            return false;
        }
        if ((putRecordsRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        return putRecordsRequest.getStreamName() == null || putRecordsRequest.getStreamName().equals(getStreamName());
    }

    public List<PutRecordsRequestEntry> getRecords() {
        return this.records;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((getRecords() == null ? 0 : getRecords().hashCode()) + 31) * 31) + (getStreamName() != null ? getStreamName().hashCode() : 0);
    }

    public void setRecords(Collection<PutRecordsRequestEntry> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRecords() != null) {
            sb.append("Records: " + getRecords() + ",");
        }
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordsRequest withRecords(PutRecordsRequestEntry... putRecordsRequestEntryArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(putRecordsRequestEntryArr.length);
        }
        for (PutRecordsRequestEntry putRecordsRequestEntry : putRecordsRequestEntryArr) {
            this.records.add(putRecordsRequestEntry);
        }
        return this;
    }

    public PutRecordsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public PutRecordsRequest withRecords(Collection<PutRecordsRequestEntry> collection) {
        setRecords(collection);
        return this;
    }
}
