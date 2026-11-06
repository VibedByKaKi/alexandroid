package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.benefits.models.service.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ServiceModule_ProvideSchedulerFactory implements Factory<SchedulerProvider> {
    private final ServiceModule module;

    public ServiceModule_ProvideSchedulerFactory(ServiceModule serviceModule) {
        this.module = serviceModule;
    }

    public static ServiceModule_ProvideSchedulerFactory create(ServiceModule serviceModule) {
        return new ServiceModule_ProvideSchedulerFactory(serviceModule);
    }

    public static SchedulerProvider provideScheduler(ServiceModule serviceModule) {
        return (SchedulerProvider) Preconditions.checkNotNull(serviceModule.provideScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SchedulerProvider get() {
        return provideScheduler(this.module);
    }
}
