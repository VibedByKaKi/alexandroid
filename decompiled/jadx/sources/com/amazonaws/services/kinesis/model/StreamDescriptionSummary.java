package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StreamDescriptionSummary implements Serializable {
    private String encryptionType;
    private List<EnhancedMetrics> enhancedMonitoring = new ArrayList();
    private String keyId;
    private Integer openShardCount;
    private Integer retentionPeriodHours;
    private String streamARN;
    private Date streamCreationTimestamp;
    private String streamName;
    private String streamStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamDescriptionSummary)) {
            return false;
        }
        StreamDescriptionSummary streamDescriptionSummary = (StreamDescriptionSummary) obj;
        if ((streamDescriptionSummary.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getStreamName() != null && !streamDescriptionSummary.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((streamDescriptionSummary.getStreamARN() == null) ^ (getStreamARN() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getStreamARN() != null && !streamDescriptionSummary.getStreamARN().equals(getStreamARN())) {
            return false;
        }
        if ((streamDescriptionSummary.getStreamStatus() == null) ^ (getStreamStatus() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getStreamStatus() != null && !streamDescriptionSummary.getStreamStatus().equals(getStreamStatus())) {
            return false;
        }
        if ((streamDescriptionSummary.getRetentionPeriodHours() == null) ^ (getRetentionPeriodHours() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getRetentionPeriodHours() != null && !streamDescriptionSummary.getRetentionPeriodHours().equals(getRetentionPeriodHours())) {
            return false;
        }
        if ((streamDescriptionSummary.getStreamCreationTimestamp() == null) ^ (getStreamCreationTimestamp() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getStreamCreationTimestamp() != null && !streamDescriptionSummary.getStreamCreationTimestamp().equals(getStreamCreationTimestamp())) {
            return false;
        }
        if ((streamDescriptionSummary.getEnhancedMonitoring() == null) ^ (getEnhancedMonitoring() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getEnhancedMonitoring() != null && !streamDescriptionSummary.getEnhancedMonitoring().equals(getEnhancedMonitoring())) {
            return false;
        }
        if ((streamDescriptionSummary.getEncryptionType() == null) ^ (getEncryptionType() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getEncryptionType() != null && !streamDescriptionSummary.getEncryptionType().equals(getEncryptionType())) {
            return false;
        }
        if ((streamDescriptionSummary.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (streamDescriptionSummary.getKeyId() != null && !streamDescriptionSummary.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((streamDescriptionSummary.getOpenShardCount() == null) ^ (getOpenShardCount() == null)) {
            return false;
        }
        return streamDescriptionSummary.getOpenShardCount() == null || streamDescriptionSummary.getOpenShardCount().equals(getOpenShardCount());
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public List<EnhancedMetrics> getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public String getStreamARN() {
        return this.streamARN;
    }

    public Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public String getStreamStatus() {
        return this.streamStatus;
    }

    public int hashCode() {
        return (((((((((((((((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getStreamARN() == null ? 0 : getStreamARN().hashCode())) * 31) + (getStreamStatus() == null ? 0 : getStreamStatus().hashCode())) * 31) + (getRetentionPeriodHours() == null ? 0 : getRetentionPeriodHours().hashCode())) * 31) + (getStreamCreationTimestamp() == null ? 0 : getStreamCreationTimestamp().hashCode())) * 31) + (getEnhancedMonitoring() == null ? 0 : getEnhancedMonitoring().hashCode())) * 31) + (getEncryptionType() == null ? 0 : getEncryptionType().hashCode())) * 31) + (getKeyId() == null ? 0 : getKeyId().hashCode())) * 31) + (getOpenShardCount() != null ? getOpenShardCount().hashCode() : 0);
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    public void setEnhancedMonitoring(Collection<EnhancedMetrics> collection) {
        if (collection == null) {
            this.enhancedMonitoring = null;
        } else {
            this.enhancedMonitoring = new ArrayList(collection);
        }
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setOpenShardCount(Integer num) {
        this.openShardCount = num;
    }

    public void setRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
    }

    public void setStreamARN(String str) {
        this.streamARN = str;
    }

    public void setStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getStreamARN() != null) {
            sb.append("StreamARN: " + getStreamARN() + ",");
        }
        if (getStreamStatus() != null) {
            sb.append("StreamStatus: " + getStreamStatus() + ",");
        }
        if (getRetentionPeriodHours() != null) {
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours() + ",");
        }
        if (getStreamCreationTimestamp() != null) {
            sb.append("StreamCreationTimestamp: " + getStreamCreationTimestamp() + ",");
        }
        if (getEnhancedMonitoring() != null) {
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        }
        if (getEncryptionType() != null) {
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getOpenShardCount() != null) {
            sb.append("OpenShardCount: " + getOpenShardCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StreamDescriptionSummary withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    public StreamDescriptionSummary withEnhancedMonitoring(EnhancedMetrics... enhancedMetricsArr) {
        if (getEnhancedMonitoring() == null) {
            this.enhancedMonitoring = new ArrayList(enhancedMetricsArr.length);
        }
        for (EnhancedMetrics enhancedMetrics : enhancedMetricsArr) {
            this.enhancedMonitoring.add(enhancedMetrics);
        }
        return this;
    }

    public StreamDescriptionSummary withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public StreamDescriptionSummary withOpenShardCount(Integer num) {
        this.openShardCount = num;
        return this;
    }

    public StreamDescriptionSummary withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public StreamDescriptionSummary withStreamARN(String str) {
        this.streamARN = str;
        return this;
    }

    public StreamDescriptionSummary withStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
        return this;
    }

    public StreamDescriptionSummary withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public StreamDescriptionSummary withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public void setStreamStatus(String str) {
        this.streamStatus = str;
    }

    public StreamDescriptionSummary withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public StreamDescriptionSummary withStreamStatus(String str) {
        this.streamStatus = str;
        return this;
    }

    public StreamDescriptionSummary withEnhancedMonitoring(Collection<EnhancedMetrics> collection) {
        setEnhancedMonitoring(collection);
        return this;
    }
}
