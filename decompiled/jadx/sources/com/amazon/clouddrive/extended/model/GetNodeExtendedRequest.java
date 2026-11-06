package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.GetNodeRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodeExtendedRequest extends GetNodeRequest {
    private String ownerId;

    public GetNodeExtendedRequest(String str) {
        super(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.GetNodeRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetNodeExtendedRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getOwnerId(), ((GetNodeExtendedRequest) cloudDriveRequest).getOwnerId());
        return compare != 0 ? compare : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.GetNodeRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetNodeExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    @Override // com.amazon.clouddrive.model.GetNodeRequest
    public int hashCode() {
        return (((getOwnerId() == null ? 0 : getOwnerId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }
}
