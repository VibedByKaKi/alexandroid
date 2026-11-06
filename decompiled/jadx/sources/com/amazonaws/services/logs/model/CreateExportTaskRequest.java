package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateExportTaskRequest extends AmazonWebServiceRequest implements Serializable {
    private String destination;
    private String destinationPrefix;
    private Long from;
    private String logGroupName;
    private String logStreamNamePrefix;
    private String taskName;
    private Long to;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateExportTaskRequest)) {
            return false;
        }
        CreateExportTaskRequest createExportTaskRequest = (CreateExportTaskRequest) obj;
        if ((createExportTaskRequest.getTaskName() == null) ^ (getTaskName() == null)) {
            return false;
        }
        if (createExportTaskRequest.getTaskName() != null && !createExportTaskRequest.getTaskName().equals(getTaskName())) {
            return false;
        }
        if ((createExportTaskRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (createExportTaskRequest.getLogGroupName() != null && !createExportTaskRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((createExportTaskRequest.getLogStreamNamePrefix() == null) ^ (getLogStreamNamePrefix() == null)) {
            return false;
        }
        if (createExportTaskRequest.getLogStreamNamePrefix() != null && !createExportTaskRequest.getLogStreamNamePrefix().equals(getLogStreamNamePrefix())) {
            return false;
        }
        if ((createExportTaskRequest.getFrom() == null) ^ (getFrom() == null)) {
            return false;
        }
        if (createExportTaskRequest.getFrom() != null && !createExportTaskRequest.getFrom().equals(getFrom())) {
            return false;
        }
        if ((createExportTaskRequest.getTo() == null) ^ (getTo() == null)) {
            return false;
        }
        if (createExportTaskRequest.getTo() != null && !createExportTaskRequest.getTo().equals(getTo())) {
            return false;
        }
        if ((createExportTaskRequest.getDestination() == null) ^ (getDestination() == null)) {
            return false;
        }
        if (createExportTaskRequest.getDestination() != null && !createExportTaskRequest.getDestination().equals(getDestination())) {
            return false;
        }
        if ((createExportTaskRequest.getDestinationPrefix() == null) ^ (getDestinationPrefix() == null)) {
            return false;
        }
        return createExportTaskRequest.getDestinationPrefix() == null || createExportTaskRequest.getDestinationPrefix().equals(getDestinationPrefix());
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    public Long getFrom() {
        return this.from;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public Long getTo() {
        return this.to;
    }

    public int hashCode() {
        return (((((((((((((getTaskName() == null ? 0 : getTaskName().hashCode()) + 31) * 31) + (getLogGroupName() == null ? 0 : getLogGroupName().hashCode())) * 31) + (getLogStreamNamePrefix() == null ? 0 : getLogStreamNamePrefix().hashCode())) * 31) + (getFrom() == null ? 0 : getFrom().hashCode())) * 31) + (getTo() == null ? 0 : getTo().hashCode())) * 31) + (getDestination() == null ? 0 : getDestination().hashCode())) * 31) + (getDestinationPrefix() != null ? getDestinationPrefix().hashCode() : 0);
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setDestinationPrefix(String str) {
        this.destinationPrefix = str;
    }

    public void setFrom(Long l) {
        this.from = l;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setLogStreamNamePrefix(String str) {
        this.logStreamNamePrefix = str;
    }

    public void setTaskName(String str) {
        this.taskName = str;
    }

    public void setTo(Long l) {
        this.to = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskName() != null) {
            sb.append("taskName: " + getTaskName() + ",");
        }
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getLogStreamNamePrefix() != null) {
            sb.append("logStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
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
            sb.append("destinationPrefix: " + getDestinationPrefix());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateExportTaskRequest withDestination(String str) {
        this.destination = str;
        return this;
    }

    public CreateExportTaskRequest withDestinationPrefix(String str) {
        this.destinationPrefix = str;
        return this;
    }

    public CreateExportTaskRequest withFrom(Long l) {
        this.from = l;
        return this;
    }

    public CreateExportTaskRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public CreateExportTaskRequest withLogStreamNamePrefix(String str) {
        this.logStreamNamePrefix = str;
        return this;
    }

    public CreateExportTaskRequest withTaskName(String str) {
        this.taskName = str;
        return this;
    }

    public CreateExportTaskRequest withTo(Long l) {
        this.to = l;
        return this;
    }
}
