package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.AssetMapping;
import com.amazon.clouddrive.cdasdk.cds.common.DedupeContext;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodeRequest extends PaginatedCloudDriveRequest {

    @SerializedName("assetMapping")
    @Expose
    private AssetMapping assetMapping;

    @SerializedName("dedupeContext")
    @Expose
    private DedupeContext dedupeContext;

    @SerializedName("showAddress")
    @Expose
    private String showAddress;

    @SerializedName("tempLink")
    @Expose
    private String tempLink;

    @Generated
    public ListNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListNodeRequest)) {
            return false;
        }
        ListNodeRequest listNodeRequest = (ListNodeRequest) obj;
        if (!listNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        AssetMapping assetMapping = getAssetMapping();
        AssetMapping assetMapping2 = listNodeRequest.getAssetMapping();
        if (assetMapping != null ? !assetMapping.equals(assetMapping2) : assetMapping2 != null) {
            return false;
        }
        String tempLink = getTempLink();
        String tempLink2 = listNodeRequest.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        String showAddress = getShowAddress();
        String showAddress2 = listNodeRequest.getShowAddress();
        if (showAddress != null ? !showAddress.equals(showAddress2) : showAddress2 != null) {
            return false;
        }
        DedupeContext dedupeContext = getDedupeContext();
        DedupeContext dedupeContext2 = listNodeRequest.getDedupeContext();
        return dedupeContext != null ? dedupeContext.equals(dedupeContext2) : dedupeContext2 == null;
    }

    @Generated
    public AssetMapping getAssetMapping() {
        return this.assetMapping;
    }

    @Generated
    public DedupeContext getDedupeContext() {
        return this.dedupeContext;
    }

    @Generated
    public String getShowAddress() {
        return this.showAddress;
    }

    @Generated
    public String getTempLink() {
        return this.tempLink;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        AssetMapping assetMapping = getAssetMapping();
        int hashCode2 = (hashCode * 59) + (assetMapping == null ? 43 : assetMapping.hashCode());
        String tempLink = getTempLink();
        int hashCode3 = (hashCode2 * 59) + (tempLink == null ? 43 : tempLink.hashCode());
        String showAddress = getShowAddress();
        int i = hashCode3 * 59;
        int hashCode4 = showAddress == null ? 43 : showAddress.hashCode();
        DedupeContext dedupeContext = getDedupeContext();
        return ((i + hashCode4) * 59) + (dedupeContext != null ? dedupeContext.hashCode() : 43);
    }

    @Generated
    public void setAssetMapping(AssetMapping assetMapping) {
        this.assetMapping = assetMapping;
    }

    @Generated
    public void setDedupeContext(DedupeContext dedupeContext) {
        this.dedupeContext = dedupeContext;
    }

    @Generated
    public void setShowAddress(String str) {
        this.showAddress = str;
    }

    @Generated
    public void setTempLink(String str) {
        this.tempLink = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "ListNodeRequest(assetMapping=" + getAssetMapping() + ", tempLink=" + getTempLink() + ", showAddress=" + getShowAddress() + ", dedupeContext=" + getDedupeContext() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
