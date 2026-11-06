package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListJobExecutionsForJobRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobId;
    private Integer maxResults;
    private String nextToken;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListJobExecutionsForJobRequest)) {
            return false;
        }
        ListJobExecutionsForJobRequest listJobExecutionsForJobRequest = (ListJobExecutionsForJobRequest) obj;
        if ((listJobExecutionsForJobRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (listJobExecutionsForJobRequest.getJobId() != null && !listJobExecutionsForJobRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((listJobExecutionsForJobRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (listJobExecutionsForJobRequest.getStatus() != null && !listJobExecutionsForJobRequest.getStatus().equals(getStatus())) {
            return false;
        }
        if ((listJobExecutionsForJobRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listJobExecutionsForJobRequest.getMaxResults() != null && !listJobExecutionsForJobRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listJobExecutionsForJobRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listJobExecutionsForJobRequest.getNextToken() == null || listJobExecutionsForJobRequest.getNextToken().equals(getNextToken());
    }

    public String getJobId() {
        return this.jobId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStatus(JobExecutionStatus jobExecutionStatus) {
        this.status = jobExecutionStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListJobExecutionsForJobRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public ListJobExecutionsForJobRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListJobExecutionsForJobRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListJobExecutionsForJobRequest withStatus(JobExecutionStatus jobExecutionStatus) {
        this.status = jobExecutionStatus.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public ListJobExecutionsForJobRequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
