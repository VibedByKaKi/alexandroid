package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateSecurityProfileResult implements Serializable {
    private String securityProfileArn;
    private String securityProfileName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateSecurityProfileResult)) {
            return false;
        }
        CreateSecurityProfileResult createSecurityProfileResult = (CreateSecurityProfileResult) obj;
        if ((createSecurityProfileResult.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (createSecurityProfileResult.getSecurityProfileName() != null && !createSecurityProfileResult.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((createSecurityProfileResult.getSecurityProfileArn() == null) ^ (getSecurityProfileArn() == null)) {
            return false;
        }
        return createSecurityProfileResult.getSecurityProfileArn() == null || createSecurityProfileResult.getSecurityProfileArn().equals(getSecurityProfileArn());
    }

    public String getSecurityProfileArn() {
        return this.securityProfileArn;
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public int hashCode() {
        return (((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getSecurityProfileArn() != null ? getSecurityProfileArn().hashCode() : 0);
    }

    public void setSecurityProfileArn(String str) {
        this.securityProfileArn = str;
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getSecurityProfileArn() != null) {
            sb.append("securityProfileArn: " + getSecurityProfileArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateSecurityProfileResult withSecurityProfileArn(String str) {
        this.securityProfileArn = str;
        return this;
    }

    public CreateSecurityProfileResult withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }
}
