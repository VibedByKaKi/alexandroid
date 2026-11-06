package com.amazonaws.services.iotdata.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PublishRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer payload;
    private Integer qos;
    private Boolean retain;
    private String topic;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PublishRequest)) {
            return false;
        }
        PublishRequest publishRequest = (PublishRequest) obj;
        if ((publishRequest.getTopic() == null) ^ (getTopic() == null)) {
            return false;
        }
        if (publishRequest.getTopic() != null && !publishRequest.getTopic().equals(getTopic())) {
            return false;
        }
        if ((publishRequest.getQos() == null) ^ (getQos() == null)) {
            return false;
        }
        if (publishRequest.getQos() != null && !publishRequest.getQos().equals(getQos())) {
            return false;
        }
        if ((publishRequest.getRetain() == null) ^ (getRetain() == null)) {
            return false;
        }
        if (publishRequest.getRetain() != null && !publishRequest.getRetain().equals(getRetain())) {
            return false;
        }
        if ((publishRequest.getPayload() == null) ^ (getPayload() == null)) {
            return false;
        }
        return publishRequest.getPayload() == null || publishRequest.getPayload().equals(getPayload());
    }

    public ByteBuffer getPayload() {
        return this.payload;
    }

    public Integer getQos() {
        return this.qos;
    }

    public Boolean getRetain() {
        return this.retain;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((((getTopic() == null ? 0 : getTopic().hashCode()) + 31) * 31) + (getQos() == null ? 0 : getQos().hashCode())) * 31) + (getRetain() == null ? 0 : getRetain().hashCode())) * 31) + (getPayload() != null ? getPayload().hashCode() : 0);
    }

    public Boolean isRetain() {
        return this.retain;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
    }

    public void setQos(Integer num) {
        this.qos = num;
    }

    public void setRetain(Boolean bool) {
        this.retain = bool;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTopic() != null) {
            sb.append("topic: " + getTopic() + ",");
        }
        if (getQos() != null) {
            sb.append("qos: " + getQos() + ",");
        }
        if (getRetain() != null) {
            sb.append("retain: " + getRetain() + ",");
        }
        if (getPayload() != null) {
            sb.append("payload: " + getPayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PublishRequest withPayload(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
        return this;
    }

    public PublishRequest withQos(Integer num) {
        this.qos = num;
        return this;
    }

    public PublishRequest withRetain(Boolean bool) {
        this.retain = bool;
        return this;
    }

    public PublishRequest withTopic(String str) {
        this.topic = str;
        return this;
    }
}
