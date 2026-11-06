package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ExportTaskExecutionInfo implements Serializable {
    private Long completionTime;
    private Long creationTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExportTaskExecutionInfo)) {
            return false;
        }
        ExportTaskExecutionInfo exportTaskExecutionInfo = (ExportTaskExecutionInfo) obj;
        if ((exportTaskExecutionInfo.getCreationTime() == null) ^ (getCreationTime() == null)) {
            return false;
        }
        if (exportTaskExecutionInfo.getCreationTime() != null && !exportTaskExecutionInfo.getCreationTime().equals(getCreationTime())) {
            return false;
        }
        if ((exportTaskExecutionInfo.getCompletionTime() == null) ^ (getCompletionTime() == null)) {
            return false;
        }
        return exportTaskExecutionInfo.getCompletionTime() == null || exportTaskExecutionInfo.getCompletionTime().equals(getCompletionTime());
    }

    public Long getCompletionTime() {
        return this.completionTime;
    }

    public Long getCreationTime() {
        return this.creationTime;
    }

    public int hashCode() {
        return (((getCreationTime() == null ? 0 : getCreationTime().hashCode()) + 31) * 31) + (getCompletionTime() != null ? getCompletionTime().hashCode() : 0);
    }

    public void setCompletionTime(Long l) {
        this.completionTime = l;
    }

    public void setCreationTime(Long l) {
        this.creationTime = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCreationTime() != null) {
            sb.append("creationTime: " + getCreationTime() + ",");
        }
        if (getCompletionTime() != null) {
            sb.append("completionTime: " + getCompletionTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ExportTaskExecutionInfo withCompletionTime(Long l) {
        this.completionTime = l;
        return this;
    }

    public ExportTaskExecutionInfo withCreationTime(Long l) {
        this.creationTime = l;
        return this;
    }
}
