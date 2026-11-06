package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private String marker;
    private Integer pageSize;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPoliciesRequest)) {
            return false;
        }
        ListPoliciesRequest listPoliciesRequest = (ListPoliciesRequest) obj;
        if ((listPoliciesRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listPoliciesRequest.getMarker() != null && !listPoliciesRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listPoliciesRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listPoliciesRequest.getPageSize() != null && !listPoliciesRequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listPoliciesRequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        return listPoliciesRequest.getAscendingOrder() == null || listPoliciesRequest.getAscendingOrder().equals(getAscendingOrder());
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

    public int hashCode() {
        return (((((getMarker() == null ? 0 : getMarker().hashCode()) + 31) * 31) + (getPageSize() == null ? 0 : getPageSize().hashCode())) * 31) + (getAscendingOrder() != null ? getAscendingOrder().hashCode() : 0);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
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

    public ListPoliciesRequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListPoliciesRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListPoliciesRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }
}
