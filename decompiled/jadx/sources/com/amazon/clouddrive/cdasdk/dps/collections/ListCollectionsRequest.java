package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListCollectionsRequest extends DPSCollectionsRequest {

    @SerializedName("collectionType")
    @Expose
    private String collectionType;

    @SerializedName("coverPhotoCount")
    @Expose
    private Integer coverPhotoCount;

    @SerializedName("limit")
    @Expose
    private Integer limit;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public ListCollectionsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListCollectionsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCollectionsRequest)) {
            return false;
        }
        ListCollectionsRequest listCollectionsRequest = (ListCollectionsRequest) obj;
        if (!listCollectionsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer limit = getLimit();
        Integer limit2 = listCollectionsRequest.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        Integer coverPhotoCount = getCoverPhotoCount();
        Integer coverPhotoCount2 = listCollectionsRequest.getCoverPhotoCount();
        if (coverPhotoCount != null ? !coverPhotoCount.equals(coverPhotoCount2) : coverPhotoCount2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = listCollectionsRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        String collectionType = getCollectionType();
        String collectionType2 = listCollectionsRequest.getCollectionType();
        return collectionType != null ? collectionType.equals(collectionType2) : collectionType2 == null;
    }

    @Generated
    public String getCollectionType() {
        return this.collectionType;
    }

    @Generated
    public Integer getCoverPhotoCount() {
        return this.coverPhotoCount;
    }

    @Generated
    public Integer getLimit() {
        return this.limit;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer limit = getLimit();
        int hashCode2 = (hashCode * 59) + (limit == null ? 43 : limit.hashCode());
        Integer coverPhotoCount = getCoverPhotoCount();
        int hashCode3 = (hashCode2 * 59) + (coverPhotoCount == null ? 43 : coverPhotoCount.hashCode());
        String nextToken = getNextToken();
        int i = hashCode3 * 59;
        int hashCode4 = nextToken == null ? 43 : nextToken.hashCode();
        String collectionType = getCollectionType();
        return ((i + hashCode4) * 59) + (collectionType != null ? collectionType.hashCode() : 43);
    }

    @Generated
    public void setCollectionType(String str) {
        this.collectionType = str;
    }

    @Generated
    public void setCoverPhotoCount(Integer num) {
        this.coverPhotoCount = num;
    }

    @Generated
    public void setLimit(Integer num) {
        this.limit = num;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "ListCollectionsRequest(nextToken=" + getNextToken() + ", limit=" + getLimit() + ", coverPhotoCount=" + getCoverPhotoCount() + ", collectionType=" + getCollectionType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
