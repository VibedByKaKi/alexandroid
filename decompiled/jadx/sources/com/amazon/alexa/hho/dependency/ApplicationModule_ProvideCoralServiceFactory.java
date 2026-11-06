package com.amazon.alexa.hho.dependency;

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
/* loaded from: classes13.dex */
public final class ApplicationModule_ProvideCoralServiceFactory implements Factory<CoralService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCoralServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCoralServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCoralServiceFactory(applicationModule);
    }

    public static CoralService provideCoralService(ApplicationModule applicationModule) {
        return (CoralService) Preconditions.checkNotNullFromProvides(applicationModule.provideCoralService());
    }

    @Override // javax.inject.Provider
    public CoralService get() {
        return provideCoralService(this.module);
    }
}
