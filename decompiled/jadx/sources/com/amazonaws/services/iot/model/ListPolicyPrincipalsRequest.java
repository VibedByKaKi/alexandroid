package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListPolicyPrincipalsRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private String marker;
    private Integer pageSize;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListPolicyPrincipalsRequest)) {
            return false;
        }
        ListPolicyPrincipalsRequest listPolicyPrincipalsRequest = (ListPolicyPrincipalsRequest) obj;
        if ((listPolicyPrincipalsRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (listPolicyPrincipalsRequest.getPolicyName() != null && !listPolicyPrincipalsRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((listPolicyPrincipalsRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listPolicyPrincipalsRequest.getMarker() != null && !listPolicyPrincipalsRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listPolicyPrincipalsRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listPolicyPrincipalsRequest.getPageSize() != null && !listPolicyPrincipalsRequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listPolicyPrincipalsRequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        return listPolicyPrincipalsRequest.getAscendingOrder() == null || listPolicyPrincipalsRequest.getAscendingOrder().equals(getAscendingOrder());
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

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getMarker() == null ? 0 : getMarker().hashCode())) * 31) + (getPageSize() == null ? 0 : getPageSize().hashCode())) * 31) + (getAscendingOrder() != null ? getAscendingOrder().hashCode() : 0);
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

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPolicyName() != null) {
            sb.append("policyName: " + getPolicyName() + ",");
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

    public ListPolicyPrincipalsRequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListPolicyPrincipalsRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListPolicyPrincipalsRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListPolicyPrincipalsRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
