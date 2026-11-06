package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateJobResult implements Serializable {
    private String description;
    private String jobArn;
    private String jobId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateJobResult)) {
            return false;
        }
        CreateJobResult createJobResult = (CreateJobResult) obj;
        if ((createJobResult.getJobArn() == null) ^ (getJobArn() == null)) {
            return false;
        }
        if (createJobResult.getJobArn() != null && !createJobResult.getJobArn().equals(getJobArn())) {
            return false;
        }
        if ((createJobResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (createJobResult.getJobId() != null && !createJobResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((createJobResult.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        return createJobResult.getDescription() == null || createJobResult.getDescription().equals(getDescription());
    }

    public String getDescription() {
        return this.description;
    }

    public String getJobArn() {
        return this.jobArn;
    }

    public String getJobId() {
        return this.jobId;
    }

    public int hashCode() {
        return (((((getJobArn() == null ? 0 : getJobArn().hashCode()) + 31) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getDescription() != null ? getDescription().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setJobArn(String str) {
        this.jobArn = str;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobArn() != null) {
            sb.append("jobArn: " + getJobArn() + ",");
        }
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateJobResult withDescription(String str) {
        this.description = str;
        return this;
    }

    public CreateJobResult withJobArn(String str) {
        this.jobArn = str;
        return this;
    }

    public CreateJobResult withJobId(String str) {
        this.jobId = str;
        return this;
    }
}
