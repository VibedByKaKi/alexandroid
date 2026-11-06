package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ISO8601;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaTypeUsage {

    @SerializedName("count")
    @Expose
    private Long count;

    @SerializedName("lastUploadedTime")
    @Expose
    private ISO8601 lastUploadedTime;

    @Generated
    public MediaTypeUsage() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof MediaTypeUsage;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaTypeUsage)) {
            return false;
        }
        MediaTypeUsage mediaTypeUsage = (MediaTypeUsage) obj;
        if (!mediaTypeUsage.canEqual(this)) {
            return false;
        }
        Long count = getCount();
        Long count2 = mediaTypeUsage.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        ISO8601 lastUploadedTime = getLastUploadedTime();
        ISO8601 lastUploadedTime2 = mediaTypeUsage.getLastUploadedTime();
        return lastUploadedTime != null ? lastUploadedTime.equals(lastUploadedTime2) : lastUploadedTime2 == null;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public ISO8601 getLastUploadedTime() {
        return this.lastUploadedTime;
    }

    @Generated
    public int hashCode() {
        Long count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        ISO8601 lastUploadedTime = getLastUploadedTime();
        return ((hashCode + 59) * 59) + (lastUploadedTime != null ? lastUploadedTime.hashCode() : 43);
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Generated
    public void setLastUploadedTime(ISO8601 iso8601) {
        this.lastUploadedTime = iso8601;
    }

    @Generated
    public String toString() {
        return "MediaTypeUsage(count=" + getCount() + ", lastUploadedTime=" + getLastUploadedTime() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
