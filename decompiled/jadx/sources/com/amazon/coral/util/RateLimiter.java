package com.amazon.coral.util;

import com.amazon.coral.google.common.util.concurrent.AtomicDouble;
import com.amazon.coral.util.RateLimiter;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.DoubleUnaryOperator;
import java.util.function.LongSupplier;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RateLimiter {
    private final LongSupplier clock;
    private final AtomicLong lastUpdate;
    private final AtomicReference<Settings> settings;
    private final AtomicDouble tokenBalance;
    public static final Double DEFAULT_SCALE_FACTOR = Double.valueOf(1.1d);
    public static final Duration DEFAULT_BURST_INTERVAL = Duration.ofSeconds(1);
    private static final long ONE_SECOND = 1000000000;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Settings {
        final double bucketSize;
        final double tps;
        final long updateIntervalNs;

        public Settings(double d, double d2) {
            if (d > 0.0d && d2 < 1.0d) {
                Single$$ExternalSyntheticBUOutline0.m$3("bucketSize must be greater than one");
                throw null;
            }
            this.updateIntervalNs = (long) Math.ceil((1.0d / d) * RateLimiter.ONE_SECOND);
            this.tps = d;
            this.bucketSize = d2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Settings.class == obj.getClass()) {
                Settings settings = (Settings) obj;
                if (Double.compare(this.tps, settings.tps) == 0 && Double.compare(this.bucketSize, settings.bucketSize) == 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Double.valueOf(this.tps), Double.valueOf(this.bucketSize));
        }
    }

    public RateLimiter(double d, double d2, LongSupplier longSupplier) {
        this.tokenBalance = new AtomicDouble(0.0d);
        this.lastUpdate = new AtomicLong();
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.settings = atomicReference;
        this.clock = longSupplier;
        atomicReference.set(new Settings(d, d2));
    }

    private static double defaultSizeBucket(double d) {
        return sizeBucket(d, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$tryAcquire$0(long j, long j2, Settings settings, double d) {
        return Math.max(0.0d, d - ((j - j2) / settings.updateIntervalNs)) + 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$tryAcquire$1(Settings settings, double d) {
        double d2 = 1.0d + d;
        return d2 <= settings.bucketSize ? d2 : d;
    }

    public static double sizeBucket(double d, Double d2, Duration duration) {
        if (d == 0.0d) {
            return 0.0d;
        }
        if (d <= 0.0d) {
            Single$$ExternalSyntheticBUOutline0.m$3("tps must be greater than zero");
            return 0.0d;
        }
        if (d2 != null && d2.doubleValue() <= 0.0d) {
            Single$$ExternalSyntheticBUOutline0.m$3("scaleFactor must be greater than zero");
            return 0.0d;
        }
        if (duration != null && duration.toMillis() < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("burstInterval must be at least 1ms");
            return 0.0d;
        }
        if (d2 == null) {
            d2 = DEFAULT_SCALE_FACTOR;
        }
        if (duration == null) {
            duration = DEFAULT_BURST_INTERVAL;
        }
        return Math.max(1.0d, (d2.doubleValue() * d) - (duration.toNanos() / ((long) Math.ceil((1.0d / d) * ONE_SECOND))));
    }

    private boolean tryAcquire(final Settings settings) {
        if (settings.tps != 0.0d) {
            LongSupplier longSupplier = this.clock;
            final long nanoTime = longSupplier == null ? System.nanoTime() : longSupplier.getAsLong();
            final long j = this.lastUpdate.get();
            if (nanoTime >= settings.updateIntervalNs + j && this.lastUpdate.compareAndSet(j, nanoTime)) {
                this.tokenBalance.updateAndGet(new DoubleUnaryOperator() { // from class: com.amazon.coral.util.RateLimiter$$ExternalSyntheticLambda0
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double lambda$tryAcquire$0;
                        lambda$tryAcquire$0 = RateLimiter.lambda$tryAcquire$0(nanoTime, j, settings, d);
                        return lambda$tryAcquire$0;
                    }
                });
                return true;
            }
            if (settings.bucketSize - this.tokenBalance.getAndUpdate(new DoubleUnaryOperator() { // from class: com.amazon.coral.util.RateLimiter$$ExternalSyntheticLambda1
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    double lambda$tryAcquire$1;
                    lambda$tryAcquire$1 = RateLimiter.lambda$tryAcquire$1(RateLimiter.Settings.this, d);
                    return lambda$tryAcquire$1;
                }
            }) < 1.0d) {
                return false;
            }
        }
        return true;
    }

    public double getLastSeenBalance() {
        return this.tokenBalance.get();
    }

    public double getTps() {
        return this.settings.get().tps;
    }

    public boolean hasLimit() {
        return this.settings.get().tps > 0.0d;
    }

    public long nanosecondsUntilAcquire() {
        Settings settings = this.settings.get();
        if (tryAcquire(settings)) {
            return 0L;
        }
        LongSupplier longSupplier = this.clock;
        long nanoTime = longSupplier == null ? System.nanoTime() : longSupplier.getAsLong();
        long j = this.lastUpdate.get();
        long j2 = j - nanoTime;
        long j3 = settings.updateIntervalNs;
        return j2 >= j3 ? nanosecondsUntilAcquire() : (j + j3) - nanoTime;
    }

    public void setTps(double d, double d2) {
        this.settings.set(new Settings(d, d2));
    }

    public void setTps(double d) {
        setTps(d, defaultSizeBucket(d));
    }

    public RateLimiter(double d, double d2) {
        this(d, d2, null);
    }

    public RateLimiter(double d) {
        this(d, defaultSizeBucket(d));
    }

    public boolean tryAcquire() {
        return tryAcquire(this.settings.get());
    }
}
