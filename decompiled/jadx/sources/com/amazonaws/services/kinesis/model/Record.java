package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Record implements Serializable {
    private Date approximateArrivalTimestamp;
    private ByteBuffer data;
    private String encryptionType;
    private String partitionKey;
    private String sequenceNumber;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if ((record.getSequenceNumber() == null) ^ (getSequenceNumber() == null)) {
            return false;
        }
        if (record.getSequenceNumber() != null && !record.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if ((record.getApproximateArrivalTimestamp() == null) ^ (getApproximateArrivalTimestamp() == null)) {
            return false;
        }
        if (record.getApproximateArrivalTimestamp() != null && !record.getApproximateArrivalTimestamp().equals(getApproximateArrivalTimestamp())) {
            return false;
        }
        if ((record.getData() == null) ^ (getData() == null)) {
            return false;
        }
        if (record.getData() != null && !record.getData().equals(getData())) {
            return false;
        }
        if ((record.getPartitionKey() == null) ^ (getPartitionKey() == null)) {
            return false;
        }
        if (record.getPartitionKey() != null && !record.getPartitionKey().equals(getPartitionKey())) {
            return false;
        }
        if ((record.getEncryptionType() == null) ^ (getEncryptionType() == null)) {
            return false;
        }
        return record.getEncryptionType() == null || record.getEncryptionType().equals(getEncryptionType());
    }

    public Date getApproximateArrivalTimestamp() {
        return this.approximateArrivalTimestamp;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getPartitionKey() {
        return this.partitionKey;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        return (((((((((getSequenceNumber() == null ? 0 : getSequenceNumber().hashCode()) + 31) * 31) + (getApproximateArrivalTimestamp() == null ? 0 : getApproximateArrivalTimestamp().hashCode())) * 31) + (getData() == null ? 0 : getData().hashCode())) * 31) + (getPartitionKey() == null ? 0 : getPartitionKey().hashCode())) * 31) + (getEncryptionType() != null ? getEncryptionType().hashCode() : 0);
    }

    public void setApproximateArrivalTimestamp(Date date) {
        this.approximateArrivalTimestamp = date;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    public void setPartitionKey(String str) {
        this.partitionKey = str;
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSequenceNumber() != null) {
            sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        }
        if (getApproximateArrivalTimestamp() != null) {
            sb.append("ApproximateArrivalTimestamp: " + getApproximateArrivalTimestamp() + ",");
        }
        if (getData() != null) {
            sb.append("Data: " + getData() + ",");
        }
        if (getPartitionKey() != null) {
            sb.append("PartitionKey: " + getPartitionKey() + ",");
        }
        if (getEncryptionType() != null) {
            sb.append("EncryptionType: " + getEncryptionType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Record withApproximateArrivalTimestamp(Date date) {
        this.approximateArrivalTimestamp = date;
        return this;
    }

    public Record withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public Record withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    public Record withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }

    public Record withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public Record withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }
}
