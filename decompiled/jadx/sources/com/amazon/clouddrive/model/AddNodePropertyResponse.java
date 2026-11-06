package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddNodePropertyResponse implements CloudDriveResponse {
    private String key;
    private String location;
    private String value;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof AddNodePropertyResponse)) {
            return 1;
        }
        AddNodePropertyResponse addNodePropertyResponse = (AddNodePropertyResponse) cloudDriveResponse;
        String value = getValue();
        String value2 = addNodePropertyResponse.getValue();
        if (value != value2) {
            if (value == null) {
                return -1;
            }
            if (value2 == null) {
                return 1;
            }
            int compareTo = value.compareTo(value2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String location = getLocation();
        String location2 = addNodePropertyResponse.getLocation();
        if (location != location2) {
            if (location == null) {
                return -1;
            }
            if (location2 == null) {
                return 1;
            }
            int compareTo2 = location.compareTo(location2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        String key = getKey();
        String key2 = addNodePropertyResponse.getKey();
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
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AddNodePropertyResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public String getKey() {
        return this.key;
    }

    public String getLocation() {
        return this.location;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getValue() == null ? 0 : getValue().hashCode()) + 1 + (getLocation() == null ? 0 : getLocation().hashCode()) + (getKey() != null ? getKey().hashCode() : 0);
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
