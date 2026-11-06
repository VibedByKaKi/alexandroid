package com.amazon.clouddrive.model;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SourceStatus implements Comparable<SourceStatus> {
    private long cacheSize;
    private boolean isDownloading;
    private boolean isUploading;
    private Map<String, MediaTypeUploadStatus> uploadStatus;

    @Override // java.lang.Comparable
    public int compareTo(SourceStatus sourceStatus) {
        if (sourceStatus == null) {
            return -1;
        }
        if (sourceStatus == this) {
            return 0;
        }
        Map<String, MediaTypeUploadStatus> uploadStatus = getUploadStatus();
        Map<String, MediaTypeUploadStatus> uploadStatus2 = sourceStatus.getUploadStatus();
        if (uploadStatus != uploadStatus2) {
            if (uploadStatus == null) {
                return -1;
            }
            if (uploadStatus2 == null) {
                return 1;
            }
            if (uploadStatus instanceof Comparable) {
                int compareTo = ((Comparable) uploadStatus).compareTo(uploadStatus2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else if (!uploadStatus.equals(uploadStatus2)) {
                int hashCode = uploadStatus.hashCode();
                int hashCode2 = uploadStatus2.hashCode();
                if (hashCode < hashCode2) {
                    return -1;
                }
                if (hashCode > hashCode2) {
                    return 1;
                }
            }
        }
        if (!isIsUploading() && sourceStatus.isIsUploading()) {
            return -1;
        }
        if (isIsUploading() && !sourceStatus.isIsUploading()) {
            return 1;
        }
        if (getCacheSize() < sourceStatus.getCacheSize()) {
            return -1;
        }
        if (getCacheSize() > sourceStatus.getCacheSize()) {
            return 1;
        }
        if (isIsDownloading() || !sourceStatus.isIsDownloading()) {
            return (!isIsDownloading() || sourceStatus.isIsDownloading()) ? 0 : 1;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SourceStatus) && compareTo((SourceStatus) obj) == 0;
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public Map<String, MediaTypeUploadStatus> getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        return (isIsDownloading() ? 1 : 0) + (isIsUploading() ? 1 : 0) + (getUploadStatus() == null ? 0 : getUploadStatus().hashCode()) + 1 + ((int) getCacheSize());
    }

    public boolean isIsDownloading() {
        return this.isDownloading;
    }

    public boolean isIsUploading() {
        return this.isUploading;
    }

    public void setCacheSize(long j) {
        this.cacheSize = j;
    }

    public void setIsDownloading(boolean z) {
        this.isDownloading = z;
    }

    public void setIsUploading(boolean z) {
        this.isUploading = z;
    }

    public void setUploadStatus(Map<String, MediaTypeUploadStatus> map) {
        this.uploadStatus = map;
    }
}
