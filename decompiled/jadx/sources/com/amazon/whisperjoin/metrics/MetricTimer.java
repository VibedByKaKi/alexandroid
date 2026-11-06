package com.amazon.whisperjoin.metrics;

import android.os.SystemClock;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricTimer {
    private static final String TAG = "MetricTimer";
    private long mStartTime = -1;

    public void start() {
        if (this.mStartTime != -1) {
            WJLog.d(TAG, " recorder start called again before terminal event");
        }
        this.mStartTime = SystemClock.elapsedRealtime();
    }

    public long stop() {
        long j = this.mStartTime;
        if (j == -1) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.mStartTime;
        this.mStartTime = -1L;
        return elapsedRealtime;
    }
}
