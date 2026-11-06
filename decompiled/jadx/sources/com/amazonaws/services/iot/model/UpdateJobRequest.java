package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateJobRequest extends AmazonWebServiceRequest implements Serializable {
    private AbortConfig abortConfig;
    private String description;
    private JobExecutionsRetryConfig jobExecutionsRetryConfig;
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;
    private String jobId;
    private String namespaceId;
    private PresignedUrlConfig presignedUrlConfig;
    private TimeoutConfig timeoutConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateJobRequest)) {
            return false;
        }
        UpdateJobRequest updateJobRequest = (UpdateJobRequest) obj;
        if ((updateJobRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (updateJobRequest.getJobId() != null && !updateJobRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((updateJobRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (updateJobRequest.getDescription() != null && !updateJobRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((updateJobRequest.getPresignedUrlConfig() == null) ^ (getPresignedUrlConfig() == null)) {
            return false;
        }
        if (updateJobRequest.getPresignedUrlConfig() != null && !updateJobRequest.getPresignedUrlConfig().equals(getPresignedUrlConfig())) {
            return false;
        }
        if ((updateJobRequest.getJobExecutionsRolloutConfig() == null) ^ (getJobExecutionsRolloutConfig() == null)) {
            return false;
        }
        if (updateJobRequest.getJobExecutionsRolloutConfig() != null && !updateJobRequest.getJobExecutionsRolloutConfig().equals(getJobExecutionsRolloutConfig())) {
            return false;
        }
        if ((updateJobRequest.getAbortConfig() == null) ^ (getAbortConfig() == null)) {
            return false;
        }
        if (updateJobRequest.getAbortConfig() != null && !updateJobRequest.getAbortConfig().equals(getAbortConfig())) {
            return false;
        }
        if ((updateJobRequest.getTimeoutConfig() == null) ^ (getTimeoutConfig() == null)) {
            return false;
        }
        if (updateJobRequest.getTimeoutConfig() != null && !updateJobRequest.getTimeoutConfig().equals(getTimeoutConfig())) {
            return false;
        }
        if ((updateJobRequest.getNamespaceId() == null) ^ (getNamespaceId() == null)) {
            return false;
        }
        if (updateJobRequest.getNamespaceId() != null && !updateJobRequest.getNamespaceId().equals(getNamespaceId())) {
            return false;
        }
        if ((updateJobRequest.getJobExecutionsRetryConfig() == null) ^ (getJobExecutionsRetryConfig() == null)) {
            return false;
        }
        return updateJobRequest.getJobExecutionsRetryConfig() == null || updateJobRequest.getJobExecutionsRetryConfig().equals(getJobExecutionsRetryConfig());
    }

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    public String getDescription() {
        return this.description;
    }

    public JobExecutionsRetryConfig getJobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig;
    }

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    public String getJobId() {
        return this.jobId;
    }

    public String getNamespaceId() {
        return this.namespaceId;
    }

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public int hashCode() {
        return (((((((((((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getPresignedUrlConfig() == null ? 0 : getPresignedUrlConfig().hashCode())) * 31) + (getJobExecutionsRolloutConfig() == null ? 0 : getJobExecutionsRolloutConfig().hashCode())) * 31) + (getAbortConfig() == null ? 0 : getAbortConfig().hashCode())) * 31) + (getTimeoutConfig() == null ? 0 : getTimeoutConfig().hashCode())) * 31) + (getNamespaceId() == null ? 0 : getNamespaceId().hashCode())) * 31) + (getJobExecutionsRetryConfig() != null ? getJobExecutionsRetryConfig().hashCode() : 0);
    }

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
    }

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setNamespaceId(String str) {
        this.namespaceId = str;
    }

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
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
        if (getNamespaceId() != null) {
            sb.append("namespaceId: " + getNamespaceId() + ",");
        }
        if (getJobExecutionsRetryConfig() != null) {
            sb.append("jobExecutionsRetryConfig: " + getJobExecutionsRetryConfig());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateJobRequest withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
        return this;
    }

    public UpdateJobRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateJobRequest withJobExecutionsRetryConfig(JobExecutionsRetryConfig jobExecutionsRetryConfig) {
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        return this;
    }

    public UpdateJobRequest withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    public UpdateJobRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public UpdateJobRequest withNamespaceId(String str) {
        this.namespaceId = str;
        return this;
    }

    public UpdateJobRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    public UpdateJobRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
}
