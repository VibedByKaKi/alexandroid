package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetLoggingOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    private LoggingOptionsPayload loggingOptionsPayload;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SetLoggingOptionsRequest)) {
            return false;
        }
        SetLoggingOptionsRequest setLoggingOptionsRequest = (SetLoggingOptionsRequest) obj;
        if ((setLoggingOptionsRequest.getLoggingOptionsPayload() == null) ^ (getLoggingOptionsPayload() == null)) {
            return false;
        }
        return setLoggingOptionsRequest.getLoggingOptionsPayload() == null || setLoggingOptionsRequest.getLoggingOptionsPayload().equals(getLoggingOptionsPayload());
    }

    public LoggingOptionsPayload getLoggingOptionsPayload() {
        return this.loggingOptionsPayload;
    }

    public int hashCode() {
        return 31 + (getLoggingOptionsPayload() == null ? 0 : getLoggingOptionsPayload().hashCode());
    }

    public void setLoggingOptionsPayload(LoggingOptionsPayload loggingOptionsPayload) {
        this.loggingOptionsPayload = loggingOptionsPayload;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLoggingOptionsPayload() != null) {
            sb.append("loggingOptionsPayload: " + getLoggingOptionsPayload());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SetLoggingOptionsRequest withLoggingOptionsPayload(LoggingOptionsPayload loggingOptionsPayload) {
        this.loggingOptionsPayload = loggingOptionsPayload;
        return this;
    }
}
