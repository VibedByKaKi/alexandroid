package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ThresholdCircuitBreaker extends AbstractCircuitBreaker<Long> {
    private static final long INITIAL_COUNT = 0;
    private final long threshold;
    private final AtomicLong used = new AtomicLong(0);

    public ThresholdCircuitBreaker(long j) {
        this.threshold = j;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() {
        return !isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
        super.close();
        this.used.set(0L);
    }

    public long getThreshold() {
        return this.threshold;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean incrementAndCheckState(Long l) {
        if (this.threshold == 0) {
            open();
        }
        if (this.used.addAndGet(l.longValue()) > this.threshold) {
            open();
        }
        return checkState();
    }
}
