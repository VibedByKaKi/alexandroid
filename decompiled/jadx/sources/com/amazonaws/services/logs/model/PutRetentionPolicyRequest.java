package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutRetentionPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String logGroupName;
    private Integer retentionInDays;

    public PutRetentionPolicyRequest(String str, Integer num) {
        setLogGroupName(str);
        setRetentionInDays(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRetentionPolicyRequest)) {
            return false;
        }
        PutRetentionPolicyRequest putRetentionPolicyRequest = (PutRetentionPolicyRequest) obj;
        if ((putRetentionPolicyRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (putRetentionPolicyRequest.getLogGroupName() != null && !putRetentionPolicyRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((putRetentionPolicyRequest.getRetentionInDays() == null) ^ (getRetentionInDays() == null)) {
            return false;
        }
        return putRetentionPolicyRequest.getRetentionInDays() == null || putRetentionPolicyRequest.getRetentionInDays().equals(getRetentionInDays());
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    public int hashCode() {
        return (((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getRetentionInDays() != null ? getRetentionInDays().hashCode() : 0);
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setRetentionInDays(Integer num) {
        this.retentionInDays = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getRetentionInDays() != null) {
            sb.append("retentionInDays: " + getRetentionInDays());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutRetentionPolicyRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public PutRetentionPolicyRequest withRetentionInDays(Integer num) {
        this.retentionInDays = num;
        return this;
    }

    public PutRetentionPolicyRequest() {
    }
}
