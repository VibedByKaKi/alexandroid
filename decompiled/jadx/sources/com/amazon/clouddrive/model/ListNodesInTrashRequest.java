package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodesInTrashRequest extends PaginatedCloudDriveRequest {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (cloudDriveRequest instanceof ListNodesInTrashRequest) {
            return super.compareTo(cloudDriveRequest);
        }
        return 1;
    }

    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListNodesInTrashRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    @Override // com.amazon.clouddrive.model.PaginatedCloudDriveRequest
    public int hashCode() {
        return 31 + super.hashCode();
    }

    public ListNodesInTrashRequest withFields(String str) {
        setFields(str);
        return this;
    }

    public ListNodesInTrashRequest withFilters(String str) {
        setFilters(str);
        return this;
    }

    public ListNodesInTrashRequest withLimit(Integer num) {
        setLimit(num);
        return this;
    }

    public ListNodesInTrashRequest withOffset(Integer num) {
        setOffset(num);
        return this;
    }

    public ListNodesInTrashRequest withSort(String str) {
        setSort(str);
        return this;
    }

    public ListNodesInTrashRequest withStartToken(String str) {
        setStartToken(str);
        return this;
    }
}
