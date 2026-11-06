package com.amazon.alexa.featurefeedbackservice.dependencies;

import com.amazon.alexa.featurefeedbackservice.cache.ConfigCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImplementationModule_ProvidesConfigCacheFactory implements Factory<ConfigCache> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesConfigCacheFactory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesConfigCacheFactory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesConfigCacheFactory(implementationModule);
    }

    public static ConfigCache providesConfigCache(ImplementationModule implementationModule) {
        return (ConfigCache) Preconditions.checkNotNull(implementationModule.providesConfigCache(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ConfigCache get() {
        return providesConfigCache(this.module);
    }
}
