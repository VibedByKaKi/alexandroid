package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SegmentReference {

    @Nullable
    public Long localId;
    public double offsetEnd;
    public double offsetStart;

    @NonNull
    public String segmentId;
    public long tilePartitionId;

    @NonNull
    public TravelDirection travelDirection;

    public SegmentReference() {
        this.segmentId = "";
        this.travelDirection = TravelDirection.BIDIRECTIONAL;
        this.offsetStart = 0.0d;
        this.offsetEnd = 1.0d;
        this.tilePartitionId = 0L;
        this.localId = 0L;
    }

    @Nullable
    public static native SegmentReference fromString(@NonNull String str);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SegmentReference)) {
            return false;
        }
        SegmentReference segmentReference = (SegmentReference) obj;
        return Objects.equals(this.segmentId, segmentReference.segmentId) && Objects.equals(this.travelDirection, segmentReference.travelDirection) && Double.compare(this.offsetStart, segmentReference.offsetStart) == 0 && Double.compare(this.offsetEnd, segmentReference.offsetEnd) == 0 && this.tilePartitionId == segmentReference.tilePartitionId && Objects.equals(this.localId, segmentReference.localId);
    }

    public int hashCode() {
        String str = this.segmentId;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        TravelDirection travelDirection = this.travelDirection;
        int hashCode2 = (((((hashCode + (travelDirection != null ? travelDirection.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.offsetStart) ^ (Double.doubleToLongBits(this.offsetStart) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.offsetEnd) ^ (Double.doubleToLongBits(this.offsetEnd) >>> 32)))) * 31;
        long j = this.tilePartitionId;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.localId;
        return i + (l != null ? l.hashCode() : 0);
    }

    public SegmentReference(@NonNull String str) {
        this.segmentId = str;
        this.travelDirection = TravelDirection.BIDIRECTIONAL;
        this.offsetStart = 0.0d;
        this.offsetEnd = 1.0d;
        this.tilePartitionId = 0L;
        this.localId = 0L;
    }

    public SegmentReference(@NonNull String str, @NonNull TravelDirection travelDirection) {
        this.segmentId = str;
        this.travelDirection = travelDirection;
        this.offsetStart = 0.0d;
        this.offsetEnd = 1.0d;
        this.tilePartitionId = 0L;
        this.localId = 0L;
    }

    public SegmentReference(@NonNull String str, @NonNull TravelDirection travelDirection, double d) {
        this.segmentId = str;
        this.travelDirection = travelDirection;
        this.offsetStart = d;
        this.offsetEnd = 1.0d;
        this.tilePartitionId = 0L;
        this.localId = 0L;
    }

    public SegmentReference(@NonNull String str, @NonNull TravelDirection travelDirection, double d, double d2) {
        this.segmentId = str;
        this.travelDirection = travelDirection;
        this.offsetStart = d;
        this.offsetEnd = d2;
        this.tilePartitionId = 0L;
        this.localId = 0L;
    }

    public SegmentReference(@NonNull String str, @NonNull TravelDirection travelDirection, double d, double d2, long j) {
        this.segmentId = str;
        this.travelDirection = travelDirection;
        this.offsetStart = d;
        this.offsetEnd = d2;
        this.tilePartitionId = j;
        this.localId = 0L;
    }

    public SegmentReference(@NonNull String str, @NonNull TravelDirection travelDirection, double d, double d2, long j, @Nullable Long l) {
        this.segmentId = str;
        this.travelDirection = travelDirection;
        this.offsetStart = d;
        this.offsetEnd = d2;
        this.tilePartitionId = j;
        this.localId = l;
    }
}
