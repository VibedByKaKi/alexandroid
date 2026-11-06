package com.amazon.clouddrive.cdasdk.prompto.contentAggregations;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ContentAggregationsResponse {

    @SerializedName("albumCount")
    @Expose
    private Long albumCount;

    @SerializedName("photoCount")
    @Expose
    private Long photoCount;

    @SerializedName("reactionCount")
    @Expose
    private Long reactionCount;

    @SerializedName("videoCount")
    @Expose
    private Long videoCount;

    @Generated
    public ContentAggregationsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ContentAggregationsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentAggregationsResponse)) {
            return false;
        }
        ContentAggregationsResponse contentAggregationsResponse = (ContentAggregationsResponse) obj;
        if (!contentAggregationsResponse.canEqual(this)) {
            return false;
        }
        Long videoCount = getVideoCount();
        Long videoCount2 = contentAggregationsResponse.getVideoCount();
        if (videoCount != null ? !videoCount.equals(videoCount2) : videoCount2 != null) {
            return false;
        }
        Long photoCount = getPhotoCount();
        Long photoCount2 = contentAggregationsResponse.getPhotoCount();
        if (photoCount != null ? !photoCount.equals(photoCount2) : photoCount2 != null) {
            return false;
        }
        Long albumCount = getAlbumCount();
        Long albumCount2 = contentAggregationsResponse.getAlbumCount();
        if (albumCount != null ? !albumCount.equals(albumCount2) : albumCount2 != null) {
            return false;
        }
        Long reactionCount = getReactionCount();
        Long reactionCount2 = contentAggregationsResponse.getReactionCount();
        return reactionCount != null ? reactionCount.equals(reactionCount2) : reactionCount2 == null;
    }

    @Generated
    public Long getAlbumCount() {
        return this.albumCount;
    }

    @Generated
    public Long getPhotoCount() {
        return this.photoCount;
    }

    @Generated
    public Long getReactionCount() {
        return this.reactionCount;
    }

    @Generated
    public Long getVideoCount() {
        return this.videoCount;
    }

    @Generated
    public int hashCode() {
        Long videoCount = getVideoCount();
        int hashCode = videoCount == null ? 43 : videoCount.hashCode();
        Long photoCount = getPhotoCount();
        int hashCode2 = ((hashCode + 59) * 59) + (photoCount == null ? 43 : photoCount.hashCode());
        Long albumCount = getAlbumCount();
        int i = hashCode2 * 59;
        int hashCode3 = albumCount == null ? 43 : albumCount.hashCode();
        Long reactionCount = getReactionCount();
        return ((i + hashCode3) * 59) + (reactionCount != null ? reactionCount.hashCode() : 43);
    }

    @Generated
    public void setAlbumCount(Long l) {
        this.albumCount = l;
    }

    @Generated
    public void setPhotoCount(Long l) {
        this.photoCount = l;
    }

    @Generated
    public void setReactionCount(Long l) {
        this.reactionCount = l;
    }

    @Generated
    public void setVideoCount(Long l) {
        this.videoCount = l;
    }

    @Generated
    public String toString() {
        return "ContentAggregationsResponse(videoCount=" + getVideoCount() + ", photoCount=" + getPhotoCount() + ", albumCount=" + getAlbumCount() + ", reactionCount=" + getReactionCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
