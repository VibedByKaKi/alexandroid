package com.amazon.alexa.alertsca.dependencies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesClockFactory implements Factory<Clock> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesClockFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesClockFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesClockFactory(applicationModule);
    }

    public static Clock providesClock(ApplicationModule applicationModule) {
        return (Clock) Preconditions.checkNotNullFromProvides(applicationModule.providesClock());
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return providesClock(this.module);
    }
}
