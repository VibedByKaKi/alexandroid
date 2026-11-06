package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobSummary implements Serializable {
    private Date completedAt;
    private Date createdAt;
    private Boolean isConcurrent;
    private String jobArn;
    private String jobId;
    private Date lastUpdatedAt;
    private String status;
    private String targetSelection;
    private String thingGroupId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobSummary)) {
            return false;
        }
        JobSummary jobSummary = (JobSummary) obj;
        if ((jobSummary.getJobArn() == null) ^ (getJobArn() == null)) {
            return false;
        }
        if (jobSummary.getJobArn() != null && !jobSummary.getJobArn().equals(getJobArn())) {
            return false;
        }
        if ((jobSummary.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (jobSummary.getJobId() != null && !jobSummary.getJobId().equals(getJobId())) {
            return false;
        }
        if ((jobSummary.getThingGroupId() == null) ^ (getThingGroupId() == null)) {
            return false;
        }
        if (jobSummary.getThingGroupId() != null && !jobSummary.getThingGroupId().equals(getThingGroupId())) {
            return false;
        }
        if ((jobSummary.getTargetSelection() == null) ^ (getTargetSelection() == null)) {
            return false;
        }
        if (jobSummary.getTargetSelection() != null && !jobSummary.getTargetSelection().equals(getTargetSelection())) {
            return false;
        }
        if ((jobSummary.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (jobSummary.getStatus() != null && !jobSummary.getStatus().equals(getStatus())) {
            return false;
        }
        if ((jobSummary.getCreatedAt() == null) ^ (getCreatedAt() == null)) {
            return false;
        }
        if (jobSummary.getCreatedAt() != null && !jobSummary.getCreatedAt().equals(getCreatedAt())) {
            return false;
        }
        if ((jobSummary.getLastUpdatedAt() == null) ^ (getLastUpdatedAt() == null)) {
            return false;
        }
        if (jobSummary.getLastUpdatedAt() != null && !jobSummary.getLastUpdatedAt().equals(getLastUpdatedAt())) {
            return false;
        }
        if ((jobSummary.getCompletedAt() == null) ^ (getCompletedAt() == null)) {
            return false;
        }
        if (jobSummary.getCompletedAt() != null && !jobSummary.getCompletedAt().equals(getCompletedAt())) {
            return false;
        }
        if ((jobSummary.getIsConcurrent() == null) ^ (getIsConcurrent() == null)) {
            return false;
        }
        return jobSummary.getIsConcurrent() == null || jobSummary.getIsConcurrent().equals(getIsConcurrent());
    }

    public Date getCompletedAt() {
        return this.completedAt;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public Boolean getIsConcurrent() {
        return this.isConcurrent;
    }

    public String getJobArn() {
        return this.jobArn;
    }

    public String getJobId() {
        return this.jobId;
    }

    public Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTargetSelection() {
        return this.targetSelection;
    }

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    public int hashCode() {
        return (((((((((((((((((getJobArn() == null ? 0 : getJobArn().hashCode()) + 31) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getThingGroupId() == null ? 0 : getThingGroupId().hashCode())) * 31) + (getTargetSelection() == null ? 0 : getTargetSelection().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getCreatedAt() == null ? 0 : getCreatedAt().hashCode())) * 31) + (getLastUpdatedAt() == null ? 0 : getLastUpdatedAt().hashCode())) * 31) + (getCompletedAt() == null ? 0 : getCompletedAt().hashCode())) * 31) + (getIsConcurrent() != null ? getIsConcurrent().hashCode() : 0);
    }

    public Boolean isIsConcurrent() {
        return this.isConcurrent;
    }

    public void setCompletedAt(Date date) {
        this.completedAt = date;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setIsConcurrent(Boolean bool) {
        this.isConcurrent = bool;
    }

    public void setJobArn(String str) {
        this.jobArn = str;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
    }

    public void setStatus(JobStatus jobStatus) {
        this.status = jobStatus.toString();
    }

    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    public void setThingGroupId(String str) {
        this.thingGroupId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobArn() != null) {
            sb.append("jobArn: " + getJobArn() + ",");
        }
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getThingGroupId() != null) {
            sb.append("thingGroupId: " + getThingGroupId() + ",");
        }
        if (getTargetSelection() != null) {
            sb.append("targetSelection: " + getTargetSelection() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getCreatedAt() != null) {
            sb.append("createdAt: " + getCreatedAt() + ",");
        }
        if (getLastUpdatedAt() != null) {
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        }
        if (getCompletedAt() != null) {
            sb.append("completedAt: " + getCompletedAt() + ",");
        }
        if (getIsConcurrent() != null) {
            sb.append("isConcurrent: " + getIsConcurrent());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobSummary withCompletedAt(Date date) {
        this.completedAt = date;
        return this;
    }

    public JobSummary withCreatedAt(Date date) {
        this.createdAt = date;
        return this;
    }

    public JobSummary withIsConcurrent(Boolean bool) {
        this.isConcurrent = bool;
        return this;
    }

    public JobSummary withJobArn(String str) {
        this.jobArn = str;
        return this;
    }

    public JobSummary withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public JobSummary withLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
        return this;
    }

    public JobSummary withStatus(JobStatus jobStatus) {
        this.status = jobStatus.toString();
        return this;
    }

    public JobSummary withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    public JobSummary withThingGroupId(String str) {
        this.thingGroupId = str;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTargetSelection(String str) {
        this.targetSelection = str;
    }

    public JobSummary withStatus(String str) {
        this.status = str;
        return this;
    }

    public JobSummary withTargetSelection(String str) {
        this.targetSelection = str;
        return this;
    }
}
