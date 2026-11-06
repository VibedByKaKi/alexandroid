package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DataMartStorageId implements Comparable<DataMartStorageId> {
    private String mStreamId;

    @Override // java.lang.Comparable
    public int compareTo(DataMartStorageId dataMartStorageId) {
        String streamId;
        String streamId2;
        if (dataMartStorageId == null) {
            return -1;
        }
        if (dataMartStorageId != this && (streamId = getStreamId()) != (streamId2 = dataMartStorageId.getStreamId())) {
            if (streamId == null) {
                return -1;
            }
            if (streamId2 == null) {
                return 1;
            }
            int compareTo = streamId.compareTo(streamId2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DataMartStorageId) && compareTo((DataMartStorageId) obj) == 0;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public int hashCode() {
        return (getStreamId() == null ? 0 : getStreamId().hashCode()) + 1;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
