package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodePropertyResponse implements CloudDriveResponse {
    private String key;
    private String value;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetNodePropertyResponse)) {
            return 1;
        }
        GetNodePropertyResponse getNodePropertyResponse = (GetNodePropertyResponse) cloudDriveResponse;
        String value = getValue();
        String value2 = getNodePropertyResponse.getValue();
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
        String key = getKey();
        String key2 = getNodePropertyResponse.getKey();
        if (key != key2) {
            if (key == null) {
                return -1;
            }
            if (key2 == null) {
                return 1;
            }
            int compareTo2 = key.compareTo(key2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetNodePropertyResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (getValue() == null ? 0 : getValue().hashCode()) + 1 + (getKey() != null ? getKey().hashCode() : 0);
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
