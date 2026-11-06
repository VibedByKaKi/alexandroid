package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaTypeUploadStatus {

    @SerializedName("backlogSize")
    @Expose
    private Long backlogSize;

    @SerializedName("isAutoSaveActive")
    @Expose
    private Boolean isAutoSaveActive;

    @SerializedName("uploadQueueSize")
    @Expose
    private Long uploadQueueSize;

    @Generated
    public MediaTypeUploadStatus() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof MediaTypeUploadStatus;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaTypeUploadStatus)) {
            return false;
        }
        MediaTypeUploadStatus mediaTypeUploadStatus = (MediaTypeUploadStatus) obj;
        if (!mediaTypeUploadStatus.canEqual(this)) {
            return false;
        }
        Boolean isAutoSaveActive = getIsAutoSaveActive();
        Boolean isAutoSaveActive2 = mediaTypeUploadStatus.getIsAutoSaveActive();
        if (isAutoSaveActive != null ? !isAutoSaveActive.equals(isAutoSaveActive2) : isAutoSaveActive2 != null) {
            return false;
        }
        Long uploadQueueSize = getUploadQueueSize();
        Long uploadQueueSize2 = mediaTypeUploadStatus.getUploadQueueSize();
        if (uploadQueueSize != null ? !uploadQueueSize.equals(uploadQueueSize2) : uploadQueueSize2 != null) {
            return false;
        }
        Long backlogSize = getBacklogSize();
        Long backlogSize2 = mediaTypeUploadStatus.getBacklogSize();
        return backlogSize != null ? backlogSize.equals(backlogSize2) : backlogSize2 == null;
    }

    @Generated
    public Long getBacklogSize() {
        return this.backlogSize;
    }

    @Generated
    public Boolean getIsAutoSaveActive() {
        return this.isAutoSaveActive;
    }

    @Generated
    public Long getUploadQueueSize() {
        return this.uploadQueueSize;
    }

    @Generated
    public int hashCode() {
        Boolean isAutoSaveActive = getIsAutoSaveActive();
        int hashCode = isAutoSaveActive == null ? 43 : isAutoSaveActive.hashCode();
        Long uploadQueueSize = getUploadQueueSize();
        int i = (hashCode + 59) * 59;
        int hashCode2 = uploadQueueSize == null ? 43 : uploadQueueSize.hashCode();
        Long backlogSize = getBacklogSize();
        return ((i + hashCode2) * 59) + (backlogSize != null ? backlogSize.hashCode() : 43);
    }

    @Generated
    public void setBacklogSize(Long l) {
        this.backlogSize = l;
    }

    @Generated
    public void setIsAutoSaveActive(Boolean bool) {
        this.isAutoSaveActive = bool;
    }

    @Generated
    public void setUploadQueueSize(Long l) {
        this.uploadQueueSize = l;
    }

    @Generated
    public String toString() {
        return "MediaTypeUploadStatus(isAutoSaveActive=" + getIsAutoSaveActive() + ", uploadQueueSize=" + getUploadQueueSize() + ", backlogSize=" + getBacklogSize() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
