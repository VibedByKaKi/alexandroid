package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListOutgoingCertificatesResult implements Serializable {
    private String nextMarker;
    private List<OutgoingCertificate> outgoingCertificates;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListOutgoingCertificatesResult)) {
            return false;
        }
        ListOutgoingCertificatesResult listOutgoingCertificatesResult = (ListOutgoingCertificatesResult) obj;
        if ((listOutgoingCertificatesResult.getOutgoingCertificates() == null) ^ (getOutgoingCertificates() == null)) {
            return false;
        }
        if (listOutgoingCertificatesResult.getOutgoingCertificates() != null && !listOutgoingCertificatesResult.getOutgoingCertificates().equals(getOutgoingCertificates())) {
            return false;
        }
        if ((listOutgoingCertificatesResult.getNextMarker() == null) ^ (getNextMarker() == null)) {
            return false;
        }
        return listOutgoingCertificatesResult.getNextMarker() == null || listOutgoingCertificatesResult.getNextMarker().equals(getNextMarker());
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public List<OutgoingCertificate> getOutgoingCertificates() {
        return this.outgoingCertificates;
    }

    public int hashCode() {
        return (((getOutgoingCertificates() == null ? 0 : getOutgoingCertificates().hashCode()) + 31) * 31) + (getNextMarker() != null ? getNextMarker().hashCode() : 0);
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public void setOutgoingCertificates(Collection<OutgoingCertificate> collection) {
        if (collection == null) {
            this.outgoingCertificates = null;
        } else {
            this.outgoingCertificates = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOutgoingCertificates() != null) {
            sb.append("outgoingCertificates: " + getOutgoingCertificates() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("nextMarker: " + getNextMarker());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListOutgoingCertificatesResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListOutgoingCertificatesResult withOutgoingCertificates(OutgoingCertificate... outgoingCertificateArr) {
        if (getOutgoingCertificates() == null) {
            this.outgoingCertificates = new ArrayList(outgoingCertificateArr.length);
        }
        for (OutgoingCertificate outgoingCertificate : outgoingCertificateArr) {
            this.outgoingCertificates.add(outgoingCertificate);
        }
        return this;
    }

    public ListOutgoingCertificatesResult withOutgoingCertificates(Collection<OutgoingCertificate> collection) {
        setOutgoingCertificates(collection);
        return this;
    }
}
