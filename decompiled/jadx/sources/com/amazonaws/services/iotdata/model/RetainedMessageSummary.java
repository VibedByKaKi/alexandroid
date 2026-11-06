package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RetainedMessageSummary implements Serializable {
    private Long lastModifiedTime;
    private Long payloadSize;
    private Integer qos;
    private String topic;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RetainedMessageSummary)) {
            return false;
        }
        RetainedMessageSummary retainedMessageSummary = (RetainedMessageSummary) obj;
        if ((retainedMessageSummary.getTopic() == null) ^ (getTopic() == null)) {
            return false;
        }
        if (retainedMessageSummary.getTopic() != null && !retainedMessageSummary.getTopic().equals(getTopic())) {
            return false;
        }
        if ((retainedMessageSummary.getPayloadSize() == null) ^ (getPayloadSize() == null)) {
            return false;
        }
        if (retainedMessageSummary.getPayloadSize() != null && !retainedMessageSummary.getPayloadSize().equals(getPayloadSize())) {
            return false;
        }
        if ((retainedMessageSummary.getQos() == null) ^ (getQos() == null)) {
            return false;
        }
        if (retainedMessageSummary.getQos() != null && !retainedMessageSummary.getQos().equals(getQos())) {
            return false;
        }
        if ((retainedMessageSummary.getLastModifiedTime() == null) ^ (getLastModifiedTime() == null)) {
            return false;
        }
        return retainedMessageSummary.getLastModifiedTime() == null || retainedMessageSummary.getLastModifiedTime().equals(getLastModifiedTime());
    }

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Long getPayloadSize() {
        return this.payloadSize;
    }

    public Integer getQos() {
        return this.qos;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((((getTopic() == null ? 0 : getTopic().hashCode()) + 31) * 31) + (getPayloadSize() == null ? 0 : getPayloadSize().hashCode())) * 31) + (getQos() == null ? 0 : getQos().hashCode())) * 31) + (getLastModifiedTime() != null ? getLastModifiedTime().hashCode() : 0);
    }

    public void setLastModifiedTime(Long l) {
        this.lastModifiedTime = l;
    }

    public void setPayloadSize(Long l) {
        this.payloadSize = l;
    }

    public void setQos(Integer num) {
        this.qos = num;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTopic() != null) {
            sb.append("topic: " + getTopic() + ",");
        }
        if (getPayloadSize() != null) {
            sb.append("payloadSize: " + getPayloadSize() + ",");
        }
        if (getQos() != null) {
            sb.append("qos: " + getQos() + ",");
        }
        if (getLastModifiedTime() != null) {
            sb.append("lastModifiedTime: " + getLastModifiedTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RetainedMessageSummary withLastModifiedTime(Long l) {
        this.lastModifiedTime = l;
        return this;
    }

    public RetainedMessageSummary withPayloadSize(Long l) {
        this.payloadSize = l;
        return this;
    }

    public RetainedMessageSummary withQos(Integer num) {
        this.qos = num;
        return this;
    }

    public RetainedMessageSummary withTopic(String str) {
        this.topic = str;
        return this;
    }
}
