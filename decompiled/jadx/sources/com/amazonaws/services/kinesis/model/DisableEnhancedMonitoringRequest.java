package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DisableEnhancedMonitoringRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> shardLevelMetrics = new ArrayList();
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisableEnhancedMonitoringRequest)) {
            return false;
        }
        DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest = (DisableEnhancedMonitoringRequest) obj;
        if ((disableEnhancedMonitoringRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (disableEnhancedMonitoringRequest.getStreamName() != null && !disableEnhancedMonitoringRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((disableEnhancedMonitoringRequest.getShardLevelMetrics() == null) ^ (getShardLevelMetrics() == null)) {
            return false;
        }
        return disableEnhancedMonitoringRequest.getShardLevelMetrics() == null || disableEnhancedMonitoringRequest.getShardLevelMetrics().equals(getShardLevelMetrics());
    }

    public List<String> getShardLevelMetrics() {
        return this.shardLevelMetrics;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getShardLevelMetrics() != null ? getShardLevelMetrics().hashCode() : 0);
    }

    public void setShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.shardLevelMetrics = null;
        } else {
            this.shardLevelMetrics = new ArrayList(collection);
        }
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getShardLevelMetrics() != null) {
            sb.append("ShardLevelMetrics: " + getShardLevelMetrics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DisableEnhancedMonitoringRequest withShardLevelMetrics(String... strArr) {
        if (getShardLevelMetrics() == null) {
            this.shardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.shardLevelMetrics.add(str);
        }
        return this;
    }

    public DisableEnhancedMonitoringRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public DisableEnhancedMonitoringRequest withShardLevelMetrics(Collection<String> collection) {
        setShardLevelMetrics(collection);
        return this;
    }
}
