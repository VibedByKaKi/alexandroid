package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListDomainConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {
    private String marker;
    private Integer pageSize;
    private String serviceType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDomainConfigurationsRequest)) {
            return false;
        }
        ListDomainConfigurationsRequest listDomainConfigurationsRequest = (ListDomainConfigurationsRequest) obj;
        if ((listDomainConfigurationsRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listDomainConfigurationsRequest.getMarker() != null && !listDomainConfigurationsRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listDomainConfigurationsRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listDomainConfigurationsRequest.getPageSize() != null && !listDomainConfigurationsRequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listDomainConfigurationsRequest.getServiceType() == null) ^ (getServiceType() == null)) {
            return false;
        }
        return listDomainConfigurationsRequest.getServiceType() == null || listDomainConfigurationsRequest.getServiceType().equals(getServiceType());
    }

    public String getMarker() {
        return this.marker;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public int hashCode() {
        return (((((getMarker() == null ? 0 : getMarker().hashCode()) + 31) * 31) + (getPageSize() == null ? 0 : getPageSize().hashCode())) * 31) + (getServiceType() != null ? getServiceType().hashCode() : 0);
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMarker() != null) {
            sb.append("marker: " + getMarker() + ",");
        }
        if (getPageSize() != null) {
            sb.append("pageSize: " + getPageSize() + ",");
        }
        if (getServiceType() != null) {
            sb.append("serviceType: " + getServiceType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListDomainConfigurationsRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListDomainConfigurationsRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListDomainConfigurationsRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    public void setServiceType(String str) {
        this.serviceType = str;
    }

    public ListDomainConfigurationsRequest withServiceType(String str) {
        this.serviceType = str;
        return this;
    }
}
