package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.NonNull;
import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateContentRequest extends ServiceRequest {
    private transient List<String> accessRuleIds;

    @SerializedName("addToFamilyArchive")
    @Expose
    private Boolean addToFamilyArchive;

    @SerializedName("assetType")
    @Expose
    private String assetType;

    @SerializedName(CamServiceClient.QUERY_CONFLICT_RESOLUTION)
    @Expose
    private com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution;

    @SerializedName("contactCount")
    @Expose
    private Long contactCount;

    @SerializedName("contentDate")
    @Expose
    private String contentDate;

    @SerializedName(MetricsConstants.Type.FILE_SIZE)
    @Expose
    private Long fileSize;

    @SerializedName("isExpirable")
    @Expose
    private Boolean isExpirable;

    @SerializedName("isFavorite")
    @Expose
    private Boolean isFavorite;

    @SerializedName("isHidden")
    @Expose
    private Boolean isHidden;

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName("nonBillable")
    @Expose
    private Boolean nonBillable;

    @SerializedName("parentNodeId")
    @Expose
    private String parentNodeId;

    @SerializedName("restricted")
    @Expose
    private Boolean restricted;

    @SerializedName("subkind")
    @Expose
    private String subkind;

    @SerializedName("suppress")
    @Expose
    private String suppress;

    public UpdateContentRequest(@NonNull Long l) {
        this.fileSize = l;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UpdateContentRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateContentRequest)) {
            return false;
        }
        UpdateContentRequest updateContentRequest = (UpdateContentRequest) obj;
        if (!updateContentRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long fileSize = getFileSize();
        Long fileSize2 = updateContentRequest.getFileSize();
        if (fileSize != null ? !fileSize.equals(fileSize2) : fileSize2 != null) {
            return false;
        }
        Boolean addToFamilyArchive = getAddToFamilyArchive();
        Boolean addToFamilyArchive2 = updateContentRequest.getAddToFamilyArchive();
        if (addToFamilyArchive != null ? !addToFamilyArchive.equals(addToFamilyArchive2) : addToFamilyArchive2 != null) {
            return false;
        }
        Boolean isFavorite = getIsFavorite();
        Boolean isFavorite2 = updateContentRequest.getIsFavorite();
        if (isFavorite != null ? !isFavorite.equals(isFavorite2) : isFavorite2 != null) {
            return false;
        }
        Boolean isHidden = getIsHidden();
        Boolean isHidden2 = updateContentRequest.getIsHidden();
        if (isHidden != null ? !isHidden.equals(isHidden2) : isHidden2 != null) {
            return false;
        }
        Boolean nonBillable = getNonBillable();
        Boolean nonBillable2 = updateContentRequest.getNonBillable();
        if (nonBillable != null ? !nonBillable.equals(nonBillable2) : nonBillable2 != null) {
            return false;
        }
        Boolean isExpirable = getIsExpirable();
        Boolean isExpirable2 = updateContentRequest.getIsExpirable();
        if (isExpirable != null ? !isExpirable.equals(isExpirable2) : isExpirable2 != null) {
            return false;
        }
        Boolean restricted = getRestricted();
        Boolean restricted2 = updateContentRequest.getRestricted();
        if (restricted != null ? !restricted.equals(restricted2) : restricted2 != null) {
            return false;
        }
        Long contactCount = getContactCount();
        Long contactCount2 = updateContentRequest.getContactCount();
        if (contactCount != null ? !contactCount.equals(contactCount2) : contactCount2 != null) {
            return false;
        }
        String contentDate = getContentDate();
        String contentDate2 = updateContentRequest.getContentDate();
        if (contentDate != null ? !contentDate.equals(contentDate2) : contentDate2 != null) {
            return false;
        }
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution = getConflictResolution();
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution2 = updateContentRequest.getConflictResolution();
        if (conflictResolution != null ? !conflictResolution.equals(conflictResolution2) : conflictResolution2 != null) {
            return false;
        }
        String suppress = getSuppress();
        String suppress2 = updateContentRequest.getSuppress();
        if (suppress != null ? !suppress.equals(suppress2) : suppress2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = updateContentRequest.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        String subkind = getSubkind();
        String subkind2 = updateContentRequest.getSubkind();
        if (subkind != null ? !subkind.equals(subkind2) : subkind2 != null) {
            return false;
        }
        String assetType = getAssetType();
        String assetType2 = updateContentRequest.getAssetType();
        if (assetType != null ? !assetType.equals(assetType2) : assetType2 != null) {
            return false;
        }
        String parentNodeId = getParentNodeId();
        String parentNodeId2 = updateContentRequest.getParentNodeId();
        return parentNodeId != null ? parentNodeId.equals(parentNodeId2) : parentNodeId2 == null;
    }

    @Generated
    public List<String> getAccessRuleIds() {
        return this.accessRuleIds;
    }

    @Generated
    public Boolean getAddToFamilyArchive() {
        return this.addToFamilyArchive;
    }

    @Generated
    public String getAssetType() {
        return this.assetType;
    }

    @Generated
    public com.amazon.clouddrive.cdasdk.cdp.ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    @Generated
    public Long getContactCount() {
        return this.contactCount;
    }

    @Generated
    public String getContentDate() {
        return this.contentDate;
    }

    @Generated
    public Long getFileSize() {
        return this.fileSize;
    }

    @Generated
    public Boolean getIsExpirable() {
        return this.isExpirable;
    }

    @Generated
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Generated
    public Boolean getIsHidden() {
        return this.isHidden;
    }

    @Generated
    public String getKind() {
        return this.kind;
    }

    @Generated
    public Boolean getNonBillable() {
        return this.nonBillable;
    }

    @Generated
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    @Generated
    public Boolean getRestricted() {
        return this.restricted;
    }

    @Generated
    public String getSubkind() {
        return this.subkind;
    }

    @Generated
    public String getSuppress() {
        return this.suppress;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long fileSize = getFileSize();
        int hashCode2 = (hashCode * 59) + (fileSize == null ? 43 : fileSize.hashCode());
        Boolean addToFamilyArchive = getAddToFamilyArchive();
        int hashCode3 = (hashCode2 * 59) + (addToFamilyArchive == null ? 43 : addToFamilyArchive.hashCode());
        Boolean isFavorite = getIsFavorite();
        int hashCode4 = (hashCode3 * 59) + (isFavorite == null ? 43 : isFavorite.hashCode());
        Boolean isHidden = getIsHidden();
        int hashCode5 = (hashCode4 * 59) + (isHidden == null ? 43 : isHidden.hashCode());
        Boolean nonBillable = getNonBillable();
        int hashCode6 = (hashCode5 * 59) + (nonBillable == null ? 43 : nonBillable.hashCode());
        Boolean isExpirable = getIsExpirable();
        int hashCode7 = (hashCode6 * 59) + (isExpirable == null ? 43 : isExpirable.hashCode());
        Boolean restricted = getRestricted();
        int hashCode8 = (hashCode7 * 59) + (restricted == null ? 43 : restricted.hashCode());
        Long contactCount = getContactCount();
        int hashCode9 = (hashCode8 * 59) + (contactCount == null ? 43 : contactCount.hashCode());
        String contentDate = getContentDate();
        int hashCode10 = (hashCode9 * 59) + (contentDate == null ? 43 : contentDate.hashCode());
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution = getConflictResolution();
        int hashCode11 = (hashCode10 * 59) + (conflictResolution == null ? 43 : conflictResolution.hashCode());
        String suppress = getSuppress();
        int hashCode12 = (hashCode11 * 59) + (suppress == null ? 43 : suppress.hashCode());
        String kind = getKind();
        int hashCode13 = (hashCode12 * 59) + (kind == null ? 43 : kind.hashCode());
        String subkind = getSubkind();
        int hashCode14 = (hashCode13 * 59) + (subkind == null ? 43 : subkind.hashCode());
        String assetType = getAssetType();
        int i = hashCode14 * 59;
        int hashCode15 = assetType == null ? 43 : assetType.hashCode();
        String parentNodeId = getParentNodeId();
        return ((i + hashCode15) * 59) + (parentNodeId != null ? parentNodeId.hashCode() : 43);
    }

    @Generated
    public void setAccessRuleIds(List<String> list) {
        this.accessRuleIds = list;
    }

    @Generated
    public void setAddToFamilyArchive(Boolean bool) {
        this.addToFamilyArchive = bool;
    }

    @Generated
    public void setAssetType(String str) {
        this.assetType = str;
    }

    @Generated
    public void setConflictResolution(com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    @Generated
    public void setContactCount(Long l) {
        this.contactCount = l;
    }

    @Generated
    public void setContentDate(String str) {
        this.contentDate = str;
    }

    @Generated
    public void setFileSize(Long l) {
        this.fileSize = l;
    }

    @Generated
    public void setIsExpirable(Boolean bool) {
        this.isExpirable = bool;
    }

    @Generated
    public void setIsFavorite(Boolean bool) {
        this.isFavorite = bool;
    }

    @Generated
    public void setIsHidden(Boolean bool) {
        this.isHidden = bool;
    }

    @Generated
    public void setKind(String str) {
        this.kind = str;
    }

    @Generated
    public void setNonBillable(Boolean bool) {
        this.nonBillable = bool;
    }

    @Generated
    public void setParentNodeId(String str) {
        this.parentNodeId = str;
    }

    @Generated
    public void setRestricted(Boolean bool) {
        this.restricted = bool;
    }

    @Generated
    public void setSubkind(String str) {
        this.subkind = str;
    }

    @Generated
    public void setSuppress(String str) {
        this.suppress = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "UpdateContentRequest(fileSize=" + getFileSize() + ", contentDate=" + getContentDate() + ", conflictResolution=" + getConflictResolution() + ", suppress=" + getSuppress() + ", kind=" + getKind() + ", subkind=" + getSubkind() + ", assetType=" + getAssetType() + ", addToFamilyArchive=" + getAddToFamilyArchive() + ", isFavorite=" + getIsFavorite() + ", isHidden=" + getIsHidden() + ", parentNodeId=" + getParentNodeId() + ", nonBillable=" + getNonBillable() + ", isExpirable=" + getIsExpirable() + ", restricted=" + getRestricted() + ", accessRuleIds=" + getAccessRuleIds() + ", contactCount=" + getContactCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
