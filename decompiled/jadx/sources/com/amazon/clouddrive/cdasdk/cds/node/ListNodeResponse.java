package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodeResponse extends PaginatedCloudDriveResponse {

    @SerializedName("data")
    @Expose
    private List<NodeInfo> data;

    @Generated
    public ListNodeResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListNodeResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListNodeResponse)) {
            return false;
        }
        ListNodeResponse listNodeResponse = (ListNodeResponse) obj;
        if (!listNodeResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<NodeInfo> data = getData();
        List<NodeInfo> data2 = listNodeResponse.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    @Generated
    public List<NodeInfo> getData() {
        return this.data;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<NodeInfo> data = getData();
        return (hashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    @Generated
    public void setData(List<NodeInfo> list) {
        this.data = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "ListNodeResponse(data=" + getData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
