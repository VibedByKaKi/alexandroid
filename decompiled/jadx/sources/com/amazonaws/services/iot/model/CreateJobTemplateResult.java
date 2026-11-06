package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateJobTemplateResult implements Serializable {
    private String jobTemplateArn;
    private String jobTemplateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateJobTemplateResult)) {
            return false;
        }
        CreateJobTemplateResult createJobTemplateResult = (CreateJobTemplateResult) obj;
        if ((createJobTemplateResult.getJobTemplateArn() == null) ^ (getJobTemplateArn() == null)) {
            return false;
        }
        if (createJobTemplateResult.getJobTemplateArn() != null && !createJobTemplateResult.getJobTemplateArn().equals(getJobTemplateArn())) {
            return false;
        }
        if ((createJobTemplateResult.getJobTemplateId() == null) ^ (getJobTemplateId() == null)) {
            return false;
        }
        return createJobTemplateResult.getJobTemplateId() == null || createJobTemplateResult.getJobTemplateId().equals(getJobTemplateId());
    }

    public String getJobTemplateArn() {
        return this.jobTemplateArn;
    }

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public int hashCode() {
        return (((getJobTemplateArn() == null ? 0 : getJobTemplateArn().hashCode()) + 31) * 31) + (getJobTemplateId() != null ? getJobTemplateId().hashCode() : 0);
    }

    public void setJobTemplateArn(String str) {
        this.jobTemplateArn = str;
    }

    public void setJobTemplateId(String str) {
        this.jobTemplateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobTemplateArn() != null) {
            sb.append("jobTemplateArn: " + getJobTemplateArn() + ",");
        }
        if (getJobTemplateId() != null) {
            sb.append("jobTemplateId: " + getJobTemplateId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateJobTemplateResult withJobTemplateArn(String str) {
        this.jobTemplateArn = str;
        return this;
    }

    public CreateJobTemplateResult withJobTemplateId(String str) {
        this.jobTemplateId = str;
        return this;
    }
}
