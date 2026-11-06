package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.GetThumbnailRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetThumbnailExtendedRequest extends GetThumbnailRequest {
    private String groupShareToken;
    private CropBox mCropBox;
    private String mOwnerId;

    public GetThumbnailExtendedRequest(String str, OutputStream outputStream) {
        super(str, outputStream);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.GetThumbnailRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetThumbnailExtendedRequest)) {
            return 1;
        }
        GetThumbnailExtendedRequest getThumbnailExtendedRequest = (GetThumbnailExtendedRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getOwnerId(), getThumbnailExtendedRequest.getOwnerId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getCropBox(), getThumbnailExtendedRequest.getCropBox());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getGroupShareToken(), getThumbnailExtendedRequest.getGroupShareToken());
        return compare3 != 0 ? compare3 : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.GetThumbnailRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetThumbnailExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public CropBox getCropBox() {
        return this.mCropBox;
    }

    public String getGroupShareToken() {
        return this.groupShareToken;
    }

    public String getOwnerId() {
        return this.mOwnerId;
    }

    @Override // com.amazon.clouddrive.model.GetThumbnailRequest
    public int hashCode() {
        return (((getOwnerId() == null ? 0 : getOwnerId().hashCode()) + 1 + (getCropBox() == null ? 0 : getCropBox().hashCode()) + (getGroupShareToken() != null ? getGroupShareToken().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setCropBox(CropBox cropBox) {
        this.mCropBox = cropBox;
    }

    public void setGroupShareToken(String str) {
        this.groupShareToken = str;
    }

    public void setOwnerId(String str) {
        this.mOwnerId = str;
    }
}
