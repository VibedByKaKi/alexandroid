package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ContentSignatureType;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InitiateMultipartRequest extends ServiceRequest {

    @SerializedName("accessRuleIds")
    @Expose
    private String accessRuleIds;

    @SerializedName("addToFamilyArchive")
    @Expose
    private Boolean addToFamilyArchive;

    @SerializedName("assetType")
    @Expose
    private String assetType;

    @SerializedName(CamServiceClient.QUERY_CONFLICT_RESOLUTION)
    @Expose
    private com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution;

    @SerializedName("contentDate")
    @Expose
    private String contentDate;

    @SerializedName("contentSignature")
    @Expose
    private String contentSignature;

    @SerializedName("contentSignatureType")
    @Expose
    private ContentSignatureType contentSignatureType;

    @SerializedName("fallbackContentDate")
    @Expose
    private String fallbackContentDate;

    @SerializedName("isFavorite")
    @Expose
    private Boolean isFavorite;

    @SerializedName("isHidden")
    @Expose
    private Boolean isHidden;

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("parentNodeId")
    @Expose
    private String parentNodeId;

    @SerializedName("properties")
    @Expose
    private String properties;

    @SerializedName("suppress")
    @Expose
    private String suppress;

    @SerializedName(MetricsConstants.Type.FILE_SIZE)
    @Expose
    private Long totalFileSize;

    @SerializedName("visualCollectionParentNodeId")
    @Expose
    private String visualCollectionParentNodeId;

    public InitiateMultipartRequest(Long l, String str) {
        this.totalFileSize = l;
        this.name = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof InitiateMultipartRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateMultipartRequest)) {
            return false;
        }
        InitiateMultipartRequest initiateMultipartRequest = (InitiateMultipartRequest) obj;
        if (!initiateMultipartRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long totalFileSize = getTotalFileSize();
        Long totalFileSize2 = initiateMultipartRequest.getTotalFileSize();
        if (totalFileSize != null ? !totalFileSize.equals(totalFileSize2) : totalFileSize2 != null) {
            return false;
        }
        Boolean addToFamilyArchive = getAddToFamilyArchive();
        Boolean addToFamilyArchive2 = initiateMultipartRequest.getAddToFamilyArchive();
        if (addToFamilyArchive != null ? !addToFamilyArchive.equals(addToFamilyArchive2) : addToFamilyArchive2 != null) {
            return false;
        }
        Boolean isFavorite = getIsFavorite();
        Boolean isFavorite2 = initiateMultipartRequest.getIsFavorite();
        if (isFavorite != null ? !isFavorite.equals(isFavorite2) : isFavorite2 != null) {
            return false;
        }
        Boolean isHidden = getIsHidden();
        Boolean isHidden2 = initiateMultipartRequest.getIsHidden();
        if (isHidden != null ? !isHidden.equals(isHidden2) : isHidden2 != null) {
            return false;
        }
        String name = getName();
        String name2 = initiateMultipartRequest.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String contentDate = getContentDate();
        String contentDate2 = initiateMultipartRequest.getContentDate();
        if (contentDate != null ? !contentDate.equals(contentDate2) : contentDate2 != null) {
            return false;
        }
        String fallbackContentDate = getFallbackContentDate();
        String fallbackContentDate2 = initiateMultipartRequest.getFallbackContentDate();
        if (fallbackContentDate != null ? !fallbackContentDate.equals(fallbackContentDate2) : fallbackContentDate2 != null) {
            return false;
        }
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution = getConflictResolution();
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution2 = initiateMultipartRequest.getConflictResolution();
        if (conflictResolution != null ? !conflictResolution.equals(conflictResolution2) : conflictResolution2 != null) {
            return false;
        }
        String suppress = getSuppress();
        String suppress2 = initiateMultipartRequest.getSuppress();
        if (suppress != null ? !suppress.equals(suppress2) : suppress2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = initiateMultipartRequest.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        String assetType = getAssetType();
        String assetType2 = initiateMultipartRequest.getAssetType();
        if (assetType != null ? !assetType.equals(assetType2) : assetType2 != null) {
            return false;
        }
        String parentNodeId = getParentNodeId();
        String parentNodeId2 = initiateMultipartRequest.getParentNodeId();
        if (parentNodeId != null ? !parentNodeId.equals(parentNodeId2) : parentNodeId2 != null) {
            return false;
        }
        String contentSignature = getContentSignature();
        String contentSignature2 = initiateMultipartRequest.getContentSignature();
        if (contentSignature != null ? !contentSignature.equals(contentSignature2) : contentSignature2 != null) {
            return false;
        }
        ContentSignatureType contentSignatureType = getContentSignatureType();
        ContentSignatureType contentSignatureType2 = initiateMultipartRequest.getContentSignatureType();
        if (contentSignatureType != null ? !contentSignatureType.equals(contentSignatureType2) : contentSignatureType2 != null) {
            return false;
        }
        String accessRuleIds = getAccessRuleIds();
        String accessRuleIds2 = initiateMultipartRequest.getAccessRuleIds();
        if (accessRuleIds != null ? !accessRuleIds.equals(accessRuleIds2) : accessRuleIds2 != null) {
            return false;
        }
        String visualCollectionParentNodeId = getVisualCollectionParentNodeId();
        String visualCollectionParentNodeId2 = initiateMultipartRequest.getVisualCollectionParentNodeId();
        if (visualCollectionParentNodeId != null ? !visualCollectionParentNodeId.equals(visualCollectionParentNodeId2) : visualCollectionParentNodeId2 != null) {
            return false;
        }
        String properties = getProperties();
        String properties2 = initiateMultipartRequest.getProperties();
        return properties != null ? properties.equals(properties2) : properties2 == null;
    }

    @Generated
    public String getAccessRuleIds() {
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
    public String getContentDate() {
        return this.contentDate;
    }

    @Generated
    public String getContentSignature() {
        return this.contentSignature;
    }

    @Generated
    public ContentSignatureType getContentSignatureType() {
        return this.contentSignatureType;
    }

    @Generated
    public String getFallbackContentDate() {
        return this.fallbackContentDate;
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
    public String getName() {
        return this.name;
    }

    @Generated
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    @Generated
    public String getProperties() {
        return this.properties;
    }

    @Generated
    public String getSuppress() {
        return this.suppress;
    }

    @Generated
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    @Generated
    public String getVisualCollectionParentNodeId() {
        return this.visualCollectionParentNodeId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long totalFileSize = getTotalFileSize();
        int hashCode2 = (hashCode * 59) + (totalFileSize == null ? 43 : totalFileSize.hashCode());
        Boolean addToFamilyArchive = getAddToFamilyArchive();
        int hashCode3 = (hashCode2 * 59) + (addToFamilyArchive == null ? 43 : addToFamilyArchive.hashCode());
        Boolean isFavorite = getIsFavorite();
        int hashCode4 = (hashCode3 * 59) + (isFavorite == null ? 43 : isFavorite.hashCode());
        Boolean isHidden = getIsHidden();
        int hashCode5 = (hashCode4 * 59) + (isHidden == null ? 43 : isHidden.hashCode());
        String name = getName();
        int hashCode6 = (hashCode5 * 59) + (name == null ? 43 : name.hashCode());
        String contentDate = getContentDate();
        int hashCode7 = (hashCode6 * 59) + (contentDate == null ? 43 : contentDate.hashCode());
        String fallbackContentDate = getFallbackContentDate();
        int hashCode8 = (hashCode7 * 59) + (fallbackContentDate == null ? 43 : fallbackContentDate.hashCode());
        com.amazon.clouddrive.cdasdk.cdp.ConflictResolution conflictResolution = getConflictResolution();
        int hashCode9 = (hashCode8 * 59) + (conflictResolution == null ? 43 : conflictResolution.hashCode());
        String suppress = getSuppress();
        int hashCode10 = (hashCode9 * 59) + (suppress == null ? 43 : suppress.hashCode());
        String kind = getKind();
        int hashCode11 = (hashCode10 * 59) + (kind == null ? 43 : kind.hashCode());
        String assetType = getAssetType();
        int hashCode12 = (hashCode11 * 59) + (assetType == null ? 43 : assetType.hashCode());
        String parentNodeId = getParentNodeId();
        int hashCode13 = (hashCode12 * 59) + (parentNodeId == null ? 43 : parentNodeId.hashCode());
        String contentSignature = getContentSignature();
        int hashCode14 = (hashCode13 * 59) + (contentSignature == null ? 43 : contentSignature.hashCode());
        ContentSignatureType contentSignatureType = getContentSignatureType();
        int hashCode15 = (hashCode14 * 59) + (contentSignatureType == null ? 43 : contentSignatureType.hashCode());
        String accessRuleIds = getAccessRuleIds();
        int hashCode16 = (hashCode15 * 59) + (accessRuleIds == null ? 43 : accessRuleIds.hashCode());
        String visualCollectionParentNodeId = getVisualCollectionParentNodeId();
        int i = hashCode16 * 59;
        int hashCode17 = visualCollectionParentNodeId == null ? 43 : visualCollectionParentNodeId.hashCode();
        String properties = getProperties();
        return ((i + hashCode17) * 59) + (properties != null ? properties.hashCode() : 43);
    }

    @Generated
    public void setAccessRuleIds(String str) {
        this.accessRuleIds = str;
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
    public void setContentDate(String str) {
        this.contentDate = str;
    }

    @Generated
    public void setContentSignature(String str) {
        this.contentSignature = str;
    }

    @Generated
    public void setContentSignatureType(ContentSignatureType contentSignatureType) {
        this.contentSignatureType = contentSignatureType;
    }

    @Generated
    public void setFallbackContentDate(String str) {
        this.fallbackContentDate = str;
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
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setParentNodeId(String str) {
        this.parentNodeId = str;
    }

    @Generated
    public void setProperties(String str) {
        this.properties = str;
    }

    @Generated
    public void setSuppress(String str) {
        this.suppress = str;
    }

    @Generated
    public void setTotalFileSize(Long l) {
        this.totalFileSize = l;
    }

    @Generated
    public void setVisualCollectionParentNodeId(String str) {
        this.visualCollectionParentNodeId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "InitiateMultipartRequest(totalFileSize=" + getTotalFileSize() + ", name=" + getName() + ", contentDate=" + getContentDate() + ", fallbackContentDate=" + getFallbackContentDate() + ", conflictResolution=" + getConflictResolution() + ", suppress=" + getSuppress() + ", kind=" + getKind() + ", assetType=" + getAssetType() + ", addToFamilyArchive=" + getAddToFamilyArchive() + ", isFavorite=" + getIsFavorite() + ", isHidden=" + getIsHidden() + ", parentNodeId=" + getParentNodeId() + ", contentSignature=" + getContentSignature() + ", contentSignatureType=" + getContentSignatureType() + ", accessRuleIds=" + getAccessRuleIds() + ", visualCollectionParentNodeId=" + getVisualCollectionParentNodeId() + ", properties=" + getProperties() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public InitiateMultipartRequest withProperties(String str) {
        this.properties = str;
        return this;
    }

    public InitiateMultipartRequest withVisualCollectionParentNodeId(String str) {
        this.visualCollectionParentNodeId = str;
        return this;
    }
}
