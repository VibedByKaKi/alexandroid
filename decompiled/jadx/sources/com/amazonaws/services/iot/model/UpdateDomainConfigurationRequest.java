package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateDomainConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private AuthorizerConfig authorizerConfig;
    private String domainConfigurationName;
    private String domainConfigurationStatus;
    private Boolean removeAuthorizerConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateDomainConfigurationRequest)) {
            return false;
        }
        UpdateDomainConfigurationRequest updateDomainConfigurationRequest = (UpdateDomainConfigurationRequest) obj;
        if ((updateDomainConfigurationRequest.getDomainConfigurationName() == null) ^ (getDomainConfigurationName() == null)) {
            return false;
        }
        if (updateDomainConfigurationRequest.getDomainConfigurationName() != null && !updateDomainConfigurationRequest.getDomainConfigurationName().equals(getDomainConfigurationName())) {
            return false;
        }
        if ((updateDomainConfigurationRequest.getAuthorizerConfig() == null) ^ (getAuthorizerConfig() == null)) {
            return false;
        }
        if (updateDomainConfigurationRequest.getAuthorizerConfig() != null && !updateDomainConfigurationRequest.getAuthorizerConfig().equals(getAuthorizerConfig())) {
            return false;
        }
        if ((updateDomainConfigurationRequest.getDomainConfigurationStatus() == null) ^ (getDomainConfigurationStatus() == null)) {
            return false;
        }
        if (updateDomainConfigurationRequest.getDomainConfigurationStatus() != null && !updateDomainConfigurationRequest.getDomainConfigurationStatus().equals(getDomainConfigurationStatus())) {
            return false;
        }
        if ((updateDomainConfigurationRequest.getRemoveAuthorizerConfig() == null) ^ (getRemoveAuthorizerConfig() == null)) {
            return false;
        }
        return updateDomainConfigurationRequest.getRemoveAuthorizerConfig() == null || updateDomainConfigurationRequest.getRemoveAuthorizerConfig().equals(getRemoveAuthorizerConfig());
    }

    public AuthorizerConfig getAuthorizerConfig() {
        return this.authorizerConfig;
    }

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    public String getDomainConfigurationStatus() {
        return this.domainConfigurationStatus;
    }

    public Boolean getRemoveAuthorizerConfig() {
        return this.removeAuthorizerConfig;
    }

    public int hashCode() {
        return (((((((getDomainConfigurationName() == null ? 0 : getDomainConfigurationName().hashCode()) + 31) * 31) + (getAuthorizerConfig() == null ? 0 : getAuthorizerConfig().hashCode())) * 31) + (getDomainConfigurationStatus() == null ? 0 : getDomainConfigurationStatus().hashCode())) * 31) + (getRemoveAuthorizerConfig() != null ? getRemoveAuthorizerConfig().hashCode() : 0);
    }

    public Boolean isRemoveAuthorizerConfig() {
        return this.removeAuthorizerConfig;
    }

    public void setAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
    }

    public void setDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
    }

    public void setDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
    }

    public void setRemoveAuthorizerConfig(Boolean bool) {
        this.removeAuthorizerConfig = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomainConfigurationName() != null) {
            sb.append("domainConfigurationName: " + getDomainConfigurationName() + ",");
        }
        if (getAuthorizerConfig() != null) {
            sb.append("authorizerConfig: " + getAuthorizerConfig() + ",");
        }
        if (getDomainConfigurationStatus() != null) {
            sb.append("domainConfigurationStatus: " + getDomainConfigurationStatus() + ",");
        }
        if (getRemoveAuthorizerConfig() != null) {
            sb.append("removeAuthorizerConfig: " + getRemoveAuthorizerConfig());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateDomainConfigurationRequest withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
        return this;
    }

    public UpdateDomainConfigurationRequest withDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
        return this;
    }

    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
        return this;
    }

    public UpdateDomainConfigurationRequest withRemoveAuthorizerConfig(Boolean bool) {
        this.removeAuthorizerConfig = bool;
        return this;
    }

    public void setDomainConfigurationStatus(String str) {
        this.domainConfigurationStatus = str;
    }

    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(String str) {
        this.domainConfigurationStatus = str;
        return this;
    }
}
