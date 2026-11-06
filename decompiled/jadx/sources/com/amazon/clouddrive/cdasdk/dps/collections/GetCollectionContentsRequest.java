package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetCollectionContentsRequest extends DPSCollectionsRequest {

    @SerializedName("collectionIds")
    @Expose
    private List<String> collectionIds;

    @SerializedName("deviceType")
    @Expose
    private String deviceType;

    @SerializedName("dsn")
    @Expose
    private String dsn;

    @SerializedName("limit")
    @Expose
    private Integer limit;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public GetCollectionContentsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetCollectionContentsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsRequest, com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCollectionContentsRequest)) {
            return false;
        }
        GetCollectionContentsRequest getCollectionContentsRequest = (GetCollectionContentsRequest) obj;
        if (!getCollectionContentsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer limit = getLimit();
        Integer limit2 = getCollectionContentsRequest.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = getCollectionContentsRequest.getCollectionIds();
        if (collectionIds != null ? !collectionIds.equals(collectionIds2) : collectionIds2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = getCollectionContentsRequest.getNextToken();
        if (nextToken != null ? !nextToken.equals(nextToken2) : nextToken2 != null) {
            return false;
        }
        String deviceType = getDeviceType();
        String deviceType2 = getCollectionContentsRequest.getDeviceType();
        if (deviceType != null ? !deviceType.equals(deviceType2) : deviceType2 != null) {
            return false;
        }
        String dsn = getDsn();
        String dsn2 = getCollectionContentsRequest.getDsn();
        return dsn != null ? dsn.equals(dsn2) : dsn2 == null;
    }

    @Generated
    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    @Generated
    public String getDeviceType() {
        return this.deviceType;
    }

    @Generated
    public String getDsn() {
        return this.dsn;
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
        List<String> collectionIds = getCollectionIds();
        int hashCode3 = (hashCode2 * 59) + (collectionIds == null ? 43 : collectionIds.hashCode());
        String nextToken = getNextToken();
        int hashCode4 = (hashCode3 * 59) + (nextToken == null ? 43 : nextToken.hashCode());
        String deviceType = getDeviceType();
        int i = hashCode4 * 59;
        int hashCode5 = deviceType == null ? 43 : deviceType.hashCode();
        String dsn = getDsn();
        return ((i + hashCode5) * 59) + (dsn != null ? dsn.hashCode() : 43);
    }

    @Generated
    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    @Generated
    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    @Generated
    public void setDsn(String str) {
        this.dsn = str;
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
        return "GetCollectionContentsRequest(collectionIds=" + getCollectionIds() + ", nextToken=" + getNextToken() + ", limit=" + getLimit() + ", deviceType=" + getDeviceType() + ", dsn=" + getDsn() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
