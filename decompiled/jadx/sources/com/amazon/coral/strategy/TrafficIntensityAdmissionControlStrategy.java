package com.amazon.coral.strategy;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TrafficIntensityAdmissionControlStrategy implements AdmissionControlStrategy {
    private static final double MAX_INTENSITY = 1.0d;
    private static final double MIN_INTENSITY = 0.5d;
    private final double trafficIntensityThreshold;

    public TrafficIntensityAdmissionControlStrategy(double d) {
        if (d < 0.5d || d > 1.0d) {
            Single$$ExternalSyntheticBUOutline0.m$3("Traffic intensity threshold must be between 0.5 and 1.0 inclusively");
            throw null;
        }
        this.trafficIntensityThreshold = d;
    }

    public double getTrafficIntensityThreshold() {
        return this.trafficIntensityThreshold;
    }
}
