package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetUploadFileProgressRequest extends GetFileProgressRequest {
    public GetUploadFileProgressRequest(String str) {
        super(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.GetFileProgressRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (cloudDriveRequest instanceof GetUploadFileProgressRequest) {
            return super.compareTo(cloudDriveRequest);
        }
        return 1;
    }

    @Override // com.amazon.clouddrive.model.GetFileProgressRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetUploadFileProgressRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getLocalId() {
        return this.mId;
    }

    @Override // com.amazon.clouddrive.model.GetFileProgressRequest
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public void setLocalId(String str) {
        this.mId = str;
    }
}
