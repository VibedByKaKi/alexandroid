package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.AssetMapping;
import com.amazon.clouddrive.cdasdk.cds.common.DedupeContext;
import com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest;
import com.amazon.clouddrive.cdasdk.cds.common.SearchContext;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchKeyRequest extends PaginatedCloudDriveRequest {

    @SerializedName("assetMapping")
    @Expose
    private AssetMapping assetMapping;

    @SerializedName("dedupeContext")
    @Expose
    private DedupeContext dedupeContext;

    @SerializedName("groupByForTime")
    @Expose
    private String groupByForTime;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("searchContext")
    @Expose
    private SearchContext searchContext;

    @SerializedName("tempLink")
    @Expose
    private Boolean tempLink;

    @Generated
    public SearchKeyRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SearchKeyRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchKeyRequest)) {
            return false;
        }
        SearchKeyRequest searchKeyRequest = (SearchKeyRequest) obj;
        if (!searchKeyRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean tempLink = getTempLink();
        Boolean tempLink2 = searchKeyRequest.getTempLink();
        if (tempLink != null ? !tempLink.equals(tempLink2) : tempLink2 != null) {
            return false;
        }
        AssetMapping assetMapping = getAssetMapping();
        AssetMapping assetMapping2 = searchKeyRequest.getAssetMapping();
        if (assetMapping != null ? !assetMapping.equals(assetMapping2) : assetMapping2 != null) {
            return false;
        }
        DedupeContext dedupeContext = getDedupeContext();
        DedupeContext dedupeContext2 = searchKeyRequest.getDedupeContext();
        if (dedupeContext != null ? !dedupeContext.equals(dedupeContext2) : dedupeContext2 != null) {
            return false;
        }
        String groupByForTime = getGroupByForTime();
        String groupByForTime2 = searchKeyRequest.getGroupByForTime();
        if (groupByForTime != null ? !groupByForTime.equals(groupByForTime2) : groupByForTime2 != null) {
            return false;
        }
        SearchContext searchContext = getSearchContext();
        SearchContext searchContext2 = searchKeyRequest.getSearchContext();
        if (searchContext != null ? !searchContext.equals(searchContext2) : searchContext2 != null) {
            return false;
        }
        String language = getLanguage();
        String language2 = searchKeyRequest.getLanguage();
        if (language != null ? !language.equals(language2) : language2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = searchKeyRequest.getGroupId();
        return groupId != null ? groupId.equals(groupId2) : groupId2 == null;
    }

    @Generated
    public AssetMapping getAssetMapping() {
        return this.assetMapping;
    }

    @Generated
    public DedupeContext getDedupeContext() {
        return this.dedupeContext;
    }

    @Generated
    public String getGroupByForTime() {
        return this.groupByForTime;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public String getLanguage() {
        return this.language;
    }

    @Generated
    public SearchContext getSearchContext() {
        return this.searchContext;
    }

    @Generated
    public Boolean getTempLink() {
        return this.tempLink;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean tempLink = getTempLink();
        int hashCode2 = (hashCode * 59) + (tempLink == null ? 43 : tempLink.hashCode());
        AssetMapping assetMapping = getAssetMapping();
        int hashCode3 = (hashCode2 * 59) + (assetMapping == null ? 43 : assetMapping.hashCode());
        DedupeContext dedupeContext = getDedupeContext();
        int hashCode4 = (hashCode3 * 59) + (dedupeContext == null ? 43 : dedupeContext.hashCode());
        String groupByForTime = getGroupByForTime();
        int hashCode5 = (hashCode4 * 59) + (groupByForTime == null ? 43 : groupByForTime.hashCode());
        SearchContext searchContext = getSearchContext();
        int hashCode6 = (hashCode5 * 59) + (searchContext == null ? 43 : searchContext.hashCode());
        String language = getLanguage();
        int i = hashCode6 * 59;
        int hashCode7 = language == null ? 43 : language.hashCode();
        String groupId = getGroupId();
        return ((i + hashCode7) * 59) + (groupId != null ? groupId.hashCode() : 43);
    }

    @Generated
    public void setAssetMapping(AssetMapping assetMapping) {
        this.assetMapping = assetMapping;
    }

    @Generated
    public void setDedupeContext(DedupeContext dedupeContext) {
        this.dedupeContext = dedupeContext;
    }

    @Generated
    public void setGroupByForTime(String str) {
        this.groupByForTime = str;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
    }

    @Generated
    public void setLanguage(String str) {
        this.language = str;
    }

    @Generated
    public void setSearchContext(SearchContext searchContext) {
        this.searchContext = searchContext;
    }

    @Generated
    public void setTempLink(Boolean bool) {
        this.tempLink = bool;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.PaginatedCloudDriveRequest, com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "SearchKeyRequest(assetMapping=" + getAssetMapping() + ", tempLink=" + getTempLink() + ", dedupeContext=" + getDedupeContext() + ", groupByForTime=" + getGroupByForTime() + ", searchContext=" + getSearchContext() + ", language=" + getLanguage() + ", groupId=" + getGroupId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
