package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListMitigationActionsRequest extends AmazonWebServiceRequest implements Serializable {
    private String actionType;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListMitigationActionsRequest)) {
            return false;
        }
        ListMitigationActionsRequest listMitigationActionsRequest = (ListMitigationActionsRequest) obj;
        if ((listMitigationActionsRequest.getActionType() == null) ^ (getActionType() == null)) {
            return false;
        }
        if (listMitigationActionsRequest.getActionType() != null && !listMitigationActionsRequest.getActionType().equals(getActionType())) {
            return false;
        }
        if ((listMitigationActionsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listMitigationActionsRequest.getMaxResults() != null && !listMitigationActionsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listMitigationActionsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listMitigationActionsRequest.getNextToken() == null || listMitigationActionsRequest.getNextToken().equals(getNextToken());
    }

    public String getActionType() {
        return this.actionType;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getActionType() == null ? 0 : getActionType().hashCode()) + 31) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setActionType(MitigationActionType mitigationActionType) {
        this.actionType = mitigationActionType.toString();
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionType() != null) {
            sb.append("actionType: " + getActionType() + ",");
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

    public ListMitigationActionsRequest withActionType(MitigationActionType mitigationActionType) {
        this.actionType = mitigationActionType.toString();
        return this;
    }

    public ListMitigationActionsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListMitigationActionsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public ListMitigationActionsRequest withActionType(String str) {
        this.actionType = str;
        return this;
    }
}
