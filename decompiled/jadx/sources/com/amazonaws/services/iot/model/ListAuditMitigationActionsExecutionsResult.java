package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuditMitigationActionsExecutionsResult implements Serializable {
    private List<AuditMitigationActionExecutionMetadata> actionsExecutions;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuditMitigationActionsExecutionsResult)) {
            return false;
        }
        ListAuditMitigationActionsExecutionsResult listAuditMitigationActionsExecutionsResult = (ListAuditMitigationActionsExecutionsResult) obj;
        if ((listAuditMitigationActionsExecutionsResult.getActionsExecutions() == null) ^ (getActionsExecutions() == null)) {
            return false;
        }
        if (listAuditMitigationActionsExecutionsResult.getActionsExecutions() != null && !listAuditMitigationActionsExecutionsResult.getActionsExecutions().equals(getActionsExecutions())) {
            return false;
        }
        if ((listAuditMitigationActionsExecutionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listAuditMitigationActionsExecutionsResult.getNextToken() == null || listAuditMitigationActionsExecutionsResult.getNextToken().equals(getNextToken());
    }

    public List<AuditMitigationActionExecutionMetadata> getActionsExecutions() {
        return this.actionsExecutions;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getActionsExecutions() == null ? 0 : getActionsExecutions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setActionsExecutions(Collection<AuditMitigationActionExecutionMetadata> collection) {
        if (collection == null) {
            this.actionsExecutions = null;
        } else {
            this.actionsExecutions = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionsExecutions() != null) {
            sb.append("actionsExecutions: " + getActionsExecutions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuditMitigationActionsExecutionsResult withActionsExecutions(AuditMitigationActionExecutionMetadata... auditMitigationActionExecutionMetadataArr) {
        if (getActionsExecutions() == null) {
            this.actionsExecutions = new ArrayList(auditMitigationActionExecutionMetadataArr.length);
        }
        for (AuditMitigationActionExecutionMetadata auditMitigationActionExecutionMetadata : auditMitigationActionExecutionMetadataArr) {
            this.actionsExecutions.add(auditMitigationActionExecutionMetadata);
        }
        return this;
    }

    public ListAuditMitigationActionsExecutionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListAuditMitigationActionsExecutionsResult withActionsExecutions(Collection<AuditMitigationActionExecutionMetadata> collection) {
        setActionsExecutions(collection);
        return this;
    }
}
