package com.amazon.commscore.commsidentity.common;

import android.os.SystemClock;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TimeUtil {
    @Inject
    public TimeUtil() {
    }

    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long getElapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }
}
