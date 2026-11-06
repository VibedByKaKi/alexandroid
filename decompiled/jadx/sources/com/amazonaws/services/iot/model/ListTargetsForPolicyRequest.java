package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTargetsForPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String marker;
    private Integer pageSize;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTargetsForPolicyRequest)) {
            return false;
        }
        ListTargetsForPolicyRequest listTargetsForPolicyRequest = (ListTargetsForPolicyRequest) obj;
        if ((listTargetsForPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (listTargetsForPolicyRequest.getPolicyName() != null && !listTargetsForPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((listTargetsForPolicyRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listTargetsForPolicyRequest.getMarker() != null && !listTargetsForPolicyRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listTargetsForPolicyRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        return listTargetsForPolicyRequest.getPageSize() == null || listTargetsForPolicyRequest.getPageSize().equals(getPageSize());
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
        return (((((getPolicyName() == null ? 0 : getPolicyName().hashCode()) + 31) * 31) + (getMarker() == null ? 0 : getMarker().hashCode())) * 31) + (getPageSize() != null ? getPageSize().hashCode() : 0);
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
            sb.append("pageSize: " + getPageSize());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTargetsForPolicyRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListTargetsForPolicyRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListTargetsForPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
