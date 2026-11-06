package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccountQuotaRequest implements CloudDriveRequest {
    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        return (cloudDriveRequest == this || (cloudDriveRequest instanceof GetAccountQuotaRequest)) ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetAccountQuotaRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public int hashCode() {
        return 1;
    }
}
