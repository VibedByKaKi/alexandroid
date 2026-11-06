package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import com.amazon.alexa.assistant.metric.InteractionFaultTracker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / InteractionFaultTracker.CLIENT_TIMEOUT_MS;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * InteractionFaultTracker.CLIENT_TIMEOUT_MS) / 1000000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.timestampOffsetUs == -9223372036854775807L) {
                long j2 = this.firstSampleTimestampUs;
                if (j2 == 9223372036854775806L) {
                    j2 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = j2 - j;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j;
            return j + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != -9223372036854775807L) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (4294967296L + usToNonWrappedPts) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - usToNonWrappedPts) < Math.abs(j5 - usToNonWrappedPts) ? j4 : j5;
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j) throws InterruptedException {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == 9223372036854775806L);
            if (this.timestampOffsetUs != -9223372036854775807L) {
                return;
            }
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j));
            } else {
                while (this.timestampOffsetUs == -9223372036854775807L) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
