package com.amazon.clouddrive.cdasdk.prompto.groups;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupsRequest extends PromptoServicePaginatedRequest {

    @SerializedName("direction")
    @Expose
    private String direction;

    @SerializedName("kindFilter")
    @Expose
    private String kindFilter;

    @SerializedName("sort")
    @Expose
    private String sort;

    @Generated
    public ListGroupsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupsRequest)) {
            return false;
        }
        ListGroupsRequest listGroupsRequest = (ListGroupsRequest) obj;
        if (!listGroupsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String sort = getSort();
        String sort2 = listGroupsRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listGroupsRequest.getDirection();
        if (direction != null ? !direction.equals(direction2) : direction2 != null) {
            return false;
        }
        String kindFilter = getKindFilter();
        String kindFilter2 = listGroupsRequest.getKindFilter();
        return kindFilter != null ? kindFilter.equals(kindFilter2) : kindFilter2 == null;
    }

    @Generated
    public String getDirection() {
        return this.direction;
    }

    @Generated
    public String getKindFilter() {
        return this.kindFilter;
    }

    @Generated
    public String getSort() {
        return this.sort;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String sort = getSort();
        int hashCode2 = (hashCode * 59) + (sort == null ? 43 : sort.hashCode());
        String direction = getDirection();
        int i = hashCode2 * 59;
        int hashCode3 = direction == null ? 43 : direction.hashCode();
        String kindFilter = getKindFilter();
        return ((i + hashCode3) * 59) + (kindFilter != null ? kindFilter.hashCode() : 43);
    }

    @Generated
    public void setDirection(String str) {
        this.direction = str;
    }

    @Generated
    public void setKindFilter(String str) {
        this.kindFilter = str;
    }

    @Generated
    public void setSort(String str) {
        this.sort = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public String toString() {
        return "ListGroupsRequest(sort=" + getSort() + ", direction=" + getDirection() + ", kindFilter=" + getKindFilter() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
