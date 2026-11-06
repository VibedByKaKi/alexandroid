package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FilteredLogEvent implements Serializable {
    private String eventId;
    private Long ingestionTime;
    private String logStreamName;
    private String message;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FilteredLogEvent)) {
            return false;
        }
        FilteredLogEvent filteredLogEvent = (FilteredLogEvent) obj;
        if ((filteredLogEvent.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        if (filteredLogEvent.getLogStreamName() != null && !filteredLogEvent.getLogStreamName().equals(getLogStreamName())) {
            return false;
        }
        if ((filteredLogEvent.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (filteredLogEvent.getTimestamp() != null && !filteredLogEvent.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((filteredLogEvent.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        if (filteredLogEvent.getMessage() != null && !filteredLogEvent.getMessage().equals(getMessage())) {
            return false;
        }
        if ((filteredLogEvent.getIngestionTime() == null) ^ (getIngestionTime() == null)) {
            return false;
        }
        if (filteredLogEvent.getIngestionTime() != null && !filteredLogEvent.getIngestionTime().equals(getIngestionTime())) {
            return false;
        }
        if ((filteredLogEvent.getEventId() == null) ^ (getEventId() == null)) {
            return false;
        }
        return filteredLogEvent.getEventId() == null || filteredLogEvent.getEventId().equals(getEventId());
    }

    public String getEventId() {
        return this.eventId;
    }

    public Long getIngestionTime() {
        return this.ingestionTime;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public String getMessage() {
        return this.message;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((getLogStreamName() == null ? 0 : getLogStreamName().hashCode()) + 31) * 31) + (getTimestamp() == null ? 0 : getTimestamp().hashCode())) * 31) + (getMessage() == null ? 0 : getMessage().hashCode())) * 31) + (getIngestionTime() == null ? 0 : getIngestionTime().hashCode())) * 31) + (getEventId() != null ? getEventId().hashCode() : 0);
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setIngestionTime(Long l) {
        this.ingestionTime = l;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName() + ",");
        }
        if (getTimestamp() != null) {
            sb.append("timestamp: " + getTimestamp() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage() + ",");
        }
        if (getIngestionTime() != null) {
            sb.append("ingestionTime: " + getIngestionTime() + ",");
        }
        if (getEventId() != null) {
            sb.append("eventId: " + getEventId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public FilteredLogEvent withEventId(String str) {
        this.eventId = str;
        return this;
    }

    public FilteredLogEvent withIngestionTime(Long l) {
        this.ingestionTime = l;
        return this;
    }

    public FilteredLogEvent withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public FilteredLogEvent withMessage(String str) {
        this.message = str;
        return this;
    }

    public FilteredLogEvent withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
