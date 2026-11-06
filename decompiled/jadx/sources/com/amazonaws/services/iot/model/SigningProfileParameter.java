package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SigningProfileParameter implements Serializable {
    private String certificateArn;
    private String certificatePathOnDevice;
    private String platform;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SigningProfileParameter)) {
            return false;
        }
        SigningProfileParameter signingProfileParameter = (SigningProfileParameter) obj;
        if ((signingProfileParameter.getCertificateArn() == null) ^ (getCertificateArn() == null)) {
            return false;
        }
        if (signingProfileParameter.getCertificateArn() != null && !signingProfileParameter.getCertificateArn().equals(getCertificateArn())) {
            return false;
        }
        if ((signingProfileParameter.getPlatform() == null) ^ (getPlatform() == null)) {
            return false;
        }
        if (signingProfileParameter.getPlatform() != null && !signingProfileParameter.getPlatform().equals(getPlatform())) {
            return false;
        }
        if ((signingProfileParameter.getCertificatePathOnDevice() == null) ^ (getCertificatePathOnDevice() == null)) {
            return false;
        }
        return signingProfileParameter.getCertificatePathOnDevice() == null || signingProfileParameter.getCertificatePathOnDevice().equals(getCertificatePathOnDevice());
    }

    public String getCertificateArn() {
        return this.certificateArn;
    }

    public String getCertificatePathOnDevice() {
        return this.certificatePathOnDevice;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (((((getCertificateArn() == null ? 0 : getCertificateArn().hashCode()) + 31) * 31) + (getPlatform() == null ? 0 : getPlatform().hashCode())) * 31) + (getCertificatePathOnDevice() != null ? getCertificatePathOnDevice().hashCode() : 0);
    }

    public void setCertificateArn(String str) {
        this.certificateArn = str;
    }

    public void setCertificatePathOnDevice(String str) {
        this.certificatePathOnDevice = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificateArn() != null) {
            sb.append("certificateArn: " + getCertificateArn() + ",");
        }
        if (getPlatform() != null) {
            sb.append("platform: " + getPlatform() + ",");
        }
        if (getCertificatePathOnDevice() != null) {
            sb.append("certificatePathOnDevice: " + getCertificatePathOnDevice());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SigningProfileParameter withCertificateArn(String str) {
        this.certificateArn = str;
        return this;
    }

    public SigningProfileParameter withCertificatePathOnDevice(String str) {
        this.certificatePathOnDevice = str;
        return this;
    }

    public SigningProfileParameter withPlatform(String str) {
        this.platform = str;
        return this;
    }
}
