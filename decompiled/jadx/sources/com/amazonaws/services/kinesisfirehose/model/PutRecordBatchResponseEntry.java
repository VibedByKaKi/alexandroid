package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordBatchResponseEntry implements Serializable {
    private String errorCode;
    private String errorMessage;
    private String recordId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordBatchResponseEntry)) {
            return false;
        }
        PutRecordBatchResponseEntry putRecordBatchResponseEntry = (PutRecordBatchResponseEntry) obj;
        if ((putRecordBatchResponseEntry.getRecordId() == null) ^ (getRecordId() == null)) {
            return false;
        }
        if (putRecordBatchResponseEntry.getRecordId() != null && !putRecordBatchResponseEntry.getRecordId().equals(getRecordId())) {
            return false;
        }
        if ((putRecordBatchResponseEntry.getErrorCode() == null) ^ (getErrorCode() == null)) {
            return false;
        }
        if (putRecordBatchResponseEntry.getErrorCode() != null && !putRecordBatchResponseEntry.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if ((putRecordBatchResponseEntry.getErrorMessage() == null) ^ (getErrorMessage() == null)) {
            return false;
        }
        return putRecordBatchResponseEntry.getErrorMessage() == null || putRecordBatchResponseEntry.getErrorMessage().equals(getErrorMessage());
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public int hashCode() {
        return (((((getRecordId() == null ? 0 : getRecordId().hashCode()) + 31) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getErrorMessage() != null ? getErrorMessage().hashCode() : 0);
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setRecordId(String str) {
        this.recordId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRecordId() != null) {
            sb.append("RecordId: " + getRecordId() + ",");
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

    public PutRecordBatchResponseEntry withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public PutRecordBatchResponseEntry withErrorMessage(String str) {
        this.errorMessage = str;
        return this;
    }

    public PutRecordBatchResponseEntry withRecordId(String str) {
        this.recordId = str;
        return this;
    }
}
