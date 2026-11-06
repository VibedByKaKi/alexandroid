package com.amazon.clouddrive.model;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodePropertiesResponse implements CloudDriveResponse {
    private long count;
    private Map<String, String> data;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof ListNodePropertiesResponse)) {
            return 1;
        }
        ListNodePropertiesResponse listNodePropertiesResponse = (ListNodePropertiesResponse) cloudDriveResponse;
        Map<String, String> data = getData();
        Map<String, String> data2 = listNodePropertiesResponse.getData();
        if (data != data2) {
            if (data == null) {
                return -1;
            }
            if (data2 == null) {
                return 1;
            }
            if (data instanceof Comparable) {
                int compareTo = ((Comparable) data).compareTo(data2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else if (!data.equals(data2)) {
                int hashCode = data.hashCode();
                int hashCode2 = data2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        if (getCount() < listNodePropertiesResponse.getCount()) {
            return -1;
        }
        return getCount() > listNodePropertiesResponse.getCount() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListNodePropertiesResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public long getCount() {
        return this.count;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public int hashCode() {
        return (getData() == null ? 0 : getData().hashCode()) + 1 + ((int) getCount());
    }

    public void setCount(long j) {
        this.count = j;
    }

    public void setData(Map<String, String> map) {
        this.data = map;
    }
}
