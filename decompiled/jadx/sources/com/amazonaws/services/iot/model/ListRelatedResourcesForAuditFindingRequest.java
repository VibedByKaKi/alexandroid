package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListRelatedResourcesForAuditFindingRequest extends AmazonWebServiceRequest implements Serializable {
    private String findingId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRelatedResourcesForAuditFindingRequest)) {
            return false;
        }
        ListRelatedResourcesForAuditFindingRequest listRelatedResourcesForAuditFindingRequest = (ListRelatedResourcesForAuditFindingRequest) obj;
        if ((listRelatedResourcesForAuditFindingRequest.getFindingId() == null) ^ (getFindingId() == null)) {
            return false;
        }
        if (listRelatedResourcesForAuditFindingRequest.getFindingId() != null && !listRelatedResourcesForAuditFindingRequest.getFindingId().equals(getFindingId())) {
            return false;
        }
        if ((listRelatedResourcesForAuditFindingRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listRelatedResourcesForAuditFindingRequest.getNextToken() != null && !listRelatedResourcesForAuditFindingRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listRelatedResourcesForAuditFindingRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        return listRelatedResourcesForAuditFindingRequest.getMaxResults() == null || listRelatedResourcesForAuditFindingRequest.getMaxResults().equals(getMaxResults());
    }

    public String getFindingId() {
        return this.findingId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getFindingId() == null ? 0 : getFindingId().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() != null ? getMaxResults().hashCode() : 0);
    }

    public void setFindingId(String str) {
        this.findingId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFindingId() != null) {
            sb.append("findingId: " + getFindingId() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("maxResults: " + getMaxResults());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListRelatedResourcesForAuditFindingRequest withFindingId(String str) {
        this.findingId = str;
        return this;
    }

    public ListRelatedResourcesForAuditFindingRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListRelatedResourcesForAuditFindingRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
