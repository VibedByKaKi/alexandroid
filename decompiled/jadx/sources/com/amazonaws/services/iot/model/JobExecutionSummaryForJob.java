package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecutionSummaryForJob implements Serializable {
    private JobExecutionSummary jobExecutionSummary;
    private String thingArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecutionSummaryForJob)) {
            return false;
        }
        JobExecutionSummaryForJob jobExecutionSummaryForJob = (JobExecutionSummaryForJob) obj;
        if ((jobExecutionSummaryForJob.getThingArn() == null) ^ (getThingArn() == null)) {
            return false;
        }
        if (jobExecutionSummaryForJob.getThingArn() != null && !jobExecutionSummaryForJob.getThingArn().equals(getThingArn())) {
            return false;
        }
        if ((jobExecutionSummaryForJob.getJobExecutionSummary() == null) ^ (getJobExecutionSummary() == null)) {
            return false;
        }
        return jobExecutionSummaryForJob.getJobExecutionSummary() == null || jobExecutionSummaryForJob.getJobExecutionSummary().equals(getJobExecutionSummary());
    }

    public JobExecutionSummary getJobExecutionSummary() {
        return this.jobExecutionSummary;
    }

    public String getThingArn() {
        return this.thingArn;
    }

    public int hashCode() {
        return (((getThingArn() == null ? 0 : getThingArn().hashCode()) + 31) * 31) + (getJobExecutionSummary() != null ? getJobExecutionSummary().hashCode() : 0);
    }

    public void setJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
    }

    public void setThingArn(String str) {
        this.thingArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingArn() != null) {
            sb.append("thingArn: " + getThingArn() + ",");
        }
        if (getJobExecutionSummary() != null) {
            sb.append("jobExecutionSummary: " + getJobExecutionSummary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecutionSummaryForJob withJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
        return this;
    }

    public JobExecutionSummaryForJob withThingArn(String str) {
        this.thingArn = str;
        return this;
    }
}
