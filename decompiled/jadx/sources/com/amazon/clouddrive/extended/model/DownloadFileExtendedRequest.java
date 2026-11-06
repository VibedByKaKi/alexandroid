package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.DownloadFileRequest;
import com.amazon.clouddrive.model.ObjectComparator;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DownloadFileExtendedRequest extends DownloadFileRequest {
    private CropBox mCropBox;
    private String mOwnerId;

    public DownloadFileExtendedRequest(String str, OutputStream outputStream) {
        super(str, outputStream);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.DownloadFileRequest, java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof DownloadFileExtendedRequest)) {
            return 1;
        }
        DownloadFileExtendedRequest downloadFileExtendedRequest = (DownloadFileExtendedRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getOwnerId(), downloadFileExtendedRequest.getOwnerId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getCropBox(), downloadFileExtendedRequest.getCropBox());
        return compare2 != 0 ? compare2 : super.compareTo(cloudDriveRequest);
    }

    @Override // com.amazon.clouddrive.model.DownloadFileRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DownloadFileExtendedRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public CropBox getCropBox() {
        return this.mCropBox;
    }

    public String getOwnerId() {
        return this.mOwnerId;
    }

    @Override // com.amazon.clouddrive.model.DownloadFileRequest
    public int hashCode() {
        return (((getOwnerId() == null ? 0 : getOwnerId().hashCode()) + 1 + (getCropBox() != null ? getCropBox().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setCropBox(CropBox cropBox) {
        this.mCropBox = cropBox;
    }

    public void setOwnerId(String str) {
        this.mOwnerId = str;
    }
}
