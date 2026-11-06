package com.amazon.alexa.featureservice.dependencies;

import com.dee.app.http.CoralService;
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
public final class BaseModule_ProvidesCoralServiceFactory implements Factory<CoralService> {
    private final BaseModule module;

    public BaseModule_ProvidesCoralServiceFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesCoralServiceFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesCoralServiceFactory(baseModule);
    }

    public static CoralService providesCoralService(BaseModule baseModule) {
        return (CoralService) Preconditions.checkNotNullFromProvides(baseModule.providesCoralService());
    }

    @Override // javax.inject.Provider
    public CoralService get() {
        return providesCoralService(this.module);
    }
}
