package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddNodePropertyRequest implements CloudDriveRequest {
    private String id;
    private String key;
    private String owner;
    private String value;

    public AddNodePropertyRequest(String str, String str2, String str3, String str4) {
        this.id = str;
        this.owner = str2;
        this.key = str3;
        this.value = str4;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof AddNodePropertyRequest)) {
            return 1;
        }
        AddNodePropertyRequest addNodePropertyRequest = (AddNodePropertyRequest) cloudDriveRequest;
        String id = getId();
        String id2 = addNodePropertyRequest.getId();
        if (id != id2) {
            if (id == null) {
                return -1;
            }
            if (id2 == null) {
                return 1;
            }
            int compareTo = id.compareTo(id2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String value = getValue();
        String value2 = addNodePropertyRequest.getValue();
        if (value != value2) {
            if (value == null) {
                return -1;
            }
            if (value2 == null) {
                return 1;
            }
            int compareTo2 = value.compareTo(value2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        String key = getKey();
        String key2 = addNodePropertyRequest.getKey();
        if (key != key2) {
            if (key == null) {
                return -1;
            }
            if (key2 == null) {
                return 1;
            }
            int compareTo3 = key.compareTo(key2);
            if (compareTo3 != 0) {
                return compareTo3;
            }
        }
        String owner = getOwner();
        String owner2 = addNodePropertyRequest.getOwner();
        if (owner != owner2) {
            if (owner == null) {
                return -1;
            }
            if (owner2 == null) {
                return 1;
            }
            int compareTo4 = owner.compareTo(owner2);
            if (compareTo4 != 0) {
                return compareTo4;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AddNodePropertyRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getId() == null ? 0 : getId().hashCode()) + 1 + (getValue() == null ? 0 : getValue().hashCode()) + (getKey() == null ? 0 : getKey().hashCode()) + (getOwner() != null ? getOwner().hashCode() : 0);
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOwner(String str) {
        this.owner = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
