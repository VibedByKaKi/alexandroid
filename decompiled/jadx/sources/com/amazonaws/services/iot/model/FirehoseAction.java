package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FirehoseAction implements Serializable {
    private Boolean batchMode;
    private String deliveryStreamName;
    private String roleArn;
    private String separator;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FirehoseAction)) {
            return false;
        }
        FirehoseAction firehoseAction = (FirehoseAction) obj;
        if ((firehoseAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (firehoseAction.getRoleArn() != null && !firehoseAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((firehoseAction.getDeliveryStreamName() == null) ^ (getDeliveryStreamName() == null)) {
            return false;
        }
        if (firehoseAction.getDeliveryStreamName() != null && !firehoseAction.getDeliveryStreamName().equals(getDeliveryStreamName())) {
            return false;
        }
        if ((firehoseAction.getSeparator() == null) ^ (getSeparator() == null)) {
            return false;
        }
        if (firehoseAction.getSeparator() != null && !firehoseAction.getSeparator().equals(getSeparator())) {
            return false;
        }
        if ((firehoseAction.getBatchMode() == null) ^ (getBatchMode() == null)) {
            return false;
        }
        return firehoseAction.getBatchMode() == null || firehoseAction.getBatchMode().equals(getBatchMode());
    }

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getSeparator() {
        return this.separator;
    }

    public int hashCode() {
        return (((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getDeliveryStreamName() == null ? 0 : getDeliveryStreamName().hashCode())) * 31) + (getSeparator() == null ? 0 : getSeparator().hashCode())) * 31) + (getBatchMode() != null ? getBatchMode().hashCode() : 0);
    }

    public Boolean isBatchMode() {
        return this.batchMode;
    }

    public void setBatchMode(Boolean bool) {
        this.batchMode = bool;
    }

    public void setDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setSeparator(String str) {
        this.separator = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getDeliveryStreamName() != null) {
            sb.append("deliveryStreamName: " + getDeliveryStreamName() + ",");
        }
        if (getSeparator() != null) {
            sb.append("separator: " + getSeparator() + ",");
        }
        if (getBatchMode() != null) {
            sb.append("batchMode: " + getBatchMode());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public FirehoseAction withBatchMode(Boolean bool) {
        this.batchMode = bool;
        return this;
    }

    public FirehoseAction withDeliveryStreamName(String str) {
        this.deliveryStreamName = str;
        return this;
    }

    public FirehoseAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public FirehoseAction withSeparator(String str) {
        this.separator = str;
        return this;
    }
}
