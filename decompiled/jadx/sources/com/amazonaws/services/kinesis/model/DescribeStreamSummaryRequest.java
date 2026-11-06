package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamSummaryRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamSummaryRequest)) {
            return false;
        }
        DescribeStreamSummaryRequest describeStreamSummaryRequest = (DescribeStreamSummaryRequest) obj;
        if ((describeStreamSummaryRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        return describeStreamSummaryRequest.getStreamName() == null || describeStreamSummaryRequest.getStreamName().equals(getStreamName());
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return 31 + (getStreamName() == null ? 0 : getStreamName().hashCode());
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeStreamSummaryRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
