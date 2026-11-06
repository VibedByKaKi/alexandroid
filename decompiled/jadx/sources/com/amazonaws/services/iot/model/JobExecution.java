package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecution implements Serializable {
    private Long approximateSecondsBeforeTimedOut;
    private Long executionNumber;
    private Boolean forceCanceled;
    private String jobId;
    private Date lastUpdatedAt;
    private Date queuedAt;
    private Date startedAt;
    private String status;
    private JobExecutionStatusDetails statusDetails;
    private String thingArn;
    private Long versionNumber;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecution)) {
            return false;
        }
        JobExecution jobExecution = (JobExecution) obj;
        if ((jobExecution.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (jobExecution.getJobId() != null && !jobExecution.getJobId().equals(getJobId())) {
            return false;
        }
        if ((jobExecution.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (jobExecution.getStatus() != null && !jobExecution.getStatus().equals(getStatus())) {
            return false;
        }
        if ((jobExecution.getForceCanceled() == null) ^ (getForceCanceled() == null)) {
            return false;
        }
        if (jobExecution.getForceCanceled() != null && !jobExecution.getForceCanceled().equals(getForceCanceled())) {
            return false;
        }
        if ((jobExecution.getStatusDetails() == null) ^ (getStatusDetails() == null)) {
            return false;
        }
        if (jobExecution.getStatusDetails() != null && !jobExecution.getStatusDetails().equals(getStatusDetails())) {
            return false;
        }
        if ((jobExecution.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (jobExecution.getThingArn() != null && !jobExecution.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((jobExecution.getQueuedAt() == null) ^ (getQueuedAt() == null)) {
            return false;
        }
        if (jobExecution.getQueuedAt() != null && !jobExecution.getQueuedAt().equals(getQueuedAt())) {
            return false;
        }
        if ((jobExecution.getStartedAt() == null) ^ (getStartedAt() == null)) {
            return false;
        }
        if (jobExecution.getStartedAt() != null && !jobExecution.getStartedAt().equals(getStartedAt())) {
            return false;
        }
        if ((jobExecution.getLastUpdatedAt() == null) ^ (getLastUpdatedAt() == null)) {
            return false;
        }
        if (jobExecution.getLastUpdatedAt() != null && !jobExecution.getLastUpdatedAt().equals(getLastUpdatedAt())) {
            return false;
        }
        if ((jobExecution.getExecutionNumber() == null) ^ (getExecutionNumber() == null)) {
            return false;
        }
        if (jobExecution.getExecutionNumber() != null && !jobExecution.getExecutionNumber().equals(getExecutionNumber())) {
            return false;
        }
        if ((jobExecution.getVersionNumber() == null) ^ (getVersionNumber() == null)) {
            return false;
        }
        if (jobExecution.getVersionNumber() != null && !jobExecution.getVersionNumber().equals(getVersionNumber())) {
            return false;
        }
        if ((jobExecution.getApproximateSecondsBeforeTimedOut() == null) ^ (getApproximateSecondsBeforeTimedOut() == null)) {
            return false;
        }
        return jobExecution.getApproximateSecondsBeforeTimedOut() == null || jobExecution.getApproximateSecondsBeforeTimedOut().equals(getApproximateSecondsBeforeTimedOut());
    }

    public Long getApproximateSecondsBeforeTimedOut() {
        return this.approximateSecondsBeforeTimedOut;
    }

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    public Boolean getForceCanceled() {
        return this.forceCanceled;
    }

    public String getJobId() {
        return this.jobId;
    }

    public Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Date getQueuedAt() {
        return this.queuedAt;
    }

    public Date getStartedAt() {
        return this.startedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public JobExecutionStatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getForceCanceled() == null ? 0 : getForceCanceled().hashCode())) * 31) + (getStatusDetails() == null ? 0 : getStatusDetails().hashCode())) * 31) + (getThingArn() == null ? 0 : getThingArn().hashCode())) * 31) + (getQueuedAt() == null ? 0 : getQueuedAt().hashCode())) * 31) + (getStartedAt() == null ? 0 : getStartedAt().hashCode())) * 31) + (getLastUpdatedAt() == null ? 0 : getLastUpdatedAt().hashCode())) * 31) + (getExecutionNumber() == null ? 0 : getExecutionNumber().hashCode())) * 31) + (getVersionNumber() == null ? 0 : getVersionNumber().hashCode())) * 31) + (getApproximateSecondsBeforeTimedOut() != null ? getApproximateSecondsBeforeTimedOut().hashCode() : 0);
    }

    public Boolean isForceCanceled() {
        return this.forceCanceled;
    }

    public void setApproximateSecondsBeforeTimedOut(Long l) {
        this.approximateSecondsBeforeTimedOut = l;
    }

    public void setExecutionNumber(Long l) {
        this.executionNumber = l;
    }

    public void setForceCanceled(Boolean bool) {
        this.forceCanceled = bool;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
    }

    public void setQueuedAt(Date date) {
        this.queuedAt = date;
    }

    public void setStartedAt(Date date) {
        this.startedAt = date;
    }

    public void setStatus(JobExecutionStatus jobExecutionStatus) {
        this.status = jobExecutionStatus.toString();
    }

    public void setStatusDetails(JobExecutionStatusDetails jobExecutionStatusDetails) {
        this.statusDetails = jobExecutionStatusDetails;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public void setVersionNumber(Long l) {
        this.versionNumber = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getForceCanceled() != null) {
            sb.append("forceCanceled: " + getForceCanceled() + ",");
        }
        if (getStatusDetails() != null) {
            sb.append("statusDetails: " + getStatusDetails() + ",");
        }
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getQueuedAt() != null) {
            sb.append("queuedAt: " + getQueuedAt() + ",");
        }
        if (getStartedAt() != null) {
            sb.append("startedAt: " + getStartedAt() + ",");
        }
        if (getLastUpdatedAt() != null) {
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        }
        if (getExecutionNumber() != null) {
            sb.append("executionNumber: " + getExecutionNumber() + ",");
        }
        if (getVersionNumber() != null) {
            sb.append("versionNumber: " + getVersionNumber() + ",");
        }
        if (getApproximateSecondsBeforeTimedOut() != null) {
            sb.append("approximateSecondsBeforeTimedOut: " + getApproximateSecondsBeforeTimedOut());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecution withApproximateSecondsBeforeTimedOut(Long l) {
        this.approximateSecondsBeforeTimedOut = l;
        return this;
    }

    public JobExecution withExecutionNumber(Long l) {
        this.executionNumber = l;
        return this;
    }

    public JobExecution withForceCanceled(Boolean bool) {
        this.forceCanceled = bool;
        return this;
    }

    public JobExecution withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public JobExecution withLastUpdatedAt(Date date) {
        this.lastUpdatedAt = date;
        return this;
    }

    public JobExecution withQueuedAt(Date date) {
        this.queuedAt = date;
        return this;
    }

    public JobExecution withStartedAt(Date date) {
        this.startedAt = date;
        return this;
    }

    public JobExecution withStatus(JobExecutionStatus jobExecutionStatus) {
        this.status = jobExecutionStatus.toString();
        return this;
    }

    public JobExecution withStatusDetails(JobExecutionStatusDetails jobExecutionStatusDetails) {
        this.statusDetails = jobExecutionStatusDetails;
        return this;
    }

    public JobExecution withThingArn(String str) {
        this.thingArn = str;
        return this;
    }

    public JobExecution withVersionNumber(Long l) {
        this.versionNumber = l;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public JobExecution withStatus(String str) {
        this.status = str;
        return this;
    }
}
