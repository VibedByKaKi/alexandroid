package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordsResult implements Serializable {
    private String encryptionType;
    private Integer failedRecordCount;
    private List<PutRecordsResultEntry> records = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsResult)) {
            return false;
        }
        PutRecordsResult putRecordsResult = (PutRecordsResult) obj;
        if ((putRecordsResult.getFailedRecordCount() == null) ^ (getFailedRecordCount() == null)) {
            return false;
        }
        if (putRecordsResult.getFailedRecordCount() != null && !putRecordsResult.getFailedRecordCount().equals(getFailedRecordCount())) {
            return false;
        }
        if ((putRecordsResult.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        if (putRecordsResult.getRecords() != null && !putRecordsResult.getRecords().equals(getRecords())) {
            return false;
        }
        if ((putRecordsResult.getEncryptionType() == null) ^ (getEncryptionType() == null)) {
            return false;
        }
        return putRecordsResult.getEncryptionType() == null || putRecordsResult.getEncryptionType().equals(getEncryptionType());
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public Integer getFailedRecordCount() {
        return this.failedRecordCount;
    }

    public List<PutRecordsResultEntry> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return (((((getFailedRecordCount() == null ? 0 : getFailedRecordCount().hashCode()) + 31) * 31) + (getRecords() == null ? 0 : getRecords().hashCode())) * 31) + (getEncryptionType() != null ? getEncryptionType().hashCode() : 0);
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    public void setFailedRecordCount(Integer num) {
        this.failedRecordCount = num;
    }

    public void setRecords(Collection<PutRecordsResultEntry> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFailedRecordCount() != null) {
            sb.append("FailedRecordCount: " + getFailedRecordCount() + ",");
        }
        if (getRecords() != null) {
            sb.append("Records: " + getRecords() + ",");
        }
        if (getEncryptionType() != null) {
            sb.append("EncryptionType: " + getEncryptionType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordsResult withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    public PutRecordsResult withFailedRecordCount(Integer num) {
        this.failedRecordCount = num;
        return this;
    }

    public PutRecordsResult withRecords(PutRecordsResultEntry... putRecordsResultEntryArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(putRecordsResultEntryArr.length);
        }
        for (PutRecordsResultEntry putRecordsResultEntry : putRecordsResultEntryArr) {
            this.records.add(putRecordsResultEntry);
        }
        return this;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public PutRecordsResult withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public PutRecordsResult withRecords(Collection<PutRecordsResultEntry> collection) {
        setRecords(collection);
        return this;
    }
}
