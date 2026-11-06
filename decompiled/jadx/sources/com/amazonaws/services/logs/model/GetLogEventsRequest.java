package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetLogEventsRequest extends AmazonWebServiceRequest implements Serializable {
    private Long endTime;
    private Integer limit;
    private String logGroupName;
    private String logStreamName;
    private String nextToken;
    private Boolean startFromHead;
    private Long startTime;

    public GetLogEventsRequest(String str, String str2) {
        setLogGroupName(str);
        setLogStreamName(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLogEventsRequest)) {
            return false;
        }
        GetLogEventsRequest getLogEventsRequest = (GetLogEventsRequest) obj;
        if ((getLogEventsRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (getLogEventsRequest.getLogGroupName() != null && !getLogEventsRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((getLogEventsRequest.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        if (getLogEventsRequest.getLogStreamName() != null && !getLogEventsRequest.getLogStreamName().equals(getLogStreamName())) {
            return false;
        }
        if ((getLogEventsRequest.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (getLogEventsRequest.getStartTime() != null && !getLogEventsRequest.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((getLogEventsRequest.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        if (getLogEventsRequest.getEndTime() != null && !getLogEventsRequest.getEndTime().equals(getEndTime())) {
            return false;
        }
        if ((getLogEventsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getLogEventsRequest.getNextToken() != null && !getLogEventsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getLogEventsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (getLogEventsRequest.getLimit() != null && !getLogEventsRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((getLogEventsRequest.getStartFromHead() == null) ^ (getStartFromHead() == null)) {
            return false;
        }
        return getLogEventsRequest.getStartFromHead() == null || getLogEventsRequest.getStartFromHead().equals(getStartFromHead());
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Boolean getStartFromHead() {
        return this.startFromHead;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((((((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getLogStreamName() == null ? 0 : getLogStreamName().hashCode())) * 31) + (getStartTime() == null ? 0 : getStartTime().hashCode())) * 31) + (getEndTime() == null ? 0 : getEndTime().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getStartFromHead() != null ? getStartFromHead().hashCode() : 0);
    }

    public Boolean isStartFromHead() {
        return this.startFromHead;
    }

    public void setEndTime(Long l) {
        this.endTime = l;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStartFromHead(Boolean bool) {
        this.startFromHead = bool;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName() + ",");
        }
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getLimit() != null) {
            sb.append("limit: " + getLimit() + ",");
        }
        if (getStartFromHead() != null) {
            sb.append("startFromHead: " + getStartFromHead());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetLogEventsRequest withEndTime(Long l) {
        this.endTime = l;
        return this;
    }

    public GetLogEventsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public GetLogEventsRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public GetLogEventsRequest withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public GetLogEventsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetLogEventsRequest withStartFromHead(Boolean bool) {
        this.startFromHead = bool;
        return this;
    }

    public GetLogEventsRequest withStartTime(Long l) {
        this.startTime = l;
        return this;
    }

    public GetLogEventsRequest() {
    }
}
