package com.amazon.clouddrive.cdasdk.cds.node;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.AssetMapping;
import com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodeRequest extends VersionedNodeRequest {

    @SerializedName("assetMapping")
    @Expose
    private AssetMapping assetMapping;

    @SerializedName("fields")
    @Expose
    private String fields;

    @SerializedName("groupShareToken")
    @Expose
    private String groupShareToken;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("lowResThumbnail")
    @Expose
    private Boolean lowResThumbnail;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("shareId")
    @Expose
    private String shareId;

    @SerializedName("shareUriNonce")
    @Expose
    private String shareUriNonce;

    @SerializedName("showAddress")
    @Expose
    private Boolean showAddress;

    @SerializedName("tempLink")
    @Expose
    private Boolean tempLink;

    @Generated
    public GetNodeRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNodeRequest)) {
            return false;
        }
        GetNodeRequest getNodeRequest = (GetNodeRequest) obj;
        if (!getNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean tempLink = getTempLink();
        Boolean tempLink2 = getNodeRequest.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        Boolean lowResThumbnail = getLowResThumbnail();
        Boolean lowResThumbnail2 = getNodeRequest.getLowResThumbnail();
        if (lowResThumbnail != null ? !lowResThumbnail.equals(lowResThumbnail2) : lowResThumbnail2 != null) {
            return false;
        }
        Boolean showAddress = getShowAddress();
        Boolean showAddress2 = getNodeRequest.getShowAddress();
        if (showAddress != null ? !showAddress.equals(showAddress2) : showAddress2 != null) {
            return false;
        }
        AssetMapping assetMapping = getAssetMapping();
        AssetMapping assetMapping2 = getNodeRequest.getAssetMapping();
        if (assetMapping != null ? !assetMapping.equals(assetMapping2) : assetMapping2 != null) {
            return false;
        }
        String id = getId();
        String id2 = getNodeRequest.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String fields = getFields();
        String fields2 = getNodeRequest.getFields();
        if (fields != null ? !fields.equals(fields2) : fields2 != null) {
            return false;
        }
        String shareId = getShareId();
        String shareId2 = getNodeRequest.getShareId();
        if (shareId != null ? !shareId.equals(shareId2) : shareId2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = getNodeRequest.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        String shareUriNonce = getShareUriNonce();
        String shareUriNonce2 = getNodeRequest.getShareUriNonce();
        if (shareUriNonce != null ? !shareUriNonce.equals(shareUriNonce2) : shareUriNonce2 != null) {
            return false;
        }
        String groupShareToken = getGroupShareToken();
        String groupShareToken2 = getNodeRequest.getGroupShareToken();
        return groupShareToken != null ? groupShareToken.equals(groupShareToken2) : groupShareToken2 == null;
    }

    @Generated
    public AssetMapping getAssetMapping() {
        return this.assetMapping;
    }

    @Generated
    public String getFields() {
        return this.fields;
    }

    @Generated
    public String getGroupShareToken() {
        return this.groupShareToken;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public Boolean getLowResThumbnail() {
        return this.lowResThumbnail;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getShareId() {
        return this.shareId;
    }

    @Generated
    public String getShareUriNonce() {
        return this.shareUriNonce;
    }

    @Generated
    public Boolean getShowAddress() {
        return this.showAddress;
    }

    @Generated
    public Boolean getTempLink() {
        return this.tempLink;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean tempLink = getTempLink();
        int hashCode2 = (hashCode * 59) + (tempLink == null ? 43 : tempLink.hashCode());
        Boolean lowResThumbnail = getLowResThumbnail();
        int hashCode3 = (hashCode2 * 59) + (lowResThumbnail == null ? 43 : lowResThumbnail.hashCode());
        Boolean showAddress = getShowAddress();
        int hashCode4 = (hashCode3 * 59) + (showAddress == null ? 43 : showAddress.hashCode());
        AssetMapping assetMapping = getAssetMapping();
        int hashCode5 = (hashCode4 * 59) + (assetMapping == null ? 43 : assetMapping.hashCode());
        String id = getId();
        int hashCode6 = (hashCode5 * 59) + (id == null ? 43 : id.hashCode());
        String fields = getFields();
        int hashCode7 = (hashCode6 * 59) + (fields == null ? 43 : fields.hashCode());
        String shareId = getShareId();
        int hashCode8 = (hashCode7 * 59) + (shareId == null ? 43 : shareId.hashCode());
        String ownerId = getOwnerId();
        int hashCode9 = (hashCode8 * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        String shareUriNonce = getShareUriNonce();
        int i = hashCode9 * 59;
        int hashCode10 = shareUriNonce == null ? 43 : shareUriNonce.hashCode();
        String groupShareToken = getGroupShareToken();
        return ((i + hashCode10) * 59) + (groupShareToken != null ? groupShareToken.hashCode() : 43);
    }

    @Generated
    public void setAssetMapping(AssetMapping assetMapping) {
        this.assetMapping = assetMapping;
    }

    @Generated
    public void setFields(String str) {
        this.fields = str;
    }

    @Generated
    public void setGroupShareToken(String str) {
        this.groupShareToken = str;
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setLowResThumbnail(Boolean bool) {
        this.lowResThumbnail = bool;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setShareId(String str) {
        this.shareId = str;
    }

    @Generated
    public void setShareUriNonce(String str) {
        this.shareUriNonce = str;
    }

    @Generated
    public void setShowAddress(Boolean bool) {
        this.showAddress = bool;
    }

    @Generated
    public void setTempLink(Boolean bool) {
        this.tempLink = bool;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.VersionedNodeRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "GetNodeRequest(assetMapping=" + getAssetMapping() + ", id=" + getId() + ", fields=" + getFields() + ", tempLink=" + getTempLink() + ", lowResThumbnail=" + getLowResThumbnail() + ", shareId=" + getShareId() + ", showAddress=" + getShowAddress() + ", ownerId=" + getOwnerId() + ", shareUriNonce=" + getShareUriNonce() + ", groupShareToken=" + getGroupShareToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
