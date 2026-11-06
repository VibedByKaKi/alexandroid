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
public final class ApplicationModule_ProvidesClientIdFactory implements Factory<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesClientIdFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesClientIdFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesClientIdFactory(applicationModule);
    }

    public static String providesClientId(ApplicationModule applicationModule) {
        return (String) Preconditions.checkNotNullFromProvides(applicationModule.providesClientId());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesClientId(this.module);
    }
}
