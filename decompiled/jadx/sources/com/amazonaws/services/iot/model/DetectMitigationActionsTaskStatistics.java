package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetectMitigationActionsTaskStatistics implements Serializable {
    private Long actionsExecuted;
    private Long actionsFailed;
    private Long actionsSkipped;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectMitigationActionsTaskStatistics)) {
            return false;
        }
        DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics = (DetectMitigationActionsTaskStatistics) obj;
        if ((detectMitigationActionsTaskStatistics.getActionsExecuted() == null) ^ (getActionsExecuted() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskStatistics.getActionsExecuted() != null && !detectMitigationActionsTaskStatistics.getActionsExecuted().equals(getActionsExecuted())) {
            return false;
        }
        if ((detectMitigationActionsTaskStatistics.getActionsSkipped() == null) ^ (getActionsSkipped() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskStatistics.getActionsSkipped() != null && !detectMitigationActionsTaskStatistics.getActionsSkipped().equals(getActionsSkipped())) {
            return false;
        }
        if ((detectMitigationActionsTaskStatistics.getActionsFailed() == null) ^ (getActionsFailed() == null)) {
            return false;
        }
        return detectMitigationActionsTaskStatistics.getActionsFailed() == null || detectMitigationActionsTaskStatistics.getActionsFailed().equals(getActionsFailed());
    }

    public Long getActionsExecuted() {
        return this.actionsExecuted;
    }

    public Long getActionsFailed() {
        return this.actionsFailed;
    }

    public Long getActionsSkipped() {
        return this.actionsSkipped;
    }

    public int hashCode() {
        return (((((getActionsExecuted() == null ? 0 : getActionsExecuted().hashCode()) + 31) * 31) + (getActionsSkipped() == null ? 0 : getActionsSkipped().hashCode())) * 31) + (getActionsFailed() != null ? getActionsFailed().hashCode() : 0);
    }

    public void setActionsExecuted(Long l) {
        this.actionsExecuted = l;
    }

    public void setActionsFailed(Long l) {
        this.actionsFailed = l;
    }

    public void setActionsSkipped(Long l) {
        this.actionsSkipped = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionsExecuted() != null) {
            sb.append("actionsExecuted: " + getActionsExecuted() + ",");
        }
        if (getActionsSkipped() != null) {
            sb.append("actionsSkipped: " + getActionsSkipped() + ",");
        }
        if (getActionsFailed() != null) {
            sb.append("actionsFailed: " + getActionsFailed());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DetectMitigationActionsTaskStatistics withActionsExecuted(Long l) {
        this.actionsExecuted = l;
        return this;
    }

    public DetectMitigationActionsTaskStatistics withActionsFailed(Long l) {
        this.actionsFailed = l;
        return this;
    }

    public DetectMitigationActionsTaskStatistics withActionsSkipped(Long l) {
        this.actionsSkipped = l;
        return this;
    }
}
