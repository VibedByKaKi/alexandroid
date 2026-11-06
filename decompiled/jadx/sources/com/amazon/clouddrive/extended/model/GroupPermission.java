package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPermission implements Comparable<GroupPermission> {
    private List<String> albumIds;
    private String groupId;
    private String lastModifiedTime;

    @Override // java.lang.Comparable
    public int compareTo(GroupPermission groupPermission) {
        if (groupPermission == null) {
            return -1;
        }
        if (groupPermission == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getLastModifiedTime(), groupPermission.getLastModifiedTime());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getGroupId(), groupPermission.getGroupId());
        if (compare2 != 0) {
            return compare2;
        }
        int compareCollections = ObjectComparator.compareCollections(getAlbumIds(), groupPermission.getAlbumIds());
        if (compareCollections != 0) {
            return compareCollections;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GroupPermission) && compareTo((GroupPermission) obj) == 0;
    }

    public List<String> getAlbumIds() {
        return this.albumIds;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public int hashCode() {
        return (((getLastModifiedTime() == null ? 0 : getLastModifiedTime().hashCode()) + 1 + (getGroupId() == null ? 0 : getGroupId().hashCode()) + (getAlbumIds() != null ? getAlbumIds().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setAlbumIds(List<String> list) {
        this.albumIds = list;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setLastModifiedTime(String str) {
        this.lastModifiedTime = str;
    }
}
