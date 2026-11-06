package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCACertificateResult implements Serializable {
    private CACertificateDescription certificateDescription;
    private RegistrationConfig registrationConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCACertificateResult)) {
            return false;
        }
        DescribeCACertificateResult describeCACertificateResult = (DescribeCACertificateResult) obj;
        if ((describeCACertificateResult.getCertificateDescription() == null) ^ (getCertificateDescription() == null)) {
            return false;
        }
        if (describeCACertificateResult.getCertificateDescription() != null && !describeCACertificateResult.getCertificateDescription().equals(getCertificateDescription())) {
            return false;
        }
        if ((describeCACertificateResult.getRegistrationConfig() == null) ^ (getRegistrationConfig() == null)) {
            return false;
        }
        return describeCACertificateResult.getRegistrationConfig() == null || describeCACertificateResult.getRegistrationConfig().equals(getRegistrationConfig());
    }

    public CACertificateDescription getCertificateDescription() {
        return this.certificateDescription;
    }

    public RegistrationConfig getRegistrationConfig() {
        return this.registrationConfig;
    }

    public int hashCode() {
        return (((getCertificateDescription() == null ? 0 : getCertificateDescription().hashCode()) + 31) * 31) + (getRegistrationConfig() != null ? getRegistrationConfig().hashCode() : 0);
    }

    public void setCertificateDescription(CACertificateDescription cACertificateDescription) {
        this.certificateDescription = cACertificateDescription;
    }

    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateDescription() != null) {
            sb.append("certificateDescription: " + getCertificateDescription() + ",");
        }
        if (getRegistrationConfig() != null) {
            sb.append("registrationConfig: " + getRegistrationConfig());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeCACertificateResult withCertificateDescription(CACertificateDescription cACertificateDescription) {
        this.certificateDescription = cACertificateDescription;
        return this;
    }

    public DescribeCACertificateResult withRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
        return this;
    }
}
