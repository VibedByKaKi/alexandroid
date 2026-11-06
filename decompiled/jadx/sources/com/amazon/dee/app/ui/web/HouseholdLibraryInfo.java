package com.amazon.dee.app.ui.web;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class HouseholdLibraryInfo {
    public final String customerId;
    public final String displayName;

    public HouseholdLibraryInfo(String str, String str2) {
        this.customerId = str2;
        this.displayName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HouseholdLibraryInfo householdLibraryInfo = (HouseholdLibraryInfo) obj;
            if (this.displayName.equals(householdLibraryInfo.displayName) && this.customerId.equals(householdLibraryInfo.customerId)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.customerId.hashCode() + (this.displayName.hashCode() * 31);
    }
}
