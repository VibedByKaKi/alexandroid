package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class IotEventsAction implements Serializable {
    private Boolean batchMode;
    private String inputName;
    private String messageId;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IotEventsAction)) {
            return false;
        }
        IotEventsAction iotEventsAction = (IotEventsAction) obj;
        if ((iotEventsAction.getInputName() == null) ^ (getInputName() == null)) {
            return false;
        }
        if (iotEventsAction.getInputName() != null && !iotEventsAction.getInputName().equals(getInputName())) {
            return false;
        }
        if ((iotEventsAction.getMessageId() == null) ^ (getMessageId() == null)) {
            return false;
        }
        if (iotEventsAction.getMessageId() != null && !iotEventsAction.getMessageId().equals(getMessageId())) {
            return false;
        }
        if ((iotEventsAction.getBatchMode() == null) ^ (getBatchMode() == null)) {
            return false;
        }
        if (iotEventsAction.getBatchMode() != null && !iotEventsAction.getBatchMode().equals(getBatchMode())) {
            return false;
        }
        if ((iotEventsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return iotEventsAction.getRoleArn() == null || iotEventsAction.getRoleArn().equals(getRoleArn());
    }

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    public String getInputName() {
        return this.inputName;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((getInputName() == null ? 0 : getInputName().hashCode()) + 31) * 31) + (getMessageId() == null ? 0 : getMessageId().hashCode())) * 31) + (getBatchMode() == null ? 0 : getBatchMode().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public Boolean isBatchMode() {
        return this.batchMode;
    }

    public void setBatchMode(Boolean bool) {
        this.batchMode = bool;
    }

    public void setInputName(String str) {
        this.inputName = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getInputName() != null) {
            sb.append("inputName: " + getInputName() + ",");
        }
        if (getMessageId() != null) {
            sb.append("messageId: " + getMessageId() + ",");
        }
        if (getBatchMode() != null) {
            sb.append("batchMode: " + getBatchMode() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public IotEventsAction withBatchMode(Boolean bool) {
        this.batchMode = bool;
        return this;
    }

    public IotEventsAction withInputName(String str) {
        this.inputName = str;
        return this;
    }

    public IotEventsAction withMessageId(String str) {
        this.messageId = str;
        return this;
    }

    public IotEventsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
