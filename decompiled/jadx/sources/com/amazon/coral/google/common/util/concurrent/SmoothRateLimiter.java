package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.math.LongMath;
import com.amazon.coral.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SmoothBursty extends SmoothRateLimiter {
        final double maxBurstSeconds;

        public SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d;
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d, double d2) {
            double d3 = this.maxPermits;
            double d4 = this.maxBurstSeconds * d;
            this.maxPermits = d4;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.storedPermits = d4;
            } else {
                this.storedPermits = d3 != 0.0d ? (this.storedPermits * d4) / d3 : 0.0d;
            }
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d, double d2) {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j, TimeUnit timeUnit, double d) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j);
            this.coldFactor = d;
        }

        private double permitsToTime(double d) {
            return (d * this.slope) + this.stableIntervalMicros;
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public void doSetRate(double d, double d2) {
            double d3 = this.maxPermits;
            double d4 = this.coldFactor * d2;
            long j = this.warmupPeriodMicros;
            double d5 = (j * 0.5d) / d2;
            this.thresholdPermits = d5;
            double d6 = ((j * 2.0d) / (d2 + d4)) + d5;
            this.maxPermits = d6;
            this.slope = (d4 - d2) / (d6 - d5);
            if (d3 == Double.POSITIVE_INFINITY) {
                this.storedPermits = 0.0d;
                return;
            }
            if (d3 != 0.0d) {
                d6 = (this.storedPermits * d6) / d3;
            }
            this.storedPermits = d6;
        }

        @Override // com.amazon.coral.google.common.util.concurrent.SmoothRateLimiter
        public long storedPermitsToWaitTime(double d, double d2) {
            long j;
            double d3 = d - this.thresholdPermits;
            if (d3 > 0.0d) {
                double min = Math.min(d3, d2);
                j = (long) (((permitsToTime(d3) + permitsToTime(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            return j + ((long) (this.stableIntervalMicros * d2));
        }
    }

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }

    public abstract double coolDownIntervalMicros();

    @Override // com.amazon.coral.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
        return 1000000 / this.stableIntervalMicros;
    }

    public abstract void doSetRate(double d, double d2);

    @Override // com.amazon.coral.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double d, long j) {
        resync(j);
        double d2 = 1000000 / d;
        this.stableIntervalMicros = d2;
        doSetRate(d, d2);
    }

    @Override // com.amazon.coral.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable(long j) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.amazon.coral.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int i, long j) {
        resync(j);
        long j2 = this.nextFreeTicketMicros;
        double d = i;
        double min = Math.min(d, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, min) + ((long) ((d - min) * this.stableIntervalMicros)));
        this.storedPermits -= min;
        return j2;
    }

    public void resync(long j) {
        if (j > this.nextFreeTicketMicros) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j - r0) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j;
        }
    }

    public abstract long storedPermitsToWaitTime(double d, double d2);
}
