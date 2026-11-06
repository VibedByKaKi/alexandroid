package com.amazon.clouddrive.model;

import java.io.OutputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetThumbnailRequest implements CloudDriveRequest {
    private FitType mFitType;
    private String mId;
    private OutputStream mOutputStream;
    private int mViewBoxWidth = -1;
    private int mViewBoxHeight = -1;
    private int mBlockSize = 32768;

    public GetThumbnailRequest(String str, OutputStream outputStream) {
        this.mId = str;
        this.mOutputStream = outputStream;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof GetThumbnailRequest)) {
            return 1;
        }
        GetThumbnailRequest getThumbnailRequest = (GetThumbnailRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getId(), getThumbnailRequest.getId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(Integer.valueOf(getViewBoxWidth()), Integer.valueOf(getThumbnailRequest.getViewBoxWidth()));
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(Integer.valueOf(getViewBoxHeight()), Integer.valueOf(getThumbnailRequest.getViewBoxHeight()));
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getFitType(), getThumbnailRequest.getFitType());
        if (compare4 != 0) {
            return compare4;
        }
        int compare5 = ObjectComparator.compare(getOutputStream(), getThumbnailRequest.getOutputStream());
        if (compare5 != 0) {
            return compare5;
        }
        int compare6 = ObjectComparator.compare(Integer.valueOf(getBlockSize()), Integer.valueOf(getThumbnailRequest.getBlockSize()));
        if (compare6 != 0) {
            return compare6;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetThumbnailRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public int getBlockSize() {
        return this.mBlockSize;
    }

    public FitType getFitType() {
        return this.mFitType;
    }

    public String getId() {
        return this.mId;
    }

    public OutputStream getOutputStream() {
        return this.mOutputStream;
    }

    public int getViewBoxHeight() {
        return this.mViewBoxHeight;
    }

    public int getViewBoxWidth() {
        return this.mViewBoxWidth;
    }

    public boolean hasFitType() {
        return this.mFitType != null;
    }

    public boolean hasViewBoxSet() {
        return this.mViewBoxWidth > 0 && this.mViewBoxHeight > 0;
    }

    public int hashCode() {
        return this.mOutputStream.hashCode() + getViewBoxHeight() + getViewBoxWidth() + (getId() == null ? 0 : getId().hashCode()) + 1 + (getFitType() != null ? getFitType().hashCode() : 0);
    }

    public void setBlockSize(int i) {
        if (i >= 1) {
            this.mBlockSize = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The block size must be at the very least 1.");
        }
    }

    public void setFitType(FitType fitType) {
        this.mFitType = fitType;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setViewBox(int i, int i2) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("viewBox width must be greater than 0");
        } else if (i2 <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("viewBox height must be greater than 0");
        } else {
            this.mViewBoxWidth = i;
            this.mViewBoxHeight = i2;
        }
    }

    public GetThumbnailRequest withBlockSize(int i) {
        setBlockSize(i);
        return this;
    }

    public GetThumbnailRequest withFitType(FitType fitType) {
        setFitType(fitType);
        return this;
    }

    public GetThumbnailRequest withViewBox(int i) {
        setViewBox(i);
        return this;
    }

    public GetThumbnailRequest withViewBox(int i, int i2) {
        setViewBox(i, i2);
        return this;
    }

    public void setViewBox(int i) {
        if (i > 0) {
            this.mViewBoxWidth = i;
            this.mViewBoxHeight = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("viewBox must be greater than 0");
        }
    }
}
