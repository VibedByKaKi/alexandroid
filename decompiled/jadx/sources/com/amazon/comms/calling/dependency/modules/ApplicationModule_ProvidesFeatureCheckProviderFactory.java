package com.amazon.comms.calling.dependency.modules;

import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.comms.calling.foundation.features.providers.FeatureCheckProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesFeatureCheckProviderFactory implements Factory<FeatureCheckProvider> {
    private final Provider<ComponentRegistry> componentRegistryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFeatureCheckProviderFactory(ApplicationModule applicationModule, Provider<ComponentRegistry> provider) {
        this.module = applicationModule;
        this.componentRegistryProvider = provider;
    }

    public static ApplicationModule_ProvidesFeatureCheckProviderFactory create(ApplicationModule applicationModule, Provider<ComponentRegistry> provider) {
        return new ApplicationModule_ProvidesFeatureCheckProviderFactory(applicationModule, provider);
    }

    public static FeatureCheckProvider providesFeatureCheckProvider(ApplicationModule applicationModule, ComponentRegistry componentRegistry) {
        return (FeatureCheckProvider) Preconditions.checkNotNullFromProvides(applicationModule.providesFeatureCheckProvider(componentRegistry));
    }

    @Override // javax.inject.Provider
    public FeatureCheckProvider get() {
        return providesFeatureCheckProvider(this.module, this.componentRegistryProvider.get());
    }
}
