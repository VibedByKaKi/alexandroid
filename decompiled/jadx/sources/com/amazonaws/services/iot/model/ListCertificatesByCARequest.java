package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListCertificatesByCARequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private String caCertificateId;
    private String marker;
    private Integer pageSize;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListCertificatesByCARequest)) {
            return false;
        }
        ListCertificatesByCARequest listCertificatesByCARequest = (ListCertificatesByCARequest) obj;
        if ((listCertificatesByCARequest.getCaCertificateId() == null) ^ (getCaCertificateId() == null)) {
            return false;
        }
        if (listCertificatesByCARequest.getCaCertificateId() != null && !listCertificatesByCARequest.getCaCertificateId().equals(getCaCertificateId())) {
            return false;
        }
        if ((listCertificatesByCARequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listCertificatesByCARequest.getPageSize() != null && !listCertificatesByCARequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listCertificatesByCARequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listCertificatesByCARequest.getMarker() != null && !listCertificatesByCARequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listCertificatesByCARequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        return listCertificatesByCARequest.getAscendingOrder() == null || listCertificatesByCARequest.getAscendingOrder().equals(getAscendingOrder());
    }

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    public String getMarker() {
        return this.marker;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return (((((((getCaCertificateId() == null ? 0 : getCaCertificateId().hashCode()) + 31) * 31) + (getPageSize() == null ? 0 : getPageSize().hashCode())) * 31) + (getMarker() == null ? 0 : getMarker().hashCode())) * 31) + (getAscendingOrder() != null ? getAscendingOrder().hashCode() : 0);
    }

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    public void setAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
    }

    public void setCaCertificateId(String str) {
        this.caCertificateId = str;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCaCertificateId() != null) {
            sb.append("caCertificateId: " + getCaCertificateId() + ",");
        }
        if (getPageSize() != null) {
            sb.append("pageSize: " + getPageSize() + ",");
        }
        if (getMarker() != null) {
            sb.append("marker: " + getMarker() + ",");
        }
        if (getAscendingOrder() != null) {
            sb.append("ascendingOrder: " + getAscendingOrder());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListCertificatesByCARequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListCertificatesByCARequest withCaCertificateId(String str) {
        this.caCertificateId = str;
        return this;
    }

    public ListCertificatesByCARequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListCertificatesByCARequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }
}
