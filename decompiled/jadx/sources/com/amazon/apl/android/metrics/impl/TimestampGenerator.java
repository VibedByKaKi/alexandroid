package com.amazon.apl.android.metrics.impl;

import android.os.SystemClock;
import com.amazon.apl.android.metrics.ITimestampGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TimestampGenerator implements ITimestampGenerator {
    @Override // com.amazon.apl.android.metrics.ITimestampGenerator
    public long generateTimeStamp() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
