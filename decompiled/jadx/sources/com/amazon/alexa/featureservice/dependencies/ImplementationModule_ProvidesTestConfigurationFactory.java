package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.configuration.FeatureServiceConfiguration;
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
public final class ImplementationModule_ProvidesTestConfigurationFactory implements Factory<FeatureServiceConfiguration> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesTestConfigurationFactory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesTestConfigurationFactory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesTestConfigurationFactory(implementationModule);
    }

    public static FeatureServiceConfiguration providesTestConfiguration(ImplementationModule implementationModule) {
        return (FeatureServiceConfiguration) Preconditions.checkNotNullFromProvides(implementationModule.providesTestConfiguration());
    }

    @Override // javax.inject.Provider
    public FeatureServiceConfiguration get() {
        return providesTestConfiguration(this.module);
    }
}
