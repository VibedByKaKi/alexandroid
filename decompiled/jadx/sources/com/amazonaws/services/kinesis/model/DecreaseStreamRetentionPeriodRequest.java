package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DecreaseStreamRetentionPeriodRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer retentionPeriodHours;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecreaseStreamRetentionPeriodRequest)) {
            return false;
        }
        DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest = (DecreaseStreamRetentionPeriodRequest) obj;
        if ((decreaseStreamRetentionPeriodRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (decreaseStreamRetentionPeriodRequest.getStreamName() != null && !decreaseStreamRetentionPeriodRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null) ^ (getRetentionPeriodHours() == null)) {
            return false;
        }
        return decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null || decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours().equals(getRetentionPeriodHours());
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

    public DecreaseStreamRetentionPeriodRequest withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public DecreaseStreamRetentionPeriodRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
