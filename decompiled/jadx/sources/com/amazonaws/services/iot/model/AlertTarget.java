package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AlertTarget implements Serializable {
    private String alertTargetArn;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AlertTarget)) {
            return false;
        }
        AlertTarget alertTarget = (AlertTarget) obj;
        if ((alertTarget.getAlertTargetArn() == null) ^ (getAlertTargetArn() == null)) {
            return false;
        }
        if (alertTarget.getAlertTargetArn() != null && !alertTarget.getAlertTargetArn().equals(getAlertTargetArn())) {
            return false;
        }
        if ((alertTarget.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return alertTarget.getRoleArn() == null || alertTarget.getRoleArn().equals(getRoleArn());
    }

    public String getAlertTargetArn() {
        return this.alertTargetArn;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((getAlertTargetArn() == null ? 0 : getAlertTargetArn().hashCode()) + 31) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setAlertTargetArn(String str) {
        this.alertTargetArn = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAlertTargetArn() != null) {
            sb.append("alertTargetArn: " + getAlertTargetArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AlertTarget withAlertTargetArn(String str) {
        this.alertTargetArn = str;
        return this;
    }

    public AlertTarget withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
