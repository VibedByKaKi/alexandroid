package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRetainedMessageResult implements Serializable {
    private Long lastModifiedTime;
    private ByteBuffer payload;
    private Integer qos;
    private String topic;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRetainedMessageResult)) {
            return false;
        }
        GetRetainedMessageResult getRetainedMessageResult = (GetRetainedMessageResult) obj;
        if ((getRetainedMessageResult.getTopic() == null) ^ (getTopic() == null)) {
            return false;
        }
        if (getRetainedMessageResult.getTopic() != null && !getRetainedMessageResult.getTopic().equals(getTopic())) {
            return false;
        }
        if ((getRetainedMessageResult.getPayload() == null) ^ (getPayload() == null)) {
            return false;
        }
        if (getRetainedMessageResult.getPayload() != null && !getRetainedMessageResult.getPayload().equals(getPayload())) {
            return false;
        }
        if ((getRetainedMessageResult.getQos() == null) ^ (getQos() == null)) {
            return false;
        }
        if (getRetainedMessageResult.getQos() != null && !getRetainedMessageResult.getQos().equals(getQos())) {
            return false;
        }
        if ((getRetainedMessageResult.getLastModifiedTime() == null) ^ (getLastModifiedTime() == null)) {
            return false;
        }
        return getRetainedMessageResult.getLastModifiedTime() == null || getRetainedMessageResult.getLastModifiedTime().equals(getLastModifiedTime());
    }

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ByteBuffer getPayload() {
        return this.payload;
    }

    public Integer getQos() {
        return this.qos;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((((getTopic() == null ? 0 : getTopic().hashCode()) + 31) * 31) + (getPayload() == null ? 0 : getPayload().hashCode())) * 31) + (getQos() == null ? 0 : getQos().hashCode())) * 31) + (getLastModifiedTime() != null ? getLastModifiedTime().hashCode() : 0);
    }

    public void setLastModifiedTime(Long l) {
        this.lastModifiedTime = l;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
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
        if (getPayload() != null) {
            sb.append("payload: " + getPayload() + ",");
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

    public GetRetainedMessageResult withLastModifiedTime(Long l) {
        this.lastModifiedTime = l;
        return this;
    }

    public GetRetainedMessageResult withPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
        return this;
    }

    public GetRetainedMessageResult withQos(Integer num) {
        this.qos = num;
        return this;
    }

    public GetRetainedMessageResult withTopic(String str) {
        this.topic = str;
        return this;
    }
}
