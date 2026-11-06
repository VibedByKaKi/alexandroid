package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateCollectionPropertiesRequest implements CloudDriveRequest {
    private String id;
    private List<CollectionPropertiesUpdateObject> operations;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof UpdateCollectionPropertiesRequest)) {
            return 1;
        }
        UpdateCollectionPropertiesRequest updateCollectionPropertiesRequest = (UpdateCollectionPropertiesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getId(), updateCollectionPropertiesRequest.getId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getOperations(), updateCollectionPropertiesRequest.getOperations());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UpdateCollectionPropertiesRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getId() {
        return this.id;
    }

    public List<CollectionPropertiesUpdateObject> getOperations() {
        return this.operations;
    }

    public int hashCode() {
        return (((getId() == null ? 0 : getId().hashCode()) + 1 + (getOperations() != null ? getOperations().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOperations(List<CollectionPropertiesUpdateObject> list) {
        this.operations = list;
    }
}
