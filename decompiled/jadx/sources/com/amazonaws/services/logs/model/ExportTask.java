package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ExportTask implements Serializable {
    private String destination;
    private String destinationPrefix;
    private ExportTaskExecutionInfo executionInfo;
    private Long from;
    private String logGroupName;
    private ExportTaskStatus status;
    private String taskId;
    private String taskName;
    private Long to;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExportTask)) {
            return false;
        }
        ExportTask exportTask = (ExportTask) obj;
        if ((exportTask.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (exportTask.getTaskId() != null && !exportTask.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((exportTask.getTaskName() == null) ^ (getTaskName() == null)) {
            return false;
        }
        if (exportTask.getTaskName() != null && !exportTask.getTaskName().equals(getTaskName())) {
            return false;
        }
        if ((exportTask.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (exportTask.getLogGroupName() != null && !exportTask.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((exportTask.getFrom() == null) ^ (getFrom() == null)) {
            return false;
        }
        if (exportTask.getFrom() != null && !exportTask.getFrom().equals(getFrom())) {
            return false;
        }
        if ((exportTask.getTo() == null) ^ (getTo() == null)) {
            return false;
        }
        if (exportTask.getTo() != null && !exportTask.getTo().equals(getTo())) {
            return false;
        }
        if ((exportTask.getDestination() == null) ^ (getDestination() == null)) {
            return false;
        }
        if (exportTask.getDestination() != null && !exportTask.getDestination().equals(getDestination())) {
            return false;
        }
        if ((exportTask.getDestinationPrefix() == null) ^ (getDestinationPrefix() == null)) {
            return false;
        }
        if (exportTask.getDestinationPrefix() != null && !exportTask.getDestinationPrefix().equals(getDestinationPrefix())) {
            return false;
        }
        if ((exportTask.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (exportTask.getStatus() != null && !exportTask.getStatus().equals(getStatus())) {
            return false;
        }
        if ((exportTask.getExecutionInfo() == null) ^ (getExecutionInfo() == null)) {
            return false;
        }
        return exportTask.getExecutionInfo() == null || exportTask.getExecutionInfo().equals(getExecutionInfo());
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    public ExportTaskExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    public Long getFrom() {
        return this.from;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public ExportTaskStatus getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public Long getTo() {
        return this.to;
    }

    public int hashCode() {
        return (((((((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getTaskName() == null ? 0 : getTaskName().hashCode())) * 31) + (getLogGroupName() == null ? 0 : getLogGroupName().hashCode())) * 31) + (getFrom() == null ? 0 : getFrom().hashCode())) * 31) + (getTo() == null ? 0 : getTo().hashCode())) * 31) + (getDestination() == null ? 0 : getDestination().hashCode())) * 31) + (getDestinationPrefix() == null ? 0 : getDestinationPrefix().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getExecutionInfo() != null ? getExecutionInfo().hashCode() : 0);
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setDestinationPrefix(String str) {
        this.destinationPrefix = str;
    }

    public void setExecutionInfo(ExportTaskExecutionInfo exportTaskExecutionInfo) {
        this.executionInfo = exportTaskExecutionInfo;
    }

    public void setFrom(Long l) {
        this.from = l;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setStatus(ExportTaskStatus exportTaskStatus) {
        this.status = exportTaskStatus;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTaskName(String str) {
        this.taskName = str;
    }

    public void setTo(Long l) {
        this.to = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getTaskName() != null) {
            sb.append("taskName: " + getTaskName() + ",");
        }
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getFrom() != null) {
            sb.append("from: " + getFrom() + ",");
        }
        if (getTo() != null) {
            sb.append("to: " + getTo() + ",");
        }
        if (getDestination() != null) {
            sb.append("destination: " + getDestination() + ",");
        }
        if (getDestinationPrefix() != null) {
            sb.append("destinationPrefix: " + getDestinationPrefix() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getExecutionInfo() != null) {
            sb.append("executionInfo: " + getExecutionInfo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ExportTask withDestination(String str) {
        this.destination = str;
        return this;
    }

    public ExportTask withDestinationPrefix(String str) {
        this.destinationPrefix = str;
        return this;
    }

    public ExportTask withExecutionInfo(ExportTaskExecutionInfo exportTaskExecutionInfo) {
        this.executionInfo = exportTaskExecutionInfo;
        return this;
    }

    public ExportTask withFrom(Long l) {
        this.from = l;
        return this;
    }

    public ExportTask withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public ExportTask withStatus(ExportTaskStatus exportTaskStatus) {
        this.status = exportTaskStatus;
        return this;
    }

    public ExportTask withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public ExportTask withTaskName(String str) {
        this.taskName = str;
        return this;
    }

    public ExportTask withTo(Long l) {
        this.to = l;
        return this;
    }
}
