package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    private Long expectedVersion;
    private String securityProfileName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteSecurityProfileRequest)) {
            return false;
        }
        DeleteSecurityProfileRequest deleteSecurityProfileRequest = (DeleteSecurityProfileRequest) obj;
        if ((deleteSecurityProfileRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (deleteSecurityProfileRequest.getSecurityProfileName() != null && !deleteSecurityProfileRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((deleteSecurityProfileRequest.getExpectedVersion() == null) ^ (getExpectedVersion() == null)) {
            return false;
        }
        return deleteSecurityProfileRequest.getExpectedVersion() == null || deleteSecurityProfileRequest.getExpectedVersion().equals(getExpectedVersion());
    }

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public int hashCode() {
        return (((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getExpectedVersion() != null ? getExpectedVersion().hashCode() : 0);
    }

    public void setExpectedVersion(Long l) {
        this.expectedVersion = l;
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getExpectedVersion() != null) {
            sb.append("expectedVersion: " + getExpectedVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteSecurityProfileRequest withExpectedVersion(Long l) {
        this.expectedVersion = l;
        return this;
    }

    public DeleteSecurityProfileRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }
}
