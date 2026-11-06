package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LogStream implements Serializable {
    private String arn;
    private Long creationTime;
    private Long firstEventTimestamp;
    private Long lastEventTimestamp;
    private Long lastIngestionTime;
    private String logStreamName;
    private Long storedBytes;
    private String uploadSequenceToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LogStream)) {
            return false;
        }
        LogStream logStream = (LogStream) obj;
        if ((logStream.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        if (logStream.getLogStreamName() != null && !logStream.getLogStreamName().equals(getLogStreamName())) {
            return false;
        }
        if ((logStream.getCreationTime() == null) ^ (getCreationTime() == null)) {
            return false;
        }
        if (logStream.getCreationTime() != null && !logStream.getCreationTime().equals(getCreationTime())) {
            return false;
        }
        if ((logStream.getFirstEventTimestamp() == null) ^ (getFirstEventTimestamp() == null)) {
            return false;
        }
        if (logStream.getFirstEventTimestamp() != null && !logStream.getFirstEventTimestamp().equals(getFirstEventTimestamp())) {
            return false;
        }
        if ((logStream.getLastEventTimestamp() == null) ^ (getLastEventTimestamp() == null)) {
            return false;
        }
        if (logStream.getLastEventTimestamp() != null && !logStream.getLastEventTimestamp().equals(getLastEventTimestamp())) {
            return false;
        }
        if ((logStream.getLastIngestionTime() == null) ^ (getLastIngestionTime() == null)) {
            return false;
        }
        if (logStream.getLastIngestionTime() != null && !logStream.getLastIngestionTime().equals(getLastIngestionTime())) {
            return false;
        }
        if ((logStream.getUploadSequenceToken() == null) ^ (getUploadSequenceToken() == null)) {
            return false;
        }
        if (logStream.getUploadSequenceToken() != null && !logStream.getUploadSequenceToken().equals(getUploadSequenceToken())) {
            return false;
        }
        if ((logStream.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (logStream.getArn() != null && !logStream.getArn().equals(getArn())) {
            return false;
        }
        if ((logStream.getStoredBytes() == null) ^ (getStoredBytes() == null)) {
            return false;
        }
        return logStream.getStoredBytes() == null || logStream.getStoredBytes().equals(getStoredBytes());
    }

    public String getArn() {
        return this.arn;
    }

    public Long getCreationTime() {
        return this.creationTime;
    }

    public Long getFirstEventTimestamp() {
        return this.firstEventTimestamp;
    }

    public Long getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    public Long getLastIngestionTime() {
        return this.lastIngestionTime;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    public String getUploadSequenceToken() {
        return this.uploadSequenceToken;
    }

    public int hashCode() {
        return (((((((((((((((getLogStreamName() == null ? 0 : getLogStreamName().hashCode()) + 31) * 31) + (getCreationTime() == null ? 0 : getCreationTime().hashCode())) * 31) + (getFirstEventTimestamp() == null ? 0 : getFirstEventTimestamp().hashCode())) * 31) + (getLastEventTimestamp() == null ? 0 : getLastEventTimestamp().hashCode())) * 31) + (getLastIngestionTime() == null ? 0 : getLastIngestionTime().hashCode())) * 31) + (getUploadSequenceToken() == null ? 0 : getUploadSequenceToken().hashCode())) * 31) + (getArn() == null ? 0 : getArn().hashCode())) * 31) + (getStoredBytes() != null ? getStoredBytes().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setCreationTime(Long l) {
        this.creationTime = l;
    }

    public void setFirstEventTimestamp(Long l) {
        this.firstEventTimestamp = l;
    }

    public void setLastEventTimestamp(Long l) {
        this.lastEventTimestamp = l;
    }

    public void setLastIngestionTime(Long l) {
        this.lastIngestionTime = l;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public void setStoredBytes(Long l) {
        this.storedBytes = l;
    }

    public void setUploadSequenceToken(String str) {
        this.uploadSequenceToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName() + ",");
        }
        if (getCreationTime() != null) {
            sb.append("creationTime: " + getCreationTime() + ",");
        }
        if (getFirstEventTimestamp() != null) {
            sb.append("firstEventTimestamp: " + getFirstEventTimestamp() + ",");
        }
        if (getLastEventTimestamp() != null) {
            sb.append("lastEventTimestamp: " + getLastEventTimestamp() + ",");
        }
        if (getLastIngestionTime() != null) {
            sb.append("lastIngestionTime: " + getLastIngestionTime() + ",");
        }
        if (getUploadSequenceToken() != null) {
            sb.append("uploadSequenceToken: " + getUploadSequenceToken() + ",");
        }
        if (getArn() != null) {
            sb.append("arn: " + getArn() + ",");
        }
        if (getStoredBytes() != null) {
            sb.append("storedBytes: " + getStoredBytes());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public LogStream withArn(String str) {
        this.arn = str;
        return this;
    }

    public LogStream withCreationTime(Long l) {
        this.creationTime = l;
        return this;
    }

    public LogStream withFirstEventTimestamp(Long l) {
        this.firstEventTimestamp = l;
        return this;
    }

    public LogStream withLastEventTimestamp(Long l) {
        this.lastEventTimestamp = l;
        return this;
    }

    public LogStream withLastIngestionTime(Long l) {
        this.lastIngestionTime = l;
        return this;
    }

    public LogStream withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public LogStream withStoredBytes(Long l) {
        this.storedBytes = l;
        return this;
    }

    public LogStream withUploadSequenceToken(String str) {
        this.uploadSequenceToken = str;
        return this;
    }
}
