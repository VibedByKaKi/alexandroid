package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuthorizersRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean ascendingOrder;
    private String marker;
    private Integer pageSize;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuthorizersRequest)) {
            return false;
        }
        ListAuthorizersRequest listAuthorizersRequest = (ListAuthorizersRequest) obj;
        if ((listAuthorizersRequest.getPageSize() == null) ^ (getPageSize() == null)) {
            return false;
        }
        if (listAuthorizersRequest.getPageSize() != null && !listAuthorizersRequest.getPageSize().equals(getPageSize())) {
            return false;
        }
        if ((listAuthorizersRequest.getMarker() == null) ^ (getMarker() == null)) {
            return false;
        }
        if (listAuthorizersRequest.getMarker() != null && !listAuthorizersRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if ((listAuthorizersRequest.getAscendingOrder() == null) ^ (getAscendingOrder() == null)) {
            return false;
        }
        if (listAuthorizersRequest.getAscendingOrder() != null && !listAuthorizersRequest.getAscendingOrder().equals(getAscendingOrder())) {
            return false;
        }
        if ((listAuthorizersRequest.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return listAuthorizersRequest.getStatus() == null || listAuthorizersRequest.getStatus().equals(getStatus());
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

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((getPageSize() == null ? 0 : getPageSize().hashCode()) + 31) * 31) + (getMarker() == null ? 0 : getMarker().hashCode())) * 31) + (getAscendingOrder() == null ? 0 : getAscendingOrder().hashCode())) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
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

    public void setStatus(AuthorizerStatus authorizerStatus) {
        this.status = authorizerStatus.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPageSize() != null) {
            sb.append("pageSize: " + getPageSize() + ",");
        }
        if (getMarker() != null) {
            sb.append("marker: " + getMarker() + ",");
        }
        if (getAscendingOrder() != null) {
            sb.append("ascendingOrder: " + getAscendingOrder() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuthorizersRequest withAscendingOrder(Boolean bool) {
        this.ascendingOrder = bool;
        return this;
    }

    public ListAuthorizersRequest withMarker(String str) {
        this.marker = str;
        return this;
    }

    public ListAuthorizersRequest withPageSize(Integer num) {
        this.pageSize = num;
        return this;
    }

    public ListAuthorizersRequest withStatus(AuthorizerStatus authorizerStatus) {
        this.status = authorizerStatus.toString();
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public ListAuthorizersRequest withStatus(String str) {
        this.status = str;
        return this;
    }
}
