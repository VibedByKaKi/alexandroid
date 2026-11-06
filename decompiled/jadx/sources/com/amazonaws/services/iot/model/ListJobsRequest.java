package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListJobsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String namespaceId;
    private String nextToken;
    private String status;
    private String targetSelection;
    private String thingGroupId;
    private String thingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListJobsRequest)) {
            return false;
        }
        ListJobsRequest listJobsRequest = (ListJobsRequest) obj;
        if ((listJobsRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (listJobsRequest.getStatus() != null && !listJobsRequest.getStatus().equals(getStatus())) {
            return false;
        }
        if ((listJobsRequest.getTargetSelection() == null) ^ (getTargetSelection() == null)) {
            return false;
        }
        if (listJobsRequest.getTargetSelection() != null && !listJobsRequest.getTargetSelection().equals(getTargetSelection())) {
            return false;
        }
        if ((listJobsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listJobsRequest.getMaxResults() != null && !listJobsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listJobsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listJobsRequest.getNextToken() != null && !listJobsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listJobsRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (listJobsRequest.getThingGroupName() != null && !listJobsRequest.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((listJobsRequest.getThingGroupId() == null) ^ (getThingGroupId() == null)) {
            return false;
        }
        if (listJobsRequest.getThingGroupId() != null && !listJobsRequest.getThingGroupId().equals(getThingGroupId())) {
            return false;
        }
        if ((listJobsRequest.getNamespaceId() == null) ^ (getNamespaceId() == null)) {
            return false;
        }
        return listJobsRequest.getNamespaceId() == null || listJobsRequest.getNamespaceId().equals(getNamespaceId());
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNamespaceId() {
        return this.namespaceId;
    }

    public String getNextToken() {
        return this.nextToken;
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

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public int hashCode() {
        return (((((((((((((getStatus() == null ? 0 : getStatus().hashCode()) + 31) * 31) + (getTargetSelection() == null ? 0 : getTargetSelection().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getThingGroupName() == null ? 0 : getThingGroupName().hashCode())) * 31) + (getThingGroupId() == null ? 0 : getThingGroupId().hashCode())) * 31) + (getNamespaceId() != null ? getNamespaceId().hashCode() : 0);
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNamespaceId(String str) {
        this.namespaceId = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
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

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getTargetSelection() != null) {
            sb.append("targetSelection: " + getTargetSelection() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        }
        if (getThingGroupId() != null) {
            sb.append("thingGroupId: " + getThingGroupId() + ",");
        }
        if (getNamespaceId() != null) {
            sb.append("namespaceId: " + getNamespaceId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListJobsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListJobsRequest withNamespaceId(String str) {
        this.namespaceId = str;
        return this;
    }

    public ListJobsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListJobsRequest withStatus(JobStatus jobStatus) {
        this.status = jobStatus.toString();
        return this;
    }

    public ListJobsRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    public ListJobsRequest withThingGroupId(String str) {
        this.thingGroupId = str;
        return this;
    }

    public ListJobsRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTargetSelection(String str) {
        this.targetSelection = str;
    }

    public ListJobsRequest withStatus(String str) {
        this.status = str;
        return this;
    }

    public ListJobsRequest withTargetSelection(String str) {
        this.targetSelection = str;
        return this;
    }
}
