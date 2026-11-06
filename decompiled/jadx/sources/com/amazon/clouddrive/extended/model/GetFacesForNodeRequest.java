package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFacesForNodeRequest implements CloudDriveRequest {
    private String nodeId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetFacesForNodeRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getNodeId(), ((GetFacesForNodeRequest) cloudDriveRequest).getNodeId());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFacesForNodeRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return (((getNodeId() == null ? 0 : getNodeId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public GetFacesForNodeRequest withNodeId(String str) {
        setNodeId(str);
        return this;
    }
}
