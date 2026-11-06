package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteJobRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean force;
    private String jobId;
    private String namespaceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteJobRequest)) {
            return false;
        }
        DeleteJobRequest deleteJobRequest = (DeleteJobRequest) obj;
        if ((deleteJobRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (deleteJobRequest.getJobId() != null && !deleteJobRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((deleteJobRequest.getForce() == null) ^ (getForce() == null)) {
            return false;
        }
        if (deleteJobRequest.getForce() != null && !deleteJobRequest.getForce().equals(getForce())) {
            return false;
        }
        if ((deleteJobRequest.getNamespaceId() == null) ^ (getNamespaceId() == null)) {
            return false;
        }
        return deleteJobRequest.getNamespaceId() == null || deleteJobRequest.getNamespaceId().equals(getNamespaceId());
    }

    public Boolean getForce() {
        return this.force;
    }

    public String getJobId() {
        return this.jobId;
    }

    public String getNamespaceId() {
        return this.namespaceId;
    }

    public int hashCode() {
        return (((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getForce() == null ? 0 : getForce().hashCode())) * 31) + (getNamespaceId() != null ? getNamespaceId().hashCode() : 0);
    }

    public Boolean isForce() {
        return this.force;
    }

    public void setForce(Boolean bool) {
        this.force = bool;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setNamespaceId(String str) {
        this.namespaceId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getJobId() != null) {
            sb.append("jobId: " + getJobId() + ",");
        }
        if (getForce() != null) {
            sb.append("force: " + getForce() + ",");
        }
        if (getNamespaceId() != null) {
            sb.append("namespaceId: " + getNamespaceId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteJobRequest withForce(Boolean bool) {
        this.force = bool;
        return this;
    }

    public DeleteJobRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public DeleteJobRequest withNamespaceId(String str) {
        this.namespaceId = str;
        return this;
    }
}
