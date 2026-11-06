package com.amazon.alexa.client.metrics.core;

import android.os.SystemClock;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultMetricsTimer extends DefaultAlexaMetricsEvent implements MetricsTimer {
    private long elapsedTime;
    private long finishedTime;
    private boolean isRunning;
    private final Object isRunningMutex;
    private long lastStartTime;
    private long startingTime;

    public DefaultMetricsTimer(String str, String str2, String str3, Map<String, Object> map, long j, boolean z) {
        super(str, str2, str3, map);
        this.isRunningMutex = new Object();
        init(z);
        this.elapsedTime = j;
    }

    private void finishTimerInternal(Long l) {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long longValue = l.longValue();
                    this.finishedTime = longValue;
                    this.elapsedTime = (longValue - this.lastStartTime) + this.elapsedTime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void init(boolean z) {
        this.isRunning = z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.lastStartTime = elapsedRealtime;
        this.startingTime = elapsedRealtime;
        this.elapsedTime = 0L;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsTimer
    public void finishTimer() {
        finishTimerInternal(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsTimer
    public long getElapsedTime() {
        return this.elapsedTime;
    }

    public long getStartingTime() {
        return this.startingTime;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsTimer
    public void pauseTimer() {
        finishTimerInternal(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsTimer
    public void resumeTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (!this.isRunning) {
                    this.isRunning = true;
                    this.lastStartTime = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setStartingTime(long j) {
        this.startingTime = j;
    }

    @Override // com.amazon.alexa.client.metrics.core.MetricsTimer
    public void finishTimer(Long l) {
        finishTimerInternal(l);
    }

    public DefaultMetricsTimer(String str, String str2, Map<String, Object> map, long j, boolean z) {
        this(str, str2, null, map, j, z);
    }

    public DefaultMetricsTimer(String str, String str2, Map<String, Object> map) {
        super(str, str2, map);
        this.isRunningMutex = new Object();
        init(true);
    }
}
