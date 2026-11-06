package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StreamSummary implements Serializable {
    private String description;
    private String streamArn;
    private String streamId;
    private Integer streamVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamSummary)) {
            return false;
        }
        StreamSummary streamSummary = (StreamSummary) obj;
        if ((streamSummary.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        if (streamSummary.getStreamId() != null && !streamSummary.getStreamId().equals(getStreamId())) {
            return false;
        }
        if ((streamSummary.getStreamArn() == null) ^ (getStreamArn() == null)) {
            return false;
        }
        if (streamSummary.getStreamArn() != null && !streamSummary.getStreamArn().equals(getStreamArn())) {
            return false;
        }
        if ((streamSummary.getStreamVersion() == null) ^ (getStreamVersion() == null)) {
            return false;
        }
        if (streamSummary.getStreamVersion() != null && !streamSummary.getStreamVersion().equals(getStreamVersion())) {
            return false;
        }
        if ((streamSummary.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        return streamSummary.getDescription() == null || streamSummary.getDescription().equals(getDescription());
    }

    public String getDescription() {
        return this.description;
    }

    public String getStreamArn() {
        return this.streamArn;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public Integer getStreamVersion() {
        return this.streamVersion;
    }

    public int hashCode() {
        return (((((((getStreamId() == null ? 0 : getStreamId().hashCode()) + 31) * 31) + (getStreamArn() == null ? 0 : getStreamArn().hashCode())) * 31) + (getStreamVersion() == null ? 0 : getStreamVersion().hashCode())) * 31) + (getDescription() != null ? getDescription().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStreamArn(String str) {
        this.streamArn = str;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public void setStreamVersion(Integer num) {
        this.streamVersion = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamId() != null) {
            sb.append("streamId: " + getStreamId() + ",");
        }
        if (getStreamArn() != null) {
            sb.append("streamArn: " + getStreamArn() + ",");
        }
        if (getStreamVersion() != null) {
            sb.append("streamVersion: " + getStreamVersion() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StreamSummary withDescription(String str) {
        this.description = str;
        return this;
    }

    public StreamSummary withStreamArn(String str) {
        this.streamArn = str;
        return this;
    }

    public StreamSummary withStreamId(String str) {
        this.streamId = str;
        return this;
    }

    public StreamSummary withStreamVersion(Integer num) {
        this.streamVersion = num;
        return this;
    }
}
