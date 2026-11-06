package com.amazon.clouddrive.cdasdk.prompto.groups;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.aps.account.FeatureName;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListGroupsResponse extends PromptoServicePaginatedResponse {

    @SerializedName(FeatureName.GROUPS)
    @Expose
    private List<GroupResponse> groups;

    @Generated
    public ListGroupsResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListGroupsResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListGroupsResponse)) {
            return false;
        }
        ListGroupsResponse listGroupsResponse = (ListGroupsResponse) obj;
        if (!listGroupsResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<GroupResponse> groups = getGroups();
        List<GroupResponse> groups2 = listGroupsResponse.getGroups();
        return groups != null ? groups.equals(groups2) : groups2 == null;
    }

    @Generated
    public List<GroupResponse> getGroups() {
        return this.groups;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<GroupResponse> groups = getGroups();
        return (hashCode * 59) + (groups == null ? 43 : groups.hashCode());
    }

    @Generated
    public void setGroups(List<GroupResponse> list) {
        this.groups = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServicePaginatedResponse
    @Generated
    public String toString() {
        return "ListGroupsResponse(groups=" + getGroups() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
