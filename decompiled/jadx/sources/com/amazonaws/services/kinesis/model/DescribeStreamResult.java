package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamResult implements Serializable {
    private StreamDescription streamDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamResult)) {
            return false;
        }
        DescribeStreamResult describeStreamResult = (DescribeStreamResult) obj;
        if ((describeStreamResult.getStreamDescription() == null) ^ (getStreamDescription() == null)) {
            return false;
        }
        return describeStreamResult.getStreamDescription() == null || describeStreamResult.getStreamDescription().equals(getStreamDescription());
    }

    public StreamDescription getStreamDescription() {
        return this.streamDescription;
    }

    public int hashCode() {
        return 31 + (getStreamDescription() == null ? 0 : getStreamDescription().hashCode());
    }

    public void setStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamDescription() != null) {
            sb.append("StreamDescription: " + getStreamDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeStreamResult withStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
        return this;
    }
}
