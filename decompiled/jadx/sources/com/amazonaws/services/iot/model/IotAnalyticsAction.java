package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class IotAnalyticsAction implements Serializable {
    private Boolean batchMode;
    private String channelArn;
    private String channelName;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IotAnalyticsAction)) {
            return false;
        }
        IotAnalyticsAction iotAnalyticsAction = (IotAnalyticsAction) obj;
        if ((iotAnalyticsAction.getChannelArn() == null) ^ (getChannelArn() == null)) {
            return false;
        }
        if (iotAnalyticsAction.getChannelArn() != null && !iotAnalyticsAction.getChannelArn().equals(getChannelArn())) {
            return false;
        }
        if ((iotAnalyticsAction.getChannelName() == null) ^ (getChannelName() == null)) {
            return false;
        }
        if (iotAnalyticsAction.getChannelName() != null && !iotAnalyticsAction.getChannelName().equals(getChannelName())) {
            return false;
        }
        if ((iotAnalyticsAction.getBatchMode() == null) ^ (getBatchMode() == null)) {
            return false;
        }
        if (iotAnalyticsAction.getBatchMode() != null && !iotAnalyticsAction.getBatchMode().equals(getBatchMode())) {
            return false;
        }
        if ((iotAnalyticsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return iotAnalyticsAction.getRoleArn() == null || iotAnalyticsAction.getRoleArn().equals(getRoleArn());
    }

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    public String getChannelArn() {
        return this.channelArn;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((getChannelArn() == null ? 0 : getChannelArn().hashCode()) + 31) * 31) + (getChannelName() == null ? 0 : getChannelName().hashCode())) * 31) + (getBatchMode() == null ? 0 : getBatchMode().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public Boolean isBatchMode() {
        return this.batchMode;
    }

    public void setBatchMode(Boolean bool) {
        this.batchMode = bool;
    }

    public void setChannelArn(String str) {
        this.channelArn = str;
    }

    public void setChannelName(String str) {
        this.channelName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getChannelArn() != null) {
            sb.append("channelArn: " + getChannelArn() + ",");
        }
        if (getChannelName() != null) {
            sb.append("channelName: " + getChannelName() + ",");
        }
        if (getBatchMode() != null) {
            sb.append("batchMode: " + getBatchMode() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public IotAnalyticsAction withBatchMode(Boolean bool) {
        this.batchMode = bool;
        return this;
    }

    public IotAnalyticsAction withChannelArn(String str) {
        this.channelArn = str;
        return this;
    }

    public IotAnalyticsAction withChannelName(String str) {
        this.channelName = str;
        return this;
    }

    public IotAnalyticsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
