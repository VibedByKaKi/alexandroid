package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StepFunctionsAction implements Serializable {
    private String executionNamePrefix;
    private String roleArn;
    private String stateMachineName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StepFunctionsAction)) {
            return false;
        }
        StepFunctionsAction stepFunctionsAction = (StepFunctionsAction) obj;
        if ((stepFunctionsAction.getExecutionNamePrefix() == null) ^ (getExecutionNamePrefix() == null)) {
            return false;
        }
        if (stepFunctionsAction.getExecutionNamePrefix() != null && !stepFunctionsAction.getExecutionNamePrefix().equals(getExecutionNamePrefix())) {
            return false;
        }
        if ((stepFunctionsAction.getStateMachineName() == null) ^ (getStateMachineName() == null)) {
            return false;
        }
        if (stepFunctionsAction.getStateMachineName() != null && !stepFunctionsAction.getStateMachineName().equals(getStateMachineName())) {
            return false;
        }
        if ((stepFunctionsAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return stepFunctionsAction.getRoleArn() == null || stepFunctionsAction.getRoleArn().equals(getRoleArn());
    }

    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getStateMachineName() {
        return this.stateMachineName;
    }

    public int hashCode() {
        return (((((getExecutionNamePrefix() == null ? 0 : getExecutionNamePrefix().hashCode()) + 31) * 31) + (getStateMachineName() == null ? 0 : getStateMachineName().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setExecutionNamePrefix(String str) {
        this.executionNamePrefix = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setStateMachineName(String str) {
        this.stateMachineName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getExecutionNamePrefix() != null) {
            sb.append("executionNamePrefix: " + getExecutionNamePrefix() + ",");
        }
        if (getStateMachineName() != null) {
            sb.append("stateMachineName: " + getStateMachineName() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StepFunctionsAction withExecutionNamePrefix(String str) {
        this.executionNamePrefix = str;
        return this;
    }

    public StepFunctionsAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public StepFunctionsAction withStateMachineName(String str) {
        this.stateMachineName = str;
        return this;
    }
}
