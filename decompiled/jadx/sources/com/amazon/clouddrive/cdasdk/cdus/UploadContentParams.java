package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.Nullable;
import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ContentSignatureType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Set;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadContentParams extends ServiceRequest {

    @SerializedName("addToFamilyArchive")
    @Expose
    private boolean addToFamilyArchive;

    @SerializedName(CamServiceClient.QUERY_CONFLICT_RESOLUTION)
    @Expose
    private ConflictResolution conflictResolution;

    @SerializedName("contentDate")
    @Expose
    private String contentDate;

    @Nullable
    @SerializedName("contentSignature")
    @Expose
    private String contentSignature;

    @Nullable
    @SerializedName("contentSignatureType")
    @Expose
    private ContentSignatureType contentSignatureType;

    @SerializedName("fallbackContentDate")
    @Expose
    private String fallbackContentDate;

    @Nullable
    @SerializedName("favoriteSetting")
    @Expose
    private Boolean favoriteSetting;

    @SerializedName("fileMd5")
    @Expose
    private String fileMd5;

    @SerializedName(MetricsConstants.Type.FILE_SIZE)
    @Expose
    private Long fileSize;

    @Nullable
    @SerializedName("hiddenSetting")
    @Expose
    private Boolean hiddenSetting;

    @SerializedName("suppressionSet")
    @Expose
    private Set<Suppression> suppressionSet;

    @Nullable
    @SerializedName("visualCollectionParentNodeId")
    @Expose
    private String visualCollectionParentNodeId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class UploadContentParamsBuilder {

        @Generated
        private boolean addToFamilyArchive$set;

        @Generated
        private boolean addToFamilyArchive$value;

        @Generated
        private boolean conflictResolution$set;

        @Generated
        private ConflictResolution conflictResolution$value;

        @Generated
        private String contentDate;

        @Generated
        private String contentSignature;

        @Generated
        private ContentSignatureType contentSignatureType;

        @Generated
        private String fallbackContentDate;

        @Generated
        private Boolean favoriteSetting;

        @Generated
        private String fileMd5;

        @Generated
        private Long fileSize;

        @Generated
        private Boolean hiddenSetting;

        @Generated
        private Set<Suppression> suppressionSet;

        @Generated
        private String visualCollectionParentNodeId;

        @Generated
        public UploadContentParamsBuilder() {
        }

        @Generated
        public UploadContentParamsBuilder addToFamilyArchive(boolean z) {
            this.addToFamilyArchive$value = z;
            this.addToFamilyArchive$set = true;
            return this;
        }

        @Generated
        public UploadContentParams build() {
            ConflictResolution conflictResolution = this.conflictResolution$value;
            if (!this.conflictResolution$set) {
                conflictResolution = UploadContentParams.$default$conflictResolution();
            }
            ConflictResolution conflictResolution2 = conflictResolution;
            boolean z = this.addToFamilyArchive$value;
            if (!this.addToFamilyArchive$set) {
                z = UploadContentParams.$default$addToFamilyArchive();
            }
            return new UploadContentParams(this.fileMd5, this.fileSize, this.contentDate, this.fallbackContentDate, conflictResolution2, this.suppressionSet, z, this.favoriteSetting, this.hiddenSetting, this.contentSignature, this.contentSignatureType, this.visualCollectionParentNodeId);
        }

        @Generated
        public UploadContentParamsBuilder conflictResolution(ConflictResolution conflictResolution) {
            this.conflictResolution$value = conflictResolution;
            this.conflictResolution$set = true;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder contentDate(String str) {
            this.contentDate = str;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder contentSignature(@Nullable String str) {
            this.contentSignature = str;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder contentSignatureType(@Nullable ContentSignatureType contentSignatureType) {
            this.contentSignatureType = contentSignatureType;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder fallbackContentDate(String str) {
            this.fallbackContentDate = str;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder favoriteSetting(@Nullable Boolean bool) {
            this.favoriteSetting = bool;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder fileMd5(String str) {
            this.fileMd5 = str;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder fileSize(Long l) {
            this.fileSize = l;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder hiddenSetting(@Nullable Boolean bool) {
            this.hiddenSetting = bool;
            return this;
        }

        @Generated
        public UploadContentParamsBuilder suppressionSet(Set<Suppression> set) {
            this.suppressionSet = set;
            return this;
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("UploadContentParams.UploadContentParamsBuilder(fileMd5=");
            sb.append(this.fileMd5);
            sb.append(", fileSize=");
            sb.append(this.fileSize);
            sb.append(", contentDate=");
            sb.append(this.contentDate);
            sb.append(", fallbackContentDate=");
            sb.append(this.fallbackContentDate);
            sb.append(", conflictResolution$value=");
            sb.append(this.conflictResolution$value);
            sb.append(", suppressionSet=");
            sb.append(this.suppressionSet);
            sb.append(", addToFamilyArchive$value=");
            sb.append(this.addToFamilyArchive$value);
            sb.append(", favoriteSetting=");
            sb.append(this.favoriteSetting);
            sb.append(", hiddenSetting=");
            sb.append(this.hiddenSetting);
            sb.append(", contentSignature=");
            sb.append(this.contentSignature);
            sb.append(", contentSignatureType=");
            sb.append(this.contentSignatureType);
            sb.append(", visualCollectionParentNodeId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.visualCollectionParentNodeId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @Generated
        public UploadContentParamsBuilder visualCollectionParentNodeId(@Nullable String str) {
            this.visualCollectionParentNodeId = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Generated
    public static boolean $default$addToFamilyArchive() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Generated
    public static ConflictResolution $default$conflictResolution() {
        return ConflictResolution.NONE;
    }

    @Generated
    public UploadContentParams(String str, Long l, String str2, String str3, ConflictResolution conflictResolution, Set<Suppression> set, boolean z, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable ContentSignatureType contentSignatureType, @Nullable String str5) {
        this.fileMd5 = str;
        this.fileSize = l;
        this.contentDate = str2;
        this.fallbackContentDate = str3;
        this.conflictResolution = conflictResolution;
        this.suppressionSet = set;
        this.addToFamilyArchive = z;
        this.favoriteSetting = bool;
        this.hiddenSetting = bool2;
        this.contentSignature = str4;
        this.contentSignatureType = contentSignatureType;
        this.visualCollectionParentNodeId = str5;
    }

    @Generated
    public static UploadContentParamsBuilder builder() {
        return new UploadContentParamsBuilder();
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UploadContentParams;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadContentParams)) {
            return false;
        }
        UploadContentParams uploadContentParams = (UploadContentParams) obj;
        if (!uploadContentParams.canEqual(this) || !super.equals(obj) || isAddToFamilyArchive() != uploadContentParams.isAddToFamilyArchive()) {
            return false;
        }
        Long fileSize = getFileSize();
        Long fileSize2 = uploadContentParams.getFileSize();
        if (fileSize != null ? !fileSize.equals(fileSize2) : fileSize2 != null) {
            return false;
        }
        Boolean favoriteSetting = getFavoriteSetting();
        Boolean favoriteSetting2 = uploadContentParams.getFavoriteSetting();
        if (favoriteSetting != null ? !favoriteSetting.equals(favoriteSetting2) : favoriteSetting2 != null) {
            return false;
        }
        Boolean hiddenSetting = getHiddenSetting();
        Boolean hiddenSetting2 = uploadContentParams.getHiddenSetting();
        if (hiddenSetting != null ? !hiddenSetting.equals(hiddenSetting2) : hiddenSetting2 != null) {
            return false;
        }
        String fileMd5 = getFileMd5();
        String fileMd52 = uploadContentParams.getFileMd5();
        if (fileMd5 != null ? !fileMd5.equals(fileMd52) : fileMd52 != null) {
            return false;
        }
        String contentDate = getContentDate();
        String contentDate2 = uploadContentParams.getContentDate();
        if (contentDate != null ? !contentDate.equals(contentDate2) : contentDate2 != null) {
            return false;
        }
        String fallbackContentDate = getFallbackContentDate();
        String fallbackContentDate2 = uploadContentParams.getFallbackContentDate();
        if (fallbackContentDate != null ? !fallbackContentDate.equals(fallbackContentDate2) : fallbackContentDate2 != null) {
            return false;
        }
        ConflictResolution conflictResolution = getConflictResolution();
        ConflictResolution conflictResolution2 = uploadContentParams.getConflictResolution();
        if (conflictResolution != null ? !conflictResolution.equals(conflictResolution2) : conflictResolution2 != null) {
            return false;
        }
        Set<Suppression> suppressionSet = getSuppressionSet();
        Set<Suppression> suppressionSet2 = uploadContentParams.getSuppressionSet();
        if (suppressionSet != null ? !suppressionSet.equals(suppressionSet2) : suppressionSet2 != null) {
            return false;
        }
        String contentSignature = getContentSignature();
        String contentSignature2 = uploadContentParams.getContentSignature();
        if (contentSignature != null ? !contentSignature.equals(contentSignature2) : contentSignature2 != null) {
            return false;
        }
        ContentSignatureType contentSignatureType = getContentSignatureType();
        ContentSignatureType contentSignatureType2 = uploadContentParams.getContentSignatureType();
        if (contentSignatureType != null ? !contentSignatureType.equals(contentSignatureType2) : contentSignatureType2 != null) {
            return false;
        }
        String visualCollectionParentNodeId = getVisualCollectionParentNodeId();
        String visualCollectionParentNodeId2 = uploadContentParams.getVisualCollectionParentNodeId();
        return visualCollectionParentNodeId != null ? visualCollectionParentNodeId.equals(visualCollectionParentNodeId2) : visualCollectionParentNodeId2 == null;
    }

    @Generated
    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    @Generated
    public String getContentDate() {
        return this.contentDate;
    }

    @Nullable
    @Generated
    public String getContentSignature() {
        return this.contentSignature;
    }

    @Nullable
    @Generated
    public ContentSignatureType getContentSignatureType() {
        return this.contentSignatureType;
    }

    @Generated
    public String getFallbackContentDate() {
        return this.fallbackContentDate;
    }

    @Nullable
    @Generated
    public Boolean getFavoriteSetting() {
        return this.favoriteSetting;
    }

    @Generated
    public String getFileMd5() {
        return this.fileMd5;
    }

    @Generated
    public Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    @Generated
    public Boolean getHiddenSetting() {
        return this.hiddenSetting;
    }

    @Generated
    public Set<Suppression> getSuppressionSet() {
        return this.suppressionSet;
    }

    @Nullable
    @Generated
    public String getVisualCollectionParentNodeId() {
        return this.visualCollectionParentNodeId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = (super.hashCode() * 59) + (isAddToFamilyArchive() ? 79 : 97);
        Long fileSize = getFileSize();
        int hashCode2 = (hashCode * 59) + (fileSize == null ? 43 : fileSize.hashCode());
        Boolean favoriteSetting = getFavoriteSetting();
        int hashCode3 = (hashCode2 * 59) + (favoriteSetting == null ? 43 : favoriteSetting.hashCode());
        Boolean hiddenSetting = getHiddenSetting();
        int hashCode4 = (hashCode3 * 59) + (hiddenSetting == null ? 43 : hiddenSetting.hashCode());
        String fileMd5 = getFileMd5();
        int hashCode5 = (hashCode4 * 59) + (fileMd5 == null ? 43 : fileMd5.hashCode());
        String contentDate = getContentDate();
        int hashCode6 = (hashCode5 * 59) + (contentDate == null ? 43 : contentDate.hashCode());
        String fallbackContentDate = getFallbackContentDate();
        int hashCode7 = (hashCode6 * 59) + (fallbackContentDate == null ? 43 : fallbackContentDate.hashCode());
        ConflictResolution conflictResolution = getConflictResolution();
        int hashCode8 = (hashCode7 * 59) + (conflictResolution == null ? 43 : conflictResolution.hashCode());
        Set<Suppression> suppressionSet = getSuppressionSet();
        int hashCode9 = (hashCode8 * 59) + (suppressionSet == null ? 43 : suppressionSet.hashCode());
        String contentSignature = getContentSignature();
        int hashCode10 = (hashCode9 * 59) + (contentSignature == null ? 43 : contentSignature.hashCode());
        ContentSignatureType contentSignatureType = getContentSignatureType();
        int i = hashCode10 * 59;
        int hashCode11 = contentSignatureType == null ? 43 : contentSignatureType.hashCode();
        String visualCollectionParentNodeId = getVisualCollectionParentNodeId();
        return ((i + hashCode11) * 59) + (visualCollectionParentNodeId != null ? visualCollectionParentNodeId.hashCode() : 43);
    }

    @Generated
    public boolean isAddToFamilyArchive() {
        return this.addToFamilyArchive;
    }

    @Generated
    public void setAddToFamilyArchive(boolean z) {
        this.addToFamilyArchive = z;
    }

    @Generated
    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    @Generated
    public void setContentDate(String str) {
        this.contentDate = str;
    }

    @Generated
    public void setContentSignature(@Nullable String str) {
        this.contentSignature = str;
    }

    @Generated
    public void setContentSignatureType(@Nullable ContentSignatureType contentSignatureType) {
        this.contentSignatureType = contentSignatureType;
    }

    @Generated
    public void setFallbackContentDate(String str) {
        this.fallbackContentDate = str;
    }

    @Generated
    public void setFavoriteSetting(@Nullable Boolean bool) {
        this.favoriteSetting = bool;
    }

    @Generated
    public void setFileMd5(String str) {
        this.fileMd5 = str;
    }

    @Generated
    public void setFileSize(Long l) {
        this.fileSize = l;
    }

    @Generated
    public void setHiddenSetting(@Nullable Boolean bool) {
        this.hiddenSetting = bool;
    }

    @Generated
    public void setSuppressionSet(Set<Suppression> set) {
        this.suppressionSet = set;
    }

    @Generated
    public void setVisualCollectionParentNodeId(@Nullable String str) {
        this.visualCollectionParentNodeId = str;
    }

    @Generated
    public UploadContentParamsBuilder toBuilder() {
        return new UploadContentParamsBuilder().fileMd5(this.fileMd5).fileSize(this.fileSize).contentDate(this.contentDate).fallbackContentDate(this.fallbackContentDate).conflictResolution(this.conflictResolution).suppressionSet(this.suppressionSet).addToFamilyArchive(this.addToFamilyArchive).favoriteSetting(this.favoriteSetting).hiddenSetting(this.hiddenSetting).contentSignature(this.contentSignature).contentSignatureType(this.contentSignatureType).visualCollectionParentNodeId(this.visualCollectionParentNodeId);
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "UploadContentParams(fileMd5=" + getFileMd5() + ", fileSize=" + getFileSize() + ", contentDate=" + getContentDate() + ", fallbackContentDate=" + getFallbackContentDate() + ", conflictResolution=" + getConflictResolution() + ", suppressionSet=" + getSuppressionSet() + ", addToFamilyArchive=" + isAddToFamilyArchive() + ", favoriteSetting=" + getFavoriteSetting() + ", hiddenSetting=" + getHiddenSetting() + ", contentSignature=" + getContentSignature() + ", contentSignatureType=" + getContentSignatureType() + ", visualCollectionParentNodeId=" + getVisualCollectionParentNodeId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
