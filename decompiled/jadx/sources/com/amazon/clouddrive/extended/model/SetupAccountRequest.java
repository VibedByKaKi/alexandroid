package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupAccountRequest implements CloudDriveRequest {
    private String termsOfUse;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof SetupAccountRequest)) {
            return 1;
        }
        String termsOfUse = getTermsOfUse();
        String termsOfUse2 = ((SetupAccountRequest) cloudDriveRequest).getTermsOfUse();
        if (termsOfUse != termsOfUse2) {
            if (termsOfUse == null) {
                return -1;
            }
            if (termsOfUse2 == null) {
                return 1;
            }
            int compareTo = termsOfUse.compareTo(termsOfUse2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SetupAccountRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getTermsOfUse() {
        return this.termsOfUse;
    }

    public int hashCode() {
        return (((getTermsOfUse() == null ? 0 : getTermsOfUse().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setTermsOfUse(String str) {
        this.termsOfUse = str;
    }
}
