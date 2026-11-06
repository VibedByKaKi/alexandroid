package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeJobTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    private String jobTemplateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeJobTemplateRequest)) {
            return false;
        }
        DescribeJobTemplateRequest describeJobTemplateRequest = (DescribeJobTemplateRequest) obj;
        if ((describeJobTemplateRequest.getJobTemplateId() == null) ^ (getJobTemplateId() == null)) {
            return false;
        }
        return describeJobTemplateRequest.getJobTemplateId() == null || describeJobTemplateRequest.getJobTemplateId().equals(getJobTemplateId());
    }

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public int hashCode() {
        return 31 + (getJobTemplateId() == null ? 0 : getJobTemplateId().hashCode());
    }

    public void setJobTemplateId(String str) {
        this.jobTemplateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobTemplateId() != null) {
            sb.append("jobTemplateId: " + getJobTemplateId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeJobTemplateRequest withJobTemplateId(String str) {
        this.jobTemplateId = str;
        return this;
    }
}
