package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesContextFactory implements Factory<Context> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesContextFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesContextFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesContextFactory(applicationModule);
    }

    public static Context providesContext(ApplicationModule applicationModule) {
        return (Context) Preconditions.checkNotNullFromProvides(applicationModule.getContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.module);
    }
}
