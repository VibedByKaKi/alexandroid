package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SqsAction implements Serializable {
    private String queueUrl;
    private String roleArn;
    private Boolean useBase64;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SqsAction)) {
            return false;
        }
        SqsAction sqsAction = (SqsAction) obj;
        if ((sqsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (sqsAction.getRoleArn() != null && !sqsAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((sqsAction.getQueueUrl() == null) ^ (getQueueUrl() == null)) {
            return false;
        }
        if (sqsAction.getQueueUrl() != null && !sqsAction.getQueueUrl().equals(getQueueUrl())) {
            return false;
        }
        if ((sqsAction.getUseBase64() == null) ^ (getUseBase64() == null)) {
            return false;
        }
        return sqsAction.getUseBase64() == null || sqsAction.getUseBase64().equals(getUseBase64());
    }

    public String getQueueUrl() {
        return this.queueUrl;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public Boolean getUseBase64() {
        return this.useBase64;
    }

    public int hashCode() {
        return (((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getQueueUrl() == null ? 0 : getQueueUrl().hashCode())) * 31) + (getUseBase64() != null ? getUseBase64().hashCode() : 0);
    }

    public Boolean isUseBase64() {
        return this.useBase64;
    }

    public void setQueueUrl(String str) {
        this.queueUrl = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setUseBase64(Boolean bool) {
        this.useBase64 = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getQueueUrl() != null) {
            sb.append("queueUrl: " + getQueueUrl() + ",");
        }
        if (getUseBase64() != null) {
            sb.append("useBase64: " + getUseBase64());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SqsAction withQueueUrl(String str) {
        this.queueUrl = str;
        return this;
    }

    public SqsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public SqsAction withUseBase64(Boolean bool) {
        this.useBase64 = bool;
        return this;
    }
}
