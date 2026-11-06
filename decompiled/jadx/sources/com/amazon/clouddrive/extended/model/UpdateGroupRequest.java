package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateGroupRequest implements CloudDriveRequest {
    private String coverNodeId;
    private String description;
    private String groupId;
    private String name;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof UpdateGroupRequest)) {
            return 1;
        }
        UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getName(), updateGroupRequest.getName());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getDescription(), updateGroupRequest.getDescription());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getGroupId(), updateGroupRequest.getGroupId());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getCoverNodeId(), updateGroupRequest.getCoverNodeId());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UpdateGroupRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getCoverNodeId() {
        return this.coverNodeId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((getName() == null ? 0 : getName().hashCode()) + 1 + (getDescription() == null ? 0 : getDescription().hashCode()) + (getGroupId() == null ? 0 : getGroupId().hashCode()) + (getCoverNodeId() != null ? getCoverNodeId().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setCoverNodeId(String str) {
        this.coverNodeId = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public UpdateGroupRequest withCoverNodeId(String str) {
        setCoverNodeId(str);
        return this;
    }

    public UpdateGroupRequest withDescription(String str) {
        setDescription(str);
        return this;
    }

    public UpdateGroupRequest withGroupId(String str) {
        setGroupId(str);
        return this;
    }

    public UpdateGroupRequest withName(String str) {
        setName(str);
        return this;
    }
}
