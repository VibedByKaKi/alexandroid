package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SnsAction implements Serializable {
    private String messageFormat;
    private String roleArn;
    private String targetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SnsAction)) {
            return false;
        }
        SnsAction snsAction = (SnsAction) obj;
        if ((snsAction.getTargetArn() == null) ^ (getTargetArn() == null)) {
            return false;
        }
        if (snsAction.getTargetArn() != null && !snsAction.getTargetArn().equals(getTargetArn())) {
            return false;
        }
        if ((snsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (snsAction.getRoleArn() != null && !snsAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((snsAction.getMessageFormat() == null) ^ (getMessageFormat() == null)) {
            return false;
        }
        return snsAction.getMessageFormat() == null || snsAction.getMessageFormat().equals(getMessageFormat());
    }

    public String getMessageFormat() {
        return this.messageFormat;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTargetArn() {
        return this.targetArn;
    }

    public int hashCode() {
        return (((((getTargetArn() == null ? 0 : getTargetArn().hashCode()) + 31) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getMessageFormat() != null ? getMessageFormat().hashCode() : 0);
    }

    public void setMessageFormat(MessageFormat messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTargetArn(String str) {
        this.targetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTargetArn() != null) {
            sb.append("targetArn: " + getTargetArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getMessageFormat() != null) {
            sb.append("messageFormat: " + getMessageFormat());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SnsAction withMessageFormat(MessageFormat messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    public SnsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public SnsAction withTargetArn(String str) {
        this.targetArn = str;
        return this;
    }

    public void setMessageFormat(String str) {
        this.messageFormat = str;
    }

    public SnsAction withMessageFormat(String str) {
        this.messageFormat = str;
        return this;
    }
}
