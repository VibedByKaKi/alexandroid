package com.amazon.alexa.featurefeedbackservice.dependencies;

import com.amazon.alexa.configservice.api.ConfigService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImplementationModule_ProvidesConfigServiceFactory implements Factory<ConfigService> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesConfigServiceFactory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesConfigServiceFactory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesConfigServiceFactory(implementationModule);
    }

    public static ConfigService providesConfigService(ImplementationModule implementationModule) {
        return (ConfigService) Preconditions.checkNotNull(implementationModule.providesConfigService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ConfigService get() {
        return providesConfigService(this.module);
    }
}
