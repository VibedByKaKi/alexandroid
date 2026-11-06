package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Destination implements Serializable {
    private String accessPolicy;
    private String arn;
    private Long creationTime;
    private String destinationName;
    private String roleArn;
    private String targetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        if ((destination.getDestinationName() == null) ^ (getDestinationName() == null)) {
            return false;
        }
        if (destination.getDestinationName() != null && !destination.getDestinationName().equals(getDestinationName())) {
            return false;
        }
        if ((destination.getTargetArn() == null) ^ (getTargetArn() == null)) {
            return false;
        }
        if (destination.getTargetArn() != null && !destination.getTargetArn().equals(getTargetArn())) {
            return false;
        }
        if ((destination.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (destination.getRoleArn() != null && !destination.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((destination.getAccessPolicy() == null) ^ (getAccessPolicy() == null)) {
            return false;
        }
        if (destination.getAccessPolicy() != null && !destination.getAccessPolicy().equals(getAccessPolicy())) {
            return false;
        }
        if ((destination.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (destination.getArn() != null && !destination.getArn().equals(getArn())) {
            return false;
        }
        if ((destination.getCreationTime() == null) ^ (getCreationTime() == null)) {
            return false;
        }
        return destination.getCreationTime() == null || destination.getCreationTime().equals(getCreationTime());
    }

    public String getAccessPolicy() {
        return this.accessPolicy;
    }

    public String getArn() {
        return this.arn;
    }

    public Long getCreationTime() {
        return this.creationTime;
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTargetArn() {
        return this.targetArn;
    }

    public int hashCode() {
        return (((((((((((getDestinationName() == null ? 0 : getDestinationName().hashCode()) + 31) * 31) + (getTargetArn() == null ? 0 : getTargetArn().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getAccessPolicy() == null ? 0 : getAccessPolicy().hashCode())) * 31) + (getArn() == null ? 0 : getArn().hashCode())) * 31) + (getCreationTime() != null ? getCreationTime().hashCode() : 0);
    }

    public void setAccessPolicy(String str) {
        this.accessPolicy = str;
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setCreationTime(Long l) {
        this.creationTime = l;
    }

    public void setDestinationName(String str) {
        this.destinationName = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTargetArn(String str) {
        this.targetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationName() != null) {
            sb.append("destinationName: " + getDestinationName() + ",");
        }
        if (getTargetArn() != null) {
            sb.append("targetArn: " + getTargetArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getAccessPolicy() != null) {
            sb.append("accessPolicy: " + getAccessPolicy() + ",");
        }
        if (getArn() != null) {
            sb.append("arn: " + getArn() + ",");
        }
        if (getCreationTime() != null) {
            sb.append("creationTime: " + getCreationTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Destination withAccessPolicy(String str) {
        this.accessPolicy = str;
        return this;
    }

    public Destination withArn(String str) {
        this.arn = str;
        return this;
    }

    public Destination withCreationTime(Long l) {
        this.creationTime = l;
        return this;
    }

    public Destination withDestinationName(String str) {
        this.destinationName = str;
        return this;
    }

    public Destination withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public Destination withTargetArn(String str) {
        this.targetArn = str;
        return this;
    }
}
