package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import com.amazon.whisperjoin.devicesetupserviceandroidclient.util.Clock;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ClockModule_ProvidesClockFactory implements Factory<Clock> {
    private final ClockModule module;

    public ClockModule_ProvidesClockFactory(ClockModule clockModule) {
        this.module = clockModule;
    }

    public static ClockModule_ProvidesClockFactory create(ClockModule clockModule) {
        return new ClockModule_ProvidesClockFactory(clockModule);
    }

    public static Clock providesClock(ClockModule clockModule) {
        return (Clock) Preconditions.checkNotNull(clockModule.providesClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return providesClock(this.module);
    }
}
