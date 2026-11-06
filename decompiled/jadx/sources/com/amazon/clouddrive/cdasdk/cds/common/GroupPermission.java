package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPermission {

    @SerializedName("albumIds")
    @Expose
    private List<String> albumIds;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("lastModifiedTime")
    @Expose
    private ISO8601 lastModifiedTime;

    @Generated
    public GroupPermission() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GroupPermission;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupPermission)) {
            return false;
        }
        GroupPermission groupPermission = (GroupPermission) obj;
        if (!groupPermission.canEqual(this)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = groupPermission.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        List<String> albumIds = getAlbumIds();
        List<String> albumIds2 = groupPermission.getAlbumIds();
        if (albumIds != null ? !albumIds.equals(albumIds2) : albumIds2 != null) {
            return false;
        }
        ISO8601 lastModifiedTime = getLastModifiedTime();
        ISO8601 lastModifiedTime2 = groupPermission.getLastModifiedTime();
        return lastModifiedTime != null ? lastModifiedTime.equals(lastModifiedTime2) : lastModifiedTime2 == null;
    }

    @Generated
    public List<String> getAlbumIds() {
        return this.albumIds;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public ISO8601 getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @Generated
    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        List<String> albumIds = getAlbumIds();
        int i = (hashCode + 59) * 59;
        int hashCode2 = albumIds == null ? 43 : albumIds.hashCode();
        ISO8601 lastModifiedTime = getLastModifiedTime();
        return ((i + hashCode2) * 59) + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 43);
    }

    @Generated
    public void setAlbumIds(List<String> list) {
        this.albumIds = list;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
    }

    @Generated
    public void setLastModifiedTime(ISO8601 iso8601) {
        this.lastModifiedTime = iso8601;
    }

    @Generated
    public String toString() {
        return "GroupPermission(groupId=" + getGroupId() + ", albumIds=" + getAlbumIds() + ", lastModifiedTime=" + getLastModifiedTime() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
