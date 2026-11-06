package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupShareResponse implements CloudDriveResponse {
    private String inviteUrl;
    private String shareToken;
    private String shareUrl;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GroupShareResponse)) {
            return 1;
        }
        GroupShareResponse groupShareResponse = (GroupShareResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getShareUrl(), groupShareResponse.getShareUrl());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getShareToken(), groupShareResponse.getShareToken());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getInviteUrl(), groupShareResponse.getInviteUrl());
        if (compare3 != 0) {
            return compare3;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupShareResponse groupShareResponse = (GroupShareResponse) obj;
            if (getShareToken() == null ? groupShareResponse.getShareToken() == null : getShareToken().equals(groupShareResponse.getShareToken())) {
                if (getShareUrl() == null ? groupShareResponse.getShareUrl() == null : getShareUrl().equals(groupShareResponse.getShareUrl())) {
                    if (getInviteUrl() == null ? groupShareResponse.getInviteUrl() == null : getInviteUrl().equals(groupShareResponse.getInviteUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getInviteUrl() {
        return this.inviteUrl;
    }

    public String getShareToken() {
        return this.shareToken;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        return ((((getShareToken() != null ? getShareToken().hashCode() : 0) * 31) + (getShareUrl() != null ? getShareUrl().hashCode() : 0)) * 31) + (getInviteUrl() != null ? getInviteUrl().hashCode() : 0);
    }

    public void setInviteUrl(String str) {
        this.inviteUrl = str;
    }

    public void setShareToken(String str) {
        this.shareToken = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupShareResponse{shareToken='");
        sb.append(this.shareToken);
        sb.append("', shareUrl='");
        sb.append(this.shareUrl);
        sb.append("', inviteUrl='");
        return a$$ExternalSyntheticOutline0.m(sb, this.inviteUrl, "'}");
    }
}
