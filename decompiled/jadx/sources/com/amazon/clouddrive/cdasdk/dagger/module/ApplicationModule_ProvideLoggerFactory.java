package com.amazon.clouddrive.cdasdk.dagger.module;

import com.amazon.clouddrive.cdasdk.util.Logger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvideLoggerFactory implements Factory<Logger> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideLoggerFactory(applicationModule);
    }

    public static Logger provideLogger(ApplicationModule applicationModule) {
        return (Logger) Preconditions.checkNotNullFromProvides(applicationModule.provideLogger());
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideLogger(this.module);
    }
}
