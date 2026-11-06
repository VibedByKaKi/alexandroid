package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PurgeNodeRequest implements CloudDriveRequest {
    private String nodeId;
    private Boolean recurse;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof PurgeNodeRequest)) {
            return 1;
        }
        PurgeNodeRequest purgeNodeRequest = (PurgeNodeRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getNodeId(), purgeNodeRequest.getNodeId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getRecurse(), purgeNodeRequest.getRecurse());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PurgeNodeRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public Boolean getRecurse() {
        return this.recurse;
    }

    public int hashCode() {
        return (((((getNodeId() == null ? 0 : getNodeId().hashCode()) + 1) * 31) + (getRecurse() != null ? getRecurse().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setRecurse(boolean z) {
        this.recurse = Boolean.valueOf(z);
    }

    public PurgeNodeRequest withNodeId(String str) {
        setNodeId(str);
        return this;
    }

    public PurgeNodeRequest withRecurse(boolean z) {
        setRecurse(z);
        return this;
    }
}
