package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LogTargetConfiguration implements Serializable {
    private String logLevel;
    private LogTarget logTarget;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LogTargetConfiguration)) {
            return false;
        }
        LogTargetConfiguration logTargetConfiguration = (LogTargetConfiguration) obj;
        if ((logTargetConfiguration.getLogTarget() == null) ^ (getLogTarget() == null)) {
            return false;
        }
        if (logTargetConfiguration.getLogTarget() != null && !logTargetConfiguration.getLogTarget().equals(getLogTarget())) {
            return false;
        }
        if ((logTargetConfiguration.getLogLevel() == null) ^ (getLogLevel() == null)) {
            return false;
        }
        return logTargetConfiguration.getLogLevel() == null || logTargetConfiguration.getLogLevel().equals(getLogLevel());
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

    public LogTargetConfiguration withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    public LogTargetConfiguration withLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
        return this;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public LogTargetConfiguration withLogLevel(String str) {
        this.logLevel = str;
        return this;
    }
}
