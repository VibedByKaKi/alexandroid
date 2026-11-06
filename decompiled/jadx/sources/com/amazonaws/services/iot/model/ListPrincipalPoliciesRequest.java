package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPrincipalPoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private String marker;
    private Integer pageSize;
    private String principal;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPrincipalPoliciesRequest)) {
            return false;
        }
        ListPrincipalPoliciesRequest listPrincipalPoliciesRequest = (ListPrincipalPoliciesRequest) obj;
        if ((listPrincipalPoliciesRequest.getPrincipal() == null) ^ (getPrincipal() == null)) {
            return false;
        }
        if (listPrincipalPoliciesRequest.getPrincipal() != null && !listPrincipalPoliciesRequest.getPrincipal().equals(getPrincipal())) {
            return false;
        }
        if ((listPrincipalPoliciesRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listPrincipalPoliciesRequest.getMarker() != null && !listPrincipalPoliciesRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listPrincipalPoliciesRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listPrincipalPoliciesRequest.getPageSize() != null && !listPrincipalPoliciesRequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listPrincipalPoliciesRequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        return listPrincipalPoliciesRequest.getAscendingOrder() == null || listPrincipalPoliciesRequest.getAscendingOrder().equals(getAscendingOrder());
    }

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    public String getMarker() {
        return this.marker;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return (((((((getPrincipal() == null ? 0 : getPrincipal().hashCode()) + 31) * 31) + (getMarker() == null ? 0 : getMarker().hashCode())) * 31) + (getPageSize() == null ? 0 : getPageSize().hashCode())) * 31) + (getAscendingOrder() != null ? getAscendingOrder().hashCode() : 0);
    }

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
    }

    public void setAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public void setPrincipal(String str) {
        this.principal = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPrincipal() != null) {
            sb.append("principal: " + getPrincipal() + ",");
        }
        if (getMarker() != null) {
            sb.append("marker: " + getMarker() + ",");
        }
        if (getPageSize() != null) {
            sb.append("pageSize: " + getPageSize() + ",");
        }
        if (getAscendingOrder() != null) {
            sb.append("ascendingOrder: " + getAscendingOrder());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListPrincipalPoliciesRequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListPrincipalPoliciesRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListPrincipalPoliciesRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListPrincipalPoliciesRequest withPrincipal(String str) {
        this.principal = str;
        return this;
    }
}
