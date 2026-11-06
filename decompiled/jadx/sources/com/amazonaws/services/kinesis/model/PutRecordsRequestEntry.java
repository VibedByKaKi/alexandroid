package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordsRequestEntry implements Serializable {
    private ByteBuffer data;
    private String explicitHashKey;
    private String partitionKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsRequestEntry)) {
            return false;
        }
        PutRecordsRequestEntry putRecordsRequestEntry = (PutRecordsRequestEntry) obj;
        if ((putRecordsRequestEntry.getData() == null) ^ (getData() == null)) {
            return false;
        }
        if (putRecordsRequestEntry.getData() != null && !putRecordsRequestEntry.getData().equals(getData())) {
            return false;
        }
        if ((putRecordsRequestEntry.getExplicitHashKey() == null) ^ (getExplicitHashKey() == null)) {
            return false;
        }
        if (putRecordsRequestEntry.getExplicitHashKey() != null && !putRecordsRequestEntry.getExplicitHashKey().equals(getExplicitHashKey())) {
            return false;
        }
        if ((putRecordsRequestEntry.getPartitionKey() == null) ^ (getPartitionKey() == null)) {
            return false;
        }
        return putRecordsRequestEntry.getPartitionKey() == null || putRecordsRequestEntry.getPartitionKey().equals(getPartitionKey());
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

    public int hashCode() {
        return (((((getData() == null ? 0 : getData().hashCode()) + 31) * 31) + (getExplicitHashKey() == null ? 0 : getExplicitHashKey().hashCode())) * 31) + (getPartitionKey() != null ? getPartitionKey().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getData() != null) {
            sb.append("Data: " + getData() + ",");
        }
        if (getExplicitHashKey() != null) {
            sb.append("ExplicitHashKey: " + getExplicitHashKey() + ",");
        }
        if (getPartitionKey() != null) {
            sb.append("PartitionKey: " + getPartitionKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordsRequestEntry withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public PutRecordsRequestEntry withExplicitHashKey(String str) {
        this.explicitHashKey = str;
        return this;
    }

    public PutRecordsRequestEntry withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }
}
