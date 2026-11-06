package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CheckpointFamilyChangesEvent implements FamilyChangesEvent {
    private String mCheckpoint;

    @Override // java.lang.Comparable
    public int compareTo(FamilyChangesEvent familyChangesEvent) {
        if (!(familyChangesEvent instanceof CheckpointFamilyChangesEvent)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getCheckpoint(), ((CheckpointFamilyChangesEvent) familyChangesEvent).getCheckpoint());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public String getCheckpoint() {
        return this.mCheckpoint;
    }

    @Override // com.amazon.clouddrive.extended.model.FamilyChangesEvent
    public String getEvent() {
        return FamilyChangesEventType.CHECKPOINT;
    }

    public int hashCode() {
        return (((getCheckpoint() == null ? 0 : getCheckpoint().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setCheckpoint(String str) {
        this.mCheckpoint = str;
    }

    public CheckpointFamilyChangesEvent withCheckpoint(String str) {
        setCheckpoint(str);
        return this;
    }
}
