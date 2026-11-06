package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnseenAggregations implements Comparable<UnseenAggregations> {
    private long groupCount;

    @Override // java.lang.Comparable
    public int compareTo(UnseenAggregations unseenAggregations) {
        long j = this.groupCount;
        long j2 = unseenAggregations.groupCount;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UnseenAggregations) && compareTo((UnseenAggregations) obj) == 0;
        }
        return true;
    }

    public long getGroupCount() {
        return this.groupCount;
    }

    public int hashCode() {
        return (int) (getGroupCount() ^ (getGroupCount() >>> 32));
    }

    public void setGroupCount(long j) {
        this.groupCount = j;
    }
}
