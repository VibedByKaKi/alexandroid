package com.amazon.alexa.hho.dependency;

import com.amazon.alexa.identity.api.IdentityService;
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
public final class ApplicationModule_ProvideIdentityServiceFactory implements Factory<IdentityService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideIdentityServiceFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideIdentityServiceFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideIdentityServiceFactory(applicationModule);
    }

    public static IdentityService provideIdentityService(ApplicationModule applicationModule) {
        return (IdentityService) Preconditions.checkNotNullFromProvides(applicationModule.provideIdentityService());
    }

    @Override // javax.inject.Provider
    public IdentityService get() {
        return provideIdentityService(this.module);
    }
}
