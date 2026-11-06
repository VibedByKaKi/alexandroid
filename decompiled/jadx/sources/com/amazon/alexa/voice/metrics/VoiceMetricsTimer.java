package com.amazon.alexa.voice.metrics;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.metrics.service.MetricsTimer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoiceMetricsTimer extends VoiceMetricsEvent implements MetricsTimer {
    private long elapsedTime;
    private long finishedTime;
    private boolean isRunning;
    private final Object isRunningMutex;
    private long lastStartTime;

    public VoiceMetricsTimer(String str, String str2, Map<String, Object> map, long j, boolean z) {
        super(str, str2, map);
        this.isRunningMutex = new Object();
        init(z);
        this.elapsedTime = j;
    }

    private void init(boolean z) {
        this.isRunning = z;
        this.lastStartTime = SystemClock.elapsedRealtime();
        this.elapsedTime = 0L;
    }

    @Override // com.amazon.alexa.voice.metrics.service.MetricsTimer
    public void finishTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.finishedTime = elapsedRealtime;
                    this.elapsedTime = (elapsedRealtime - this.lastStartTime) + this.elapsedTime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.voice.metrics.service.MetricsTimer
    public long getElapsedTime() {
        return this.elapsedTime;
    }

    @VisibleForTesting
    public boolean isFinished() {
        boolean z;
        synchronized (this.isRunningMutex) {
            z = !this.isRunning;
        }
        return z;
    }

    @Override // com.amazon.alexa.voice.metrics.service.MetricsTimer
    public void pauseTimer() {
        synchronized (this.isRunningMutex) {
            try {
                if (this.isRunning) {
                    this.isRunning = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.finishedTime = elapsedRealtime;
                    this.elapsedTime = (elapsedRealtime - this.lastStartTime) + this.elapsedTime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.voice.metrics.service.MetricsTimer
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

    public VoiceMetricsTimer(String str, String str2, Map<String, Object> map) {
        super(str, str2, map);
        this.isRunningMutex = new Object();
        init(true);
    }

    @Override // com.amazon.alexa.voice.metrics.service.MetricsTimer
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
}
