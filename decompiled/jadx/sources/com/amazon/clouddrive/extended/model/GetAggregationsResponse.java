package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAggregationsResponse implements CloudDriveResponse {
    private List<Aggregation> mAggregation;
    private String mCategory;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        GetAggregationsResponse getAggregationsResponse = (GetAggregationsResponse) cloudDriveResponse;
        int compareCollections = ObjectComparator.compareCollections(getAggregation(), getAggregationsResponse.getAggregation());
        if (compareCollections != 0) {
            return compareCollections;
        }
        int compare = ObjectComparator.compare(getCategory(), getAggregationsResponse.getCategory());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetAggregationsResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<Aggregation> getAggregation() {
        return this.mAggregation;
    }

    public String getCategory() {
        return this.mCategory;
    }

    public int hashCode() {
        return (((getCategory() == null ? 0 : getCategory().hashCode()) + 1 + (getAggregation() != null ? getAggregation().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setAggregation(List<Aggregation> list) {
        this.mAggregation = list;
    }

    public void setCategory(String str) {
        this.mCategory = str;
    }
}
