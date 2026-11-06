package com.amazon.clouddrive.cdasdk.cds.child;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.AssetMapping;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListChildrenRequest extends PaginatedCloudDriveRequest {

    @SerializedName("assetMapping")
    @Expose
    private AssetMapping assetMapping;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("searchOnFamily")
    @Expose
    private String searchOnFamily;

    @SerializedName("shareId")
    @Expose
    private String shareId;

    @SerializedName("tempLink")
    @Expose
    private String tempLink;

    @Generated
    public ListChildrenRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListChildrenRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListChildrenRequest)) {
            return false;
        }
        ListChildrenRequest listChildrenRequest = (ListChildrenRequest) obj;
        if (!listChildrenRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        AssetMapping assetMapping = getAssetMapping();
        AssetMapping assetMapping2 = listChildrenRequest.getAssetMapping();
        if (assetMapping != null ? !assetMapping.equals(assetMapping2) : assetMapping2 != null) {
            return false;
        }
        String id = getId();
        String id2 = listChildrenRequest.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String tempLink = getTempLink();
        String tempLink2 = listChildrenRequest.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        String shareId = getShareId();
        String shareId2 = listChildrenRequest.getShareId();
        if (shareId != null ? !shareId.equals(shareId2) : shareId2 != null) {
            return false;
        }
        String searchOnFamily = getSearchOnFamily();
        String searchOnFamily2 = listChildrenRequest.getSearchOnFamily();
        if (searchOnFamily != null ? !searchOnFamily.equals(searchOnFamily2) : searchOnFamily2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = listChildrenRequest.getOwnerId();
        return ownerId != null ? ownerId.equals(ownerId2) : ownerId2 == null;
    }

    @Generated
    public AssetMapping getAssetMapping() {
        return this.assetMapping;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getSearchOnFamily() {
        return this.searchOnFamily;
    }

    @Generated
    public String getShareId() {
        return this.shareId;
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
        String id = getId();
        int hashCode3 = (hashCode2 * 59) + (id == null ? 43 : id.hashCode());
        String tempLink = getTempLink();
        int hashCode4 = (hashCode3 * 59) + (tempLink == null ? 43 : tempLink.hashCode());
        String shareId = getShareId();
        int hashCode5 = (hashCode4 * 59) + (shareId == null ? 43 : shareId.hashCode());
        String searchOnFamily = getSearchOnFamily();
        int i = hashCode5 * 59;
        int hashCode6 = searchOnFamily == null ? 43 : searchOnFamily.hashCode();
        String ownerId = getOwnerId();
        return ((i + hashCode6) * 59) + (ownerId != null ? ownerId.hashCode() : 43);
    }

    @Generated
    public void setAssetMapping(AssetMapping assetMapping) {
        this.assetMapping = assetMapping;
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setSearchOnFamily(String str) {
        this.searchOnFamily = str;
    }

    @Generated
    public void setShareId(String str) {
        this.shareId = str;
    }

    @Generated
    public void setTempLink(String str) {
        this.tempLink = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "ListChildrenRequest(assetMapping=" + getAssetMapping() + ", id=" + getId() + ", tempLink=" + getTempLink() + ", shareId=" + getShareId() + ", searchOnFamily=" + getSearchOnFamily() + ", ownerId=" + getOwnerId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
