package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteOTAUpdateRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean deleteStream;
    private Boolean forceDeleteAWSJob;
    private String otaUpdateId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteOTAUpdateRequest)) {
            return false;
        }
        DeleteOTAUpdateRequest deleteOTAUpdateRequest = (DeleteOTAUpdateRequest) obj;
        if ((deleteOTAUpdateRequest.getOtaUpdateId() == null) ^ (getOtaUpdateId() == null)) {
            return false;
        }
        if (deleteOTAUpdateRequest.getOtaUpdateId() != null && !deleteOTAUpdateRequest.getOtaUpdateId().equals(getOtaUpdateId())) {
            return false;
        }
        if ((deleteOTAUpdateRequest.getDeleteStream() == null) ^ (getDeleteStream() == null)) {
            return false;
        }
        if (deleteOTAUpdateRequest.getDeleteStream() != null && !deleteOTAUpdateRequest.getDeleteStream().equals(getDeleteStream())) {
            return false;
        }
        if ((deleteOTAUpdateRequest.getForceDeleteAWSJob() == null) ^ (getForceDeleteAWSJob() == null)) {
            return false;
        }
        return deleteOTAUpdateRequest.getForceDeleteAWSJob() == null || deleteOTAUpdateRequest.getForceDeleteAWSJob().equals(getForceDeleteAWSJob());
    }

    public Boolean getDeleteStream() {
        return this.deleteStream;
    }

    public Boolean getForceDeleteAWSJob() {
        return this.forceDeleteAWSJob;
    }

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    public int hashCode() {
        return (((((getOtaUpdateId() == null ? 0 : getOtaUpdateId().hashCode()) + 31) * 31) + (getDeleteStream() == null ? 0 : getDeleteStream().hashCode())) * 31) + (getForceDeleteAWSJob() != null ? getForceDeleteAWSJob().hashCode() : 0);
    }

    public Boolean isDeleteStream() {
        return this.deleteStream;
    }

    public Boolean isForceDeleteAWSJob() {
        return this.forceDeleteAWSJob;
    }

    public void setDeleteStream(Boolean bool) {
        this.deleteStream = bool;
    }

    public void setForceDeleteAWSJob(Boolean bool) {
        this.forceDeleteAWSJob = bool;
    }

    public void setOtaUpdateId(String str) {
        this.otaUpdateId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOtaUpdateId() != null) {
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        }
        if (getDeleteStream() != null) {
            sb.append("deleteStream: " + getDeleteStream() + ",");
        }
        if (getForceDeleteAWSJob() != null) {
            sb.append("forceDeleteAWSJob: " + getForceDeleteAWSJob());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteOTAUpdateRequest withDeleteStream(Boolean bool) {
        this.deleteStream = bool;
        return this;
    }

    public DeleteOTAUpdateRequest withForceDeleteAWSJob(Boolean bool) {
        this.forceDeleteAWSJob = bool;
        return this;
    }

    public DeleteOTAUpdateRequest withOtaUpdateId(String str) {
        this.otaUpdateId = str;
        return this;
    }
}
