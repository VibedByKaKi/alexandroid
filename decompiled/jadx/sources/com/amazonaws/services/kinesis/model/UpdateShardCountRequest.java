package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateShardCountRequest extends AmazonWebServiceRequest implements Serializable {
    private String scalingType;
    private String streamName;
    private Integer targetShardCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateShardCountRequest)) {
            return false;
        }
        UpdateShardCountRequest updateShardCountRequest = (UpdateShardCountRequest) obj;
        if ((updateShardCountRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (updateShardCountRequest.getStreamName() != null && !updateShardCountRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((updateShardCountRequest.getTargetShardCount() == null) ^ (getTargetShardCount() == null)) {
            return false;
        }
        if (updateShardCountRequest.getTargetShardCount() != null && !updateShardCountRequest.getTargetShardCount().equals(getTargetShardCount())) {
            return false;
        }
        if ((updateShardCountRequest.getScalingType() == null) ^ (getScalingType() == null)) {
            return false;
        }
        return updateShardCountRequest.getScalingType() == null || updateShardCountRequest.getScalingType().equals(getScalingType());
    }

    public String getScalingType() {
        return this.scalingType;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Integer getTargetShardCount() {
        return this.targetShardCount;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getTargetShardCount() == null ? 0 : getTargetShardCount().hashCode())) * 31) + (getScalingType() != null ? getScalingType().hashCode() : 0);
    }

    public void setScalingType(ScalingType scalingType) {
        this.scalingType = scalingType.toString();
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTargetShardCount(Integer num) {
        this.targetShardCount = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getTargetShardCount() != null) {
            sb.append("TargetShardCount: " + getTargetShardCount() + ",");
        }
        if (getScalingType() != null) {
            sb.append("ScalingType: " + getScalingType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateShardCountRequest withScalingType(ScalingType scalingType) {
        this.scalingType = scalingType.toString();
        return this;
    }

    public UpdateShardCountRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public UpdateShardCountRequest withTargetShardCount(Integer num) {
        this.targetShardCount = num;
        return this;
    }

    public void setScalingType(String str) {
        this.scalingType = str;
    }

    public UpdateShardCountRequest withScalingType(String str) {
        this.scalingType = str;
        return this;
    }
}
