package com.amazon.clouddrive.cdasdk.cds.histogram;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetHistogramRequest extends PaginatedCloudDriveRequest {

    @SerializedName("bucket")
    @Expose
    private String bucket;

    @SerializedName("groupBy")
    @Expose
    private String groupBy;

    @Generated
    public GetHistogramRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetHistogramRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetHistogramRequest)) {
            return false;
        }
        GetHistogramRequest getHistogramRequest = (GetHistogramRequest) obj;
        if (!getHistogramRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String groupBy = getGroupBy();
        String groupBy2 = getHistogramRequest.getGroupBy();
        if (groupBy != null ? !groupBy.equals(groupBy2) : groupBy2 != null) {
            return false;
        }
        String bucket = getBucket();
        String bucket2 = getHistogramRequest.getBucket();
        return bucket != null ? bucket.equals(bucket2) : bucket2 == null;
    }

    @Generated
    public String getBucket() {
        return this.bucket;
    }

    @Generated
    public String getGroupBy() {
        return this.groupBy;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String groupBy = getGroupBy();
        int i = hashCode * 59;
        int hashCode2 = groupBy == null ? 43 : groupBy.hashCode();
        String bucket = getBucket();
        return ((i + hashCode2) * 59) + (bucket != null ? bucket.hashCode() : 43);
    }

    @Generated
    public void setBucket(String str) {
        this.bucket = str;
    }

    @Generated
    public void setGroupBy(String str) {
        this.groupBy = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "GetHistogramRequest(groupBy=" + getGroupBy() + ", bucket=" + getBucket() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
