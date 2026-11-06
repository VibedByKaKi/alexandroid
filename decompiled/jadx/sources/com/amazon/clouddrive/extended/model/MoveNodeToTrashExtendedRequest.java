package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.MoveNodeToTrashRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MoveNodeToTrashExtendedRequest extends MoveNodeToTrashRequest {
    private boolean recurse;

    public MoveNodeToTrashExtendedRequest(String str) {
        super(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.MoveNodeToTrashRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        int compareTo;
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof MoveNodeToTrashExtendedRequest)) {
            return 1;
        }
        MoveNodeToTrashExtendedRequest moveNodeToTrashExtendedRequest = (MoveNodeToTrashExtendedRequest) cloudDriveRequest;
        Boolean valueOf = Boolean.valueOf(getRecurse());
        Boolean valueOf2 = Boolean.valueOf(moveNodeToTrashExtendedRequest.getRecurse());
        if (valueOf != valueOf2 && (compareTo = valueOf.compareTo(valueOf2)) != 0) {
            return compareTo;
        }
        String id = getId();
        String id2 = moveNodeToTrashExtendedRequest.getId();
        if (id != id2) {
            if (id == null) {
                return -1;
            }
            if (id2 == null) {
                return 1;
            }
            int compareTo2 = id.compareTo(id2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    @Override // com.amazon.clouddrive.model.MoveNodeToTrashRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MoveNodeToTrashExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public boolean getRecurse() {
        return this.recurse;
    }

    @Override // com.amazon.clouddrive.model.MoveNodeToTrashRequest
    public int hashCode() {
        return (((getRecurse() ? 1 : 0) + 1 + (getId() == null ? 0 : getId().hashCode())) * 31) + super.hashCode();
    }

    public void setRecurse(boolean z) {
        this.recurse = z;
    }
}
