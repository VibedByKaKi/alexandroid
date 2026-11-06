package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StreamFile implements Serializable {
    private Integer fileId;
    private S3Location s3Location;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamFile)) {
            return false;
        }
        StreamFile streamFile = (StreamFile) obj;
        if ((streamFile.getFileId() == null) ^ (getFileId() == null)) {
            return false;
        }
        if (streamFile.getFileId() != null && !streamFile.getFileId().equals(getFileId())) {
            return false;
        }
        if ((streamFile.getS3Location() == null) ^ (getS3Location() == null)) {
            return false;
        }
        return streamFile.getS3Location() == null || streamFile.getS3Location().equals(getS3Location());
    }

    public Integer getFileId() {
        return this.fileId;
    }

    public S3Location getS3Location() {
        return this.s3Location;
    }

    public int hashCode() {
        return (((getFileId() == null ? 0 : getFileId().hashCode()) + 31) * 31) + (getS3Location() != null ? getS3Location().hashCode() : 0);
    }

    public void setFileId(Integer num) {
        this.fileId = num;
    }

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFileId() != null) {
            sb.append("fileId: " + getFileId() + ",");
        }
        if (getS3Location() != null) {
            sb.append("s3Location: " + getS3Location());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StreamFile withFileId(Integer num) {
        this.fileId = num;
        return this;
    }

    public StreamFile withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }
}
