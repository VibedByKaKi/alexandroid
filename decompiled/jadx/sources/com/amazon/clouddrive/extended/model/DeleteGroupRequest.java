package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeleteGroupRequest implements CloudDriveRequest {
    private String groupId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof DeleteGroupRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getGroupId(), ((DeleteGroupRequest) cloudDriveRequest).getGroupId());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DeleteGroupRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return (((getGroupId() == null ? 0 : getGroupId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public DeleteGroupRequest withGroupId(String str) {
        setGroupId(str);
        return this;
    }
}
