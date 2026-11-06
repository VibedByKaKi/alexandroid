package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutVerificationStateOnViolationRequest extends AmazonWebServiceRequest implements Serializable {
    private String verificationState;
    private String verificationStateDescription;
    private String violationId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutVerificationStateOnViolationRequest)) {
            return false;
        }
        PutVerificationStateOnViolationRequest putVerificationStateOnViolationRequest = (PutVerificationStateOnViolationRequest) obj;
        if ((putVerificationStateOnViolationRequest.getViolationId() == null) ^ (getViolationId() == null)) {
            return false;
        }
        if (putVerificationStateOnViolationRequest.getViolationId() != null && !putVerificationStateOnViolationRequest.getViolationId().equals(getViolationId())) {
            return false;
        }
        if ((putVerificationStateOnViolationRequest.getVerificationState() == null) ^ (getVerificationState() == null)) {
            return false;
        }
        if (putVerificationStateOnViolationRequest.getVerificationState() != null && !putVerificationStateOnViolationRequest.getVerificationState().equals(getVerificationState())) {
            return false;
        }
        if ((putVerificationStateOnViolationRequest.getVerificationStateDescription() == null) ^ (getVerificationStateDescription() == null)) {
            return false;
        }
        return putVerificationStateOnViolationRequest.getVerificationStateDescription() == null || putVerificationStateOnViolationRequest.getVerificationStateDescription().equals(getVerificationStateDescription());
    }

    public String getVerificationState() {
        return this.verificationState;
    }

    public String getVerificationStateDescription() {
        return this.verificationStateDescription;
    }

    public String getViolationId() {
        return this.violationId;
    }

    public int hashCode() {
        return (((((getViolationId() == null ? 0 : getViolationId().hashCode()) + 31) * 31) + (getVerificationState() == null ? 0 : getVerificationState().hashCode())) * 31) + (getVerificationStateDescription() != null ? getVerificationStateDescription().hashCode() : 0);
    }

    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    public void setVerificationStateDescription(String str) {
        this.verificationStateDescription = str;
    }

    public void setViolationId(String str) {
        this.violationId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getViolationId() != null) {
            sb.append("violationId: " + getViolationId() + ",");
        }
        if (getVerificationState() != null) {
            sb.append("verificationState: " + getVerificationState() + ",");
        }
        if (getVerificationStateDescription() != null) {
            sb.append("verificationStateDescription: " + getVerificationStateDescription());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutVerificationStateOnViolationRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    public PutVerificationStateOnViolationRequest withVerificationStateDescription(String str) {
        this.verificationStateDescription = str;
        return this;
    }

    public PutVerificationStateOnViolationRequest withViolationId(String str) {
        this.violationId = str;
        return this;
    }

    public void setVerificationState(String str) {
        this.verificationState = str;
    }

    public PutVerificationStateOnViolationRequest withVerificationState(String str) {
        this.verificationState = str;
        return this;
    }
}
