package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    private Long executionNumber;
    private String jobId;
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeJobExecutionRequest)) {
            return false;
        }
        DescribeJobExecutionRequest describeJobExecutionRequest = (DescribeJobExecutionRequest) obj;
        if ((describeJobExecutionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (describeJobExecutionRequest.getJobId() != null && !describeJobExecutionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((describeJobExecutionRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (describeJobExecutionRequest.getThingName() != null && !describeJobExecutionRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((describeJobExecutionRequest.getExecutionNumber() == null) ^ (getExecutionNumber() == null)) {
            return false;
        }
        return describeJobExecutionRequest.getExecutionNumber() == null || describeJobExecutionRequest.getExecutionNumber().equals(getExecutionNumber());
    }

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    public String getJobId() {
        return this.jobId;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getExecutionNumber() != null ? getExecutionNumber().hashCode() : 0);
    }

    public void setExecutionNumber(Long l) {
        this.executionNumber = l;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName() + ",");
        }
        if (getExecutionNumber() != null) {
            sb.append("executionNumber: " + getExecutionNumber());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeJobExecutionRequest withExecutionNumber(Long l) {
        this.executionNumber = l;
        return this;
    }

    public DescribeJobExecutionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public DescribeJobExecutionRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
