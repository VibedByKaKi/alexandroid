package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.protocols.environment.EnvironmentService;
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
public final class ExternalModule_ProvidesEnvironmentServiceFactory implements Factory<EnvironmentService> {
    private final ExternalModule module;

    public ExternalModule_ProvidesEnvironmentServiceFactory(ExternalModule externalModule) {
        this.module = externalModule;
    }

    public static ExternalModule_ProvidesEnvironmentServiceFactory create(ExternalModule externalModule) {
        return new ExternalModule_ProvidesEnvironmentServiceFactory(externalModule);
    }

    public static EnvironmentService providesEnvironmentService(ExternalModule externalModule) {
        return (EnvironmentService) Preconditions.checkNotNullFromProvides(externalModule.providesEnvironmentService());
    }

    @Override // javax.inject.Provider
    public EnvironmentService get() {
        return providesEnvironmentService(this.module);
    }
}
