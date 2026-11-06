package com.amazon.alexa.mobilytics.event.operational;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultMobilyticsMetricsTimer extends DefaultMobilyticsOperationalEvent implements MobilyticsMetricsTimer {
    private transient long elapsedTime;
    private transient long finishedTime;
    protected transient boolean isRunning;
    private transient long lastStartTime;
    private transient ReentrantReadWriteLock lock;
    private transient ReentrantReadWriteLock.ReadLock readLock;
    private transient ReentrantReadWriteLock.WriteLock writeLock;

    public DefaultMobilyticsMetricsTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, long j, boolean z, String str4) {
        super(str, "timer", str2, str3, str4);
        init(z);
        this.elapsedTime = j;
        withEventNumericValue(Long.valueOf(j));
    }

    private void init(boolean z) {
        initLocks();
        this.isRunning = z;
        this.lastStartTime = this.eventTimestamp;
        this.elapsedTime = 0L;
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer
    public void finishTimer() {
        this.writeLock.lock();
        try {
            if (this.isRunning) {
                this.isRunning = false;
                long currentTimeMillis = System.currentTimeMillis();
                this.finishedTime = currentTimeMillis;
                this.elapsedTime = (currentTimeMillis - this.lastStartTime) + this.elapsedTime;
            }
            withEventNumericValue(Long.valueOf(this.elapsedTime));
            this.writeLock.unlock();
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer
    public long getElapsedTime() {
        this.readLock.lock();
        try {
            long j = this.elapsedTime;
            withEventNumericValue(Long.valueOf(j));
            return j;
        } finally {
            this.readLock.unlock();
        }
    }

    public void initLocks() {
        if (this.readLock == null || this.writeLock == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.lock = reentrantReadWriteLock;
            this.readLock = reentrantReadWriteLock.readLock();
            this.writeLock = this.lock.writeLock();
        }
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer
    public void pauseTimer() {
        this.writeLock.lock();
        try {
            if (this.isRunning) {
                this.isRunning = false;
                long currentTimeMillis = System.currentTimeMillis();
                this.finishedTime = currentTimeMillis;
                this.elapsedTime = (currentTimeMillis - this.lastStartTime) + this.elapsedTime;
            }
            withEventNumericValue(Long.valueOf(this.elapsedTime));
            this.writeLock.unlock();
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer
    public void resumeTimer() {
        this.writeLock.lock();
        try {
            if (!this.isRunning) {
                this.isRunning = true;
                this.lastStartTime = System.currentTimeMillis();
            }
        } finally {
            this.writeLock.unlock();
        }
    }

    public DefaultMobilyticsMetricsTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, String str4) {
        super(str, "timer", str2, str3, str4);
        init(true);
    }

    public DefaultMobilyticsMetricsTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, long j, boolean z) {
        super(str, "timer", str2, str3);
        init(z);
        this.elapsedTime = j;
        withEventNumericValue(Long.valueOf(j));
    }

    public DefaultMobilyticsMetricsTimer(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        super(str, "timer", str2, str3);
        init(true);
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer
    public void finishTimer(Long l) {
        this.writeLock.lock();
        try {
            if (this.isRunning) {
                this.isRunning = false;
                long longValue = l.longValue();
                this.finishedTime = longValue;
                this.elapsedTime = (longValue - this.lastStartTime) + this.elapsedTime;
            }
            withEventNumericValue(Long.valueOf(this.elapsedTime));
            this.writeLock.unlock();
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }
}
