package com.amazonaws.services.iotdata.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRetainedMessageRequest extends AmazonWebServiceRequest implements Serializable {
    private String topic;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRetainedMessageRequest)) {
            return false;
        }
        GetRetainedMessageRequest getRetainedMessageRequest = (GetRetainedMessageRequest) obj;
        if ((getRetainedMessageRequest.getTopic() == null) ^ (getTopic() == null)) {
            return false;
        }
        return getRetainedMessageRequest.getTopic() == null || getRetainedMessageRequest.getTopic().equals(getTopic());
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return 31 + (getTopic() == null ? 0 : getTopic().hashCode());
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTopic() != null) {
            sb.append("topic: " + getTopic());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetRetainedMessageRequest withTopic(String str) {
        this.topic = str;
        return this;
    }
}
