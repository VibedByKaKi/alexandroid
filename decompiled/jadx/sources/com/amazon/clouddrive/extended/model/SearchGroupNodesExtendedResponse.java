package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchGroupNodesExtendedResponse extends SearchGroupNodesResponse {
    GroupsData groupsData;

    public boolean canEqual(Object obj) {
        return obj instanceof SearchGroupNodesExtendedResponse;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyResponse, com.amazon.clouddrive.model.PaginatedCloudDriveResponse
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchGroupNodesExtendedResponse)) {
            return false;
        }
        SearchGroupNodesExtendedResponse searchGroupNodesExtendedResponse = (SearchGroupNodesExtendedResponse) obj;
        if (!searchGroupNodesExtendedResponse.canEqual(this)) {
            return false;
        }
        GroupsData groupsData = getGroupsData();
        GroupsData groupsData2 = searchGroupNodesExtendedResponse.getGroupsData();
        return groupsData != null ? groupsData.equals(groupsData2) : groupsData2 == null;
    }

    public GroupsData getGroupsData() {
        return this.groupsData;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyResponse, com.amazon.clouddrive.model.PaginatedCloudDriveResponse
    public int hashCode() {
        GroupsData groupsData = getGroupsData();
        return 59 + (groupsData == null ? 43 : groupsData.hashCode());
    }

    public void setGroupsData(GroupsData groupsData) {
        this.groupsData = groupsData;
    }

    public String toString() {
        return "SearchGroupNodesExtendedResponse(groupsData=" + getGroupsData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
