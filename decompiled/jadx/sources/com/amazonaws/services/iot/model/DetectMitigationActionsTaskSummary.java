package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetectMitigationActionsTaskSummary implements Serializable {
    private List<MitigationAction> actionsDefinition;
    private Boolean onlyActiveViolationsIncluded;
    private Boolean suppressedAlertsIncluded;
    private DetectMitigationActionsTaskTarget target;
    private Date taskEndTime;
    private String taskId;
    private Date taskStartTime;
    private DetectMitigationActionsTaskStatistics taskStatistics;
    private String taskStatus;
    private ViolationEventOccurrenceRange violationEventOccurrenceRange;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectMitigationActionsTaskSummary)) {
            return false;
        }
        DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary = (DetectMitigationActionsTaskSummary) obj;
        if ((detectMitigationActionsTaskSummary.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getTaskId() != null && !detectMitigationActionsTaskSummary.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getTaskStatus() == null) ^ (getTaskStatus() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getTaskStatus() != null && !detectMitigationActionsTaskSummary.getTaskStatus().equals(getTaskStatus())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getTaskStartTime() == null) ^ (getTaskStartTime() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getTaskStartTime() != null && !detectMitigationActionsTaskSummary.getTaskStartTime().equals(getTaskStartTime())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getTaskEndTime() == null) ^ (getTaskEndTime() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getTaskEndTime() != null && !detectMitigationActionsTaskSummary.getTaskEndTime().equals(getTaskEndTime())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getTarget() == null) ^ (getTarget() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getTarget() != null && !detectMitigationActionsTaskSummary.getTarget().equals(getTarget())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getViolationEventOccurrenceRange() == null) ^ (getViolationEventOccurrenceRange() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getViolationEventOccurrenceRange() != null && !detectMitigationActionsTaskSummary.getViolationEventOccurrenceRange().equals(getViolationEventOccurrenceRange())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getOnlyActiveViolationsIncluded() == null) ^ (getOnlyActiveViolationsIncluded() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getOnlyActiveViolationsIncluded() != null && !detectMitigationActionsTaskSummary.getOnlyActiveViolationsIncluded().equals(getOnlyActiveViolationsIncluded())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getSuppressedAlertsIncluded() == null) ^ (getSuppressedAlertsIncluded() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getSuppressedAlertsIncluded() != null && !detectMitigationActionsTaskSummary.getSuppressedAlertsIncluded().equals(getSuppressedAlertsIncluded())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getActionsDefinition() == null) ^ (getActionsDefinition() == null)) {
            return false;
        }
        if (detectMitigationActionsTaskSummary.getActionsDefinition() != null && !detectMitigationActionsTaskSummary.getActionsDefinition().equals(getActionsDefinition())) {
            return false;
        }
        if ((detectMitigationActionsTaskSummary.getTaskStatistics() == null) ^ (getTaskStatistics() == null)) {
            return false;
        }
        return detectMitigationActionsTaskSummary.getTaskStatistics() == null || detectMitigationActionsTaskSummary.getTaskStatistics().equals(getTaskStatistics());
    }

    public List<MitigationAction> getActionsDefinition() {
        return this.actionsDefinition;
    }

    public Boolean getOnlyActiveViolationsIncluded() {
        return this.onlyActiveViolationsIncluded;
    }

    public Boolean getSuppressedAlertsIncluded() {
        return this.suppressedAlertsIncluded;
    }

    public DetectMitigationActionsTaskTarget getTarget() {
        return this.target;
    }

    public Date getTaskEndTime() {
        return this.taskEndTime;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public Date getTaskStartTime() {
        return this.taskStartTime;
    }

    public DetectMitigationActionsTaskStatistics getTaskStatistics() {
        return this.taskStatistics;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ViolationEventOccurrenceRange getViolationEventOccurrenceRange() {
        return this.violationEventOccurrenceRange;
    }

    public int hashCode() {
        return (((((((((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getTaskStatus() == null ? 0 : getTaskStatus().hashCode())) * 31) + (getTaskStartTime() == null ? 0 : getTaskStartTime().hashCode())) * 31) + (getTaskEndTime() == null ? 0 : getTaskEndTime().hashCode())) * 31) + (getTarget() == null ? 0 : getTarget().hashCode())) * 31) + (getViolationEventOccurrenceRange() == null ? 0 : getViolationEventOccurrenceRange().hashCode())) * 31) + (getOnlyActiveViolationsIncluded() == null ? 0 : getOnlyActiveViolationsIncluded().hashCode())) * 31) + (getSuppressedAlertsIncluded() == null ? 0 : getSuppressedAlertsIncluded().hashCode())) * 31) + (getActionsDefinition() == null ? 0 : getActionsDefinition().hashCode())) * 31) + (getTaskStatistics() != null ? getTaskStatistics().hashCode() : 0);
    }

    public Boolean isOnlyActiveViolationsIncluded() {
        return this.onlyActiveViolationsIncluded;
    }

    public Boolean isSuppressedAlertsIncluded() {
        return this.suppressedAlertsIncluded;
    }

    public void setActionsDefinition(Collection<MitigationAction> collection) {
        if (collection == null) {
            this.actionsDefinition = null;
        } else {
            this.actionsDefinition = new ArrayList(collection);
        }
    }

    public void setOnlyActiveViolationsIncluded(Boolean bool) {
        this.onlyActiveViolationsIncluded = bool;
    }

    public void setSuppressedAlertsIncluded(Boolean bool) {
        this.suppressedAlertsIncluded = bool;
    }

    public void setTarget(DetectMitigationActionsTaskTarget detectMitigationActionsTaskTarget) {
        this.target = detectMitigationActionsTaskTarget;
    }

    public void setTaskEndTime(Date date) {
        this.taskEndTime = date;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTaskStartTime(Date date) {
        this.taskStartTime = date;
    }

    public void setTaskStatistics(DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics) {
        this.taskStatistics = detectMitigationActionsTaskStatistics;
    }

    public void setTaskStatus(DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus) {
        this.taskStatus = detectMitigationActionsTaskStatus.toString();
    }

    public void setViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getTaskStatus() != null) {
            sb.append("taskStatus: " + getTaskStatus() + ",");
        }
        if (getTaskStartTime() != null) {
            sb.append("taskStartTime: " + getTaskStartTime() + ",");
        }
        if (getTaskEndTime() != null) {
            sb.append("taskEndTime: " + getTaskEndTime() + ",");
        }
        if (getTarget() != null) {
            sb.append("target: " + getTarget() + ",");
        }
        if (getViolationEventOccurrenceRange() != null) {
            sb.append("violationEventOccurrenceRange: " + getViolationEventOccurrenceRange() + ",");
        }
        if (getOnlyActiveViolationsIncluded() != null) {
            sb.append("onlyActiveViolationsIncluded: " + getOnlyActiveViolationsIncluded() + ",");
        }
        if (getSuppressedAlertsIncluded() != null) {
            sb.append("suppressedAlertsIncluded: " + getSuppressedAlertsIncluded() + ",");
        }
        if (getActionsDefinition() != null) {
            sb.append("actionsDefinition: " + getActionsDefinition() + ",");
        }
        if (getTaskStatistics() != null) {
            sb.append("taskStatistics: " + getTaskStatistics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DetectMitigationActionsTaskSummary withActionsDefinition(MitigationAction... mitigationActionArr) {
        if (getActionsDefinition() == null) {
            this.actionsDefinition = new ArrayList(mitigationActionArr.length);
        }
        for (MitigationAction mitigationAction : mitigationActionArr) {
            this.actionsDefinition.add(mitigationAction);
        }
        return this;
    }

    public DetectMitigationActionsTaskSummary withOnlyActiveViolationsIncluded(Boolean bool) {
        this.onlyActiveViolationsIncluded = bool;
        return this;
    }

    public DetectMitigationActionsTaskSummary withSuppressedAlertsIncluded(Boolean bool) {
        this.suppressedAlertsIncluded = bool;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTarget(DetectMitigationActionsTaskTarget detectMitigationActionsTaskTarget) {
        this.target = detectMitigationActionsTaskTarget;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTaskEndTime(Date date) {
        this.taskEndTime = date;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTaskStartTime(Date date) {
        this.taskStartTime = date;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTaskStatistics(DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics) {
        this.taskStatistics = detectMitigationActionsTaskStatistics;
        return this;
    }

    public DetectMitigationActionsTaskSummary withTaskStatus(DetectMitigationActionsTaskStatus detectMitigationActionsTaskStatus) {
        this.taskStatus = detectMitigationActionsTaskStatus.toString();
        return this;
    }

    public DetectMitigationActionsTaskSummary withViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
        return this;
    }

    public void setTaskStatus(String str) {
        this.taskStatus = str;
    }

    public DetectMitigationActionsTaskSummary withTaskStatus(String str) {
        this.taskStatus = str;
        return this;
    }

    public DetectMitigationActionsTaskSummary withActionsDefinition(Collection<MitigationAction> collection) {
        setActionsDefinition(collection);
        return this;
    }
}
