package com.amazon.deecomms.services.metrics;

import com.dee.app.metrics.MetricsTimer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultMetricsTimer extends DefaultAlexaMetricsEvent implements MetricsTimer {
    private long elapsedTime;
    private long finishedTime;
    private boolean isRunning;
    private final Object isRunningMutex;
    private long lastStartTime;
    private final long startingTime;

    public DefaultMetricsTimer(String str, String str2, Map<String, Object> map, long j, boolean z) {
        super(str, str2, map);
        this.isRunningMutex = new Object();
        this.isRunning = z;
        long eventDate = getEventDate();
        this.lastStartTime = eventDate;
        this.startingTime = eventDate;
        this.elapsedTime = j;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer(Long l) {
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

    @Override // com.dee.app.metrics.MetricsTimer
    public long getElapsedTime() {
        long j;
        synchronized (this.isRunningMutex) {
            try {
                boolean z = this.isRunning;
                j = this.elapsedTime;
                if (z) {
                    j = (j + System.currentTimeMillis()) - this.lastStartTime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void pauseTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.finishedTime = currentTimeMillis;
                    this.elapsedTime = (currentTimeMillis - this.lastStartTime) + this.elapsedTime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void resumeTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (!this.isRunning) {
                    this.isRunning = true;
                    this.lastStartTime = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DefaultMetricsTimer(String str, String str2, Map<String, Object> map) {
        this(str, str2, map, 0L, true);
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    finishTimer(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
