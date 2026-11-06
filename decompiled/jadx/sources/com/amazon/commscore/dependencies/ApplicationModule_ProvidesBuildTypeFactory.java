package com.amazon.commscore.dependencies;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.commscore.dependencies.annotation.BuildType"})
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesBuildTypeFactory implements Factory<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBuildTypeFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesBuildTypeFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesBuildTypeFactory(applicationModule);
    }

    public static String providesBuildType(ApplicationModule applicationModule) {
        return (String) Preconditions.checkNotNullFromProvides(applicationModule.providesBuildType());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesBuildType(this.module);
    }
}
