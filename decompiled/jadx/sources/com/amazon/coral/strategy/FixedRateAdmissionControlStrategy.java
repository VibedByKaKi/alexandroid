package com.amazon.coral.strategy;

import java.time.Duration;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class FixedRateAdmissionControlStrategy implements AdmissionControlStrategy {
    private final Duration burstInterval;
    private final Double burstScaleFactor;
    private final double maxTransactionsPerSecond;

    public FixedRateAdmissionControlStrategy(double d, Duration duration, Double d2) {
        if (d <= 0.0d) {
            Single$$ExternalSyntheticBUOutline0.m$3("maxTransactionsPerSecond must be greater than zero");
            throw null;
        }
        if (duration != null && duration.toMillis() <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("burstInterval, if set, must be at least 1ms");
            throw null;
        }
        if (d2 != null && d2.doubleValue() <= 0.0d) {
            Single$$ExternalSyntheticBUOutline0.m$3("burstScaleFactor, if set, must be positive");
            throw null;
        }
        this.burstInterval = duration;
        this.burstScaleFactor = d2;
        this.maxTransactionsPerSecond = d;
    }

    public Duration getBurstInterval() {
        return this.burstInterval;
    }

    public Double getBurstScaleFactor() {
        return this.burstScaleFactor;
    }

    public double getMaxTransactionsPerSecond() {
        return this.maxTransactionsPerSecond;
    }

    public FixedRateAdmissionControlStrategy(double d) {
        this(d, null, null);
    }
}
