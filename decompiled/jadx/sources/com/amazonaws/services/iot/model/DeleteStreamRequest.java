package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteStreamRequest)) {
            return false;
        }
        DeleteStreamRequest deleteStreamRequest = (DeleteStreamRequest) obj;
        if ((deleteStreamRequest.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        return deleteStreamRequest.getStreamId() == null || deleteStreamRequest.getStreamId().equals(getStreamId());
    }

    public String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        return 31 + (getStreamId() == null ? 0 : getStreamId().hashCode());
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamId() != null) {
            sb.append("streamId: " + getStreamId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteStreamRequest withStreamId(String str) {
        this.streamId = str;
        return this;
    }
}
