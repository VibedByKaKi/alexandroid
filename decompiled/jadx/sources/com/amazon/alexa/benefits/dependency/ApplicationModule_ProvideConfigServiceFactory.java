package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.configservice.api.ConfigService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideConfigServiceFactory implements Factory<ConfigService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideConfigServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideConfigServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideConfigServiceFactory(applicationModule);
    }

    public static ConfigService provideConfigService(ApplicationModule applicationModule) {
        return (ConfigService) Preconditions.checkNotNull(applicationModule.provideConfigService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ConfigService get() {
        return provideConfigService(this.module);
    }
}
