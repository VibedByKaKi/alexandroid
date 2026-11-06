package com.amazon.deecomms.util;

import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TimeoutHelper {
    private long startedAt;
    private long timeoutDuration;

    public synchronized boolean hasTimedOut() {
        return SystemClock.elapsedRealtime() - this.startedAt > this.timeoutDuration;
    }

    public synchronized void startTimeOut(long j) {
        this.startedAt = SystemClock.elapsedRealtime();
        this.timeoutDuration = j;
    }
}
