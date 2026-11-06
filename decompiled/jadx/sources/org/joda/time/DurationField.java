package org.joda.time;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class DurationField implements Comparable<DurationField> {
    public abstract long add(long j, int i);

    public abstract long add(long j, long j2);

    public abstract int getDifference(long j, long j2);

    public abstract long getDifferenceAsLong(long j, long j2);

    public abstract long getMillis(int i);

    public abstract long getMillis(int i, long j);

    public abstract long getMillis(long j);

    public abstract long getMillis(long j, long j2);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j);

    public abstract int getValue(long j, long j2);

    public abstract long getValueAsLong(long j);

    public abstract long getValueAsLong(long j, long j2);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            return add(j, -j2);
        }
        Duration$$ExternalSyntheticBUOutline0.m("Long.MIN_VALUE cannot be negated");
        return 0L;
    }

    public abstract String toString();

    public long subtract(long j, int i) {
        if (i == Integer.MIN_VALUE) {
            return subtract(j, i);
        }
        return add(j, -i);
    }
}
