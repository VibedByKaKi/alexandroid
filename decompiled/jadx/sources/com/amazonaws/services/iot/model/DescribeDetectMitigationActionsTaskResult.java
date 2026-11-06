package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDetectMitigationActionsTaskResult implements Serializable {
    private DetectMitigationActionsTaskSummary taskSummary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDetectMitigationActionsTaskResult)) {
            return false;
        }
        DescribeDetectMitigationActionsTaskResult describeDetectMitigationActionsTaskResult = (DescribeDetectMitigationActionsTaskResult) obj;
        if ((describeDetectMitigationActionsTaskResult.getTaskSummary() == null) ^ (getTaskSummary() == null)) {
            return false;
        }
        return describeDetectMitigationActionsTaskResult.getTaskSummary() == null || describeDetectMitigationActionsTaskResult.getTaskSummary().equals(getTaskSummary());
    }

    public DetectMitigationActionsTaskSummary getTaskSummary() {
        return this.taskSummary;
    }

    public int hashCode() {
        return 31 + (getTaskSummary() == null ? 0 : getTaskSummary().hashCode());
    }

    public void setTaskSummary(DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary) {
        this.taskSummary = detectMitigationActionsTaskSummary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskSummary() != null) {
            sb.append("taskSummary: " + getTaskSummary());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeDetectMitigationActionsTaskResult withTaskSummary(DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary) {
        this.taskSummary = detectMitigationActionsTaskSummary;
        return this;
    }
}
