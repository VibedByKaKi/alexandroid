package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageSummary implements Comparable<UsageSummary> {
    private UsageDetail billable;
    private UsageDetail total;

    @Override // java.lang.Comparable
    public int compareTo(UsageSummary usageSummary) {
        if (usageSummary == null) {
            return -1;
        }
        if (usageSummary == this) {
            return 0;
        }
        UsageDetail billable = getBillable();
        UsageDetail billable2 = usageSummary.getBillable();
        if (billable != billable2) {
            if (billable == null) {
                return -1;
            }
            if (billable2 == null) {
                return 1;
            }
            int compareTo = billable.compareTo(billable2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        UsageDetail total = getTotal();
        UsageDetail total2 = usageSummary.getTotal();
        if (total != total2) {
            if (total == null) {
                return -1;
            }
            if (total2 == null) {
                return 1;
            }
            int compareTo2 = total.compareTo(total2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UsageSummary) && compareTo((UsageSummary) obj) == 0;
    }

    public UsageDetail getBillable() {
        return this.billable;
    }

    public UsageDetail getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (getBillable() == null ? 0 : getBillable().hashCode()) + 1 + (getTotal() != null ? getTotal().hashCode() : 0);
    }

    public void setBillable(UsageDetail usageDetail) {
        this.billable = usageDetail;
    }

    public void setTotal(UsageDetail usageDetail) {
        this.total = usageDetail;
    }
}
