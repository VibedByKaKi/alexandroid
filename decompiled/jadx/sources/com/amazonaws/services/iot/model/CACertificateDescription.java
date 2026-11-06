package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CACertificateDescription implements Serializable {
    private String autoRegistrationStatus;
    private String certificateArn;
    private String certificateId;
    private String certificateMode;
    private String certificatePem;
    private Date creationDate;
    private Integer customerVersion;
    private String generationId;
    private Date lastModifiedDate;
    private String ownedBy;
    private String status;
    private CertificateValidity validity;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CACertificateDescription)) {
            return false;
        }
        CACertificateDescription cACertificateDescription = (CACertificateDescription) obj;
        if ((cACertificateDescription.getCertificateArn() == null) ^ (getCertificateArn() == null)) {
            return false;
        }
        if (cACertificateDescription.getCertificateArn() != null && !cACertificateDescription.getCertificateArn().equals(getCertificateArn())) {
            return false;
        }
        if ((cACertificateDescription.getCertificateId() == null) ^ (getCertificateId() == null)) {
            return false;
        }
        if (cACertificateDescription.getCertificateId() != null && !cACertificateDescription.getCertificateId().equals(getCertificateId())) {
            return false;
        }
        if ((cACertificateDescription.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (cACertificateDescription.getStatus() != null && !cACertificateDescription.getStatus().equals(getStatus())) {
            return false;
        }
        if ((cACertificateDescription.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        if (cACertificateDescription.getCertificatePem() != null && !cACertificateDescription.getCertificatePem().equals(getCertificatePem())) {
            return false;
        }
        if ((cACertificateDescription.getOwnedBy() == null) ^ (getOwnedBy() == null)) {
            return false;
        }
        if (cACertificateDescription.getOwnedBy() != null && !cACertificateDescription.getOwnedBy().equals(getOwnedBy())) {
            return false;
        }
        if ((cACertificateDescription.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (cACertificateDescription.getCreationDate() != null && !cACertificateDescription.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((cACertificateDescription.getAutoRegistrationStatus() == null) ^ (getAutoRegistrationStatus() == null)) {
            return false;
        }
        if (cACertificateDescription.getAutoRegistrationStatus() != null && !cACertificateDescription.getAutoRegistrationStatus().equals(getAutoRegistrationStatus())) {
            return false;
        }
        if ((cACertificateDescription.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (cACertificateDescription.getLastModifiedDate() != null && !cACertificateDescription.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((cACertificateDescription.getCustomerVersion() == null) ^ (getCustomerVersion() == null)) {
            return false;
        }
        if (cACertificateDescription.getCustomerVersion() != null && !cACertificateDescription.getCustomerVersion().equals(getCustomerVersion())) {
            return false;
        }
        if ((cACertificateDescription.getGenerationId() == null) ^ (getGenerationId() == null)) {
            return false;
        }
        if (cACertificateDescription.getGenerationId() != null && !cACertificateDescription.getGenerationId().equals(getGenerationId())) {
            return false;
        }
        if ((cACertificateDescription.getValidity() == null) ^ (getValidity() == null)) {
            return false;
        }
        if (cACertificateDescription.getValidity() != null && !cACertificateDescription.getValidity().equals(getValidity())) {
            return false;
        }
        if ((cACertificateDescription.getCertificateMode() == null) ^ (getCertificateMode() == null)) {
            return false;
        }
        return cACertificateDescription.getCertificateMode() == null || cACertificateDescription.getCertificateMode().equals(getCertificateMode());
    }

    public String getAutoRegistrationStatus() {
        return this.autoRegistrationStatus;
    }

    public String getCertificateArn() {
        return this.certificateArn;
    }

    public String getCertificateId() {
        return this.certificateId;
    }

    public String getCertificateMode() {
        return this.certificateMode;
    }

    public String getCertificatePem() {
        return this.certificatePem;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Integer getCustomerVersion() {
        return this.customerVersion;
    }

    public String getGenerationId() {
        return this.generationId;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getOwnedBy() {
        return this.ownedBy;
    }

    public String getStatus() {
        return this.status;
    }

    public CertificateValidity getValidity() {
        return this.validity;
    }

    public int hashCode() {
        return (((((((((((((((((((((((getCertificateArn() == null ? 0 : getCertificateArn().hashCode()) + 31) * 31) + (getCertificateId() == null ? 0 : getCertificateId().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getCertificatePem() == null ? 0 : getCertificatePem().hashCode())) * 31) + (getOwnedBy() == null ? 0 : getOwnedBy().hashCode())) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getAutoRegistrationStatus() == null ? 0 : getAutoRegistrationStatus().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getCustomerVersion() == null ? 0 : getCustomerVersion().hashCode())) * 31) + (getGenerationId() == null ? 0 : getGenerationId().hashCode())) * 31) + (getValidity() == null ? 0 : getValidity().hashCode())) * 31) + (getCertificateMode() != null ? getCertificateMode().hashCode() : 0);
    }

    public void setAutoRegistrationStatus(AutoRegistrationStatus autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
    }

    public void setCertificateArn(String str) {
        this.certificateArn = str;
    }

    public void setCertificateId(String str) {
        this.certificateId = str;
    }

    public void setCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
    }

    public void setCertificatePem(String str) {
        this.certificatePem = str;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setCustomerVersion(Integer num) {
        this.customerVersion = num;
    }

    public void setGenerationId(String str) {
        this.generationId = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setOwnedBy(String str) {
        this.ownedBy = str;
    }

    public void setStatus(CACertificateStatus cACertificateStatus) {
        this.status = cACertificateStatus.toString();
    }

    public void setValidity(CertificateValidity certificateValidity) {
        this.validity = certificateValidity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateArn() != null) {
            sb.append("certificateArn: " + getCertificateArn() + ",");
        }
        if (getCertificateId() != null) {
            sb.append("certificateId: " + getCertificateId() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem() + ",");
        }
        if (getOwnedBy() != null) {
            sb.append("ownedBy: " + getOwnedBy() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getAutoRegistrationStatus() != null) {
            sb.append("autoRegistrationStatus: " + getAutoRegistrationStatus() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        }
        if (getCustomerVersion() != null) {
            sb.append("customerVersion: " + getCustomerVersion() + ",");
        }
        if (getGenerationId() != null) {
            sb.append("generationId: " + getGenerationId() + ",");
        }
        if (getValidity() != null) {
            sb.append("validity: " + getValidity() + ",");
        }
        if (getCertificateMode() != null) {
            sb.append("certificateMode: " + getCertificateMode());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CACertificateDescription withAutoRegistrationStatus(AutoRegistrationStatus autoRegistrationStatus) {
        this.autoRegistrationStatus = autoRegistrationStatus.toString();
        return this;
    }

    public CACertificateDescription withCertificateArn(String str) {
        this.certificateArn = str;
        return this;
    }

    public CACertificateDescription withCertificateId(String str) {
        this.certificateId = str;
        return this;
    }

    public CACertificateDescription withCertificateMode(CertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
        return this;
    }

    public CACertificateDescription withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }

    public CACertificateDescription withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public CACertificateDescription withCustomerVersion(Integer num) {
        this.customerVersion = num;
        return this;
    }

    public CACertificateDescription withGenerationId(String str) {
        this.generationId = str;
        return this;
    }

    public CACertificateDescription withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public CACertificateDescription withOwnedBy(String str) {
        this.ownedBy = str;
        return this;
    }

    public CACertificateDescription withStatus(CACertificateStatus cACertificateStatus) {
        this.status = cACertificateStatus.toString();
        return this;
    }

    public CACertificateDescription withValidity(CertificateValidity certificateValidity) {
        this.validity = certificateValidity;
        return this;
    }

    public void setAutoRegistrationStatus(String str) {
        this.autoRegistrationStatus = str;
    }

    public void setCertificateMode(String str) {
        this.certificateMode = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public CACertificateDescription withAutoRegistrationStatus(String str) {
        this.autoRegistrationStatus = str;
        return this;
    }

    public CACertificateDescription withCertificateMode(String str) {
        this.certificateMode = str;
        return this;
    }

    public CACertificateDescription withStatus(String str) {
        this.status = str;
        return this;
    }
}
