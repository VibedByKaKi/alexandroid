package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class PaginatedCloudDriveResponse implements CloudDriveResponse {
    private long count;
    private String nextToken;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof PaginatedCloudDriveResponse)) {
            return 1;
        }
        PaginatedCloudDriveResponse paginatedCloudDriveResponse = (PaginatedCloudDriveResponse) cloudDriveResponse;
        if (getCount() < paginatedCloudDriveResponse.getCount()) {
            return -1;
        }
        if (getCount() > paginatedCloudDriveResponse.getCount()) {
            return 1;
        }
        String nextToken = getNextToken();
        String nextToken2 = paginatedCloudDriveResponse.getNextToken();
        if (nextToken != nextToken2) {
            if (nextToken == null) {
                return -1;
            }
            if (nextToken2 == null) {
                return 1;
            }
            int compareTo = nextToken.compareTo(nextToken2);
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
        return (obj instanceof PaginatedCloudDriveResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public long getCount() {
        return this.count;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return ((int) getCount()) + 1 + (getNextToken() == null ? 0 : getNextToken().hashCode());
    }

    public void setCount(long j) {
        this.count = j;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }
}
