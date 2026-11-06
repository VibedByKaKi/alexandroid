package com.amazon.alexa.featureservice.dependencies;

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
public final class BaseModule_ProvidesEnvironmentServiceFactory implements Factory<EnvironmentService> {
    private final BaseModule module;

    public BaseModule_ProvidesEnvironmentServiceFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesEnvironmentServiceFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesEnvironmentServiceFactory(baseModule);
    }

    public static EnvironmentService providesEnvironmentService(BaseModule baseModule) {
        return (EnvironmentService) Preconditions.checkNotNullFromProvides(baseModule.providesEnvironmentService());
    }

    @Override // javax.inject.Provider
    public EnvironmentService get() {
        return providesEnvironmentService(this.module);
    }
}
