package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddFacesToPersonRequest implements CloudDriveRequest {
    private List<NodeFacePair> faceList;
    private String sourcePersonId;
    private String targetPersonId;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof AddFacesToPersonRequest)) {
            return 1;
        }
        AddFacesToPersonRequest addFacesToPersonRequest = (AddFacesToPersonRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getTargetPersonId(), addFacesToPersonRequest.getTargetPersonId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getSourcePersonId(), addFacesToPersonRequest.getSourcePersonId());
        if (compare2 != 0) {
            return compare2;
        }
        int compareCollections = ObjectComparator.compareCollections(getFaceList(), addFacesToPersonRequest.getFaceList());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AddFacesToPersonRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public List<NodeFacePair> getFaceList() {
        return this.faceList;
    }

    public String getSourcePersonId() {
        return this.sourcePersonId;
    }

    public String getTargetPersonId() {
        return this.targetPersonId;
    }

    public int hashCode() {
        return (((getTargetPersonId() == null ? 0 : getTargetPersonId().hashCode()) + 1 + (getSourcePersonId() == null ? 0 : getSourcePersonId().hashCode()) + (getFaceList() != null ? getFaceList().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setFaceList(List<NodeFacePair> list) {
        this.faceList = list;
    }

    public void setSourcePersonId(String str) {
        this.sourcePersonId = str;
    }

    public void setTargetPersonId(String str) {
        this.targetPersonId = str;
    }

    public AddFacesToPersonRequest withFaceList(List<NodeFacePair> list) {
        setFaceList(list);
        return this;
    }

    public AddFacesToPersonRequest withSourcePersonId(String str) {
        setSourcePersonId(str);
        return this;
    }

    public AddFacesToPersonRequest withTargetPersonId(String str) {
        setTargetPersonId(str);
        return this;
    }
}
