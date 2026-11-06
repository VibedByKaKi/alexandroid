package com.amazon.comms.instrumentation;

import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ClocksImpl implements Clocks {
    @Override // com.amazon.comms.instrumentation.Clocks
    public long calculateRelativeTimestamp(long j) {
        return j - (getCurrentTimeMillis() - getElapsedRealtime());
    }

    @Override // com.amazon.comms.instrumentation.Clocks
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.amazon.comms.instrumentation.Clocks
    public long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
