package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.AddChildToParentRequest;
import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddChildToParentExtendedRequest extends AddChildToParentRequest {
    private String childOwnerId;

    public AddChildToParentExtendedRequest(String str, String str2) {
        super(str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.AddChildToParentRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof AddChildToParentExtendedRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getChildOwnerId(), ((AddChildToParentExtendedRequest) cloudDriveRequest).getChildOwnerId());
        return compare != 0 ? compare : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.AddChildToParentRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AddChildToParentExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getChildOwnerId() {
        return this.childOwnerId;
    }

    @Override // com.amazon.clouddrive.model.AddChildToParentRequest
    public int hashCode() {
        return (((getChildOwnerId() == null ? 0 : getChildOwnerId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setChildOwnerId(String str) {
        this.childOwnerId = str;
    }

    public AddChildToParentExtendedRequest withChildOwnerId(String str) {
        setChildOwnerId(str);
        return this;
    }
}
