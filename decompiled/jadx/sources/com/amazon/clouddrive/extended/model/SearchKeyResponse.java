package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.NodeListingResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import com.amazon.clouddrive.model.PaginatedCloudDriveResponse;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchKeyResponse extends PaginatedCloudDriveResponse implements NodeListingResponse<NodeExtended> {
    private Map<String, List<SearchAggregation>> aggregations;
    private List<NodeExtended> mData;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveResponse, java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof SearchKeyResponse)) {
            return 1;
        }
        SearchKeyResponse searchKeyResponse = (SearchKeyResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getData(), searchKeyResponse.getData());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getAggregations(), searchKeyResponse.getAggregations());
        return compare2 != 0 ? compare2 : super.compareTo(cloudDriveResponse);
    }

    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveResponse
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SearchKeyResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public Map<String, List<SearchAggregation>> getAggregations() {
        return this.aggregations;
    }

    @Override // com.amazon.clouddrive.model.NodeListingResponse
    public List<NodeExtended> getData() {
        return this.mData;
    }

    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveResponse
    public int hashCode() {
        return (((getData() == null ? 0 : getData().hashCode()) + 1 + (getAggregations() != null ? getAggregations().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setAggregations(Map<String, List<SearchAggregation>> map) {
        this.aggregations = map;
    }

    @Override // com.amazon.clouddrive.model.NodeListingResponse
    public void setData(List<NodeExtended> list) {
        this.mData = list;
    }
}
