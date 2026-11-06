package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobTemplateResult implements Serializable {
    private AbortConfig abortConfig;
    private Date createdAt;
    private String description;
    private String document;
    private String documentSource;
    private JobExecutionsRetryConfig jobExecutionsRetryConfig;
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;
    private String jobTemplateArn;
    private String jobTemplateId;
    private PresignedUrlConfig presignedUrlConfig;
    private TimeoutConfig timeoutConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeJobTemplateResult)) {
            return false;
        }
        DescribeJobTemplateResult describeJobTemplateResult = (DescribeJobTemplateResult) obj;
        if ((describeJobTemplateResult.getJobTemplateArn() == null) ^ (getJobTemplateArn() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getJobTemplateArn() != null && !describeJobTemplateResult.getJobTemplateArn().equals(getJobTemplateArn())) {
            return false;
        }
        if ((describeJobTemplateResult.getJobTemplateId() == null) ^ (getJobTemplateId() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getJobTemplateId() != null && !describeJobTemplateResult.getJobTemplateId().equals(getJobTemplateId())) {
            return false;
        }
        if ((describeJobTemplateResult.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getDescription() != null && !describeJobTemplateResult.getDescription().equals(getDescription())) {
            return false;
        }
        if ((describeJobTemplateResult.getDocumentSource() == null) ^ (getDocumentSource() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getDocumentSource() != null && !describeJobTemplateResult.getDocumentSource().equals(getDocumentSource())) {
            return false;
        }
        if ((describeJobTemplateResult.getDocument() == null) ^ (getDocument() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getDocument() != null && !describeJobTemplateResult.getDocument().equals(getDocument())) {
            return false;
        }
        if ((describeJobTemplateResult.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getCreatedAt() != null && !describeJobTemplateResult.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((describeJobTemplateResult.getPresignedUrlConfig() == null) ^ (getPresignedUrlConfig() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getPresignedUrlConfig() != null && !describeJobTemplateResult.getPresignedUrlConfig().equals(getPresignedUrlConfig())) {
            return false;
        }
        if ((describeJobTemplateResult.getJobExecutionsRolloutConfig() == null) ^ (getJobExecutionsRolloutConfig() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getJobExecutionsRolloutConfig() != null && !describeJobTemplateResult.getJobExecutionsRolloutConfig().equals(getJobExecutionsRolloutConfig())) {
            return false;
        }
        if ((describeJobTemplateResult.getAbortConfig() == null) ^ (getAbortConfig() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getAbortConfig() != null && !describeJobTemplateResult.getAbortConfig().equals(getAbortConfig())) {
            return false;
        }
        if ((describeJobTemplateResult.getTimeoutConfig() == null) ^ (getTimeoutConfig() == null)) {
            return false;
        }
        if (describeJobTemplateResult.getTimeoutConfig() != null && !describeJobTemplateResult.getTimeoutConfig().equals(getTimeoutConfig())) {
            return false;
        }
        if ((describeJobTemplateResult.getJobExecutionsRetryConfig() == null) ^ (getJobExecutionsRetryConfig() == null)) {
            return false;
        }
        return describeJobTemplateResult.getJobExecutionsRetryConfig() == null || describeJobTemplateResult.getJobExecutionsRetryConfig().equals(getJobExecutionsRetryConfig());
    }

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDocument() {
        return this.document;
    }

    public String getDocumentSource() {
        return this.documentSource;
    }

    public JobExecutionsRetryConfig getJobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig;
    }

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    public String getJobTemplateArn() {
        return this.jobTemplateArn;
    }

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public int hashCode() {
        return (((((((((((((((((((((getJobTemplateArn() == null ? 0 : getJobTemplateArn().hashCode()) + 31) * 31) + (getJobTemplateId() == null ? 0 : getJobTemplateId().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getDocumentSource() == null ? 0 : getDocumentSource().hashCode())) * 31) + (getDocument() == null ? 0 : getDocument().hashCode())) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getPresignedUrlConfig() == null ? 0 : getPresignedUrlConfig().hashCode())) * 31) + (getJobExecutionsRolloutConfig() == null ? 0 : getJobExecutionsRolloutConfig().hashCode())) * 31) + (getAbortConfig() == null ? 0 : getAbortConfig().hashCode())) * 31) + (getTimeoutConfig() == null ? 0 : getTimeoutConfig().hashCode())) * 31) + (getJobExecutionsRetryConfig() != null ? getJobExecutionsRetryConfig().hashCode() : 0);
    }

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDocument(String str) {
        this.document = str;
    }

    public void setDocumentSource(String str) {
        this.documentSource = str;
    }

    public void setJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
    }

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    public void setJobTemplateArn(String str) {
        this.jobTemplateArn = str;
    }

    public void setJobTemplateId(String str) {
        this.jobTemplateId = str;
    }

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobTemplateArn() != null) {
            sb.append("jobTemplateArn: " + getJobTemplateArn() + ",");
        }
        if (getJobTemplateId() != null) {
            sb.append("jobTemplateId: " + getJobTemplateId() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getDocumentSource() != null) {
            sb.append("documentSource: " + getDocumentSource() + ",");
        }
        if (getDocument() != null) {
            sb.append("document: " + getDocument() + ",");
        }
        if (getCreatedAt() != null) {
            sb.append("createdAt: " + getCreatedAt() + ",");
        }
        if (getPresignedUrlConfig() != null) {
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        }
        if (getJobExecutionsRolloutConfig() != null) {
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        }
        if (getAbortConfig() != null) {
            sb.append("abortConfig: " + getAbortConfig() + ",");
        }
        if (getTimeoutConfig() != null) {
            sb.append("timeoutConfig: " + getTimeoutConfig() + ",");
        }
        if (getJobExecutionsRetryConfig() != null) {
            sb.append("jobExecutionsRetryConfig: " + getJobExecutionsRetryConfig());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeJobTemplateResult withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
        return this;
    }

    public DescribeJobTemplateResult withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public DescribeJobTemplateResult withDescription(String str) {
        this.description = str;
        return this;
    }

    public DescribeJobTemplateResult withDocument(String str) {
        this.document = str;
        return this;
    }

    public DescribeJobTemplateResult withDocumentSource(String str) {
        this.documentSource = str;
        return this;
    }

    public DescribeJobTemplateResult withJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        return this;
    }

    public DescribeJobTemplateResult withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    public DescribeJobTemplateResult withJobTemplateArn(String str) {
        this.jobTemplateArn = str;
        return this;
    }

    public DescribeJobTemplateResult withJobTemplateId(String str) {
        this.jobTemplateId = str;
        return this;
    }

    public DescribeJobTemplateResult withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    public DescribeJobTemplateResult withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
}
