package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterCACertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean allowAutoRegistration;
    private String caCertificate;
    private String certificateMode;
    private RegistrationConfig registrationConfig;
    private Boolean setAsActive;
    private List<Tag> tags;
    private String verificationCertificate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterCACertificateRequest)) {
            return false;
        }
        RegisterCACertificateRequest registerCACertificateRequest = (RegisterCACertificateRequest) obj;
        if ((registerCACertificateRequest.getCaCertificate() == null) ^ (getCaCertificate() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getCaCertificate() != null && !registerCACertificateRequest.getCaCertificate().equals(getCaCertificate())) {
            return false;
        }
        if ((registerCACertificateRequest.getVerificationCertificate() == null) ^ (getVerificationCertificate() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getVerificationCertificate() != null && !registerCACertificateRequest.getVerificationCertificate().equals(getVerificationCertificate())) {
            return false;
        }
        if ((registerCACertificateRequest.getSetAsActive() == null) ^ (getSetAsActive() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getSetAsActive() != null && !registerCACertificateRequest.getSetAsActive().equals(getSetAsActive())) {
            return false;
        }
        if ((registerCACertificateRequest.getAllowAutoRegistration() == null) ^ (getAllowAutoRegistration() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getAllowAutoRegistration() != null && !registerCACertificateRequest.getAllowAutoRegistration().equals(getAllowAutoRegistration())) {
            return false;
        }
        if ((registerCACertificateRequest.getRegistrationConfig() == null) ^ (getRegistrationConfig() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getRegistrationConfig() != null && !registerCACertificateRequest.getRegistrationConfig().equals(getRegistrationConfig())) {
            return false;
        }
        if ((registerCACertificateRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (registerCACertificateRequest.getTags() != null && !registerCACertificateRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((registerCACertificateRequest.getCertificateMode() == null) ^ (getCertificateMode() == null)) {
            return false;
        }
        return registerCACertificateRequest.getCertificateMode() == null || registerCACertificateRequest.getCertificateMode().equals(getCertificateMode());
    }

    public Boolean getAllowAutoRegistration() {
        return this.allowAutoRegistration;
    }

    public String getCaCertificate() {
        return this.caCertificate;
    }

    public String getCertificateMode() {
        return this.certificateMode;
    }

    public RegistrationConfig getRegistrationConfig() {
        return this.registrationConfig;
    }

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getVerificationCertificate() {
        return this.verificationCertificate;
    }

    public int hashCode() {
        return (((((((((((((getCaCertificate() == null ? 0 : getCaCertificate().hashCode()) + 31) * 31) + (getVerificationCertificate() == null ? 0 : getVerificationCertificate().hashCode())) * 31) + (getSetAsActive() == null ? 0 : getSetAsActive().hashCode())) * 31) + (getAllowAutoRegistration() == null ? 0 : getAllowAutoRegistration().hashCode())) * 31) + (getRegistrationConfig() == null ? 0 : getRegistrationConfig().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getCertificateMode() != null ? getCertificateMode().hashCode() : 0);
    }

    public Boolean isAllowAutoRegistration() {
        return this.allowAutoRegistration;
    }

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    public void setAllowAutoRegistration(Boolean bool) {
        this.allowAutoRegistration = bool;
    }

    public void setCaCertificate(String str) {
        this.caCertificate = str;
    }

    public void setCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
    }

    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    public void setSetAsActive(Boolean bool) {
        this.setAsActive = bool;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setVerificationCertificate(String str) {
        this.verificationCertificate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCaCertificate() != null) {
            sb.append("caCertificate: " + getCaCertificate() + ",");
        }
        if (getVerificationCertificate() != null) {
            sb.append("verificationCertificate: " + getVerificationCertificate() + ",");
        }
        if (getSetAsActive() != null) {
            sb.append("setAsActive: " + getSetAsActive() + ",");
        }
        if (getAllowAutoRegistration() != null) {
            sb.append("allowAutoRegistration: " + getAllowAutoRegistration() + ",");
        }
        if (getRegistrationConfig() != null) {
            sb.append("registrationConfig: " + getRegistrationConfig() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags() + ",");
        }
        if (getCertificateMode() != null) {
            sb.append("certificateMode: " + getCertificateMode());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterCACertificateRequest withAllowAutoRegistration(Boolean bool) {
        this.allowAutoRegistration = bool;
        return this;
    }

    public RegisterCACertificateRequest withCaCertificate(String str) {
        this.caCertificate = str;
        return this;
    }

    public RegisterCACertificateRequest withCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
        return this;
    }

    public RegisterCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
        return this;
    }

    public RegisterCACertificateRequest withSetAsActive(Boolean bool) {
        this.setAsActive = bool;
        return this;
    }

    public RegisterCACertificateRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public RegisterCACertificateRequest withVerificationCertificate(String str) {
        this.verificationCertificate = str;
        return this;
    }

    public void setCertificateMode(String str) {
        this.certificateMode = str;
    }

    public RegisterCACertificateRequest withCertificateMode(String str) {
        this.certificateMode = str;
        return this;
    }

    public RegisterCACertificateRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
