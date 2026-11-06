package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuditTaskMetadata implements Serializable {
    private String taskId;
    private String taskStatus;
    private String taskType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuditTaskMetadata)) {
            return false;
        }
        AuditTaskMetadata auditTaskMetadata = (AuditTaskMetadata) obj;
        if ((auditTaskMetadata.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (auditTaskMetadata.getTaskId() != null && !auditTaskMetadata.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((auditTaskMetadata.getTaskStatus() == null) ^ (getTaskStatus() == null)) {
            return false;
        }
        if (auditTaskMetadata.getTaskStatus() != null && !auditTaskMetadata.getTaskStatus().equals(getTaskStatus())) {
            return false;
        }
        if ((auditTaskMetadata.getTaskType() == null) ^ (getTaskType() == null)) {
            return false;
        }
        return auditTaskMetadata.getTaskType() == null || auditTaskMetadata.getTaskType().equals(getTaskType());
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public int hashCode() {
        return (((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getTaskStatus() == null ? 0 : getTaskStatus().hashCode())) * 31) + (getTaskType() != null ? getTaskType().hashCode() : 0);
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTaskStatus(AuditTaskStatus auditTaskStatus) {
        this.taskStatus = auditTaskStatus.toString();
    }

    public void setTaskType(AuditTaskType auditTaskType) {
        this.taskType = auditTaskType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getTaskStatus() != null) {
            sb.append("taskStatus: " + getTaskStatus() + ",");
        }
        if (getTaskType() != null) {
            sb.append("taskType: " + getTaskType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuditTaskMetadata withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public AuditTaskMetadata withTaskStatus(AuditTaskStatus auditTaskStatus) {
        this.taskStatus = auditTaskStatus.toString();
        return this;
    }

    public AuditTaskMetadata withTaskType(AuditTaskType auditTaskType) {
        this.taskType = auditTaskType.toString();
        return this;
    }

    public void setTaskStatus(String str) {
        this.taskStatus = str;
    }

    public void setTaskType(String str) {
        this.taskType = str;
    }

    public AuditTaskMetadata withTaskStatus(String str) {
        this.taskStatus = str;
        return this;
    }

    public AuditTaskMetadata withTaskType(String str) {
        this.taskType = str;
        return this;
    }
}
