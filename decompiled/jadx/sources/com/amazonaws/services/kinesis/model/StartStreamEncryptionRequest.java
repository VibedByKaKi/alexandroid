package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StartStreamEncryptionRequest extends AmazonWebServiceRequest implements Serializable {
    private String encryptionType;
    private String keyId;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartStreamEncryptionRequest)) {
            return false;
        }
        StartStreamEncryptionRequest startStreamEncryptionRequest = (StartStreamEncryptionRequest) obj;
        if ((startStreamEncryptionRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (startStreamEncryptionRequest.getStreamName() != null && !startStreamEncryptionRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((startStreamEncryptionRequest.getEncryptionType() == null) ^ (getEncryptionType() == null)) {
            return false;
        }
        if (startStreamEncryptionRequest.getEncryptionType() != null && !startStreamEncryptionRequest.getEncryptionType().equals(getEncryptionType())) {
            return false;
        }
        if ((startStreamEncryptionRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        return startStreamEncryptionRequest.getKeyId() == null || startStreamEncryptionRequest.getKeyId().equals(getKeyId());
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getEncryptionType() == null ? 0 : getEncryptionType().hashCode())) * 31) + (getKeyId() != null ? getKeyId().hashCode() : 0);
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getEncryptionType() != null) {
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StartStreamEncryptionRequest withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    public StartStreamEncryptionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public StartStreamEncryptionRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public StartStreamEncryptionRequest withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }
}
