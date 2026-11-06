package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Stream implements Serializable {
    private Integer fileId;
    private String streamId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) obj;
        if ((stream.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        if (stream.getStreamId() != null && !stream.getStreamId().equals(getStreamId())) {
            return false;
        }
        if ((stream.getFileId() == null) ^ (getFileId() == null)) {
            return false;
        }
        return stream.getFileId() == null || stream.getFileId().equals(getFileId());
    }

    public Integer getFileId() {
        return this.fileId;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        return (((getStreamId() == null ? 0 : getStreamId().hashCode()) + 31) * 31) + (getFileId() != null ? getFileId().hashCode() : 0);
    }

    public void setFileId(Integer num) {
        this.fileId = num;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamId() != null) {
            sb.append("streamId: " + getStreamId() + ",");
        }
        if (getFileId() != null) {
            sb.append("fileId: " + getFileId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Stream withFileId(Integer num) {
        this.fileId = num;
        return this;
    }

    public Stream withStreamId(String str) {
        this.streamId = str;
        return this;
    }
}
