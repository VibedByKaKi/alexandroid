package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageDetail implements Comparable<UsageDetail> {
    private long bytes;
    private long count;

    @Override // java.lang.Comparable
    public int compareTo(UsageDetail usageDetail) {
        if (usageDetail == null) {
            return -1;
        }
        if (usageDetail == this) {
            return 0;
        }
        if (getBytes() < usageDetail.getBytes()) {
            return -1;
        }
        if (getBytes() > usageDetail.getBytes()) {
            return 1;
        }
        if (getCount() < usageDetail.getCount()) {
            return -1;
        }
        return getCount() > usageDetail.getCount() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UsageDetail) && compareTo((UsageDetail) obj) == 0;
    }

    public long getBytes() {
        return this.bytes;
    }

    public long getCount() {
        return this.count;
    }

    public int hashCode() {
        return ((int) getBytes()) + 1 + ((int) getCount());
    }

    public void setBytes(long j) {
        this.bytes = j;
    }

    public void setCount(long j) {
        this.count = j;
    }
}
