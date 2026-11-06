package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.routing.api.RoutingService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideRoutingServiceFactory implements Factory<RoutingService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideRoutingServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideRoutingServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRoutingServiceFactory(applicationModule);
    }

    public static RoutingService provideRoutingService(ApplicationModule applicationModule) {
        return (RoutingService) Preconditions.checkNotNull(applicationModule.provideRoutingService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public RoutingService get() {
        return provideRoutingService(this.module);
    }
}
