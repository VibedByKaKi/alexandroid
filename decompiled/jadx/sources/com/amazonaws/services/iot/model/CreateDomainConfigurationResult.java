package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateDomainConfigurationResult implements Serializable {
    private String domainConfigurationArn;
    private String domainConfigurationName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateDomainConfigurationResult)) {
            return false;
        }
        CreateDomainConfigurationResult createDomainConfigurationResult = (CreateDomainConfigurationResult) obj;
        if ((createDomainConfigurationResult.getDomainConfigurationName() == null) ^ (getDomainConfigurationName() == null)) {
            return false;
        }
        if (createDomainConfigurationResult.getDomainConfigurationName() != null && !createDomainConfigurationResult.getDomainConfigurationName().equals(getDomainConfigurationName())) {
            return false;
        }
        if ((createDomainConfigurationResult.getDomainConfigurationArn() == null) ^ (getDomainConfigurationArn() == null)) {
            return false;
        }
        return createDomainConfigurationResult.getDomainConfigurationArn() == null || createDomainConfigurationResult.getDomainConfigurationArn().equals(getDomainConfigurationArn());
    }

    public String getDomainConfigurationArn() {
        return this.domainConfigurationArn;
    }

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    public int hashCode() {
        return (((getDomainConfigurationName() == null ? 0 : getDomainConfigurationName().hashCode()) + 31) * 31) + (getDomainConfigurationArn() != null ? getDomainConfigurationArn().hashCode() : 0);
    }

    public void setDomainConfigurationArn(String str) {
        this.domainConfigurationArn = str;
    }

    public void setDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDomainConfigurationName() != null) {
            sb.append("domainConfigurationName: " + getDomainConfigurationName() + ",");
        }
        if (getDomainConfigurationArn() != null) {
            sb.append("domainConfigurationArn: " + getDomainConfigurationArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateDomainConfigurationResult withDomainConfigurationArn(String str) {
        this.domainConfigurationArn = str;
        return this;
    }

    public CreateDomainConfigurationResult withDomainConfigurationName(String str) {
        this.domainConfigurationName = str;
        return this;
    }
}
