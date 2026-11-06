package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordsResultEntry implements Serializable {
    private String errorCode;
    private String errorMessage;
    private String sequenceNumber;
    private String shardId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsResultEntry)) {
            return false;
        }
        PutRecordsResultEntry putRecordsResultEntry = (PutRecordsResultEntry) obj;
        if ((putRecordsResultEntry.getSequenceNumber() == null) ^ (getSequenceNumber() == null)) {
            return false;
        }
        if (putRecordsResultEntry.getSequenceNumber() != null && !putRecordsResultEntry.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if ((putRecordsResultEntry.getShardId() == null) ^ (getShardId() == null)) {
            return false;
        }
        if (putRecordsResultEntry.getShardId() != null && !putRecordsResultEntry.getShardId().equals(getShardId())) {
            return false;
        }
        if ((putRecordsResultEntry.getErrorCode() == null) ^ (getErrorCode() == null)) {
            return false;
        }
        if (putRecordsResultEntry.getErrorCode() != null && !putRecordsResultEntry.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if ((putRecordsResultEntry.getErrorMessage() == null) ^ (getErrorMessage() == null)) {
            return false;
        }
        return putRecordsResultEntry.getErrorMessage() == null || putRecordsResultEntry.getErrorMessage().equals(getErrorMessage());
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public String getShardId() {
        return this.shardId;
    }

    public int hashCode() {
        return (((((((getSequenceNumber() == null ? 0 : getSequenceNumber().hashCode()) + 31) * 31) + (getShardId() == null ? 0 : getShardId().hashCode())) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getErrorMessage() != null ? getErrorMessage().hashCode() : 0);
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSequenceNumber() != null) {
            sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        }
        if (getShardId() != null) {
            sb.append("ShardId: " + getShardId() + ",");
        }
        if (getErrorCode() != null) {
            sb.append("ErrorCode: " + getErrorCode() + ",");
        }
        if (getErrorMessage() != null) {
            sb.append("ErrorMessage: " + getErrorMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordsResultEntry withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public PutRecordsResultEntry withErrorMessage(String str) {
        this.errorMessage = str;
        return this;
    }

    public PutRecordsResultEntry withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public PutRecordsResultEntry withShardId(String str) {
        this.shardId = str;
        return this;
    }
}
