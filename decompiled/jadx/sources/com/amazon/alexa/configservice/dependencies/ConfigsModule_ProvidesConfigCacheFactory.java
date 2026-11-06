package com.amazon.alexa.configservice.dependencies;

import com.amazon.alexa.configservice.cache.ConfigCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ConfigsModule_ProvidesConfigCacheFactory implements Factory<ConfigCache> {
    private final ConfigsModule module;

    public ConfigsModule_ProvidesConfigCacheFactory(ConfigsModule configsModule) {
        this.module = configsModule;
    }

    public static ConfigsModule_ProvidesConfigCacheFactory create(ConfigsModule configsModule) {
        return new ConfigsModule_ProvidesConfigCacheFactory(configsModule);
    }

    public static ConfigCache providesConfigCache(ConfigsModule configsModule) {
        return (ConfigCache) Preconditions.checkNotNull(configsModule.providesConfigCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ConfigCache get() {
        return providesConfigCache(this.module);
    }
}
