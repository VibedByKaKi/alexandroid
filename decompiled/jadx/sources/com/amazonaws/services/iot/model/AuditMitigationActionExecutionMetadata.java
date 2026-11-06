package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuditMitigationActionExecutionMetadata implements Serializable {
    private String actionId;
    private String actionName;
    private Date endTime;
    private String errorCode;
    private String findingId;
    private String message;
    private Date startTime;
    private String status;
    private String taskId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuditMitigationActionExecutionMetadata)) {
            return false;
        }
        AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata = (AuditMitigationActionExecutionMetadata) obj;
        if ((auditMitigationActionExecutionMetadata.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getTaskId() != null && !auditMitigationActionExecutionMetadata.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getFindingId() == null) ^ (getFindingId() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getFindingId() != null && !auditMitigationActionExecutionMetadata.getFindingId().equals(getFindingId())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getActionName() == null) ^ (getActionName() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getActionName() != null && !auditMitigationActionExecutionMetadata.getActionName().equals(getActionName())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getActionId() == null) ^ (getActionId() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getActionId() != null && !auditMitigationActionExecutionMetadata.getActionId().equals(getActionId())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getStatus() != null && !auditMitigationActionExecutionMetadata.getStatus().equals(getStatus())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getStartTime() != null && !auditMitigationActionExecutionMetadata.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getEndTime() != null && !auditMitigationActionExecutionMetadata.getEndTime().equals(getEndTime())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getErrorCode() == null) ^ (getErrorCode() == null)) {
            return false;
        }
        if (auditMitigationActionExecutionMetadata.getErrorCode() != null && !auditMitigationActionExecutionMetadata.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if ((auditMitigationActionExecutionMetadata.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        return auditMitigationActionExecutionMetadata.getMessage() == null || auditMitigationActionExecutionMetadata.getMessage().equals(getMessage());
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getActionName() {
        return this.actionName;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getFindingId() {
        return this.findingId;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((((((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getFindingId() == null ? 0 : getFindingId().hashCode())) * 31) + (getActionName() == null ? 0 : getActionName().hashCode())) * 31) + (getActionId() == null ? 0 : getActionId().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getStartTime() == null ? 0 : getStartTime().hashCode())) * 31) + (getEndTime() == null ? 0 : getEndTime().hashCode())) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setEndTime(Date date) {
        this.endTime = date;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setFindingId(String str) {
        this.findingId = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStartTime(Date date) {
        this.startTime = date;
    }

    public void setStatus(AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus) {
        this.status = auditMitigationActionsExecutionStatus.toString();
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getFindingId() != null) {
            sb.append("findingId: " + getFindingId() + ",");
        }
        if (getActionName() != null) {
            sb.append("actionName: " + getActionName() + ",");
        }
        if (getActionId() != null) {
            sb.append("actionId: " + getActionId() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime() + ",");
        }
        if (getErrorCode() != null) {
            sb.append("errorCode: " + getErrorCode() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuditMitigationActionExecutionMetadata withActionId(String str) {
        this.actionId = str;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withActionName(String str) {
        this.actionName = str;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withEndTime(Date date) {
        this.endTime = date;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withFindingId(String str) {
        this.findingId = str;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withMessage(String str) {
        this.message = str;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withStartTime(Date date) {
        this.startTime = date;
        return this;
    }

    public AuditMitigationActionExecutionMetadata withStatus(AuditMitigationActionsExecutionStatus auditMitigationActionsExecutionStatus) {
        this.status = auditMitigationActionsExecutionStatus.toString();
        return this;
    }

    public AuditMitigationActionExecutionMetadata withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public AuditMitigationActionExecutionMetadata withStatus(String str) {
        this.status = str;
        return this;
    }
}
