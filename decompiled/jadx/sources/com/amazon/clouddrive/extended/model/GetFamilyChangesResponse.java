package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFamilyChangesResponse implements CloudDriveResponse {
    private List<FamilyChangesEvent> mEvents;
    private String mLastSeenCheckpoint;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetFamilyChangesResponse)) {
            return 1;
        }
        GetFamilyChangesResponse getFamilyChangesResponse = (GetFamilyChangesResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getLastSeenCheckpoint(), getFamilyChangesResponse.getLastSeenCheckpoint());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getEvents(), getFamilyChangesResponse.getEvents());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFamilyChangesResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<FamilyChangesEvent> getEvents() {
        return this.mEvents;
    }

    public String getLastSeenCheckpoint() {
        return this.mLastSeenCheckpoint;
    }

    public int hashCode() {
        return (((getLastSeenCheckpoint() == null ? 0 : getLastSeenCheckpoint().hashCode()) + 1 + (getEvents() != null ? getEvents().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setEvents(List<FamilyChangesEvent> list) {
        this.mEvents = list;
    }

    public void setLastSeenCheckpoint(String str) {
        this.mLastSeenCheckpoint = str;
    }
}
