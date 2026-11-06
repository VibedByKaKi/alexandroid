package com.amazon.clouddrive.cdasdk.prompto.collections;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupCollectionsRequest extends PromptoServicePaginatedRequest {

    @SerializedName("addedBy")
    @Expose
    private String addedBy;

    @SerializedName("direction")
    @Expose
    private String direction;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("kindFilter")
    @Expose
    private String kindFilter;

    @SerializedName("sort")
    @Expose
    private String sort;

    @Generated
    public ListGroupCollectionsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupCollectionsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceCustomerRequest, com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupCollectionsRequest)) {
            return false;
        }
        ListGroupCollectionsRequest listGroupCollectionsRequest = (ListGroupCollectionsRequest) obj;
        if (!listGroupCollectionsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = listGroupCollectionsRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String kindFilter = getKindFilter();
        String kindFilter2 = listGroupCollectionsRequest.getKindFilter();
        if (kindFilter != null ? !kindFilter.equals(kindFilter2) : kindFilter2 != null) {
            return false;
        }
        String addedBy = getAddedBy();
        String addedBy2 = listGroupCollectionsRequest.getAddedBy();
        if (addedBy != null ? !addedBy.equals(addedBy2) : addedBy2 != null) {
            return false;
        }
        String sort = getSort();
        String sort2 = listGroupCollectionsRequest.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        String direction = getDirection();
        String direction2 = listGroupCollectionsRequest.getDirection();
        return direction != null ? direction.equals(direction2) : direction2 == null;
    }

    @Generated
    public String getAddedBy() {
        return this.addedBy;
    }

    @Generated
    public String getDirection() {
        return this.direction;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
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
        String groupId = getGroupId();
        int hashCode2 = (hashCode * 59) + (groupId == null ? 43 : groupId.hashCode());
        String kindFilter = getKindFilter();
        int hashCode3 = (hashCode2 * 59) + (kindFilter == null ? 43 : kindFilter.hashCode());
        String addedBy = getAddedBy();
        int hashCode4 = (hashCode3 * 59) + (addedBy == null ? 43 : addedBy.hashCode());
        String sort = getSort();
        int i = hashCode4 * 59;
        int hashCode5 = sort == null ? 43 : sort.hashCode();
        String direction = getDirection();
        return ((i + hashCode5) * 59) + (direction != null ? direction.hashCode() : 43);
    }

    @Generated
    public void setAddedBy(String str) {
        this.addedBy = str;
    }

    @Generated
    public void setDirection(String str) {
        this.direction = str;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
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
        return "ListGroupCollectionsRequest(groupId=" + getGroupId() + ", kindFilter=" + getKindFilter() + ", addedBy=" + getAddedBy() + ", sort=" + getSort() + ", direction=" + getDirection() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
