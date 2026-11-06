package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class AwakeTimeSinceBootClock implements MonotonicNanoClock {

    @DoNotStrip
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @DoNotStrip
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.MonotonicClock
    @DoNotStrip
    public long nowNanos() {
        return System.nanoTime();
    }
}
