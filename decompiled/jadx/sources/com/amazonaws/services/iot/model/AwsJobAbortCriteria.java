package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AwsJobAbortCriteria implements Serializable {
    private String action;
    private String failureType;
    private Integer minNumberOfExecutedThings;
    private Double thresholdPercentage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AwsJobAbortCriteria)) {
            return false;
        }
        AwsJobAbortCriteria awsJobAbortCriteria = (AwsJobAbortCriteria) obj;
        if ((awsJobAbortCriteria.getFailureType() == null) ^ (getFailureType() == null)) {
            return false;
        }
        if (awsJobAbortCriteria.getFailureType() != null && !awsJobAbortCriteria.getFailureType().equals(getFailureType())) {
            return false;
        }
        if ((awsJobAbortCriteria.getAction() == null) ^ (getAction() == null)) {
            return false;
        }
        if (awsJobAbortCriteria.getAction() != null && !awsJobAbortCriteria.getAction().equals(getAction())) {
            return false;
        }
        if ((awsJobAbortCriteria.getThresholdPercentage() == null) ^ (getThresholdPercentage() == null)) {
            return false;
        }
        if (awsJobAbortCriteria.getThresholdPercentage() != null && !awsJobAbortCriteria.getThresholdPercentage().equals(getThresholdPercentage())) {
            return false;
        }
        if ((awsJobAbortCriteria.getMinNumberOfExecutedThings() == null) ^ (getMinNumberOfExecutedThings() == null)) {
            return false;
        }
        return awsJobAbortCriteria.getMinNumberOfExecutedThings() == null || awsJobAbortCriteria.getMinNumberOfExecutedThings().equals(getMinNumberOfExecutedThings());
    }

    public String getAction() {
        return this.action;
    }

    public String getFailureType() {
        return this.failureType;
    }

    public Integer getMinNumberOfExecutedThings() {
        return this.minNumberOfExecutedThings;
    }

    public Double getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    public int hashCode() {
        return (((((((getFailureType() == null ? 0 : getFailureType().hashCode()) + 31) * 31) + (getAction() == null ? 0 : getAction().hashCode())) * 31) + (getThresholdPercentage() == null ? 0 : getThresholdPercentage().hashCode())) * 31) + (getMinNumberOfExecutedThings() != null ? getMinNumberOfExecutedThings().hashCode() : 0);
    }

    public void setAction(AwsJobAbortCriteriaAbortAction awsJobAbortCriteriaAbortAction) {
        this.action = awsJobAbortCriteriaAbortAction.toString();
    }

    public void setFailureType(AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType) {
        this.failureType = awsJobAbortCriteriaFailureType.toString();
    }

    public void setMinNumberOfExecutedThings(Integer num) {
        this.minNumberOfExecutedThings = num;
    }

    public void setThresholdPercentage(Double d) {
        this.thresholdPercentage = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFailureType() != null) {
            sb.append("failureType: " + getFailureType() + ",");
        }
        if (getAction() != null) {
            sb.append("action: " + getAction() + ",");
        }
        if (getThresholdPercentage() != null) {
            sb.append("thresholdPercentage: " + getThresholdPercentage() + ",");
        }
        if (getMinNumberOfExecutedThings() != null) {
            sb.append("minNumberOfExecutedThings: " + getMinNumberOfExecutedThings());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AwsJobAbortCriteria withAction(AwsJobAbortCriteriaAbortAction awsJobAbortCriteriaAbortAction) {
        this.action = awsJobAbortCriteriaAbortAction.toString();
        return this;
    }

    public AwsJobAbortCriteria withFailureType(AwsJobAbortCriteriaFailureType awsJobAbortCriteriaFailureType) {
        this.failureType = awsJobAbortCriteriaFailureType.toString();
        return this;
    }

    public AwsJobAbortCriteria withMinNumberOfExecutedThings(Integer num) {
        this.minNumberOfExecutedThings = num;
        return this;
    }

    public AwsJobAbortCriteria withThresholdPercentage(Double d) {
        this.thresholdPercentage = d;
        return this;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setFailureType(String str) {
        this.failureType = str;
    }

    public AwsJobAbortCriteria withAction(String str) {
        this.action = str;
        return this;
    }

    public AwsJobAbortCriteria withFailureType(String str) {
        this.failureType = str;
        return this;
    }
}
