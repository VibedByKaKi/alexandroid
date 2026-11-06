package com.amazon.alexa.benefits.dependency;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideClockFactory implements Factory<Clock> {
    private final ServiceModule module;

    public ServiceModule_ProvideClockFactory(ServiceModule serviceModule) {
        this.module = serviceModule;
    }

    public static ServiceModule_ProvideClockFactory create(ServiceModule serviceModule) {
        return new ServiceModule_ProvideClockFactory(serviceModule);
    }

    public static Clock provideClock(ServiceModule serviceModule) {
        return (Clock) Preconditions.checkNotNull(serviceModule.provideClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return provideClock(this.module);
    }
}
