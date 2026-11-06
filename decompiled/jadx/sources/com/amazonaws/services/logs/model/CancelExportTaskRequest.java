package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CancelExportTaskRequest extends AmazonWebServiceRequest implements Serializable {
    private String taskId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CancelExportTaskRequest)) {
            return false;
        }
        CancelExportTaskRequest cancelExportTaskRequest = (CancelExportTaskRequest) obj;
        if ((cancelExportTaskRequest.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        return cancelExportTaskRequest.getTaskId() == null || cancelExportTaskRequest.getTaskId().equals(getTaskId());
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return 31 + (getTaskId() == null ? 0 : getTaskId().hashCode());
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CancelExportTaskRequest withTaskId(String str) {
        this.taskId = str;
        return this;
    }
}
