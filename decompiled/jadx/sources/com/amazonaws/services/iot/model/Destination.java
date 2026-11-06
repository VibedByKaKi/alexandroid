package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Destination implements Serializable {
    private S3Destination s3Destination;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        if ((destination.getS3Destination() == null) ^ (getS3Destination() == null)) {
            return false;
        }
        return destination.getS3Destination() == null || destination.getS3Destination().equals(getS3Destination());
    }

    public S3Destination getS3Destination() {
        return this.s3Destination;
    }

    public int hashCode() {
        return 31 + (getS3Destination() == null ? 0 : getS3Destination().hashCode());
    }

    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getS3Destination() != null) {
            sb.append("s3Destination: " + getS3Destination());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Destination withS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }
}
