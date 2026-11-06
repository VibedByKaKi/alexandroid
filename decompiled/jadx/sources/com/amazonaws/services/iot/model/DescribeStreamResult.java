package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeStreamResult implements Serializable {
    private StreamInfo streamInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamResult)) {
            return false;
        }
        DescribeStreamResult describeStreamResult = (DescribeStreamResult) obj;
        if ((describeStreamResult.getStreamInfo() == null) ^ (getStreamInfo() == null)) {
            return false;
        }
        return describeStreamResult.getStreamInfo() == null || describeStreamResult.getStreamInfo().equals(getStreamInfo());
    }

    public StreamInfo getStreamInfo() {
        return this.streamInfo;
    }

    public int hashCode() {
        return 31 + (getStreamInfo() == null ? 0 : getStreamInfo().hashCode());
    }

    public void setStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamInfo() != null) {
            sb.append("streamInfo: " + getStreamInfo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeStreamResult withStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
        return this;
    }
}
