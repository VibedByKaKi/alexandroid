package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFamilyChangesRequest implements CloudDriveRequest {
    public static int DEFAULT_ITEM_LIMIT = 2000;
    private String mCheckpoint;
    private String mIncludePurged;
    private int mRequestedItemCount = DEFAULT_ITEM_LIMIT;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetFamilyChangesRequest)) {
            return 1;
        }
        GetFamilyChangesRequest getFamilyChangesRequest = (GetFamilyChangesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getCheckpoint(), getFamilyChangesRequest.getCheckpoint());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getIncludePurged(), getFamilyChangesRequest.getIncludePurged());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFamilyChangesRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getCheckpoint() {
        return this.mCheckpoint;
    }

    public String getIncludePurged() {
        return this.mIncludePurged;
    }

    public int getRequestedItemCount() {
        return this.mRequestedItemCount;
    }

    public int hashCode() {
        return (((getCheckpoint() == null ? 0 : getCheckpoint().hashCode()) + 1 + (getIncludePurged() != null ? getIncludePurged().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setCheckpoint(String str) {
        this.mCheckpoint = str;
    }

    public void setIncludePurged(String str) {
        this.mIncludePurged = str;
    }

    public void setRequestedItemCount(int i) {
        this.mRequestedItemCount = i;
    }

    public GetFamilyChangesRequest withCheckpoint(String str) {
        setCheckpoint(str);
        return this;
    }

    public GetFamilyChangesRequest withIncludePurged(String str) {
        setIncludePurged(str);
        return this;
    }
}
