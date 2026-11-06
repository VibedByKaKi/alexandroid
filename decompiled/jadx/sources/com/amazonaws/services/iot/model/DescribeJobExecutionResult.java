package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobExecutionResult implements Serializable {
    private JobExecution execution;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeJobExecutionResult)) {
            return false;
        }
        DescribeJobExecutionResult describeJobExecutionResult = (DescribeJobExecutionResult) obj;
        if ((describeJobExecutionResult.getExecution() == null) ^ (getExecution() == null)) {
            return false;
        }
        return describeJobExecutionResult.getExecution() == null || describeJobExecutionResult.getExecution().equals(getExecution());
    }

    public JobExecution getExecution() {
        return this.execution;
    }

    public int hashCode() {
        return 31 + (getExecution() == null ? 0 : getExecution().hashCode());
    }

    public void setExecution(JobExecution jobExecution) {
        this.execution = jobExecution;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getExecution() != null) {
            sb.append("execution: " + getExecution());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeJobExecutionResult withExecution(JobExecution jobExecution) {
        this.execution = jobExecution;
        return this;
    }
}
