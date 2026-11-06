package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class OutputLogEvent implements Serializable {
    private Long ingestionTime;
    private String message;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OutputLogEvent)) {
            return false;
        }
        OutputLogEvent outputLogEvent = (OutputLogEvent) obj;
        if ((outputLogEvent.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (outputLogEvent.getTimestamp() != null && !outputLogEvent.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((outputLogEvent.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        if (outputLogEvent.getMessage() != null && !outputLogEvent.getMessage().equals(getMessage())) {
            return false;
        }
        if ((outputLogEvent.getIngestionTime() == null) ^ (getIngestionTime() == null)) {
            return false;
        }
        return outputLogEvent.getIngestionTime() == null || outputLogEvent.getIngestionTime().equals(getIngestionTime());
    }

    public Long getIngestionTime() {
        return this.ingestionTime;
    }

    public String getMessage() {
        return this.message;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getMessage() == null ? 0 : getMessage().hashCode())) * 31) + (getIngestionTime() != null ? getIngestionTime().hashCode() : 0);
    }

    public void setIngestionTime(Long l) {
        this.ingestionTime = l;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTimestamp() != null) {
            sb.append("timestamp: " + getTimestamp() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage() + ",");
        }
        if (getIngestionTime() != null) {
            sb.append("ingestionTime: " + getIngestionTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public OutputLogEvent withIngestionTime(Long l) {
        this.ingestionTime = l;
        return this;
    }

    public OutputLogEvent withMessage(String str) {
        this.message = str;
        return this;
    }

    public OutputLogEvent withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
