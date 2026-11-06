package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ResetFamilyChangesEvent implements FamilyChangesEvent {
    private String mFamilyId;

    @Override // java.lang.Comparable
    public int compareTo(FamilyChangesEvent familyChangesEvent) {
        if (!(familyChangesEvent instanceof ResetFamilyChangesEvent)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getFamilyId(), ((ResetFamilyChangesEvent) familyChangesEvent).getFamilyId());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    @Override // com.amazon.clouddrive.extended.model.FamilyChangesEvent
    public String getEvent() {
        return FamilyChangesEventType.RESET;
    }

    public String getFamilyId() {
        return this.mFamilyId;
    }

    public int hashCode() {
        return (((getFamilyId() == null ? 0 : getFamilyId().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setFamilyId(String str) {
        this.mFamilyId = str;
    }

    public ResetFamilyChangesEvent withFamilyId(String str) {
        setFamilyId(str);
        return this;
    }
}
