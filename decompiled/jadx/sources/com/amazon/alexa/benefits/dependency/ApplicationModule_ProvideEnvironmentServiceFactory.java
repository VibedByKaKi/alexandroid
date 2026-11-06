package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideEnvironmentServiceFactory implements Factory<EnvironmentService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideEnvironmentServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideEnvironmentServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideEnvironmentServiceFactory(applicationModule);
    }

    public static EnvironmentService provideEnvironmentService(ApplicationModule applicationModule) {
        return (EnvironmentService) Preconditions.checkNotNull(applicationModule.provideEnvironmentService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public EnvironmentService get() {
        return provideEnvironmentService(this.module);
    }
}
