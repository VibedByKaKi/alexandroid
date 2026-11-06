package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LoggingOptionsPayload implements Serializable {
    private String logLevel;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoggingOptionsPayload)) {
            return false;
        }
        LoggingOptionsPayload loggingOptionsPayload = (LoggingOptionsPayload) obj;
        if ((loggingOptionsPayload.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (loggingOptionsPayload.getRoleArn() != null && !loggingOptionsPayload.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((loggingOptionsPayload.getLogLevel() == null) ^ (getLogLevel() == null)) {
            return false;
        }
        return loggingOptionsPayload.getLogLevel() == null || loggingOptionsPayload.getLogLevel().equals(getLogLevel());
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getLogLevel() != null ? getLogLevel().hashCode() : 0);
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getLogLevel() != null) {
            sb.append("logLevel: " + getLogLevel());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public LoggingOptionsPayload withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    public LoggingOptionsPayload withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public LoggingOptionsPayload withLogLevel(String str) {
        this.logLevel = str;
        return this;
    }
}
