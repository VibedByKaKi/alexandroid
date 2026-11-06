package com.amazon.comms.metrics;

import com.amazon.comms.instrumentation.Clocks;
import com.amazon.comms.instrumentation.ClocksImpl;
import com.amazon.comms.log.CommsLogger;
import com.google.common.primitives.Doubles;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AggregatingTimer {
    private static final CommsLogger mLog = CommsLogger.getLogger(AggregatingTimer.class);
    private static final TimeUnit TIMEUNIT = TimeUnit.MILLISECONDS;
    private long mLastUpdatedTime = 0;
    private final Clocks clocks = new ClocksImpl();
    private int mRunningCount = 0;
    private int mTotalSamplesCount = 0;
    private double mTotalElapsedTime = 0.0d;

    public synchronized void addTime(double d, int i) {
        if (!Doubles.isFinite(d)) {
            mLog.e(String.format(Locale.US, "AddTime: Invalid value %f.  Cannot be NaN or infinite.", Double.valueOf(d)));
        } else {
            this.mTotalElapsedTime += d;
            this.mTotalSamplesCount += i;
        }
    }

    public long getElapsedRealTime() {
        return this.clocks.getElapsedRealtime();
    }

    public int getRunningCount() {
        return this.mRunningCount;
    }

    public TimeUnit getTimeUnit() {
        return TIMEUNIT;
    }

    public double getTotalElapsedTime() {
        return this.mTotalElapsedTime;
    }

    public int getTotalSamplesCount() {
        return this.mTotalSamplesCount;
    }

    public synchronized void startTimer() {
        try {
            long elapsedRealTime = getElapsedRealTime();
            int i = this.mRunningCount;
            if (i > 0) {
                this.mTotalElapsedTime += (elapsedRealTime - this.mLastUpdatedTime) * i;
            }
            this.mLastUpdatedTime = elapsedRealTime;
            this.mRunningCount = i + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stopTimer() {
        long elapsedRealTime = getElapsedRealTime();
        int i = this.mRunningCount;
        if (i > 0) {
            this.mTotalElapsedTime += (elapsedRealTime - this.mLastUpdatedTime) * i;
            this.mRunningCount = i - 1;
            this.mLastUpdatedTime = elapsedRealTime;
            this.mTotalSamplesCount++;
        }
    }
}
