package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchGroupNodesRequest extends SearchKeyRequest {
    private String groupShareToken;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest, com.amazon.clouddrive.model.PaginatedCloudDriveRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof SearchGroupNodesRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getGroupShareToken(), ((SearchGroupNodesRequest) cloudDriveRequest).getGroupShareToken());
        return compare != 0 ? compare : super.compareTo(cloudDriveRequest);
    }

    public String getGroupShareToken() {
        return this.groupShareToken;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest, com.amazon.clouddrive.model.PaginatedCloudDriveRequest
    public int hashCode() {
        return (((getGroupShareToken() == null ? 0 : getGroupShareToken().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setGroupShareToken(String str) {
        this.groupShareToken = str;
    }

    public SearchKeyRequest withGroupShareToken(String str) {
        setGroupShareToken(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withTempLink(boolean z) {
        setTempLink(Boolean.valueOf(z));
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withAssetMapping(String str) {
        setAssetMapping(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withDedupeContext(String str) {
        setDedupeContext(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withFields(String str) {
        setFields(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withFilters(String str) {
        setFilters(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withGroupByForTime(String str) {
        setGroupByForTime(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withGroupId(String str) {
        setGroupId(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withLanguage(String str) {
        setLanguage(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withLimit(Integer num) {
        setLimit(num);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withOffset(Integer num) {
        setOffset(num);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withSearchContext(String str) {
        setSearchContext(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withSessionId(String str) {
        setSessionId(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withSort(String str) {
        setSort(str);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.SearchKeyRequest
    public SearchGroupNodesRequest withStartToken(String str) {
        setStartToken(str);
        return this;
    }
}
