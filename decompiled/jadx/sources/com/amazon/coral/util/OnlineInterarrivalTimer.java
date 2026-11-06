package com.amazon.coral.util;

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class OnlineInterarrivalTimer {
    private long count;
    private long lastTime;
    private double m2;
    private double mean;
    private final LongSupplier timer;

    public OnlineInterarrivalTimer() {
        this(new AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0(0));
    }

    public SummaryStatistics getAndReset() {
        SummaryStatistics summaryStatistics = new SummaryStatistics(getMean(), getVariance(), getSampleVariance(), getSampleSize());
        this.count = 0L;
        this.mean = 0.0d;
        this.m2 = 0.0d;
        return summaryStatistics;
    }

    public double getMean() {
        return this.mean;
    }

    public long getSampleSize() {
        return this.count;
    }

    public double getSampleVariance() {
        if (this.count < 2) {
            return Double.NaN;
        }
        return this.m2 / (r0 - 1);
    }

    public double getVariance() {
        long j = this.count;
        if (j < 2) {
            return Double.NaN;
        }
        return this.m2 / j;
    }

    public void update() {
        long asLong = this.timer.getAsLong();
        long j = this.lastTime;
        if (j == 0) {
            this.lastTime = asLong;
            return;
        }
        long j2 = this.count + 1;
        this.count = j2;
        double d = asLong - j;
        double d2 = this.mean;
        double d3 = d - d2;
        double d4 = (d3 / j2) + d2;
        this.mean = d4;
        this.m2 = (d3 * (d - d4)) + this.m2;
        this.lastTime = asLong;
    }

    public OnlineInterarrivalTimer(LongSupplier longSupplier) {
        this.timer = longSupplier;
    }
}
