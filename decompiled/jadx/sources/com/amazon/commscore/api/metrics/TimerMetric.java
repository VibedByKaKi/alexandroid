package com.amazon.commscore.api.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class TimerMetric extends OperationalMetric {
    public TimerMetric(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4, OperationalMetricType.TIMER);
    }

    public abstract void finishTimer();

    public abstract void finishTimer(long j);

    public abstract long getElapsedTime();

    public abstract void pauseTimer();

    public abstract void resumeTimer();

    public TimerMetric(String str, String str2, String str3) {
        super(str, str2, str3, OperationalMetricType.TIMER);
    }
}
