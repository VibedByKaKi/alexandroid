package com.amazon.dee.app.dependencies;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideContextFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideContextFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideContextFactory(applicationModule);
    }

    public static Context provideContext(ApplicationModule applicationModule) {
        return (Context) Preconditions.checkNotNullFromProvides(applicationModule.provideContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
