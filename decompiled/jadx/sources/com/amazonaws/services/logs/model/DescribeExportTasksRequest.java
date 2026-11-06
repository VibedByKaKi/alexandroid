package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeExportTasksRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer limit;
    private String nextToken;
    private String statusCode;
    private String taskId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeExportTasksRequest)) {
            return false;
        }
        DescribeExportTasksRequest describeExportTasksRequest = (DescribeExportTasksRequest) obj;
        if ((describeExportTasksRequest.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (describeExportTasksRequest.getTaskId() != null && !describeExportTasksRequest.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((describeExportTasksRequest.getStatusCode() == null) ^ (getStatusCode() == null)) {
            return false;
        }
        if (describeExportTasksRequest.getStatusCode() != null && !describeExportTasksRequest.getStatusCode().equals(getStatusCode())) {
            return false;
        }
        if ((describeExportTasksRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (describeExportTasksRequest.getNextToken() != null && !describeExportTasksRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((describeExportTasksRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return describeExportTasksRequest.getLimit() == null || describeExportTasksRequest.getLimit().equals(getLimit());
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getStatusCode() == null ? 0 : getStatusCode().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStatusCode(ExportTaskStatusCode exportTaskStatusCode) {
        this.statusCode = exportTaskStatusCode.toString();
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getStatusCode() != null) {
            sb.append("statusCode: " + getStatusCode() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getLimit() != null) {
            sb.append("limit: " + getLimit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeExportTasksRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeExportTasksRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeExportTasksRequest withStatusCode(ExportTaskStatusCode exportTaskStatusCode) {
        this.statusCode = exportTaskStatusCode.toString();
        return this;
    }

    public DescribeExportTasksRequest withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public DescribeExportTasksRequest withStatusCode(String str) {
        this.statusCode = str;
        return this;
    }
}
