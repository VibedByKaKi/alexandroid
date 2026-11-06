package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDetectMitigationActionsExecutionsRequest extends AmazonWebServiceRequest implements Serializable {
    private Date endTime;
    private Integer maxResults;
    private String nextToken;
    private Date startTime;
    private String taskId;
    private String thingName;
    private String violationId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDetectMitigationActionsExecutionsRequest)) {
            return false;
        }
        ListDetectMitigationActionsExecutionsRequest listDetectMitigationActionsExecutionsRequest = (ListDetectMitigationActionsExecutionsRequest) obj;
        if ((listDetectMitigationActionsExecutionsRequest.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getTaskId() != null && !listDetectMitigationActionsExecutionsRequest.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getViolationId() == null) ^ (getViolationId() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getViolationId() != null && !listDetectMitigationActionsExecutionsRequest.getViolationId().equals(getViolationId())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getThingName() != null && !listDetectMitigationActionsExecutionsRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getStartTime() != null && !listDetectMitigationActionsExecutionsRequest.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getEndTime() != null && !listDetectMitigationActionsExecutionsRequest.getEndTime().equals(getEndTime())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listDetectMitigationActionsExecutionsRequest.getMaxResults() != null && !listDetectMitigationActionsExecutionsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listDetectMitigationActionsExecutionsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listDetectMitigationActionsExecutionsRequest.getNextToken() == null || listDetectMitigationActionsExecutionsRequest.getNextToken().equals(getNextToken());
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Date getStartTime() {
        return this.startTime;
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
        return (((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getViolationId() == null ? 0 : getViolationId().hashCode())) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getStartTime() == null ? 0 : getStartTime().hashCode())) * 31) + (getEndTime() == null ? 0 : getEndTime().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setEndTime(Date date) {
        this.endTime = date;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStartTime(Date date) {
        this.startTime = date;
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
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListDetectMitigationActionsExecutionsRequest withEndTime(Date date) {
        this.endTime = date;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withStartTime(Date date) {
        this.startTime = date;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }

    public ListDetectMitigationActionsExecutionsRequest withViolationId(String str) {
        this.violationId = str;
        return this;
    }
}
