package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageSummary {

    @SerializedName("billable")
    @Expose
    private UsageDetail billable;

    @SerializedName("total")
    @Expose
    private UsageDetail total;

    @Generated
    public UsageSummary() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UsageSummary;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UsageSummary)) {
            return false;
        }
        UsageSummary usageSummary = (UsageSummary) obj;
        if (!usageSummary.canEqual(this)) {
            return false;
        }
        UsageDetail billable = getBillable();
        UsageDetail billable2 = usageSummary.getBillable();
        if (billable != null ? !billable.equals(billable2) : billable2 != null) {
            return false;
        }
        UsageDetail total = getTotal();
        UsageDetail total2 = usageSummary.getTotal();
        return total != null ? total.equals(total2) : total2 == null;
    }

    @Generated
    public UsageDetail getBillable() {
        return this.billable;
    }

    @Generated
    public UsageDetail getTotal() {
        return this.total;
    }

    @Generated
    public int hashCode() {
        UsageDetail billable = getBillable();
        int hashCode = billable == null ? 43 : billable.hashCode();
        UsageDetail total = getTotal();
        return ((hashCode + 59) * 59) + (total != null ? total.hashCode() : 43);
    }

    @Generated
    public void setBillable(UsageDetail usageDetail) {
        this.billable = usageDetail;
    }

    @Generated
    public void setTotal(UsageDetail usageDetail) {
        this.total = usageDetail;
    }

    @Generated
    public String toString() {
        return "UsageSummary(billable=" + getBillable() + ", total=" + getTotal() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
