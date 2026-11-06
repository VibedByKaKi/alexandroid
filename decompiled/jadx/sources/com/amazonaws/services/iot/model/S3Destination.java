package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3Destination implements Serializable {
    private String bucket;
    private String prefix;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S3Destination)) {
            return false;
        }
        S3Destination s3Destination = (S3Destination) obj;
        if ((s3Destination.getBucket() == null) ^ (getBucket() == null)) {
            return false;
        }
        if (s3Destination.getBucket() != null && !s3Destination.getBucket().equals(getBucket())) {
            return false;
        }
        if ((s3Destination.getPrefix() == null) ^ (getPrefix() == null)) {
            return false;
        }
        return s3Destination.getPrefix() == null || s3Destination.getPrefix().equals(getPrefix());
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        return (((getBucket() == null ? 0 : getBucket().hashCode()) + 31) * 31) + (getPrefix() != null ? getPrefix().hashCode() : 0);
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBucket() != null) {
            sb.append("bucket: " + getBucket() + ",");
        }
        if (getPrefix() != null) {
            sb.append("prefix: " + getPrefix());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public S3Destination withBucket(String str) {
        this.bucket = str;
        return this;
    }

    public S3Destination withPrefix(String str) {
        this.prefix = str;
        return this;
    }
}
