package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PurgeNodeResponse implements CloudDriveResponse {
    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        return (cloudDriveResponse == this || (cloudDriveResponse instanceof PurgeNodeResponse)) ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PurgeNodeResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public int hashCode() {
        return 31 + super.hashCode();
    }
}
