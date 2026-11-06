package com.amazon.clouddrive.cdasdk.cdts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ThumbnailRequest {
    private CropBox cropBox;
    private FitType fitType;
    private String groupShareToken;

    @NonNull
    private String nodeId;
    private String ownerId;
    private ViewBox viewBox;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class ThumbnailRequestBuilder {

        @Generated
        private CropBox cropBox;

        @Generated
        private FitType fitType;

        @Generated
        private String groupShareToken;

        @Generated
        private String nodeId;

        @Generated
        private String ownerId;

        @Generated
        private ViewBox viewBox;

        @Generated
        public ThumbnailRequestBuilder() {
        }

        @Generated
        public ThumbnailRequest build() {
            return new ThumbnailRequest(this.nodeId, this.ownerId, this.groupShareToken, this.viewBox, this.fitType, this.cropBox);
        }

        @Generated
        public ThumbnailRequestBuilder cropBox(CropBox cropBox) {
            this.cropBox = cropBox;
            return this;
        }

        @Generated
        public ThumbnailRequestBuilder fitType(FitType fitType) {
            this.fitType = fitType;
            return this;
        }

        @Generated
        public ThumbnailRequestBuilder groupShareToken(String str) {
            this.groupShareToken = str;
            return this;
        }

        @Generated
        public ThumbnailRequestBuilder nodeId(@NonNull String str) {
            if (str != null) {
                this.nodeId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("nodeId is marked non-null but is null");
            return null;
        }

        @Generated
        public ThumbnailRequestBuilder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Generated
        public String toString() {
            return "ThumbnailRequest.ThumbnailRequestBuilder(nodeId=" + this.nodeId + ", ownerId=" + this.ownerId + ", groupShareToken=" + this.groupShareToken + ", viewBox=" + this.viewBox + ", fitType=" + this.fitType + ", cropBox=" + this.cropBox + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @Generated
        public ThumbnailRequestBuilder viewBox(ViewBox viewBox) {
            this.viewBox = viewBox;
            return this;
        }
    }

    @Generated
    public ThumbnailRequest(@NonNull String str, String str2, String str3, ViewBox viewBox, FitType fitType, CropBox cropBox) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("nodeId is marked non-null but is null");
            throw null;
        }
        this.nodeId = str;
        this.ownerId = str2;
        this.groupShareToken = str3;
        this.viewBox = viewBox;
        this.fitType = fitType;
        this.cropBox = cropBox;
    }

    @Generated
    public static ThumbnailRequestBuilder builder() {
        return new ThumbnailRequestBuilder();
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ThumbnailRequest;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThumbnailRequest)) {
            return false;
        }
        ThumbnailRequest thumbnailRequest = (ThumbnailRequest) obj;
        if (!thumbnailRequest.canEqual(this)) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = thumbnailRequest.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = thumbnailRequest.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        String groupShareToken = getGroupShareToken();
        String groupShareToken2 = thumbnailRequest.getGroupShareToken();
        if (groupShareToken != null ? !groupShareToken.equals(groupShareToken2) : groupShareToken2 != null) {
            return false;
        }
        ViewBox viewBox = getViewBox();
        ViewBox viewBox2 = thumbnailRequest.getViewBox();
        if (viewBox != null ? !viewBox.equals(viewBox2) : viewBox2 != null) {
            return false;
        }
        FitType fitType = getFitType();
        FitType fitType2 = thumbnailRequest.getFitType();
        if (fitType != null ? !fitType.equals(fitType2) : fitType2 != null) {
            return false;
        }
        CropBox cropBox = getCropBox();
        CropBox cropBox2 = thumbnailRequest.getCropBox();
        return cropBox != null ? cropBox.equals(cropBox2) : cropBox2 == null;
    }

    @Generated
    public CropBox getCropBox() {
        return this.cropBox;
    }

    @Generated
    public FitType getFitType() {
        return this.fitType;
    }

    @Generated
    public String getGroupShareToken() {
        return this.groupShareToken;
    }

    @NonNull
    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public ViewBox getViewBox() {
        return this.viewBox;
    }

    @Generated
    public int hashCode() {
        String nodeId = getNodeId();
        int hashCode = nodeId == null ? 43 : nodeId.hashCode();
        String ownerId = getOwnerId();
        int hashCode2 = ((hashCode + 59) * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        String groupShareToken = getGroupShareToken();
        int hashCode3 = (hashCode2 * 59) + (groupShareToken == null ? 43 : groupShareToken.hashCode());
        ViewBox viewBox = getViewBox();
        int hashCode4 = (hashCode3 * 59) + (viewBox == null ? 43 : viewBox.hashCode());
        FitType fitType = getFitType();
        int i = hashCode4 * 59;
        int hashCode5 = fitType == null ? 43 : fitType.hashCode();
        CropBox cropBox = getCropBox();
        return ((i + hashCode5) * 59) + (cropBox != null ? cropBox.hashCode() : 43);
    }

    @Generated
    public void setCropBox(CropBox cropBox) {
        this.cropBox = cropBox;
    }

    @Generated
    public void setFitType(FitType fitType) {
        this.fitType = fitType;
    }

    @Generated
    public void setGroupShareToken(String str) {
        this.groupShareToken = str;
    }

    @Generated
    public void setNodeId(@NonNull String str) {
        if (str != null) {
            this.nodeId = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("nodeId is marked non-null but is null");
        }
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setViewBox(ViewBox viewBox) {
        this.viewBox = viewBox;
    }

    @Generated
    public String toString() {
        return "ThumbnailRequest(nodeId=" + getNodeId() + ", ownerId=" + getOwnerId() + ", groupShareToken=" + getGroupShareToken() + ", viewBox=" + getViewBox() + ", fitType=" + getFitType() + ", cropBox=" + getCropBox() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
