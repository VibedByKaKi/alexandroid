package com.amazon.coral.util;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AtomicOnlineStatistics implements AtomicOnlineMetric {
    private final AtomicReference<State> state = new AtomicReference<>(new State(0, 0.0d, 0.0d));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State {
        private final double m2;
        private final double mean;
        private final long sampleCount;

        private State(long j, double d, double d2) {
            this.sampleCount = j;
            this.mean = d;
            this.m2 = d2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && State.class == obj.getClass()) {
                State state = (State) obj;
                if (this.sampleCount == state.sampleCount && Double.compare(state.mean, this.mean) == 0 && Double.compare(state.m2, this.m2) == 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.sampleCount), Double.valueOf(this.mean), Double.valueOf(this.m2));
        }

        public SummaryStatistics toSummary() {
            long j = this.sampleCount;
            double d = this.mean;
            if (j < 2) {
                return new SummaryStatistics(d, Double.NaN, Double.NaN, j);
            }
            double d2 = this.m2;
            return new SummaryStatistics(d, d2 / j, d2 / (j - 1), j);
        }

        public State update(double d) {
            long j = this.sampleCount + 1;
            double d2 = this.mean;
            double d3 = d - d2;
            double d4 = (d3 / j) + d2;
            return new State(j, d4, (d3 * (d - d4)) + this.m2);
        }
    }

    public void addSample(double d) {
        while (true) {
            State state = this.state.get();
            AtomicReference<State> atomicReference = this.state;
            State update = state.update(d);
            while (!atomicReference.compareAndSet(state, update)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
            return;
        }
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public SummaryStatistics get() {
        return this.state.get().toSummary();
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public SummaryStatistics getAndReset() {
        return this.state.getAndSet(new State(0L, 0.0d, 0.0d)).toSummary();
    }

    @Override // com.amazon.coral.util.AtomicOnlineMetric
    public long getSampleSize() {
        return this.state.get().sampleCount;
    }
}
