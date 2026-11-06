package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CancelJobExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    private Long expectedVersion;
    private Boolean force;
    private String jobId;
    private Map<String, String> statusDetails;
    private String thingName;

    public CancelJobExecutionRequest addstatusDetailsEntry(String str, String str2) {
        if (this.statusDetails == null) {
            this.statusDetails = new HashMap();
        }
        if (this.statusDetails.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.statusDetails.put(str, str2);
        return this;
    }

    public CancelJobExecutionRequest clearstatusDetailsEntries() {
        this.statusDetails = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CancelJobExecutionRequest)) {
            return false;
        }
        CancelJobExecutionRequest cancelJobExecutionRequest = (CancelJobExecutionRequest) obj;
        if ((cancelJobExecutionRequest.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (cancelJobExecutionRequest.getJobId() != null && !cancelJobExecutionRequest.getJobId().equals(getJobId())) {
            return false;
        }
        if ((cancelJobExecutionRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        if (cancelJobExecutionRequest.getThingName() != null && !cancelJobExecutionRequest.getThingName().equals(getThingName())) {
            return false;
        }
        if ((cancelJobExecutionRequest.getForce() == null) ^ (getForce() == null)) {
            return false;
        }
        if (cancelJobExecutionRequest.getForce() != null && !cancelJobExecutionRequest.getForce().equals(getForce())) {
            return false;
        }
        if ((cancelJobExecutionRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        if (cancelJobExecutionRequest.getExpectedVersion() != null && !cancelJobExecutionRequest.getExpectedVersion().equals(getExpectedVersion())) {
            return false;
        }
        if ((cancelJobExecutionRequest.getStatusDetails() == null) ^ (getStatusDetails() == null)) {
            return false;
        }
        return cancelJobExecutionRequest.getStatusDetails() == null || cancelJobExecutionRequest.getStatusDetails().equals(getStatusDetails());
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public Boolean getForce() {
        return this.force;
    }

    public String getJobId() {
        return this.jobId;
    }

    public Map<String, String> getStatusDetails() {
        return this.statusDetails;
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return (((((((((getJobId() == null ? 0 : getJobId().hashCode()) + 31) * 31) + (getThingName() == null ? 0 : getThingName().hashCode())) * 31) + (getForce() == null ? 0 : getForce().hashCode())) * 31) + (getExpectedVersion() == null ? 0 : getExpectedVersion().hashCode())) * 31) + (getStatusDetails() != null ? getStatusDetails().hashCode() : 0);
    }

    public Boolean isForce() {
        return this.force;
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setForce(Boolean bool) {
        this.force = bool;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setStatusDetails(Map<String, String> map) {
        this.statusDetails = map;
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
        if (getForce() != null) {
            sb.append("force: " + getForce() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion() + ",");
        }
        if (getStatusDetails() != null) {
            sb.append("statusDetails: " + getStatusDetails());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CancelJobExecutionRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public CancelJobExecutionRequest withForce(Boolean bool) {
        this.force = bool;
        return this;
    }

    public CancelJobExecutionRequest withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public CancelJobExecutionRequest withStatusDetails(Map<String, String> map) {
        this.statusDetails = map;
        return this;
    }

    public CancelJobExecutionRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
