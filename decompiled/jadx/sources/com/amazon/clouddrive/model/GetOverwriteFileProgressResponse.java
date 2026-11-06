package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetOverwriteFileProgressResponse extends GetFileProgressResponse {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.GetFileProgressResponse, java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (cloudDriveResponse instanceof GetOverwriteFileProgressResponse) {
            return super.compareTo(cloudDriveResponse);
        }
        return 1;
    }

    @Override // com.amazon.clouddrive.model.GetFileProgressResponse
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetOverwriteFileProgressResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }
}
