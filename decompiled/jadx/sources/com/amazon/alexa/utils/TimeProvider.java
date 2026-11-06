package com.amazon.alexa.utils;

import android.os.SystemClock;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TimeProvider {
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealTime() {
        return SystemClock.elapsedRealtime();
    }

    public Date getCurrentTimestamp() {
        return new Date();
    }

    public long toEpochTime(long j) {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + j;
    }
}
