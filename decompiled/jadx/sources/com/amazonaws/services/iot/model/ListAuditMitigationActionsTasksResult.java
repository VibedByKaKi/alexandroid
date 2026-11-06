package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuditMitigationActionsTasksResult implements Serializable {
    private String nextToken;
    private List<AuditMitigationActionsTaskMetadata> tasks;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuditMitigationActionsTasksResult)) {
            return false;
        }
        ListAuditMitigationActionsTasksResult listAuditMitigationActionsTasksResult = (ListAuditMitigationActionsTasksResult) obj;
        if ((listAuditMitigationActionsTasksResult.getTasks() == null) ^ (getTasks() == null)) {
            return false;
        }
        if (listAuditMitigationActionsTasksResult.getTasks() != null && !listAuditMitigationActionsTasksResult.getTasks().equals(getTasks())) {
            return false;
        }
        if ((listAuditMitigationActionsTasksResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listAuditMitigationActionsTasksResult.getNextToken() == null || listAuditMitigationActionsTasksResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<AuditMitigationActionsTaskMetadata> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return (((getTasks() == null ? 0 : getTasks().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setTasks(Collection<AuditMitigationActionsTaskMetadata> collection) {
        if (collection == null) {
            this.tasks = null;
        } else {
            this.tasks = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTasks() != null) {
            sb.append("tasks: " + getTasks() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuditMitigationActionsTasksResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListAuditMitigationActionsTasksResult withTasks(AuditMitigationActionsTaskMetadata... auditMitigationActionsTaskMetadataArr) {
        if (getTasks() == null) {
            this.tasks = new ArrayList(auditMitigationActionsTaskMetadataArr.length);
        }
        for (AuditMitigationActionsTaskMetadata auditMitigationActionsTaskMetadata : auditMitigationActionsTaskMetadataArr) {
            this.tasks.add(auditMitigationActionsTaskMetadata);
        }
        return this;
    }

    public ListAuditMitigationActionsTasksResult withTasks(Collection<AuditMitigationActionsTaskMetadata> collection) {
        setTasks(collection);
        return this;
    }
}
