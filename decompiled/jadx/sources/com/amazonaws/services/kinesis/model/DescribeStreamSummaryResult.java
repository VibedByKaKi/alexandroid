package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamSummaryResult implements Serializable {
    private StreamDescriptionSummary streamDescriptionSummary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamSummaryResult)) {
            return false;
        }
        DescribeStreamSummaryResult describeStreamSummaryResult = (DescribeStreamSummaryResult) obj;
        if ((describeStreamSummaryResult.getStreamDescriptionSummary() == null) ^ (getStreamDescriptionSummary() == null)) {
            return false;
        }
        return describeStreamSummaryResult.getStreamDescriptionSummary() == null || describeStreamSummaryResult.getStreamDescriptionSummary().equals(getStreamDescriptionSummary());
    }

    public StreamDescriptionSummary getStreamDescriptionSummary() {
        return this.streamDescriptionSummary;
    }

    public int hashCode() {
        return 31 + (getStreamDescriptionSummary() == null ? 0 : getStreamDescriptionSummary().hashCode());
    }

    public void setStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary) {
        this.streamDescriptionSummary = streamDescriptionSummary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamDescriptionSummary() != null) {
            sb.append("StreamDescriptionSummary: " + getStreamDescriptionSummary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeStreamSummaryResult withStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary) {
        this.streamDescriptionSummary = streamDescriptionSummary;
        return this;
    }
}
