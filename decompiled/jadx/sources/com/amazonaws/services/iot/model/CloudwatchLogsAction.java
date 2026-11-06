package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CloudwatchLogsAction implements Serializable {
    private String logGroupName;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudwatchLogsAction)) {
            return false;
        }
        CloudwatchLogsAction cloudwatchLogsAction = (CloudwatchLogsAction) obj;
        if ((cloudwatchLogsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (cloudwatchLogsAction.getRoleArn() != null && !cloudwatchLogsAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((cloudwatchLogsAction.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        return cloudwatchLogsAction.getLogGroupName() == null || cloudwatchLogsAction.getLogGroupName().equals(getLogGroupName());
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getLogGroupName() != null ? getLogGroupName().hashCode() : 0);
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CloudwatchLogsAction withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public CloudwatchLogsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
