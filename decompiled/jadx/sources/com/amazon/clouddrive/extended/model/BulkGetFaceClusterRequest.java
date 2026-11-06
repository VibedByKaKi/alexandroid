package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetFaceClusterRequest implements CloudDriveRequest {
    private List<String> mClusterIdList;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        int compareCollections;
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this || (compareCollections = ObjectComparator.compareCollections(getClusterIdList(), ((BulkGetFaceClusterRequest) cloudDriveRequest).getClusterIdList())) == 0) {
            return 0;
        }
        return compareCollections;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BulkGetFaceClusterRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public List<String> getClusterIdList() {
        return this.mClusterIdList;
    }

    public int hashCode() {
        return (((getClusterIdList() == null ? 0 : getClusterIdList().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setClusterIdList(List<String> list) {
        this.mClusterIdList = list;
    }

    public BulkGetFaceClusterRequest withClusterIdList(List<String> list) {
        setClusterIdList(list);
        return this;
    }
}
