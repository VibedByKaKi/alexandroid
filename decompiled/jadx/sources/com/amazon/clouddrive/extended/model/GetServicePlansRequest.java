package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetServicePlansRequest implements CloudDriveRequest {
    private Boolean filter;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetServicePlansRequest)) {
            return 1;
        }
        Boolean isFilter = isFilter();
        Boolean isFilter2 = ((GetServicePlansRequest) cloudDriveRequest).isFilter();
        if (isFilter != isFilter2) {
            if (isFilter == null) {
                return -1;
            }
            if (isFilter2 == null) {
                return 1;
            }
            int compareTo = isFilter.compareTo(isFilter2);
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
        return (obj instanceof GetServicePlansRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public int hashCode() {
        return (((isFilter() == null ? 0 : isFilter().hashCode()) + 1) * 31) + super.hashCode();
    }

    public Boolean isFilter() {
        return this.filter;
    }

    public void setFilter(Boolean bool) {
        this.filter = bool;
    }
}
