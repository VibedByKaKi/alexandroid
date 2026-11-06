package com.amazon.dee.app.time;

import com.amazon.dee.app.dependencies.ApplicationScope;
import dagger.Module;
import dagger.Provides;
import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class ClockModule {
    @Provides
    @ApplicationScope
    public Clock provideClock() {
        return Clock.systemUTC();
    }
}
