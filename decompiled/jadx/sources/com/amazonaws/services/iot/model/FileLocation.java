package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class FileLocation implements Serializable {
    private S3Location s3Location;
    private Stream stream;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FileLocation)) {
            return false;
        }
        FileLocation fileLocation = (FileLocation) obj;
        if ((fileLocation.getStream() == null) ^ (getStream() == null)) {
            return false;
        }
        if (fileLocation.getStream() != null && !fileLocation.getStream().equals(getStream())) {
            return false;
        }
        if ((fileLocation.getS3Location() == null) ^ (getS3Location() == null)) {
            return false;
        }
        return fileLocation.getS3Location() == null || fileLocation.getS3Location().equals(getS3Location());
    }

    public S3Location getS3Location() {
        return this.s3Location;
    }

    public Stream getStream() {
        return this.stream;
    }

    public int hashCode() {
        return (((getStream() == null ? 0 : getStream().hashCode()) + 31) * 31) + (getS3Location() != null ? getS3Location().hashCode() : 0);
    }

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStream() != null) {
            sb.append("stream: " + getStream() + ",");
        }
        if (getS3Location() != null) {
            sb.append("s3Location: " + getS3Location());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public FileLocation withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    public FileLocation withStream(Stream stream) {
        this.stream = stream;
        return this;
    }
}
