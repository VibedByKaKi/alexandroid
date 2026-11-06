package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.IGetChangesResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetChangesExtendedResponse implements IGetChangesResponse<NodeExtended> {
    private String mCheckpoint;
    private List<NodeExtended> mNodes;
    private boolean mReset;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetChangesExtendedResponse)) {
            return 1;
        }
        GetChangesExtendedResponse getChangesExtendedResponse = (GetChangesExtendedResponse) cloudDriveResponse;
        if (!isReset() && getChangesExtendedResponse.isReset()) {
            return -1;
        }
        if (isReset() && !getChangesExtendedResponse.isReset()) {
            return 1;
        }
        int compare = ObjectComparator.compare(getCheckpoint(), getChangesExtendedResponse.getCheckpoint());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getNodes(), getChangesExtendedResponse.getNodes());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetChangesExtendedResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public String getCheckpoint() {
        return this.mCheckpoint;
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public List<NodeExtended> getNodes() {
        return this.mNodes;
    }

    public int hashCode() {
        return (isReset() ? 1 : 0) + 1 + (getCheckpoint() != null ? getCheckpoint().hashCode() : 0) + (getNodes() != null ? getNodes().hashCode() : 0);
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public boolean isReset() {
        return this.mReset;
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public void setCheckpoint(String str) {
        this.mCheckpoint = str;
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public void setNodes(List<NodeExtended> list) {
        this.mNodes = list;
    }

    @Override // com.amazon.clouddrive.model.IGetChangesResponse
    public void setReset(boolean z) {
        this.mReset = z;
    }
}
