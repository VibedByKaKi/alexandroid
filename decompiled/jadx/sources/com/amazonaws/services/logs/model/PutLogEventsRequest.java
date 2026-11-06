package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutLogEventsRequest extends AmazonWebServiceRequest implements Serializable {
    private List<InputLogEvent> logEvents;
    private String logGroupName;
    private String logStreamName;
    private String sequenceToken;

    public PutLogEventsRequest(String str, String str2, List<InputLogEvent> list) {
        setLogGroupName(str);
        setLogStreamName(str2);
        setLogEvents(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutLogEventsRequest)) {
            return false;
        }
        PutLogEventsRequest putLogEventsRequest = (PutLogEventsRequest) obj;
        if ((putLogEventsRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (putLogEventsRequest.getLogGroupName() != null && !putLogEventsRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((putLogEventsRequest.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        if (putLogEventsRequest.getLogStreamName() != null && !putLogEventsRequest.getLogStreamName().equals(getLogStreamName())) {
            return false;
        }
        if ((putLogEventsRequest.getLogEvents() == null) ^ (getLogEvents() == null)) {
            return false;
        }
        if (putLogEventsRequest.getLogEvents() != null && !putLogEventsRequest.getLogEvents().equals(getLogEvents())) {
            return false;
        }
        if ((putLogEventsRequest.getSequenceToken() == null) ^ (getSequenceToken() == null)) {
            return false;
        }
        return putLogEventsRequest.getSequenceToken() == null || putLogEventsRequest.getSequenceToken().equals(getSequenceToken());
    }

    public List<InputLogEvent> getLogEvents() {
        return this.logEvents;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public String getSequenceToken() {
        return this.sequenceToken;
    }

    public int hashCode() {
        return (((((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getLogStreamName() == null ? 0 : getLogStreamName().hashCode())) * 31) + (getLogEvents() == null ? 0 : getLogEvents().hashCode())) * 31) + (getSequenceToken() != null ? getSequenceToken().hashCode() : 0);
    }

    public void setLogEvents(Collection<InputLogEvent> collection) {
        if (collection == null) {
            this.logEvents = null;
        } else {
            this.logEvents = new ArrayList(collection);
        }
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public void setSequenceToken(String str) {
        this.sequenceToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName() + ",");
        }
        if (getLogEvents() != null) {
            sb.append("logEvents: " + getLogEvents() + ",");
        }
        if (getSequenceToken() != null) {
            sb.append("sequenceToken: " + getSequenceToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutLogEventsRequest withLogEvents(InputLogEvent... inputLogEventArr) {
        if (getLogEvents() == null) {
            this.logEvents = new ArrayList(inputLogEventArr.length);
        }
        for (InputLogEvent inputLogEvent : inputLogEventArr) {
            this.logEvents.add(inputLogEvent);
        }
        return this;
    }

    public PutLogEventsRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public PutLogEventsRequest withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public PutLogEventsRequest withSequenceToken(String str) {
        this.sequenceToken = str;
        return this;
    }

    public PutLogEventsRequest() {
    }

    public PutLogEventsRequest withLogEvents(Collection<InputLogEvent> collection) {
        setLogEvents(collection);
        return this;
    }
}
