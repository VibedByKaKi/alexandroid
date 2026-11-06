package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListJobExecutionsForJobResult implements Serializable {
    private List<JobExecutionSummaryForJob> executionSummaries;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListJobExecutionsForJobResult)) {
            return false;
        }
        ListJobExecutionsForJobResult listJobExecutionsForJobResult = (ListJobExecutionsForJobResult) obj;
        if ((listJobExecutionsForJobResult.getExecutionSummaries() == null) ^ (getExecutionSummaries() == null)) {
            return false;
        }
        if (listJobExecutionsForJobResult.getExecutionSummaries() != null && !listJobExecutionsForJobResult.getExecutionSummaries().equals(getExecutionSummaries())) {
            return false;
        }
        if ((listJobExecutionsForJobResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listJobExecutionsForJobResult.getNextToken() == null || listJobExecutionsForJobResult.getNextToken().equals(getNextToken());
    }

    public List<JobExecutionSummaryForJob> getExecutionSummaries() {
        return this.executionSummaries;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getExecutionSummaries() == null ? 0 : getExecutionSummaries().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setExecutionSummaries(Collection<JobExecutionSummaryForJob> collection) {
        if (collection == null) {
            this.executionSummaries = null;
        } else {
            this.executionSummaries = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getExecutionSummaries() != null) {
            sb.append("executionSummaries: " + getExecutionSummaries() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListJobExecutionsForJobResult withExecutionSummaries(JobExecutionSummaryForJob... jobExecutionSummaryForJobArr) {
        if (getExecutionSummaries() == null) {
            this.executionSummaries = new ArrayList(jobExecutionSummaryForJobArr.length);
        }
        for (JobExecutionSummaryForJob jobExecutionSummaryForJob : jobExecutionSummaryForJobArr) {
            this.executionSummaries.add(jobExecutionSummaryForJob);
        }
        return this;
    }

    public ListJobExecutionsForJobResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListJobExecutionsForJobResult withExecutionSummaries(Collection<JobExecutionSummaryForJob> collection) {
        setExecutionSummaries(collection);
        return this;
    }
}
