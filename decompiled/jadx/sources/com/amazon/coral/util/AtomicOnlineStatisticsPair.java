package com.amazon.coral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AtomicOnlineStatisticsPair extends AtomicOnlineMetricPair {
    public AtomicOnlineStatisticsPair(int i) {
        super(new AtomicOnlineStatistics(), new AtomicOnlineStatistics(), i);
    }

    public void addSample(double d) {
        this.lock.readLock().lock();
        try {
            this.newSamplesSeen.set(true);
            ((AtomicOnlineStatistics) this.oldMetric).addSample(d);
            ((AtomicOnlineStatistics) this.newMetric).addSample(d);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetricPair
    public SummaryStatistics getAndRotate() {
        SummaryStatistics summaryStatistics;
        this.lock.writeLock().lock();
        try {
            this.newSamplesSeen.set(false);
            if (this.newMetric.getSampleSize() > this.minSamples) {
                summaryStatistics = this.newMetric.get();
                this.oldMetric = this.newMetric;
                this.newMetric = new AtomicOnlineStatistics();
            } else {
                summaryStatistics = this.oldMetric.get();
            }
            this.lock.writeLock().unlock();
            return summaryStatistics;
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetricPair
    public /* bridge */ /* synthetic */ boolean getNewSamplesSeen() {
        return super.getNewSamplesSeen();
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetricPair
    public /* bridge */ /* synthetic */ long getSampleSize() {
        return super.getSampleSize();
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetricPair
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }
}
