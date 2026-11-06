package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RetryCriteria implements Serializable {
    private String failureType;
    private Integer numberOfRetries;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RetryCriteria)) {
            return false;
        }
        RetryCriteria retryCriteria = (RetryCriteria) obj;
        if ((retryCriteria.getFailureType() == null) ^ (getFailureType() == null)) {
            return false;
        }
        if (retryCriteria.getFailureType() != null && !retryCriteria.getFailureType().equals(getFailureType())) {
            return false;
        }
        if ((retryCriteria.getNumberOfRetries() == null) ^ (getNumberOfRetries() == null)) {
            return false;
        }
        return retryCriteria.getNumberOfRetries() == null || retryCriteria.getNumberOfRetries().equals(getNumberOfRetries());
    }

    public String getFailureType() {
        return this.failureType;
    }

    public Integer getNumberOfRetries() {
        return this.numberOfRetries;
    }

    public int hashCode() {
        return (((getFailureType() == null ? 0 : getFailureType().hashCode()) + 31) * 31) + (getNumberOfRetries() != null ? getNumberOfRetries().hashCode() : 0);
    }

    public void setFailureType(RetryableFailureType retryableFailureType) {
        this.failureType = retryableFailureType.toString();
    }

    public void setNumberOfRetries(Integer num) {
        this.numberOfRetries = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFailureType() != null) {
            sb.append("failureType: " + getFailureType() + ",");
        }
        if (getNumberOfRetries() != null) {
            sb.append("numberOfRetries: " + getNumberOfRetries());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RetryCriteria withFailureType(RetryableFailureType retryableFailureType) {
        this.failureType = retryableFailureType.toString();
        return this;
    }

    public RetryCriteria withNumberOfRetries(Integer num) {
        this.numberOfRetries = num;
        return this;
    }

    public void setFailureType(String str) {
        this.failureType = str;
    }

    public RetryCriteria withFailureType(String str) {
        this.failureType = str;
        return this;
    }
}
