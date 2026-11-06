package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteLogStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String logGroupName;
    private String logStreamName;

    public DeleteLogStreamRequest(String str, String str2) {
        setLogGroupName(str);
        setLogStreamName(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteLogStreamRequest)) {
            return false;
        }
        DeleteLogStreamRequest deleteLogStreamRequest = (DeleteLogStreamRequest) obj;
        if ((deleteLogStreamRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (deleteLogStreamRequest.getLogGroupName() != null && !deleteLogStreamRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((deleteLogStreamRequest.getLogStreamName() == null) ^ (getLogStreamName() == null)) {
            return false;
        }
        return deleteLogStreamRequest.getLogStreamName() == null || deleteLogStreamRequest.getLogStreamName().equals(getLogStreamName());
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public String getLogStreamName() {
        return this.logStreamName;
    }

    public int hashCode() {
        return (((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getLogStreamName() != null ? getLogStreamName().hashCode() : 0);
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setLogStreamName(String str) {
        this.logStreamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getLogStreamName() != null) {
            sb.append("logStreamName: " + getLogStreamName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteLogStreamRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public DeleteLogStreamRequest withLogStreamName(String str) {
        this.logStreamName = str;
        return this;
    }

    public DeleteLogStreamRequest() {
    }
}
