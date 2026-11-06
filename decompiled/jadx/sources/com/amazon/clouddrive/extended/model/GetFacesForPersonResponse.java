package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFacesForPersonResponse implements CloudDriveResponse {
    private List<NodeFace> faces;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        int compareCollections;
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this || (compareCollections = ObjectComparator.compareCollections(getFaces(), ((GetFacesForPersonResponse) cloudDriveResponse).getFaces())) == 0) {
            return 0;
        }
        return compareCollections;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFacesForPersonResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<NodeFace> getFaces() {
        return this.faces;
    }

    public int hashCode() {
        return (((getFaces() == null ? 0 : getFaces().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setFaces(List<NodeFace> list) {
        this.faces = list;
    }
}
