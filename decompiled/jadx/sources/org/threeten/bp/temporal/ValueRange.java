package org.threeten.bp.temporal;

import androidx.collection.SieveCacheKt;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class ValueRange implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long maxLargest;
    private final long maxSmallest;
    private final long minLargest;
    private final long minSmallest;

    private ValueRange(long j, long j2, long j3, long j4) {
        this.minSmallest = j;
        this.minLargest = j2;
        this.maxSmallest = j3;
        this.maxLargest = j4;
    }

    public static ValueRange of(long j, long j2, long j3, long j4) {
        if (j > j2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Smallest minimum value must be less than largest minimum value");
            return null;
        }
        if (j3 > j4) {
            Single$$ExternalSyntheticBUOutline0.m$3("Smallest maximum value must be less than largest maximum value");
            return null;
        }
        if (j2 <= j4) {
            return new ValueRange(j, j2, j3, j4);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Minimum value must be less than maximum value");
        return null;
    }

    public int checkValidIntValue(long j, TemporalField temporalField) {
        if (isValidIntValue(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid int value for " + temporalField + ": " + j);
    }

    public long checkValidValue(long j, TemporalField temporalField) {
        if (isValidValue(j)) {
            return j;
        }
        if (temporalField == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j);
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + this + "): " + j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueRange) {
            ValueRange valueRange = (ValueRange) obj;
            if (this.minSmallest == valueRange.minSmallest && this.minLargest == valueRange.minLargest && this.maxSmallest == valueRange.maxSmallest && this.maxLargest == valueRange.maxLargest) {
                return true;
            }
        }
        return false;
    }

    public long getLargestMinimum() {
        return this.minLargest;
    }

    public long getMaximum() {
        return this.maxLargest;
    }

    public long getMinimum() {
        return this.minSmallest;
    }

    public long getSmallestMaximum() {
        return this.maxSmallest;
    }

    public int hashCode() {
        long j = this.minSmallest;
        long j2 = this.minLargest;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.maxSmallest;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.maxLargest;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public boolean isFixed() {
        return this.minSmallest == this.minLargest && this.maxSmallest == this.maxLargest;
    }

    public boolean isIntValue() {
        return getMinimum() >= SieveCacheKt.NodeMetaAndPreviousMask && getMaximum() <= SieveCacheKt.NodeLinkMask;
    }

    public boolean isValidIntValue(long j) {
        return isIntValue() && isValidValue(j);
    }

    public boolean isValidValue(long j) {
        return j >= getMinimum() && j <= getMaximum();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.minSmallest);
        if (this.minSmallest != this.minLargest) {
            sb.append('/');
            sb.append(this.minLargest);
        }
        sb.append(" - ");
        sb.append(this.maxSmallest);
        if (this.maxSmallest != this.maxLargest) {
            sb.append('/');
            sb.append(this.maxLargest);
        }
        return sb.toString();
    }

    public static ValueRange of(long j, long j2, long j3) {
        return of(j, j, j2, j3);
    }

    public static ValueRange of(long j, long j2) {
        if (j <= j2) {
            return new ValueRange(j, j, j2, j2);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Minimum value must be less than maximum value");
        return null;
    }
}
