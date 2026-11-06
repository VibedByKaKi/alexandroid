package com.amazon.rtcsc.capabilityagent.common.dependencies;

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
/* loaded from: classes5.dex */
public final class ApplicationModule_ProvidesApplicationContextFactory implements Factory<Context> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesApplicationContextFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesApplicationContextFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesApplicationContextFactory(applicationModule);
    }

    public static Context providesApplicationContext(ApplicationModule applicationModule) {
        return (Context) Preconditions.checkNotNullFromProvides(applicationModule.providesApplicationContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesApplicationContext(this.module);
    }
}
