package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionPropertiesResponse implements CloudDriveResponse {
    private CollectionProperties collectionProperties;
    private String id;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof CollectionPropertiesResponse)) {
            return 1;
        }
        CollectionPropertiesResponse collectionPropertiesResponse = (CollectionPropertiesResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getCollectionProperties(), collectionPropertiesResponse.getCollectionProperties());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getId(), collectionPropertiesResponse.getId());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CollectionPropertiesResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public CollectionProperties getCollectionProperties() {
        return this.collectionProperties;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return (getCollectionProperties() == null ? 0 : getCollectionProperties().hashCode()) + 1 + (getId() != null ? getId().hashCode() : 0);
    }

    public void setCollectionProperties(CollectionProperties collectionProperties) {
        this.collectionProperties = collectionProperties;
    }

    public void setId(String str) {
        this.id = str;
    }
}
