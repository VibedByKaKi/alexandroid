package com.amazon.coral.util;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AtomicOnlineInterarrivalTimer implements AtomicOnlineMetric {
    private long count;
    private long lastTime;
    private final ReentrantReadWriteLock lock;
    private double m2;
    private double mean;
    private final LongSupplier timer;

    public AtomicOnlineInterarrivalTimer(LongSupplier longSupplier) {
        this.lock = new ReentrantReadWriteLock();
        this.timer = longSupplier;
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public SummaryStatistics get() {
        this.lock.readLock().lock();
        try {
            long j = this.count;
            double d = this.m2;
            double d2 = Double.NaN;
            double d3 = j < 2 ? Double.NaN : d / j;
            if (j >= 2) {
                d2 = d / (j - 1);
            }
            return new SummaryStatistics(this.mean, d3, d2, j);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public SummaryStatistics getAndReset() {
        this.lock.writeLock().lock();
        try {
            long j = this.count;
            double d = Double.NaN;
            double d2 = j < 2 ? Double.NaN : this.m2 / j;
            if (j >= 2) {
                d = this.m2 / (j - 1);
            }
            SummaryStatistics summaryStatistics = new SummaryStatistics(this.mean, d2, d, j);
            this.count = 0L;
            this.mean = 0.0d;
            this.m2 = 0.0d;
            return summaryStatistics;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public long getSampleSize() {
        this.lock.readLock().lock();
        try {
            return this.count;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void update() {
        this.lock.writeLock().lock();
        try {
            long asLong = this.timer.getAsLong();
            long j = this.lastTime;
            if (j == 0) {
                this.lastTime = asLong;
            } else {
                long j2 = asLong - j;
                long j3 = this.count + 1;
                this.count = j3;
                double d = j2;
                double d2 = this.mean;
                double d3 = d - d2;
                double d4 = (d3 / j3) + d2;
                this.mean = d4;
                this.m2 = (d3 * (d - d4)) + this.m2;
                this.lastTime = asLong;
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public AtomicOnlineInterarrivalTimer() {
        this(new AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0(0));
    }
}
