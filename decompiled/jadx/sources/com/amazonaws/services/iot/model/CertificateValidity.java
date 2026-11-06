package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CertificateValidity implements Serializable {
    private Date notAfter;
    private Date notBefore;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CertificateValidity)) {
            return false;
        }
        CertificateValidity certificateValidity = (CertificateValidity) obj;
        if ((certificateValidity.getNotBefore() == null) ^ (getNotBefore() == null)) {
            return false;
        }
        if (certificateValidity.getNotBefore() != null && !certificateValidity.getNotBefore().equals(getNotBefore())) {
            return false;
        }
        if ((certificateValidity.getNotAfter() == null) ^ (getNotAfter() == null)) {
            return false;
        }
        return certificateValidity.getNotAfter() == null || certificateValidity.getNotAfter().equals(getNotAfter());
    }

    public Date getNotAfter() {
        return this.notAfter;
    }

    public Date getNotBefore() {
        return this.notBefore;
    }

    public int hashCode() {
        return (((getNotBefore() == null ? 0 : getNotBefore().hashCode()) + 31) * 31) + (getNotAfter() != null ? getNotAfter().hashCode() : 0);
    }

    public void setNotAfter(Date date) {
        this.notAfter = date;
    }

    public void setNotBefore(Date date) {
        this.notBefore = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNotBefore() != null) {
            sb.append("notBefore: " + getNotBefore() + ",");
        }
        if (getNotAfter() != null) {
            sb.append("notAfter: " + getNotAfter());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CertificateValidity withNotAfter(Date date) {
        this.notAfter = date;
        return this;
    }

    public CertificateValidity withNotBefore(Date date) {
        this.notBefore = date;
        return this;
    }
}
