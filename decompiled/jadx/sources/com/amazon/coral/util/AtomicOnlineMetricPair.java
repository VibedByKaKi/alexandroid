package com.amazon.coral.util;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
abstract class AtomicOnlineMetricPair {
    private static final int DEFAULT_MIN_SAMPLES = 100;
    protected final ReentrantReadWriteLock lock;
    protected final int minSamples;
    protected AtomicOnlineMetric newMetric;
    protected final AtomicBoolean newSamplesSeen;
    protected AtomicOnlineMetric oldMetric;

    public AtomicOnlineMetricPair(AtomicOnlineMetric atomicOnlineMetric, AtomicOnlineMetric atomicOnlineMetric2, int i) {
        this.lock = new ReentrantReadWriteLock();
        this.newMetric = atomicOnlineMetric;
        this.oldMetric = atomicOnlineMetric2;
        this.minSamples = i;
        this.newSamplesSeen = new AtomicBoolean(false);
    }

    public abstract SummaryStatistics getAndRotate();

    public boolean getNewSamplesSeen() {
        return this.newSamplesSeen.get();
    }

    public long getSampleSize() {
        this.lock.readLock().lock();
        try {
            long sampleSize = this.newMetric.getSampleSize();
            if (sampleSize < this.minSamples) {
                sampleSize = this.oldMetric.getSampleSize();
            }
            return sampleSize;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void reset() {
        this.lock.writeLock().lock();
        try {
            this.newMetric.getAndReset();
            this.oldMetric.getAndReset();
            this.newSamplesSeen.set(false);
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public AtomicOnlineMetricPair(AtomicOnlineMetric atomicOnlineMetric, AtomicOnlineMetric atomicOnlineMetric2) {
        this(atomicOnlineMetric, atomicOnlineMetric2, 100);
    }
}
