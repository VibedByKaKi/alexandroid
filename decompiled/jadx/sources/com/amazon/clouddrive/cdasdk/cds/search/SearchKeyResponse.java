package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchKeyResponse extends PaginatedCloudDriveResponse {

    @SerializedName("aggregations")
    @Expose
    private Map<String, List<Match>> aggregations;

    @SerializedName("data")
    @Expose
    private List<NodeInfo> data;

    @Generated
    public SearchKeyResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SearchKeyResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchKeyResponse)) {
            return false;
        }
        SearchKeyResponse searchKeyResponse = (SearchKeyResponse) obj;
        if (!searchKeyResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<NodeInfo> data = getData();
        List<NodeInfo> data2 = searchKeyResponse.getData();
        if (data != null ? !data.equals(data2) : data2 != null) {
            return false;
        }
        Map<String, List<Match>> aggregations = getAggregations();
        Map<String, List<Match>> aggregations2 = searchKeyResponse.getAggregations();
        return aggregations != null ? aggregations.equals(aggregations2) : aggregations2 == null;
    }

    @Generated
    public Map<String, List<Match>> getAggregations() {
        return this.aggregations;
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
        int i = hashCode * 59;
        int hashCode2 = data == null ? 43 : data.hashCode();
        Map<String, List<Match>> aggregations = getAggregations();
        return ((i + hashCode2) * 59) + (aggregations != null ? aggregations.hashCode() : 43);
    }

    @Generated
    public void setAggregations(Map<String, List<Match>> map) {
        this.aggregations = map;
    }

    @Generated
    public void setData(List<NodeInfo> list) {
        this.data = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveResponse, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "SearchKeyResponse(data=" + getData() + ", aggregations=" + getAggregations() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
