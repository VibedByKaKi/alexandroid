package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StartUserImportJobRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartUserImportJobRequest)) {
            return false;
        }
        StartUserImportJobRequest startUserImportJobRequest = (StartUserImportJobRequest) obj;
        if ((startUserImportJobRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (startUserImportJobRequest.getUserPoolId() != null && !startUserImportJobRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((startUserImportJobRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        return startUserImportJobRequest.getJobId() == null || startUserImportJobRequest.getJobId().equals(getJobId());
    }

    public String getJobId() {
        return this.jobId;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public int hashCode() {
        return (((getUserPoolId() == null ? 0 : getUserPoolId().hashCode()) + 31) * 31) + (getJobId() != null ? getJobId().hashCode() : 0);
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setUserPoolId(String str) {
        this.userPoolId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUserPoolId() != null) {
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        }
        if (getJobId() != null) {
            sb.append("JobId: " + getJobId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StartUserImportJobRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public StartUserImportJobRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
