package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteV2LoggingLevelRequest extends AmazonWebServiceRequest implements Serializable {
    private String targetName;
    private String targetType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteV2LoggingLevelRequest)) {
            return false;
        }
        DeleteV2LoggingLevelRequest deleteV2LoggingLevelRequest = (DeleteV2LoggingLevelRequest) obj;
        if ((deleteV2LoggingLevelRequest.getTargetType() == null) ^ (getTargetType() == null)) {
            return false;
        }
        if (deleteV2LoggingLevelRequest.getTargetType() != null && !deleteV2LoggingLevelRequest.getTargetType().equals(getTargetType())) {
            return false;
        }
        if ((deleteV2LoggingLevelRequest.getTargetName() == null) ^ (getTargetName() == null)) {
            return false;
        }
        return deleteV2LoggingLevelRequest.getTargetName() == null || deleteV2LoggingLevelRequest.getTargetName().equals(getTargetName());
    }

    public String getTargetName() {
        return this.targetName;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public int hashCode() {
        return (((getTargetType() == null ? 0 : getTargetType().hashCode()) + 31) * 31) + (getTargetName() != null ? getTargetName().hashCode() : 0);
    }

    public void setTargetName(String str) {
        this.targetName = str;
    }

    public void setTargetType(LogTargetType logTargetType) {
        this.targetType = logTargetType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTargetType() != null) {
            sb.append("targetType: " + getTargetType() + ",");
        }
        if (getTargetName() != null) {
            sb.append("targetName: " + getTargetName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteV2LoggingLevelRequest withTargetName(String str) {
        this.targetName = str;
        return this;
    }

    public DeleteV2LoggingLevelRequest withTargetType(LogTargetType logTargetType) {
        this.targetType = logTargetType.toString();
        return this;
    }

    public void setTargetType(String str) {
        this.targetType = str;
    }

    public DeleteV2LoggingLevelRequest withTargetType(String str) {
        this.targetType = str;
        return this;
    }
}
