package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListJobsResult implements Serializable {
    private List<JobSummary> jobs;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListJobsResult)) {
            return false;
        }
        ListJobsResult listJobsResult = (ListJobsResult) obj;
        if ((listJobsResult.getJobs() == null) ^ (getJobs() == null)) {
            return false;
        }
        if (listJobsResult.getJobs() != null && !listJobsResult.getJobs().equals(getJobs())) {
            return false;
        }
        if ((listJobsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listJobsResult.getNextToken() == null || listJobsResult.getNextToken().equals(getNextToken());
    }

    public List<JobSummary> getJobs() {
        return this.jobs;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getJobs() == null ? 0 : getJobs().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setJobs(Collection<JobSummary> collection) {
        if (collection == null) {
            this.jobs = null;
        } else {
            this.jobs = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobs() != null) {
            sb.append("jobs: " + getJobs() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListJobsResult withJobs(JobSummary... jobSummaryArr) {
        if (getJobs() == null) {
            this.jobs = new ArrayList(jobSummaryArr.length);
        }
        for (JobSummary jobSummary : jobSummaryArr) {
            this.jobs.add(jobSummary);
        }
        return this;
    }

    public ListJobsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListJobsResult withJobs(Collection<JobSummary> collection) {
        setJobs(collection);
        return this;
    }
}
