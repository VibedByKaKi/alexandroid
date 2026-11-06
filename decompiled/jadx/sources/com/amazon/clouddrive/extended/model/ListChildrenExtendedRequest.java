package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ListChildrenRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListChildrenExtendedRequest extends ListChildrenRequest {
    private String ownerId;
    private boolean searchOnFamily;

    public ListChildrenExtendedRequest(String str) {
        super(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.ListChildrenRequest, com.amazon.clouddrive.model.PaginatedCloudDriveRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ListChildrenExtendedRequest)) {
            return 1;
        }
        ListChildrenExtendedRequest listChildrenExtendedRequest = (ListChildrenExtendedRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(Boolean.valueOf(getSearchOnFamily()), Boolean.valueOf(listChildrenExtendedRequest.getSearchOnFamily()));
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getOwnerId(), listChildrenExtendedRequest.getOwnerId());
        return compare2 != 0 ? compare2 : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.ListChildrenRequest, com.amazon.clouddrive.model.PaginatedCloudDriveRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListChildrenExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public boolean getSearchOnFamily() {
        return this.searchOnFamily;
    }

    @Override // com.amazon.clouddrive.model.ListChildrenRequest, com.amazon.clouddrive.model.PaginatedCloudDriveRequest
    public int hashCode() {
        return (((getSearchOnFamily() ? 1 : 0) + 1 + (getOwnerId() == null ? 0 : getOwnerId().hashCode())) * 31) + super.hashCode();
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setSearchOnFamily(boolean z) {
        this.searchOnFamily = z;
    }

    public ListChildrenExtendedRequest withOwnerId(String str) {
        setOwnerId(str);
        return this;
    }

    public ListChildrenExtendedRequest withSearchOnFamily(boolean z) {
        setSearchOnFamily(z);
        return this;
    }
}
