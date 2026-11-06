package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingRegistrationTaskReportsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;
    private String reportType;
    private String taskId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingRegistrationTaskReportsRequest)) {
            return false;
        }
        ListThingRegistrationTaskReportsRequest listThingRegistrationTaskReportsRequest = (ListThingRegistrationTaskReportsRequest) obj;
        if ((listThingRegistrationTaskReportsRequest.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (listThingRegistrationTaskReportsRequest.getTaskId() != null && !listThingRegistrationTaskReportsRequest.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((listThingRegistrationTaskReportsRequest.getReportType() == null) ^ (getReportType() == null)) {
            return false;
        }
        if (listThingRegistrationTaskReportsRequest.getReportType() != null && !listThingRegistrationTaskReportsRequest.getReportType().equals(getReportType())) {
            return false;
        }
        if ((listThingRegistrationTaskReportsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listThingRegistrationTaskReportsRequest.getNextToken() != null && !listThingRegistrationTaskReportsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listThingRegistrationTaskReportsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listThingRegistrationTaskReportsRequest.getMaxResults() == null || listThingRegistrationTaskReportsRequest.getMaxResults().equals(getMaxResults());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getReportType() {
        return this.reportType;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getReportType() == null ? 0 : getReportType().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType.toString();
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getReportType() != null) {
            sb.append("reportType: " + getReportType() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingRegistrationTaskReportsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListThingRegistrationTaskReportsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingRegistrationTaskReportsRequest withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    public ListThingRegistrationTaskReportsRequest withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public void setReportType(String str) {
        this.reportType = str;
    }

    public ListThingRegistrationTaskReportsRequest withReportType(String str) {
        this.reportType = str;
        return this;
    }
}
