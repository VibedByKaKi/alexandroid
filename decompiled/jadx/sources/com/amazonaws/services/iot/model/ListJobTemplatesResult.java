package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListJobTemplatesResult implements Serializable {
    private List<JobTemplateSummary> jobTemplates;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListJobTemplatesResult)) {
            return false;
        }
        ListJobTemplatesResult listJobTemplatesResult = (ListJobTemplatesResult) obj;
        if ((listJobTemplatesResult.getJobTemplates() == null) ^ (getJobTemplates() == null)) {
            return false;
        }
        if (listJobTemplatesResult.getJobTemplates() != null && !listJobTemplatesResult.getJobTemplates().equals(getJobTemplates())) {
            return false;
        }
        if ((listJobTemplatesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listJobTemplatesResult.getNextToken() == null || listJobTemplatesResult.getNextToken().equals(getNextToken());
    }

    public List<JobTemplateSummary> getJobTemplates() {
        return this.jobTemplates;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getJobTemplates() == null ? 0 : getJobTemplates().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setJobTemplates(Collection<JobTemplateSummary> collection) {
        if (collection == null) {
            this.jobTemplates = null;
        } else {
            this.jobTemplates = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobTemplates() != null) {
            sb.append("jobTemplates: " + getJobTemplates() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListJobTemplatesResult withJobTemplates(JobTemplateSummary... jobTemplateSummaryArr) {
        if (getJobTemplates() == null) {
            this.jobTemplates = new ArrayList(jobTemplateSummaryArr.length);
        }
        for (JobTemplateSummary jobTemplateSummary : jobTemplateSummaryArr) {
            this.jobTemplates.add(jobTemplateSummary);
        }
        return this;
    }

    public ListJobTemplatesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListJobTemplatesResult withJobTemplates(Collection<JobTemplateSummary> collection) {
        setJobTemplates(collection);
        return this;
    }
}
