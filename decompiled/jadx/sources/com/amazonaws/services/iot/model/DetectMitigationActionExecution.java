package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetectMitigationActionExecution implements Serializable {
    private String actionName;
    private String errorCode;
    private Date executionEndDate;
    private Date executionStartDate;
    private String message;
    private String status;
    private String taskId;
    private String thingName;
    private String violationId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectMitigationActionExecution)) {
            return false;
        }
        DetectMitigationActionExecution detectMitigationActionExecution = (DetectMitigationActionExecution) obj;
        if ((detectMitigationActionExecution.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getTaskId() != null && !detectMitigationActionExecution.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((detectMitigationActionExecution.getViolationId() == null) ^ (getViolationId() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getViolationId() != null && !detectMitigationActionExecution.getViolationId().equals(getViolationId())) {
            return false;
        }
        if ((detectMitigationActionExecution.getActionName() == null) ^ (getActionName() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getActionName() != null && !detectMitigationActionExecution.getActionName().equals(getActionName())) {
            return false;
        }
        if ((detectMitigationActionExecution.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getThingName() != null && !detectMitigationActionExecution.getThingName().equals(getThingName())) {
            return false;
        }
        if ((detectMitigationActionExecution.getExecutionStartDate() == null) ^ (getExecutionStartDate() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getExecutionStartDate() != null && !detectMitigationActionExecution.getExecutionStartDate().equals(getExecutionStartDate())) {
            return false;
        }
        if ((detectMitigationActionExecution.getExecutionEndDate() == null) ^ (getExecutionEndDate() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getExecutionEndDate() != null && !detectMitigationActionExecution.getExecutionEndDate().equals(getExecutionEndDate())) {
            return false;
        }
        if ((detectMitigationActionExecution.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getStatus() != null && !detectMitigationActionExecution.getStatus().equals(getStatus())) {
            return false;
        }
        if ((detectMitigationActionExecution.getErrorCode() == null) ^ (getErrorCode() == null)) {
            return false;
        }
        if (detectMitigationActionExecution.getErrorCode() != null && !detectMitigationActionExecution.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if ((detectMitigationActionExecution.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        return detectMitigationActionExecution.getMessage() == null || detectMitigationActionExecution.getMessage().equals(getMessage());
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Date getExecutionEndDate() {
        return this.executionEndDate;
    }

    public Date getExecutionStartDate() {
        return this.executionStartDate;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getThingName() {
        return this.thingName;
    }

    public String getViolationId() {
        return this.violationId;
    }

    public int hashCode() {
        return (((((((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getViolationId() == null ? 0 : getViolationId().hashCode())) * 31) + (getActionName() == null ? 0 : getActionName().hashCode())) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getExecutionStartDate() == null ? 0 : getExecutionStartDate().hashCode())) * 31) + (getExecutionEndDate() == null ? 0 : getExecutionEndDate().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setExecutionEndDate(Date date) {
        this.executionEndDate = date;
    }

    public void setExecutionStartDate(Date date) {
        this.executionStartDate = date;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus(DetectMitigationActionExecutionStatus detectMitigationActionExecutionStatus) {
        this.status = detectMitigationActionExecutionStatus.toString();
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public void setViolationId(String str) {
        this.violationId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getViolationId() != null) {
            sb.append("violationId: " + getViolationId() + ",");
        }
        if (getActionName() != null) {
            sb.append("actionName: " + getActionName() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getExecutionStartDate() != null) {
            sb.append("executionStartDate: " + getExecutionStartDate() + ",");
        }
        if (getExecutionEndDate() != null) {
            sb.append("executionEndDate: " + getExecutionEndDate() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
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

    public DetectMitigationActionExecution withActionName(String str) {
        this.actionName = str;
        return this;
    }

    public DetectMitigationActionExecution withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public DetectMitigationActionExecution withExecutionEndDate(Date date) {
        this.executionEndDate = date;
        return this;
    }

    public DetectMitigationActionExecution withExecutionStartDate(Date date) {
        this.executionStartDate = date;
        return this;
    }

    public DetectMitigationActionExecution withMessage(String str) {
        this.message = str;
        return this;
    }

    public DetectMitigationActionExecution withStatus(DetectMitigationActionExecutionStatus detectMitigationActionExecutionStatus) {
        this.status = detectMitigationActionExecutionStatus.toString();
        return this;
    }

    public DetectMitigationActionExecution withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public DetectMitigationActionExecution withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public DetectMitigationActionExecution withViolationId(String str) {
        this.violationId = str;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public DetectMitigationActionExecution withStatus(String str) {
        this.status = str;
        return this;
    }
}
