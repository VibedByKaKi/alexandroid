package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.configservice.api.ConfigService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ExternalModule_ProvidesConfigServiceFactory implements Factory<ConfigService> {
    private final ExternalModule module;

    public ExternalModule_ProvidesConfigServiceFactory(ExternalModule externalModule) {
        this.module = externalModule;
    }

    public static ExternalModule_ProvidesConfigServiceFactory create(ExternalModule externalModule) {
        return new ExternalModule_ProvidesConfigServiceFactory(externalModule);
    }

    public static ConfigService providesConfigService(ExternalModule externalModule) {
        return (ConfigService) Preconditions.checkNotNullFromProvides(externalModule.providesConfigService());
    }

    @Override // javax.inject.Provider
    public ConfigService get() {
        return providesConfigService(this.module);
    }
}
