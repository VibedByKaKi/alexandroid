package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetV2LoggingLevelRequest extends AmazonWebServiceRequest implements Serializable {
    private String logLevel;
    private LogTarget logTarget;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SetV2LoggingLevelRequest)) {
            return false;
        }
        SetV2LoggingLevelRequest setV2LoggingLevelRequest = (SetV2LoggingLevelRequest) obj;
        if ((setV2LoggingLevelRequest.getLogTarget() == null) ^ (getLogTarget() == null)) {
            return false;
        }
        if (setV2LoggingLevelRequest.getLogTarget() != null && !setV2LoggingLevelRequest.getLogTarget().equals(getLogTarget())) {
            return false;
        }
        if ((setV2LoggingLevelRequest.getLogLevel() == null) ^ (getLogLevel() == null)) {
            return false;
        }
        return setV2LoggingLevelRequest.getLogLevel() == null || setV2LoggingLevelRequest.getLogLevel().equals(getLogLevel());
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public LogTarget getLogTarget() {
        return this.logTarget;
    }

    public int hashCode() {
        return (((getLogTarget() == null ? 0 : getLogTarget().hashCode()) + 31) * 31) + (getLogLevel() != null ? getLogLevel().hashCode() : 0);
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    public void setLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogTarget() != null) {
            sb.append("logTarget: " + getLogTarget() + ",");
        }
        if (getLogLevel() != null) {
            sb.append("logLevel: " + getLogLevel());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SetV2LoggingLevelRequest withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    public SetV2LoggingLevelRequest withLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
        return this;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public SetV2LoggingLevelRequest withLogLevel(String str) {
        this.logLevel = str;
        return this;
    }
}
