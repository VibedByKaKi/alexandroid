package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetLoggingOptionsResult implements Serializable {
    private String logLevel;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLoggingOptionsResult)) {
            return false;
        }
        GetLoggingOptionsResult getLoggingOptionsResult = (GetLoggingOptionsResult) obj;
        if ((getLoggingOptionsResult.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (getLoggingOptionsResult.getRoleArn() != null && !getLoggingOptionsResult.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((getLoggingOptionsResult.getLogLevel() == null) ^ (getLogLevel() == null)) {
            return false;
        }
        return getLoggingOptionsResult.getLogLevel() == null || getLoggingOptionsResult.getLogLevel().equals(getLogLevel());
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

    public GetLoggingOptionsResult withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    public GetLoggingOptionsResult withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public void setLogLevel(String str) {
        this.logLevel = str;
    }

    public GetLoggingOptionsResult withLogLevel(String str) {
        this.logLevel = str;
        return this;
    }
}
