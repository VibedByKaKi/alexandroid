package com.amazon.alexa.configservice.dependencies;

import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ConfigsModule_ProvidesApplicationLifecycleServiceFactory implements Factory<ApplicationLifecycleService> {
    private final ConfigsModule module;

    public ConfigsModule_ProvidesApplicationLifecycleServiceFactory(ConfigsModule configsModule) {
        this.module = configsModule;
    }

    public static ConfigsModule_ProvidesApplicationLifecycleServiceFactory create(ConfigsModule configsModule) {
        return new ConfigsModule_ProvidesApplicationLifecycleServiceFactory(configsModule);
    }

    public static ApplicationLifecycleService providesApplicationLifecycleService(ConfigsModule configsModule) {
        return (ApplicationLifecycleService) Preconditions.checkNotNull(configsModule.providesApplicationLifecycleService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ApplicationLifecycleService get() {
        return providesApplicationLifecycleService(this.module);
    }
}
