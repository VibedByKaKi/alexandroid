package com.here.time;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Duration implements Comparable<Duration> {
    private static long MILLIS_PER_SECOND = 1000;
    private static int NANOS_PER_MILLIS = 1000000;
    private static long NANOS_PER_SECOND = 1000000000;
    private int mNanos;
    private long mSeconds;

    private Duration(long j, int i) {
        this.mSeconds = j;
        this.mNanos = i;
    }

    private static long divFloor(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    private static long exactAdd(long j, long j2) throws ArithmeticException {
        if (j2 < 0 && j < Long.MIN_VALUE - j2) {
            Duration$$ExternalSyntheticBUOutline0.m("Integer underflow");
            return 0L;
        }
        if (j2 <= 0 || j <= Long.MAX_VALUE - j2) {
            return j + j2;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Integer overflow");
        return 0L;
    }

    private static long exactMultiply(long j, long j2) throws ArithmeticException {
        if ((j2 == -1 && j == Long.MIN_VALUE) || (j == -1 && j2 == Long.MIN_VALUE)) {
            Duration$$ExternalSyntheticBUOutline0.m("Integer overflow");
            return 0L;
        }
        if (j2 > 0 && j > Long.MAX_VALUE / j2) {
            Duration$$ExternalSyntheticBUOutline0.m("Integer overflow");
            return 0L;
        }
        if (j2 > 0 && j < Long.MIN_VALUE / j2) {
            Duration$$ExternalSyntheticBUOutline0.m("Integer underflow");
            return 0L;
        }
        if (j2 < -1 && j > Long.MIN_VALUE / j2) {
            Duration$$ExternalSyntheticBUOutline0.m("Integer underflow");
            return 0L;
        }
        if (j2 >= -1 || j >= Long.MAX_VALUE / j2) {
            return j * j2;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Integer overflow");
        return 0L;
    }

    private static long modFloor(long j, long j2) {
        long j3 = j % j2;
        return ((j ^ j2) >= 0 || j3 == 0) ? j3 : j3 + j2;
    }

    public static Duration ofDays(long j) throws ArithmeticException {
        return ofHours(exactMultiply(j, 24L));
    }

    public static Duration ofHours(long j) throws ArithmeticException {
        return ofMinutes(exactMultiply(j, 60L));
    }

    public static Duration ofMillis(long j) {
        return ofNanos(j * NANOS_PER_MILLIS);
    }

    public static Duration ofMinutes(long j) throws ArithmeticException {
        return ofSeconds(exactMultiply(j, 60L));
    }

    public static Duration ofNanos(long j) {
        long j2 = NANOS_PER_SECOND;
        long j3 = j / j2;
        int i = (int) (j % j2);
        if (i < 0) {
            i = (int) (i + j2);
            j3--;
        }
        return new Duration(j3, i);
    }

    public static Duration ofSeconds(long j, long j2) {
        return new Duration(exactAdd(j, divFloor(j2, NANOS_PER_SECOND)), (int) modFloor(j2, NANOS_PER_SECOND));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        long j = this.mSeconds;
        long j2 = duration.mSeconds;
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i == 0) {
            int i2 = this.mNanos;
            int i3 = duration.mNanos;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Duration.class == obj.getClass()) {
            Duration duration = (Duration) obj;
            if (this.mSeconds == duration.mSeconds && this.mNanos == duration.mNanos) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.mNanos;
    }

    public long getSeconds() {
        return this.mSeconds;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mSeconds), Integer.valueOf(this.mNanos));
    }

    public long toDays() {
        return toHours() / 24;
    }

    public long toDaysPart() {
        return toDays();
    }

    public long toHours() {
        return toMinutes() / 60;
    }

    public int toHoursPart() {
        return (int) (toHours() % 24);
    }

    public long toMillis() throws ArithmeticException {
        return exactAdd(exactMultiply(this.mSeconds, MILLIS_PER_SECOND), this.mNanos / NANOS_PER_MILLIS);
    }

    public int toMillisPart() {
        return this.mNanos / NANOS_PER_MILLIS;
    }

    public long toMinutes() {
        return this.mSeconds / 60;
    }

    public int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public long toNanos() throws ArithmeticException {
        return exactAdd(exactMultiply(this.mSeconds, NANOS_PER_SECOND), this.mNanos);
    }

    public int toNanosPart() {
        return this.mNanos;
    }

    public long toSeconds() {
        return this.mSeconds;
    }

    public int toSecondsPart() {
        return (int) (this.mSeconds % 60);
    }

    public static Duration ofSeconds(long j) {
        return new Duration(j, 0);
    }
}
