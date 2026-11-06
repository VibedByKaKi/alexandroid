package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupCoverPhoto implements Comparable<GroupCoverPhoto> {
    private CropBox cropBox;
    private String nodeId;
    private String ownerId;
    private String url;

    @Override // java.lang.Comparable
    public int compareTo(GroupCoverPhoto groupCoverPhoto) {
        if (groupCoverPhoto == null) {
            return -1;
        }
        if (groupCoverPhoto == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getNodeId(), groupCoverPhoto.getNodeId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getOwnerId(), groupCoverPhoto.getOwnerId());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getCropBox(), groupCoverPhoto.getCropBox());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getUrl(), groupCoverPhoto.getUrl());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GroupCoverPhoto) && compareTo((GroupCoverPhoto) obj) == 0;
    }

    public CropBox getCropBox() {
        return this.cropBox;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (getNodeId() == null ? 0 : getNodeId().hashCode()) + 1 + (getOwnerId() == null ? 0 : getOwnerId().hashCode()) + (getCropBox() == null ? 0 : getCropBox().hashCode()) + (getUrl() != null ? getUrl().hashCode() : 0);
    }

    public void setCropBox(CropBox cropBox) {
        this.cropBox = cropBox;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
