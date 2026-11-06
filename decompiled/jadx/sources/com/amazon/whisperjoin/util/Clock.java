package com.amazon.whisperjoin.util;

import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class Clock {
    public long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
