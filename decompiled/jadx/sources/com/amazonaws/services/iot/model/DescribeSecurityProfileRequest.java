package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    private String securityProfileName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeSecurityProfileRequest)) {
            return false;
        }
        DescribeSecurityProfileRequest describeSecurityProfileRequest = (DescribeSecurityProfileRequest) obj;
        if ((describeSecurityProfileRequest.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        return describeSecurityProfileRequest.getSecurityProfileName() == null || describeSecurityProfileRequest.getSecurityProfileName().equals(getSecurityProfileName());
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public int hashCode() {
        return 31 + (getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode());
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeSecurityProfileRequest withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }
}
