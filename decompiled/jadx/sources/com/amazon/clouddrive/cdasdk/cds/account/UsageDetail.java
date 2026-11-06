package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageDetail {

    @SerializedName("bytes")
    @Expose
    private Long bytes;

    @SerializedName("count")
    @Expose
    private Long count;

    @Generated
    public UsageDetail() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UsageDetail;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UsageDetail)) {
            return false;
        }
        UsageDetail usageDetail = (UsageDetail) obj;
        if (!usageDetail.canEqual(this)) {
            return false;
        }
        Long count = getCount();
        Long count2 = usageDetail.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        Long bytes = getBytes();
        Long bytes2 = usageDetail.getBytes();
        return bytes != null ? bytes.equals(bytes2) : bytes2 == null;
    }

    @Generated
    public Long getBytes() {
        return this.bytes;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public int hashCode() {
        Long count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        Long bytes = getBytes();
        return ((hashCode + 59) * 59) + (bytes != null ? bytes.hashCode() : 43);
    }

    @Generated
    public void setBytes(Long l) {
        this.bytes = l;
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Generated
    public String toString() {
        return "UsageDetail(count=" + getCount() + ", bytes=" + getBytes() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
