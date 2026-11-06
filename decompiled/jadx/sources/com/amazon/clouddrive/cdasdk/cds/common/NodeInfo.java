package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeInfo extends EditableNodeInfo {

    @SerializedName("assets")
    @Expose
    private List<String> assets;

    @SerializedName("createdDate")
    @Expose
    private ISO8601 createdDate;

    @SerializedName("eTagRequest")
    @Expose
    private String eTagRequest;

    @SerializedName("eTagResponse")
    @Expose
    private String eTagResponse;

    @SerializedName("exclusivelyTrashed")
    @Expose
    private Boolean exclusivelyTrashed;

    @SerializedName("familyModifiedDate")
    @Expose
    private ISO8601 familyModifiedDate;

    @SerializedName("isRoot")
    @Expose
    private Boolean isRoot;

    @SerializedName("isShared")
    @Expose
    private Boolean isShared;

    @SerializedName("lowResThumbnail")
    @Expose
    private String lowResThumbnail;

    @SerializedName(Message.SERIALIZED_NAME_MODIFIED_DATE)
    @Expose
    private ISO8601 modifiedDate;

    @SerializedName(MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER)
    @Expose
    private String owner;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("purgeReason")
    @Expose
    private String purgeReason;

    @SerializedName("recursivelyTrashed")
    @Expose
    private Boolean recursivelyTrashed;

    @SerializedName("shareId")
    @Expose
    private String shareId;

    @SerializedName("shareURL")
    @Expose
    private String shareURL;

    @SerializedName("tempLink")
    @Expose
    private String tempLink;

    @SerializedName("version")
    @Expose
    private Long version;

    @Generated
    public NodeInfo() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof NodeInfo;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeInfo)) {
            return false;
        }
        NodeInfo nodeInfo = (NodeInfo) obj;
        if (!nodeInfo.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long version = getVersion();
        Long version2 = nodeInfo.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        Boolean exclusivelyTrashed = getExclusivelyTrashed();
        Boolean exclusivelyTrashed2 = nodeInfo.getExclusivelyTrashed();
        if (exclusivelyTrashed != null ? !exclusivelyTrashed.equals(exclusivelyTrashed2) : exclusivelyTrashed2 != null) {
            return false;
        }
        Boolean recursivelyTrashed = getRecursivelyTrashed();
        Boolean recursivelyTrashed2 = nodeInfo.getRecursivelyTrashed();
        if (recursivelyTrashed != null ? !recursivelyTrashed.equals(recursivelyTrashed2) : recursivelyTrashed2 != null) {
            return false;
        }
        Boolean isRoot = getIsRoot();
        Boolean isRoot2 = nodeInfo.getIsRoot();
        if (isRoot != null ? !isRoot.equals(isRoot2) : isRoot2 != null) {
            return false;
        }
        Boolean isShared = getIsShared();
        Boolean isShared2 = nodeInfo.getIsShared();
        if (isShared != null ? !isShared.equals(isShared2) : isShared2 != null) {
            return false;
        }
        String eTagRequest = getETagRequest();
        String eTagRequest2 = nodeInfo.getETagRequest();
        if (eTagRequest != null ? !eTagRequest.equals(eTagRequest2) : eTagRequest2 != null) {
            return false;
        }
        String eTagResponse = getETagResponse();
        String eTagResponse2 = nodeInfo.getETagResponse();
        if (eTagResponse != null ? !eTagResponse.equals(eTagResponse2) : eTagResponse2 != null) {
            return false;
        }
        ISO8601 modifiedDate = getModifiedDate();
        ISO8601 modifiedDate2 = nodeInfo.getModifiedDate();
        if (modifiedDate != null ? !modifiedDate.equals(modifiedDate2) : modifiedDate2 != null) {
            return false;
        }
        ISO8601 createdDate = getCreatedDate();
        ISO8601 createdDate2 = nodeInfo.getCreatedDate();
        if (createdDate != null ? !createdDate.equals(createdDate2) : createdDate2 != null) {
            return false;
        }
        String owner = getOwner();
        String owner2 = nodeInfo.getOwner();
        if (owner != null ? !owner.equals(owner2) : owner2 != null) {
            return false;
        }
        List<String> assets = getAssets();
        List<String> assets2 = nodeInfo.getAssets();
        if (assets != null ? !assets.equals(assets2) : assets2 != null) {
            return false;
        }
        String tempLink = getTempLink();
        String tempLink2 = nodeInfo.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        String shareId = getShareId();
        String shareId2 = nodeInfo.getShareId();
        if (shareId != null ? !shareId.equals(shareId2) : shareId2 != null) {
            return false;
        }
        String shareURL = getShareURL();
        String shareURL2 = nodeInfo.getShareURL();
        if (shareURL != null ? !shareURL.equals(shareURL2) : shareURL2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = nodeInfo.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        ISO8601 familyModifiedDate = getFamilyModifiedDate();
        ISO8601 familyModifiedDate2 = nodeInfo.getFamilyModifiedDate();
        if (familyModifiedDate != null ? !familyModifiedDate.equals(familyModifiedDate2) : familyModifiedDate2 != null) {
            return false;
        }
        String purgeReason = getPurgeReason();
        String purgeReason2 = nodeInfo.getPurgeReason();
        if (purgeReason != null ? !purgeReason.equals(purgeReason2) : purgeReason2 != null) {
            return false;
        }
        String lowResThumbnail = getLowResThumbnail();
        String lowResThumbnail2 = nodeInfo.getLowResThumbnail();
        return lowResThumbnail != null ? lowResThumbnail.equals(lowResThumbnail2) : lowResThumbnail2 == null;
    }

    @Generated
    public List<String> getAssets() {
        return this.assets;
    }

    @Generated
    public ISO8601 getCreatedDate() {
        return this.createdDate;
    }

    @Generated
    public String getETagRequest() {
        return this.eTagRequest;
    }

    @Generated
    public String getETagResponse() {
        return this.eTagResponse;
    }

    @Generated
    public Boolean getExclusivelyTrashed() {
        return this.exclusivelyTrashed;
    }

    @Generated
    public ISO8601 getFamilyModifiedDate() {
        return this.familyModifiedDate;
    }

    @Generated
    public Boolean getIsRoot() {
        return this.isRoot;
    }

    @Generated
    public Boolean getIsShared() {
        return this.isShared;
    }

    @Generated
    public String getLowResThumbnail() {
        return this.lowResThumbnail;
    }

    @Generated
    public ISO8601 getModifiedDate() {
        return this.modifiedDate;
    }

    @Generated
    public String getOwner() {
        return this.owner;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getPurgeReason() {
        return this.purgeReason;
    }

    @Generated
    public Boolean getRecursivelyTrashed() {
        return this.recursivelyTrashed;
    }

    @Generated
    public String getShareId() {
        return this.shareId;
    }

    @Generated
    public String getShareURL() {
        return this.shareURL;
    }

    @Generated
    public String getTempLink() {
        return this.tempLink;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long version = getVersion();
        int hashCode2 = (hashCode * 59) + (version == null ? 43 : version.hashCode());
        Boolean exclusivelyTrashed = getExclusivelyTrashed();
        int hashCode3 = (hashCode2 * 59) + (exclusivelyTrashed == null ? 43 : exclusivelyTrashed.hashCode());
        Boolean recursivelyTrashed = getRecursivelyTrashed();
        int hashCode4 = (hashCode3 * 59) + (recursivelyTrashed == null ? 43 : recursivelyTrashed.hashCode());
        Boolean isRoot = getIsRoot();
        int hashCode5 = (hashCode4 * 59) + (isRoot == null ? 43 : isRoot.hashCode());
        Boolean isShared = getIsShared();
        int hashCode6 = (hashCode5 * 59) + (isShared == null ? 43 : isShared.hashCode());
        String eTagRequest = getETagRequest();
        int hashCode7 = (hashCode6 * 59) + (eTagRequest == null ? 43 : eTagRequest.hashCode());
        String eTagResponse = getETagResponse();
        int hashCode8 = (hashCode7 * 59) + (eTagResponse == null ? 43 : eTagResponse.hashCode());
        ISO8601 modifiedDate = getModifiedDate();
        int hashCode9 = (hashCode8 * 59) + (modifiedDate == null ? 43 : modifiedDate.hashCode());
        ISO8601 createdDate = getCreatedDate();
        int hashCode10 = (hashCode9 * 59) + (createdDate == null ? 43 : createdDate.hashCode());
        String owner = getOwner();
        int hashCode11 = (hashCode10 * 59) + (owner == null ? 43 : owner.hashCode());
        List<String> assets = getAssets();
        int hashCode12 = (hashCode11 * 59) + (assets == null ? 43 : assets.hashCode());
        String tempLink = getTempLink();
        int hashCode13 = (hashCode12 * 59) + (tempLink == null ? 43 : tempLink.hashCode());
        String shareId = getShareId();
        int hashCode14 = (hashCode13 * 59) + (shareId == null ? 43 : shareId.hashCode());
        String shareURL = getShareURL();
        int hashCode15 = (hashCode14 * 59) + (shareURL == null ? 43 : shareURL.hashCode());
        String ownerId = getOwnerId();
        int hashCode16 = (hashCode15 * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        ISO8601 familyModifiedDate = getFamilyModifiedDate();
        int hashCode17 = (hashCode16 * 59) + (familyModifiedDate == null ? 43 : familyModifiedDate.hashCode());
        String purgeReason = getPurgeReason();
        int i = hashCode17 * 59;
        int hashCode18 = purgeReason == null ? 43 : purgeReason.hashCode();
        String lowResThumbnail = getLowResThumbnail();
        return ((i + hashCode18) * 59) + (lowResThumbnail != null ? lowResThumbnail.hashCode() : 43);
    }

    @Generated
    public void setAssets(List<String> list) {
        this.assets = list;
    }

    @Generated
    public void setCreatedDate(ISO8601 iso8601) {
        this.createdDate = iso8601;
    }

    @Generated
    public void setETagRequest(String str) {
        this.eTagRequest = str;
    }

    @Generated
    public void setETagResponse(String str) {
        this.eTagResponse = str;
    }

    @Generated
    public void setExclusivelyTrashed(Boolean bool) {
        this.exclusivelyTrashed = bool;
    }

    @Generated
    public void setFamilyModifiedDate(ISO8601 iso8601) {
        this.familyModifiedDate = iso8601;
    }

    @Generated
    public void setIsRoot(Boolean bool) {
        this.isRoot = bool;
    }

    @Generated
    public void setIsShared(Boolean bool) {
        this.isShared = bool;
    }

    @Generated
    public void setLowResThumbnail(String str) {
        this.lowResThumbnail = str;
    }

    @Generated
    public void setModifiedDate(ISO8601 iso8601) {
        this.modifiedDate = iso8601;
    }

    @Generated
    public void setOwner(String str) {
        this.owner = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setPurgeReason(String str) {
        this.purgeReason = str;
    }

    @Generated
    public void setRecursivelyTrashed(Boolean bool) {
        this.recursivelyTrashed = bool;
    }

    @Generated
    public void setShareId(String str) {
        this.shareId = str;
    }

    @Generated
    public void setShareURL(String str) {
        this.shareURL = str;
    }

    @Generated
    public void setTempLink(String str) {
        this.tempLink = str;
    }

    @Generated
    public void setVersion(Long l) {
        this.version = l;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.EditableNodeInfo
    @Generated
    public String toString() {
        return "NodeInfo(eTagRequest=" + getETagRequest() + ", eTagResponse=" + getETagResponse() + ", version=" + getVersion() + ", modifiedDate=" + getModifiedDate() + ", createdDate=" + getCreatedDate() + ", owner=" + getOwner() + ", assets=" + getAssets() + ", tempLink=" + getTempLink() + ", exclusivelyTrashed=" + getExclusivelyTrashed() + ", recursivelyTrashed=" + getRecursivelyTrashed() + ", isRoot=" + getIsRoot() + ", isShared=" + getIsShared() + ", shareId=" + getShareId() + ", shareURL=" + getShareURL() + ", ownerId=" + getOwnerId() + ", familyModifiedDate=" + getFamilyModifiedDate() + ", purgeReason=" + getPurgeReason() + ", lowResThumbnail=" + getLowResThumbnail() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
