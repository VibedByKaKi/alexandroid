package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LogGroup implements Serializable {
    private String arn;
    private Long creationTime;
    private String kmsKeyId;
    private String logGroupName;
    private Integer metricFilterCount;
    private Integer retentionInDays;
    private Long storedBytes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LogGroup)) {
            return false;
        }
        LogGroup logGroup = (LogGroup) obj;
        if ((logGroup.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (logGroup.getLogGroupName() != null && !logGroup.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((logGroup.getCreationTime() == null) ^ (getCreationTime() == null)) {
            return false;
        }
        if (logGroup.getCreationTime() != null && !logGroup.getCreationTime().equals(getCreationTime())) {
            return false;
        }
        if ((logGroup.getRetentionInDays() == null) ^ (getRetentionInDays() == null)) {
            return false;
        }
        if (logGroup.getRetentionInDays() != null && !logGroup.getRetentionInDays().equals(getRetentionInDays())) {
            return false;
        }
        if ((logGroup.getMetricFilterCount() == null) ^ (getMetricFilterCount() == null)) {
            return false;
        }
        if (logGroup.getMetricFilterCount() != null && !logGroup.getMetricFilterCount().equals(getMetricFilterCount())) {
            return false;
        }
        if ((logGroup.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (logGroup.getArn() != null && !logGroup.getArn().equals(getArn())) {
            return false;
        }
        if ((logGroup.getStoredBytes() == null) ^ (getStoredBytes() == null)) {
            return false;
        }
        if (logGroup.getStoredBytes() != null && !logGroup.getStoredBytes().equals(getStoredBytes())) {
            return false;
        }
        if ((logGroup.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        return logGroup.getKmsKeyId() == null || logGroup.getKmsKeyId().equals(getKmsKeyId());
    }

    public String getArn() {
        return this.arn;
    }

    public Long getCreationTime() {
        return this.creationTime;
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public Integer getMetricFilterCount() {
        return this.metricFilterCount;
    }

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    public int hashCode() {
        return (((((((((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getCreationTime() == null ? 0 : getCreationTime().hashCode())) * 31) + (getRetentionInDays() == null ? 0 : getRetentionInDays().hashCode())) * 31) + (getMetricFilterCount() == null ? 0 : getMetricFilterCount().hashCode())) * 31) + (getArn() == null ? 0 : getArn().hashCode())) * 31) + (getStoredBytes() == null ? 0 : getStoredBytes().hashCode())) * 31) + (getKmsKeyId() != null ? getKmsKeyId().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setCreationTime(Long l) {
        this.creationTime = l;
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setMetricFilterCount(Integer num) {
        this.metricFilterCount = num;
    }

    public void setRetentionInDays(Integer num) {
        this.retentionInDays = num;
    }

    public void setStoredBytes(Long l) {
        this.storedBytes = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getCreationTime() != null) {
            sb.append("creationTime: " + getCreationTime() + ",");
        }
        if (getRetentionInDays() != null) {
            sb.append("retentionInDays: " + getRetentionInDays() + ",");
        }
        if (getMetricFilterCount() != null) {
            sb.append("metricFilterCount: " + getMetricFilterCount() + ",");
        }
        if (getArn() != null) {
            sb.append("arn: " + getArn() + ",");
        }
        if (getStoredBytes() != null) {
            sb.append("storedBytes: " + getStoredBytes() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("kmsKeyId: " + getKmsKeyId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public LogGroup withArn(String str) {
        this.arn = str;
        return this;
    }

    public LogGroup withCreationTime(Long l) {
        this.creationTime = l;
        return this;
    }

    public LogGroup withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public LogGroup withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public LogGroup withMetricFilterCount(Integer num) {
        this.metricFilterCount = num;
        return this;
    }

    public LogGroup withRetentionInDays(Integer num) {
        this.retentionInDays = num;
        return this;
    }

    public LogGroup withStoredBytes(Long l) {
        this.storedBytes = l;
        return this;
    }
}
