package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CloudwatchAlarmAction implements Serializable {
    private String alarmName;
    private String roleArn;
    private String stateReason;
    private String stateValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudwatchAlarmAction)) {
            return false;
        }
        CloudwatchAlarmAction cloudwatchAlarmAction = (CloudwatchAlarmAction) obj;
        if ((cloudwatchAlarmAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (cloudwatchAlarmAction.getRoleArn() != null && !cloudwatchAlarmAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((cloudwatchAlarmAction.getAlarmName() == null) ^ (getAlarmName() == null)) {
            return false;
        }
        if (cloudwatchAlarmAction.getAlarmName() != null && !cloudwatchAlarmAction.getAlarmName().equals(getAlarmName())) {
            return false;
        }
        if ((cloudwatchAlarmAction.getStateReason() == null) ^ (getStateReason() == null)) {
            return false;
        }
        if (cloudwatchAlarmAction.getStateReason() != null && !cloudwatchAlarmAction.getStateReason().equals(getStateReason())) {
            return false;
        }
        if ((cloudwatchAlarmAction.getStateValue() == null) ^ (getStateValue() == null)) {
            return false;
        }
        return cloudwatchAlarmAction.getStateValue() == null || cloudwatchAlarmAction.getStateValue().equals(getStateValue());
    }

    public String getAlarmName() {
        return this.alarmName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getStateReason() {
        return this.stateReason;
    }

    public String getStateValue() {
        return this.stateValue;
    }

    public int hashCode() {
        return (((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getAlarmName() == null ? 0 : getAlarmName().hashCode())) * 31) + (getStateReason() == null ? 0 : getStateReason().hashCode())) * 31) + (getStateValue() != null ? getStateValue().hashCode() : 0);
    }

    public void setAlarmName(String str) {
        this.alarmName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setStateReason(String str) {
        this.stateReason = str;
    }

    public void setStateValue(String str) {
        this.stateValue = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getAlarmName() != null) {
            sb.append("alarmName: " + getAlarmName() + ",");
        }
        if (getStateReason() != null) {
            sb.append("stateReason: " + getStateReason() + ",");
        }
        if (getStateValue() != null) {
            sb.append("stateValue: " + getStateValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CloudwatchAlarmAction withAlarmName(String str) {
        this.alarmName = str;
        return this;
    }

    public CloudwatchAlarmAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public CloudwatchAlarmAction withStateReason(String str) {
        this.stateReason = str;
        return this;
    }

    public CloudwatchAlarmAction withStateValue(String str) {
        this.stateValue = str;
        return this;
    }
}
