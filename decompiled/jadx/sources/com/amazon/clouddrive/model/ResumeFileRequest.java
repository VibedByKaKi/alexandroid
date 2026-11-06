package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ResumeFileRequest extends StreamFileRequest {
    private long mResumeFromPosition = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.StreamFileRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof ResumeFileRequest)) {
            return 1;
        }
        int compare = ObjectComparator.compare(Long.valueOf(getResumeFromPosition()), Long.valueOf(((ResumeFileRequest) cloudDriveRequest).getResumeFromPosition()));
        return compare != 0 ? compare : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.StreamFileRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ResumeFileRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public long getResumeFromPosition() {
        return this.mResumeFromPosition;
    }

    @Override // com.amazon.clouddrive.model.StreamFileRequest
    public int hashCode() {
        return super.hashCode() ^ ((int) (getResumeFromPosition() ^ (getResumeFromPosition() >>> 32)));
    }

    public void setResumeFromPosition(long j) {
        this.mResumeFromPosition = j;
    }
}
