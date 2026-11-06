package com.amazon.dee.app.framework.startup.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DeferredTimerMetric extends DeferredCounterMetric {
    private long endTime;
    private long startTime;

    public DeferredTimerMetric(String str, String str2, long j, long j2) {
        super(str, str2);
        this.startTime = j;
        this.endTime = j2;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }
}
