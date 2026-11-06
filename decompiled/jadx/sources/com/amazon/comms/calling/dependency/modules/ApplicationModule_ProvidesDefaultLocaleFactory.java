package com.amazon.comms.calling.dependency.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesDefaultLocaleFactory implements Factory<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDefaultLocaleFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDefaultLocaleFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDefaultLocaleFactory(applicationModule);
    }

    public static String providesDefaultLocale(ApplicationModule applicationModule) {
        return (String) Preconditions.checkNotNullFromProvides(applicationModule.providesDefaultLocale());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesDefaultLocale(this.module);
    }
}
