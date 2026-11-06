package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuditTasksResult implements Serializable {
    private String nextToken;
    private List<AuditTaskMetadata> tasks;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuditTasksResult)) {
            return false;
        }
        ListAuditTasksResult listAuditTasksResult = (ListAuditTasksResult) obj;
        if ((listAuditTasksResult.getTasks() == null) ^ (getTasks() == null)) {
            return false;
        }
        if (listAuditTasksResult.getTasks() != null && !listAuditTasksResult.getTasks().equals(getTasks())) {
            return false;
        }
        if ((listAuditTasksResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listAuditTasksResult.getNextToken() == null || listAuditTasksResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<AuditTaskMetadata> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return (((getTasks() == null ? 0 : getTasks().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setTasks(Collection<AuditTaskMetadata> collection) {
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

    public ListAuditTasksResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListAuditTasksResult withTasks(AuditTaskMetadata... auditTaskMetadataArr) {
        if (getTasks() == null) {
            this.tasks = new ArrayList(auditTaskMetadataArr.length);
        }
        for (AuditTaskMetadata auditTaskMetadata : auditTaskMetadataArr) {
            this.tasks.add(auditTaskMetadata);
        }
        return this;
    }

    public ListAuditTasksResult withTasks(Collection<AuditTaskMetadata> collection) {
        setTasks(collection);
        return this;
    }
}
