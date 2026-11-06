package com.amazon.alexa.accessory.metrics;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Stopwatch {
    private final CurrentTimeSupplier currentTimeSupplier;
    private volatile boolean isRunning;
    private volatile long lastStartedTime;
    private volatile long previousLapTimes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CurrentTimeSupplier {
        long getCurrentTimeMillis();
    }

    public Stopwatch(CurrentTimeSupplier currentTimeSupplier) {
        Preconditions.notNull(currentTimeSupplier, "currentTimeSupplier");
        this.currentTimeSupplier = currentTimeSupplier;
    }

    private synchronized long getTimeSinceLastStart() {
        if (!this.isRunning) {
            return 0L;
        }
        return this.currentTimeSupplier.getCurrentTimeMillis() - this.lastStartedTime;
    }

    public synchronized long getElapsedTimeMillis() {
        return this.previousLapTimes + getTimeSinceLastStart();
    }

    public synchronized void startOrResume() {
        if (this.isRunning) {
            return;
        }
        this.lastStartedTime = this.currentTimeSupplier.getCurrentTimeMillis();
        this.isRunning = true;
    }

    public synchronized void stop() {
        if (this.isRunning) {
            this.previousLapTimes += getTimeSinceLastStart();
            this.isRunning = false;
        }
    }

    public synchronized void stopAndReset() {
        try {
            if (this.isRunning) {
                this.isRunning = false;
            }
            this.previousLapTimes = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
