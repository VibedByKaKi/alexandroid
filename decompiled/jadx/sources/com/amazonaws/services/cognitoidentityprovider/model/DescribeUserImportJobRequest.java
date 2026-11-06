package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeUserImportJobRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private String userPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeUserImportJobRequest)) {
            return false;
        }
        DescribeUserImportJobRequest describeUserImportJobRequest = (DescribeUserImportJobRequest) obj;
        if ((describeUserImportJobRequest.getUserPoolId() == null) ^ (getUserPoolId() == null)) {
            return false;
        }
        if (describeUserImportJobRequest.getUserPoolId() != null && !describeUserImportJobRequest.getUserPoolId().equals(getUserPoolId())) {
            return false;
        }
        if ((describeUserImportJobRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        return describeUserImportJobRequest.getJobId() == null || describeUserImportJobRequest.getJobId().equals(getJobId());
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

    public DescribeUserImportJobRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public DescribeUserImportJobRequest withUserPoolId(String str) {
        this.userPoolId = str;
        return this;
    }
}
