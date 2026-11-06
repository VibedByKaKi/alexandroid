package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRecordBatchResult implements Serializable {
    private Boolean encrypted;
    private Integer failedPutCount;
    private List<PutRecordBatchResponseEntry> requestResponses;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordBatchResult)) {
            return false;
        }
        PutRecordBatchResult putRecordBatchResult = (PutRecordBatchResult) obj;
        if ((putRecordBatchResult.getFailedPutCount() == null) ^ (getFailedPutCount() == null)) {
            return false;
        }
        if (putRecordBatchResult.getFailedPutCount() != null && !putRecordBatchResult.getFailedPutCount().equals(getFailedPutCount())) {
            return false;
        }
        if ((putRecordBatchResult.getEncrypted() == null) ^ (getEncrypted() == null)) {
            return false;
        }
        if (putRecordBatchResult.getEncrypted() != null && !putRecordBatchResult.getEncrypted().equals(getEncrypted())) {
            return false;
        }
        if ((putRecordBatchResult.getRequestResponses() == null) ^ (getRequestResponses() == null)) {
            return false;
        }
        return putRecordBatchResult.getRequestResponses() == null || putRecordBatchResult.getRequestResponses().equals(getRequestResponses());
    }

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public Integer getFailedPutCount() {
        return this.failedPutCount;
    }

    public List<PutRecordBatchResponseEntry> getRequestResponses() {
        return this.requestResponses;
    }

    public int hashCode() {
        return (((((getFailedPutCount() == null ? 0 : getFailedPutCount().hashCode()) + 31) * 31) + (getEncrypted() == null ? 0 : getEncrypted().hashCode())) * 31) + (getRequestResponses() != null ? getRequestResponses().hashCode() : 0);
    }

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    public void setEncrypted(Boolean bool) {
        this.encrypted = bool;
    }

    public void setFailedPutCount(Integer num) {
        this.failedPutCount = num;
    }

    public void setRequestResponses(Collection<PutRecordBatchResponseEntry> collection) {
        if (collection == null) {
            this.requestResponses = null;
        } else {
            this.requestResponses = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFailedPutCount() != null) {
            sb.append("FailedPutCount: " + getFailedPutCount() + ",");
        }
        if (getEncrypted() != null) {
            sb.append("Encrypted: " + getEncrypted() + ",");
        }
        if (getRequestResponses() != null) {
            sb.append("RequestResponses: " + getRequestResponses());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRecordBatchResult withEncrypted(Boolean bool) {
        this.encrypted = bool;
        return this;
    }

    public PutRecordBatchResult withFailedPutCount(Integer num) {
        this.failedPutCount = num;
        return this;
    }

    public PutRecordBatchResult withRequestResponses(PutRecordBatchResponseEntry... putRecordBatchResponseEntryArr) {
        if (getRequestResponses() == null) {
            this.requestResponses = new ArrayList(putRecordBatchResponseEntryArr.length);
        }
        for (PutRecordBatchResponseEntry putRecordBatchResponseEntry : putRecordBatchResponseEntryArr) {
            this.requestResponses.add(putRecordBatchResponseEntry);
        }
        return this;
    }

    public PutRecordBatchResult withRequestResponses(Collection<PutRecordBatchResponseEntry> collection) {
        setRequestResponses(collection);
        return this;
    }
}
