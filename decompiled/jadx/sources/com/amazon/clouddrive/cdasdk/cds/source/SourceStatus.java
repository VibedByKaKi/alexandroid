package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SourceStatus {

    @SerializedName("cacheSize")
    @Expose
    private Long cacheSize;

    @SerializedName("isDownloading")
    @Expose
    private Boolean isDownloading;

    @SerializedName("isUploading")
    @Expose
    private Boolean isUploading;

    @SerializedName("uploadStatus")
    @Expose
    private Map<String, MediaTypeUploadStatus> uploadStatus;

    @Generated
    public SourceStatus() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SourceStatus;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceStatus)) {
            return false;
        }
        SourceStatus sourceStatus = (SourceStatus) obj;
        if (!sourceStatus.canEqual(this)) {
            return false;
        }
        Boolean isUploading = getIsUploading();
        Boolean isUploading2 = sourceStatus.getIsUploading();
        if (isUploading != null ? !isUploading.equals(isUploading2) : isUploading2 != null) {
            return false;
        }
        Boolean isDownloading = getIsDownloading();
        Boolean isDownloading2 = sourceStatus.getIsDownloading();
        if (isDownloading != null ? !isDownloading.equals(isDownloading2) : isDownloading2 != null) {
            return false;
        }
        Long cacheSize = getCacheSize();
        Long cacheSize2 = sourceStatus.getCacheSize();
        if (cacheSize != null ? !cacheSize.equals(cacheSize2) : cacheSize2 != null) {
            return false;
        }
        Map<String, MediaTypeUploadStatus> uploadStatus = getUploadStatus();
        Map<String, MediaTypeUploadStatus> uploadStatus2 = sourceStatus.getUploadStatus();
        return uploadStatus != null ? uploadStatus.equals(uploadStatus2) : uploadStatus2 == null;
    }

    @Generated
    public Long getCacheSize() {
        return this.cacheSize;
    }

    @Generated
    public Boolean getIsDownloading() {
        return this.isDownloading;
    }

    @Generated
    public Boolean getIsUploading() {
        return this.isUploading;
    }

    @Generated
    public Map<String, MediaTypeUploadStatus> getUploadStatus() {
        return this.uploadStatus;
    }

    @Generated
    public int hashCode() {
        Boolean isUploading = getIsUploading();
        int hashCode = isUploading == null ? 43 : isUploading.hashCode();
        Boolean isDownloading = getIsDownloading();
        int hashCode2 = ((hashCode + 59) * 59) + (isDownloading == null ? 43 : isDownloading.hashCode());
        Long cacheSize = getCacheSize();
        int i = hashCode2 * 59;
        int hashCode3 = cacheSize == null ? 43 : cacheSize.hashCode();
        Map<String, MediaTypeUploadStatus> uploadStatus = getUploadStatus();
        return ((i + hashCode3) * 59) + (uploadStatus != null ? uploadStatus.hashCode() : 43);
    }

    @Generated
    public void setCacheSize(Long l) {
        this.cacheSize = l;
    }

    @Generated
    public void setIsDownloading(Boolean bool) {
        this.isDownloading = bool;
    }

    @Generated
    public void setIsUploading(Boolean bool) {
        this.isUploading = bool;
    }

    @Generated
    public void setUploadStatus(Map<String, MediaTypeUploadStatus> map) {
        this.uploadStatus = map;
    }

    @Generated
    public String toString() {
        return "SourceStatus(isUploading=" + getIsUploading() + ", isDownloading=" + getIsDownloading() + ", cacheSize=" + getCacheSize() + ", uploadStatus=" + getUploadStatus() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
