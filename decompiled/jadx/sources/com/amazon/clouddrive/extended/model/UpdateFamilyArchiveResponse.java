package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateFamilyArchiveResponse implements CloudDriveResponse {
    List<UpdateFamilyArchiveError> mErrors;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof UpdateFamilyArchiveResponse)) {
            return 1;
        }
        int compareCollections = ObjectComparator.compareCollections(getErrors(), ((UpdateFamilyArchiveResponse) cloudDriveResponse).getErrors());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UpdateFamilyArchiveResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<UpdateFamilyArchiveError> getErrors() {
        return this.mErrors;
    }

    public int hashCode() {
        return (((getErrors() == null ? 0 : getErrors().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setErrors(List<UpdateFamilyArchiveError> list) {
        this.mErrors = list;
    }

    public UpdateFamilyArchiveResponse withErrors(List<UpdateFamilyArchiveError> list) {
        setErrors(list);
        return this;
    }
}
