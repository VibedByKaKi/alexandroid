package com.amazon.deecomms.api.metrics;

import androidx.annotation.NonNull;
import com.amazon.deecomms.api.metrics.CommsMetric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TimerMetric extends CommsMetric {
    private long endTime;
    private long startTime;
    private boolean timerActive;

    public TimerMetric(CommsMetric.MetricType metricType, String str, String str2) {
        super(metricType, str, str2);
    }

    @NonNull
    public static TimerMetric generateClickstream(String str) {
        return new TimerMetric(CommsMetric.MetricType.ClickStream, str);
    }

    @NonNull
    public static TimerMetric generateOperational(String str) {
        return new TimerMetric(CommsMetric.MetricType.Operational, str);
    }

    @Override // com.amazon.deecomms.api.metrics.CommsMetric
    public void addAttributesForToString(StringBuilder sb) {
        sb.append("timeDelta=");
        sb.append(getTimeDelta());
    }

    @Override // com.amazon.deecomms.api.metrics.CommsMetric
    public String formatMetric() {
        return format(String.valueOf(getTimeDelta()));
    }

    public long getTimeDelta() {
        return this.endTime - this.startTime;
    }

    public final void setTimeDelta(long j) {
        this.startTime = 0L;
        this.endTime = j;
        this.timerActive = false;
    }

    public void startTimer() {
        this.startTime = System.currentTimeMillis();
        this.timerActive = true;
    }

    public void stopTimer() {
        if (this.timerActive) {
            this.endTime = System.currentTimeMillis();
        }
        this.timerActive = false;
    }

    public TimerMetric(CommsMetric.MetricType metricType, String str) {
        super(metricType, str);
    }
}
