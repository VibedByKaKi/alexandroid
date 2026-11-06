package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDetectMitigationActionsTasksRequest extends AmazonWebServiceRequest implements Serializable {
    private Date endTime;
    private Integer maxResults;
    private String nextToken;
    private Date startTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDetectMitigationActionsTasksRequest)) {
            return false;
        }
        ListDetectMitigationActionsTasksRequest listDetectMitigationActionsTasksRequest = (ListDetectMitigationActionsTasksRequest) obj;
        if ((listDetectMitigationActionsTasksRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listDetectMitigationActionsTasksRequest.getMaxResults() != null && !listDetectMitigationActionsTasksRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listDetectMitigationActionsTasksRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listDetectMitigationActionsTasksRequest.getNextToken() != null && !listDetectMitigationActionsTasksRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listDetectMitigationActionsTasksRequest.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (listDetectMitigationActionsTasksRequest.getStartTime() != null && !listDetectMitigationActionsTasksRequest.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((listDetectMitigationActionsTasksRequest.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        return listDetectMitigationActionsTasksRequest.getEndTime() == null || listDetectMitigationActionsTasksRequest.getEndTime().equals(getEndTime());
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

    public int hashCode() {
        return (((((((getMaxResults() == null ? 0 : getMaxResults().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getStartTime() == null ? 0 : getStartTime().hashCode())) * 31) + (getEndTime() != null ? getEndTime().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListDetectMitigationActionsTasksRequest withEndTime(Date date) {
        this.endTime = date;
        return this;
    }

    public ListDetectMitigationActionsTasksRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListDetectMitigationActionsTasksRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDetectMitigationActionsTasksRequest withStartTime(Date date) {
        this.startTime = date;
        return this;
    }
}
