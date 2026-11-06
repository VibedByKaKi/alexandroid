package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DetachSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    private String securityProfileName;
    private String securityProfileTargetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetachSecurityProfileRequest)) {
            return false;
        }
        DetachSecurityProfileRequest detachSecurityProfileRequest = (DetachSecurityProfileRequest) obj;
        if ((detachSecurityProfileRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (detachSecurityProfileRequest.getSecurityProfileName() != null && !detachSecurityProfileRequest.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((detachSecurityProfileRequest.getSecurityProfileTargetArn() == null) ^ (getSecurityProfileTargetArn() == null)) {
            return false;
        }
        return detachSecurityProfileRequest.getSecurityProfileTargetArn() == null || detachSecurityProfileRequest.getSecurityProfileTargetArn().equals(getSecurityProfileTargetArn());
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public String getSecurityProfileTargetArn() {
        return this.securityProfileTargetArn;
    }

    public int hashCode() {
        return (((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getSecurityProfileTargetArn() != null ? getSecurityProfileTargetArn().hashCode() : 0);
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public void setSecurityProfileTargetArn(String str) {
        this.securityProfileTargetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getSecurityProfileTargetArn() != null) {
            sb.append("securityProfileTargetArn: " + getSecurityProfileTargetArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DetachSecurityProfileRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }

    public DetachSecurityProfileRequest withSecurityProfileTargetArn(String str) {
        this.securityProfileTargetArn = str;
        return this;
    }
}
