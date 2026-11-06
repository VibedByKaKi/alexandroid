package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecutionSummaryForThing implements Serializable {
    private JobExecutionSummary jobExecutionSummary;
    private String jobId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecutionSummaryForThing)) {
            return false;
        }
        JobExecutionSummaryForThing jobExecutionSummaryForThing = (JobExecutionSummaryForThing) obj;
        if ((jobExecutionSummaryForThing.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (jobExecutionSummaryForThing.getJobId() != null && !jobExecutionSummaryForThing.getJobId().equals(getJobId())) {
            return false;
        }
        if ((jobExecutionSummaryForThing.getJobExecutionSummary() == null) ^ (getJobExecutionSummary() == null)) {
            return false;
        }
        return jobExecutionSummaryForThing.getJobExecutionSummary() == null || jobExecutionSummaryForThing.getJobExecutionSummary().equals(getJobExecutionSummary());
    }

    public JobExecutionSummary getJobExecutionSummary() {
        return this.jobExecutionSummary;
    }

    public String getJobId() {
        return this.jobId;
    }

    public int hashCode() {
        return (((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getJobExecutionSummary() != null ? getJobExecutionSummary().hashCode() : 0);
    }

    public void setJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getJobExecutionSummary() != null) {
            sb.append("jobExecutionSummary: " + getJobExecutionSummary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecutionSummaryForThing withJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
        return this;
    }

    public JobExecutionSummaryForThing withJobId(String str) {
        this.jobId = str;
        return this;
    }
}
