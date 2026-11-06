package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
abstract class GetFileProgressRequest implements CloudDriveRequest {
    protected String mId;

    public GetFileProgressRequest(String str) {
        this.mId = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetFileProgressRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(this.mId, ((GetFileProgressRequest) cloudDriveRequest).mId);
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFileProgressRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public int hashCode() {
        int hashCode = getClass().getSimpleName().hashCode();
        String str = this.mId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
