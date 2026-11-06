package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class IncreaseStreamRetentionPeriodRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer retentionPeriodHours;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IncreaseStreamRetentionPeriodRequest)) {
            return false;
        }
        IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest = (IncreaseStreamRetentionPeriodRequest) obj;
        if ((increaseStreamRetentionPeriodRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (increaseStreamRetentionPeriodRequest.getStreamName() != null && !increaseStreamRetentionPeriodRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((increaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null) ^ (getRetentionPeriodHours() == null)) {
            return false;
        }
        return increaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null || increaseStreamRetentionPeriodRequest.getRetentionPeriodHours().equals(getRetentionPeriodHours());
    }

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getRetentionPeriodHours() != null ? getRetentionPeriodHours().hashCode() : 0);
    }

    public void setRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getRetentionPeriodHours() != null) {
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public IncreaseStreamRetentionPeriodRequest withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public IncreaseStreamRetentionPeriodRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
