package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Avatar implements Comparable<Avatar> {
    private String color;
    private GroupCoverPhoto photo;

    @Override // java.lang.Comparable
    public int compareTo(Avatar avatar) {
        if (avatar == null) {
            return -1;
        }
        if (avatar == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getColor(), avatar.getColor());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getPhoto(), avatar.getPhoto());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Avatar) && compareTo((Avatar) obj) == 0;
    }

    public String getColor() {
        return this.color;
    }

    public GroupCoverPhoto getPhoto() {
        return this.photo;
    }

    public int hashCode() {
        return (((getColor() == null ? 0 : getColor().hashCode()) + 1 + (getPhoto() != null ? getPhoto().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setPhoto(GroupCoverPhoto groupCoverPhoto) {
        this.photo = groupCoverPhoto;
    }
}
