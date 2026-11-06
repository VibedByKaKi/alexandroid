package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoveFacesFromPersonRequest implements CloudDriveRequest {
    private List<NodeFacePair> faces;
    private String personId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof RemoveFacesFromPersonRequest)) {
            return 1;
        }
        RemoveFacesFromPersonRequest removeFacesFromPersonRequest = (RemoveFacesFromPersonRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getPersonId(), removeFacesFromPersonRequest.getPersonId());
        if (compare != 0) {
            return compare;
        }
        int compareCollections = ObjectComparator.compareCollections(getFaces(), removeFacesFromPersonRequest.getFaces());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RemoveFacesFromPersonRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public List<NodeFacePair> getFaces() {
        return this.faces;
    }

    public String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        return (((getPersonId() == null ? 0 : getPersonId().hashCode()) + 1 + (getFaces() != null ? getFaces().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setFaces(List<NodeFacePair> list) {
        this.faces = list;
    }

    public void setPersonId(String str) {
        this.personId = str;
    }

    public RemoveFacesFromPersonRequest withFaces(List<NodeFacePair> list) {
        setFaces(list);
        return this;
    }

    public RemoveFacesFromPersonRequest withPersonId(String str) {
        setPersonId(str);
        return this;
    }
}
