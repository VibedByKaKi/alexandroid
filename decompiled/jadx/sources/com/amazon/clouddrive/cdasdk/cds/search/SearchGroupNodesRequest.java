package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchGroupNodesRequest extends SearchKeyRequest {

    @SerializedName("groupShareToken")
    @Expose
    private String groupShareToken;

    @Generated
    public SearchGroupNodesRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.search.SearchKeyRequest, com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SearchGroupNodesRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.search.SearchKeyRequest, com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchGroupNodesRequest)) {
            return false;
        }
        SearchGroupNodesRequest searchGroupNodesRequest = (SearchGroupNodesRequest) obj;
        if (!searchGroupNodesRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String groupShareToken = getGroupShareToken();
        String groupShareToken2 = searchGroupNodesRequest.getGroupShareToken();
        return groupShareToken != null ? groupShareToken.equals(groupShareToken2) : groupShareToken2 == null;
    }

    @Generated
    public String getGroupShareToken() {
        return this.groupShareToken;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.search.SearchKeyRequest, com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String groupShareToken = getGroupShareToken();
        return (hashCode * 59) + (groupShareToken == null ? 43 : groupShareToken.hashCode());
    }

    @Generated
    public void setGroupShareToken(String str) {
        this.groupShareToken = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.search.SearchKeyRequest, com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "SearchGroupNodesRequest(groupShareToken=" + getGroupShareToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
