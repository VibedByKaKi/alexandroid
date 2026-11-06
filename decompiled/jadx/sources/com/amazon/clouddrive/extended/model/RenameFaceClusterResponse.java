package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RenameFaceClusterResponse implements CloudDriveResponse {
    private String mClusterId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof RenameFaceClusterResponse)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getClusterId(), ((RenameFaceClusterResponse) cloudDriveResponse).getClusterId());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RenameFaceClusterResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public String getClusterId() {
        return this.mClusterId;
    }

    public int hashCode() {
        return (((getClusterId() == null ? 0 : getClusterId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setClusterId(String str) {
        this.mClusterId = str;
    }
}
