package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccountInfoResponse implements CloudDriveResponse {
    private String status;
    private String termsOfUse;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetAccountInfoResponse)) {
            return 1;
        }
        GetAccountInfoResponse getAccountInfoResponse = (GetAccountInfoResponse) cloudDriveResponse;
        String termsOfUse = getTermsOfUse();
        String termsOfUse2 = getAccountInfoResponse.getTermsOfUse();
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
        String status = getStatus();
        String status2 = getAccountInfoResponse.getStatus();
        if (status != status2) {
            if (status == null) {
                return -1;
            }
            if (status2 == null) {
                return 1;
            }
            int compareTo2 = status.compareTo(status2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetAccountInfoResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTermsOfUse() {
        return this.termsOfUse;
    }

    public int hashCode() {
        return (getTermsOfUse() == null ? 0 : getTermsOfUse().hashCode()) + 1 + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTermsOfUse(String str) {
        this.termsOfUse = str;
    }
}
