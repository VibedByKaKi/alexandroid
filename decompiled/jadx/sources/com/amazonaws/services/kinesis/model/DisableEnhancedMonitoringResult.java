package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DisableEnhancedMonitoringResult implements Serializable {
    private List<String> currentShardLevelMetrics = new ArrayList();
    private List<String> desiredShardLevelMetrics = new ArrayList();
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisableEnhancedMonitoringResult)) {
            return false;
        }
        DisableEnhancedMonitoringResult disableEnhancedMonitoringResult = (DisableEnhancedMonitoringResult) obj;
        if ((disableEnhancedMonitoringResult.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (disableEnhancedMonitoringResult.getStreamName() != null && !disableEnhancedMonitoringResult.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((disableEnhancedMonitoringResult.getCurrentShardLevelMetrics() == null) ^ (getCurrentShardLevelMetrics() == null)) {
            return false;
        }
        if (disableEnhancedMonitoringResult.getCurrentShardLevelMetrics() != null && !disableEnhancedMonitoringResult.getCurrentShardLevelMetrics().equals(getCurrentShardLevelMetrics())) {
            return false;
        }
        if ((disableEnhancedMonitoringResult.getDesiredShardLevelMetrics() == null) ^ (getDesiredShardLevelMetrics() == null)) {
            return false;
        }
        return disableEnhancedMonitoringResult.getDesiredShardLevelMetrics() == null || disableEnhancedMonitoringResult.getDesiredShardLevelMetrics().equals(getDesiredShardLevelMetrics());
    }

    public List<String> getCurrentShardLevelMetrics() {
        return this.currentShardLevelMetrics;
    }

    public List<String> getDesiredShardLevelMetrics() {
        return this.desiredShardLevelMetrics;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getCurrentShardLevelMetrics() == null ? 0 : getCurrentShardLevelMetrics().hashCode())) * 31) + (getDesiredShardLevelMetrics() != null ? getDesiredShardLevelMetrics().hashCode() : 0);
    }

    public void setCurrentShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.currentShardLevelMetrics = null;
        } else {
            this.currentShardLevelMetrics = new ArrayList(collection);
        }
    }

    public void setDesiredShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.desiredShardLevelMetrics = null;
        } else {
            this.desiredShardLevelMetrics = new ArrayList(collection);
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
        if (getCurrentShardLevelMetrics() != null) {
            sb.append("CurrentShardLevelMetrics: " + getCurrentShardLevelMetrics() + ",");
        }
        if (getDesiredShardLevelMetrics() != null) {
            sb.append("DesiredShardLevelMetrics: " + getDesiredShardLevelMetrics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DisableEnhancedMonitoringResult withCurrentShardLevelMetrics(String... strArr) {
        if (getCurrentShardLevelMetrics() == null) {
            this.currentShardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.currentShardLevelMetrics.add(str);
        }
        return this;
    }

    public DisableEnhancedMonitoringResult withDesiredShardLevelMetrics(String... strArr) {
        if (getDesiredShardLevelMetrics() == null) {
            this.desiredShardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.desiredShardLevelMetrics.add(str);
        }
        return this;
    }

    public DisableEnhancedMonitoringResult withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public DisableEnhancedMonitoringResult withCurrentShardLevelMetrics(Collection<String> collection) {
        setCurrentShardLevelMetrics(collection);
        return this;
    }

    public DisableEnhancedMonitoringResult withDesiredShardLevelMetrics(Collection<String> collection) {
        setDesiredShardLevelMetrics(collection);
        return this;
    }
}
