package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateShardCountResult implements Serializable {
    private Integer currentShardCount;
    private String streamName;
    private Integer targetShardCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateShardCountResult)) {
            return false;
        }
        UpdateShardCountResult updateShardCountResult = (UpdateShardCountResult) obj;
        if ((updateShardCountResult.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (updateShardCountResult.getStreamName() != null && !updateShardCountResult.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((updateShardCountResult.getCurrentShardCount() == null) ^ (getCurrentShardCount() == null)) {
            return false;
        }
        if (updateShardCountResult.getCurrentShardCount() != null && !updateShardCountResult.getCurrentShardCount().equals(getCurrentShardCount())) {
            return false;
        }
        if ((updateShardCountResult.getTargetShardCount() == null) ^ (getTargetShardCount() == null)) {
            return false;
        }
        return updateShardCountResult.getTargetShardCount() == null || updateShardCountResult.getTargetShardCount().equals(getTargetShardCount());
    }

    public Integer getCurrentShardCount() {
        return this.currentShardCount;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Integer getTargetShardCount() {
        return this.targetShardCount;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getCurrentShardCount() == null ? 0 : getCurrentShardCount().hashCode())) * 31) + (getTargetShardCount() != null ? getTargetShardCount().hashCode() : 0);
    }

    public void setCurrentShardCount(Integer num) {
        this.currentShardCount = num;
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
        if (getCurrentShardCount() != null) {
            sb.append("CurrentShardCount: " + getCurrentShardCount() + ",");
        }
        if (getTargetShardCount() != null) {
            sb.append("TargetShardCount: " + getTargetShardCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateShardCountResult withCurrentShardCount(Integer num) {
        this.currentShardCount = num;
        return this;
    }

    public UpdateShardCountResult withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public UpdateShardCountResult withTargetShardCount(Integer num) {
        this.targetShardCount = num;
        return this;
    }
}
