package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class KinesisAction implements Serializable {
    private String partitionKey;
    private String roleArn;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KinesisAction)) {
            return false;
        }
        KinesisAction kinesisAction = (KinesisAction) obj;
        if ((kinesisAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (kinesisAction.getRoleArn() != null && !kinesisAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((kinesisAction.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (kinesisAction.getStreamName() != null && !kinesisAction.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((kinesisAction.getPartitionKey() == null) ^ (getPartitionKey() == null)) {
            return false;
        }
        return kinesisAction.getPartitionKey() == null || kinesisAction.getPartitionKey().equals(getPartitionKey());
    }

    public String getPartitionKey() {
        return this.partitionKey;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getStreamName() == null ? 0 : getStreamName().hashCode())) * 31) + (getPartitionKey() != null ? getPartitionKey().hashCode() : 0);
    }

    public void setPartitionKey(String str) {
        this.partitionKey = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getStreamName() != null) {
            sb.append("streamName: " + getStreamName() + ",");
        }
        if (getPartitionKey() != null) {
            sb.append("partitionKey: " + getPartitionKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public KinesisAction withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }

    public KinesisAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public KinesisAction withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
