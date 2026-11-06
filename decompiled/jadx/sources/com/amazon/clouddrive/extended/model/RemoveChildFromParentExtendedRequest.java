package com.amazon.clouddrive.extended.model;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import com.amazon.clouddrive.model.RemoveChildFromParentRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoveChildFromParentExtendedRequest extends RemoveChildFromParentRequest {
    private String childOwnerId;

    public RemoveChildFromParentExtendedRequest(String str, String str2) {
        super(str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.RemoveChildFromParentRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof RemoveChildFromParentExtendedRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getChildOwnerId(), ((RemoveChildFromParentExtendedRequest) cloudDriveRequest).getChildOwnerId());
        return compare != 0 ? compare : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.RemoveChildFromParentRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RemoveChildFromParentExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getChildOwnerId() {
        return this.childOwnerId;
    }

    @Override // com.amazon.clouddrive.model.RemoveChildFromParentRequest
    public int hashCode() {
        return ParcelCompat$$ExternalSyntheticOutline0.m$1(getChildOwnerId() == null ? 0 : getChildOwnerId().hashCode(), 31, 1, 31) + super.hashCode();
    }

    public void setChildOwnerId(String str) {
        this.childOwnerId = str;
    }

    public RemoveChildFromParentRequest withChildOwnerId(String str) {
        setChildOwnerId(str);
        return this;
    }
}
