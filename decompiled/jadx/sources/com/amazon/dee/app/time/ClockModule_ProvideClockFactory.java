package com.amazon.dee.app.time;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ClockModule_ProvideClockFactory implements Factory<Clock> {
    private final ClockModule module;

    public ClockModule_ProvideClockFactory(ClockModule clockModule) {
        this.module = clockModule;
    }

    public static ClockModule_ProvideClockFactory create(ClockModule clockModule) {
        return new ClockModule_ProvideClockFactory(clockModule);
    }

    public static Clock provideClock(ClockModule clockModule) {
        return (Clock) Preconditions.checkNotNullFromProvides(clockModule.provideClock());
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return provideClock(this.module);
    }
}
