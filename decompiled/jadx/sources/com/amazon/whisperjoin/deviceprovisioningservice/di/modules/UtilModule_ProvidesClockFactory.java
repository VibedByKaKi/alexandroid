package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.util.Clock;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UtilModule_ProvidesClockFactory implements Factory<Clock> {
    private final UtilModule module;

    public UtilModule_ProvidesClockFactory(UtilModule utilModule) {
        this.module = utilModule;
    }

    public static UtilModule_ProvidesClockFactory create(UtilModule utilModule) {
        return new UtilModule_ProvidesClockFactory(utilModule);
    }

    public static Clock providesClock(UtilModule utilModule) {
        return (Clock) Preconditions.checkNotNull(utilModule.providesClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return providesClock(this.module);
    }
}
