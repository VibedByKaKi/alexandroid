package com.amazon.commscore.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.commscore.api.metrics.TimerMetric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DefaultTimerMetric extends TimerMetric {
    private final MobilyticsMetricsTimer mTimer;

    public DefaultTimerMetric(String str, String str2, String str3, String str4) {
        super(str, str2, str3);
        this.mTimer = new DefaultMobilyticsMetricsTimer(str, str2, str3, 0L, true, str4);
    }

    @Override // com.amazon.commscore.api.metrics.TimerMetric
    public void finishTimer(long j) {
        this.mTimer.finishTimer(Long.valueOf(j));
    }

    @Override // com.amazon.commscore.api.metrics.TimerMetric
    public long getElapsedTime() {
        return this.mTimer.getElapsedTime();
    }

    @Override // com.amazon.commscore.api.metrics.TimerMetric
    public void pauseTimer() {
        this.mTimer.pauseTimer();
    }

    @Override // com.amazon.commscore.api.metrics.TimerMetric
    public void resumeTimer() {
        this.mTimer.resumeTimer();
    }

    @Override // com.amazon.commscore.api.metrics.TimerMetric
    public void finishTimer() {
        this.mTimer.finishTimer();
    }

    public DefaultTimerMetric(String str, String str2, String str3, long j, boolean z, String str4) {
        super(str, str2, str3);
        this.mTimer = new DefaultMobilyticsMetricsTimer(str, str2, str3, j, z, str4);
    }

    @VisibleForTesting
    public DefaultTimerMetric(@NonNull MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        super(mobilyticsMetricsTimer.getEventName(), mobilyticsMetricsTimer.getComponent(), mobilyticsMetricsTimer.getSubComponent());
        this.mTimer = mobilyticsMetricsTimer;
    }

    @VisibleForTesting
    public DefaultTimerMetric(@NonNull MobilyticsMetricsTimer mobilyticsMetricsTimer, String str) {
        super(mobilyticsMetricsTimer.getEventName(), mobilyticsMetricsTimer.getComponent(), mobilyticsMetricsTimer.getSubComponent(), str);
        this.mTimer = mobilyticsMetricsTimer;
    }
}
