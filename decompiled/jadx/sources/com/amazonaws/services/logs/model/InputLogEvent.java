package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InputLogEvent implements Serializable {
    private String message;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InputLogEvent)) {
            return false;
        }
        InputLogEvent inputLogEvent = (InputLogEvent) obj;
        if ((inputLogEvent.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (inputLogEvent.getTimestamp() != null && !inputLogEvent.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((inputLogEvent.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        return inputLogEvent.getMessage() == null || inputLogEvent.getMessage().equals(getMessage());
    }

    public String getMessage() {
        return this.message;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
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
            sb.append("message: " + getMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public InputLogEvent withMessage(String str) {
        this.message = str;
        return this;
    }

    public InputLogEvent withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
