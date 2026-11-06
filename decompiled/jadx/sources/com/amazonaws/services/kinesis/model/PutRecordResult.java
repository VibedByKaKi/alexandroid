package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordResult implements Serializable {
    private String encryptionType;
    private String sequenceNumber;
    private String shardId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordResult)) {
            return false;
        }
        PutRecordResult putRecordResult = (PutRecordResult) obj;
        if ((putRecordResult.getShardId() == null) ^ (getShardId() == null)) {
            return false;
        }
        if (putRecordResult.getShardId() != null && !putRecordResult.getShardId().equals(getShardId())) {
            return false;
        }
        if ((putRecordResult.getSequenceNumber() == null) ^ (getSequenceNumber() == null)) {
            return false;
        }
        if (putRecordResult.getSequenceNumber() != null && !putRecordResult.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if ((putRecordResult.getEncryptionType() == null) ^ (getEncryptionType() == null)) {
            return false;
        }
        return putRecordResult.getEncryptionType() == null || putRecordResult.getEncryptionType().equals(getEncryptionType());
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public String getShardId() {
        return this.shardId;
    }

    public int hashCode() {
        return (((((getShardId() == null ? 0 : getShardId().hashCode()) + 31) * 31) + (getSequenceNumber() == null ? 0 : getSequenceNumber().hashCode())) * 31) + (getEncryptionType() != null ? getEncryptionType().hashCode() : 0);
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardId() != null) {
            sb.append("ShardId: " + getShardId() + ",");
        }
        if (getSequenceNumber() != null) {
            sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        }
        if (getEncryptionType() != null) {
            sb.append("EncryptionType: " + getEncryptionType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordResult withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    public PutRecordResult withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public PutRecordResult withShardId(String str) {
        this.shardId = str;
        return this;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public PutRecordResult withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }
}
