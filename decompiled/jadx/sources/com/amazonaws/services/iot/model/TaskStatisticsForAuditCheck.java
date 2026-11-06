package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TaskStatisticsForAuditCheck implements Serializable {
    private Long canceledFindingsCount;
    private Long failedFindingsCount;
    private Long skippedFindingsCount;
    private Long succeededFindingsCount;
    private Long totalFindingsCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TaskStatisticsForAuditCheck)) {
            return false;
        }
        TaskStatisticsForAuditCheck taskStatisticsForAuditCheck = (TaskStatisticsForAuditCheck) obj;
        if ((taskStatisticsForAuditCheck.getTotalFindingsCount() == null) ^ (getTotalFindingsCount() == null)) {
            return false;
        }
        if (taskStatisticsForAuditCheck.getTotalFindingsCount() != null && !taskStatisticsForAuditCheck.getTotalFindingsCount().equals(getTotalFindingsCount())) {
            return false;
        }
        if ((taskStatisticsForAuditCheck.getFailedFindingsCount() == null) ^ (getFailedFindingsCount() == null)) {
            return false;
        }
        if (taskStatisticsForAuditCheck.getFailedFindingsCount() != null && !taskStatisticsForAuditCheck.getFailedFindingsCount().equals(getFailedFindingsCount())) {
            return false;
        }
        if ((taskStatisticsForAuditCheck.getSucceededFindingsCount() == null) ^ (getSucceededFindingsCount() == null)) {
            return false;
        }
        if (taskStatisticsForAuditCheck.getSucceededFindingsCount() != null && !taskStatisticsForAuditCheck.getSucceededFindingsCount().equals(getSucceededFindingsCount())) {
            return false;
        }
        if ((taskStatisticsForAuditCheck.getSkippedFindingsCount() == null) ^ (getSkippedFindingsCount() == null)) {
            return false;
        }
        if (taskStatisticsForAuditCheck.getSkippedFindingsCount() != null && !taskStatisticsForAuditCheck.getSkippedFindingsCount().equals(getSkippedFindingsCount())) {
            return false;
        }
        if ((taskStatisticsForAuditCheck.getCanceledFindingsCount() == null) ^ (getCanceledFindingsCount() == null)) {
            return false;
        }
        return taskStatisticsForAuditCheck.getCanceledFindingsCount() == null || taskStatisticsForAuditCheck.getCanceledFindingsCount().equals(getCanceledFindingsCount());
    }

    public Long getCanceledFindingsCount() {
        return this.canceledFindingsCount;
    }

    public Long getFailedFindingsCount() {
        return this.failedFindingsCount;
    }

    public Long getSkippedFindingsCount() {
        return this.skippedFindingsCount;
    }

    public Long getSucceededFindingsCount() {
        return this.succeededFindingsCount;
    }

    public Long getTotalFindingsCount() {
        return this.totalFindingsCount;
    }

    public int hashCode() {
        return (((((((((getTotalFindingsCount() == null ? 0 : getTotalFindingsCount().hashCode()) + 31) * 31) + (getFailedFindingsCount() == null ? 0 : getFailedFindingsCount().hashCode())) * 31) + (getSucceededFindingsCount() == null ? 0 : getSucceededFindingsCount().hashCode())) * 31) + (getSkippedFindingsCount() == null ? 0 : getSkippedFindingsCount().hashCode())) * 31) + (getCanceledFindingsCount() != null ? getCanceledFindingsCount().hashCode() : 0);
    }

    public void setCanceledFindingsCount(Long l) {
        this.canceledFindingsCount = l;
    }

    public void setFailedFindingsCount(Long l) {
        this.failedFindingsCount = l;
    }

    public void setSkippedFindingsCount(Long l) {
        this.skippedFindingsCount = l;
    }

    public void setSucceededFindingsCount(Long l) {
        this.succeededFindingsCount = l;
    }

    public void setTotalFindingsCount(Long l) {
        this.totalFindingsCount = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTotalFindingsCount() != null) {
            sb.append("totalFindingsCount: " + getTotalFindingsCount() + ",");
        }
        if (getFailedFindingsCount() != null) {
            sb.append("failedFindingsCount: " + getFailedFindingsCount() + ",");
        }
        if (getSucceededFindingsCount() != null) {
            sb.append("succeededFindingsCount: " + getSucceededFindingsCount() + ",");
        }
        if (getSkippedFindingsCount() != null) {
            sb.append("skippedFindingsCount: " + getSkippedFindingsCount() + ",");
        }
        if (getCanceledFindingsCount() != null) {
            sb.append("canceledFindingsCount: " + getCanceledFindingsCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TaskStatisticsForAuditCheck withCanceledFindingsCount(Long l) {
        this.canceledFindingsCount = l;
        return this;
    }

    public TaskStatisticsForAuditCheck withFailedFindingsCount(Long l) {
        this.failedFindingsCount = l;
        return this;
    }

    public TaskStatisticsForAuditCheck withSkippedFindingsCount(Long l) {
        this.skippedFindingsCount = l;
        return this;
    }

    public TaskStatisticsForAuditCheck withSucceededFindingsCount(Long l) {
        this.succeededFindingsCount = l;
        return this;
    }

    public TaskStatisticsForAuditCheck withTotalFindingsCount(Long l) {
        this.totalFindingsCount = l;
        return this;
    }
}
