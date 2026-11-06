package com.amazon.coral.util;

import java.util.Objects;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class NanoTimer implements Comparable<NanoTimer> {
    private static final LongSupplier NANO_CLOCK = new AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0(0);
    private final LongSupplier clock;
    private final long deadline;
    private final long duration;
    private final long startTime;

    public NanoTimer(long j, long j2, LongSupplier longSupplier) {
        this.startTime = j2;
        this.duration = j;
        this.deadline = j2 + j;
        this.clock = longSupplier;
    }

    @Override // java.lang.Comparable
    public int compareTo(NanoTimer nanoTimer) {
        long j = this.deadline;
        long j2 = nanoTimer.deadline;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NanoTimer.class == obj.getClass()) {
            NanoTimer nanoTimer = (NanoTimer) obj;
            if (this.startTime == nanoTimer.startTime && this.deadline == nanoTimer.deadline) {
                return true;
            }
        }
        return false;
    }

    public long getDeadline() {
        return this.deadline;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getRemainingTime() {
        return this.deadline - this.clock.getAsLong();
    }

    public boolean hasExpired() {
        return this.clock.getAsLong() > this.deadline;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.startTime), Long.valueOf(this.deadline));
    }

    public NanoTimer(long j, long j2) {
        this(j, j2, NANO_CLOCK);
    }

    public NanoTimer(long j) {
        this(j, System.nanoTime(), NANO_CLOCK);
    }
}
