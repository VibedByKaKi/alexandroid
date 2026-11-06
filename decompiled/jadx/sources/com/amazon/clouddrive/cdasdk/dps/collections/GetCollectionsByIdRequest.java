package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetCollectionsByIdRequest extends DPSCollectionsRequest {

    @SerializedName("collectionIds")
    @Expose
    private List<String> collectionIds;

    @Generated
    public GetCollectionsByIdRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetCollectionsByIdRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCollectionsByIdRequest)) {
            return false;
        }
        GetCollectionsByIdRequest getCollectionsByIdRequest = (GetCollectionsByIdRequest) obj;
        if (!getCollectionsByIdRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = getCollectionsByIdRequest.getCollectionIds();
        return collectionIds != null ? collectionIds.equals(collectionIds2) : collectionIds2 == null;
    }

    @Generated
    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<String> collectionIds = getCollectionIds();
        return (hashCode * 59) + (collectionIds == null ? 43 : collectionIds.hashCode());
    }

    @Generated
    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "GetCollectionsByIdRequest(collectionIds=" + getCollectionIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
