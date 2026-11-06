package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListCertificatesResult implements Serializable {
    private List<Certificate> certificates;
    private String nextMarker;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListCertificatesResult)) {
            return false;
        }
        ListCertificatesResult listCertificatesResult = (ListCertificatesResult) obj;
        if ((listCertificatesResult.getCertificates() == null) ^ (getCertificates() == null)) {
            return false;
        }
        if (listCertificatesResult.getCertificates() != null && !listCertificatesResult.getCertificates().equals(getCertificates())) {
            return false;
        }
        if ((listCertificatesResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listCertificatesResult.getNextMarker() == null || listCertificatesResult.getNextMarker().equals(getNextMarker());
    }

    public List<Certificate> getCertificates() {
        return this.certificates;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public int hashCode() {
        return (((getCertificates() == null ? 0 : getCertificates().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setCertificates(Collection<Certificate> collection) {
        if (collection == null) {
            this.certificates = null;
        } else {
            this.certificates = new ArrayList(collection);
        }
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificates() != null) {
            sb.append("certificates: " + getCertificates() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListCertificatesResult withCertificates(Certificate... certificateArr) {
        if (getCertificates() == null) {
            this.certificates = new ArrayList(certificateArr.length);
        }
        for (Certificate certificate : certificateArr) {
            this.certificates.add(certificate);
        }
        return this;
    }

    public ListCertificatesResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListCertificatesResult withCertificates(Collection<Certificate> collection) {
        setCertificates(collection);
        return this;
    }
}
