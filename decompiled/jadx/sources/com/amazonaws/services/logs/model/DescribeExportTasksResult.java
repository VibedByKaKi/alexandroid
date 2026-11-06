package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeExportTasksResult implements Serializable {
    private List<ExportTask> exportTasks;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeExportTasksResult)) {
            return false;
        }
        DescribeExportTasksResult describeExportTasksResult = (DescribeExportTasksResult) obj;
        if ((describeExportTasksResult.getExportTasks() == null) ^ (getExportTasks() == null)) {
            return false;
        }
        if (describeExportTasksResult.getExportTasks() != null && !describeExportTasksResult.getExportTasks().equals(getExportTasks())) {
            return false;
        }
        if ((describeExportTasksResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeExportTasksResult.getNextToken() == null || describeExportTasksResult.getNextToken().equals(getNextToken());
    }

    public List<ExportTask> getExportTasks() {
        return this.exportTasks;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getExportTasks() == null ? 0 : getExportTasks().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setExportTasks(Collection<ExportTask> collection) {
        if (collection == null) {
            this.exportTasks = null;
        } else {
            this.exportTasks = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getExportTasks() != null) {
            sb.append("exportTasks: " + getExportTasks() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeExportTasksResult withExportTasks(ExportTask... exportTaskArr) {
        if (getExportTasks() == null) {
            this.exportTasks = new ArrayList(exportTaskArr.length);
        }
        for (ExportTask exportTask : exportTaskArr) {
            this.exportTasks.add(exportTask);
        }
        return this;
    }

    public DescribeExportTasksResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeExportTasksResult withExportTasks(Collection<ExportTask> collection) {
        setExportTasks(collection);
        return this;
    }
}
