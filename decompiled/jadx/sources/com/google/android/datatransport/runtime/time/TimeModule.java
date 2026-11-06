package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes7.dex */
public abstract class TimeModule {
    @Provides
    @WallTime
    public static Clock eventClock() {
        return new WallTimeClock();
    }

    @Provides
    @Monotonic
    public static Clock uptimeClock() {
        return new UptimeClock();
    }
}
