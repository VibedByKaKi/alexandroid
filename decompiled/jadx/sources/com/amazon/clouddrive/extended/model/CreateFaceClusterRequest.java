package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateFaceClusterRequest implements CloudDriveRequest {
    private List<String> mClusterIdList;
    private String mContext;
    private String mNewName;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof CreateFaceClusterRequest)) {
            return 1;
        }
        CreateFaceClusterRequest createFaceClusterRequest = (CreateFaceClusterRequest) cloudDriveRequest;
        int compareCollections = ObjectComparator.compareCollections(getClusterIdList(), createFaceClusterRequest.getClusterIdList());
        if (compareCollections != 0) {
            return compareCollections;
        }
        int compare = ObjectComparator.compare(getNewName(), createFaceClusterRequest.getNewName());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getContext(), createFaceClusterRequest.getContext());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CreateFaceClusterRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public List<String> getClusterIdList() {
        return this.mClusterIdList;
    }

    public String getContext() {
        return this.mContext;
    }

    public String getNewName() {
        return this.mNewName;
    }

    public int hashCode() {
        return (((getClusterIdList() == null ? 0 : getClusterIdList().hashCode()) + 1 + (getNewName() == null ? 0 : getNewName().hashCode()) + (getContext() != null ? getContext().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setClusterIdList(List<String> list) {
        this.mClusterIdList = list;
    }

    public void setContext(String str) {
        this.mContext = str;
    }

    public void setNewName(String str) {
        this.mNewName = str;
    }

    public CreateFaceClusterRequest withClusterIdList(List<String> list) {
        setClusterIdList(list);
        return this;
    }

    public CreateFaceClusterRequest withContext(String str) {
        setContext(str);
        return this;
    }

    public CreateFaceClusterRequest withNewName(String str) {
        setNewName(str);
        return this;
    }
}
