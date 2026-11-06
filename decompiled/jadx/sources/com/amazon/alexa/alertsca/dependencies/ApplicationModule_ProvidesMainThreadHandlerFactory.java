package com.amazon.alexa.alertsca.dependencies;

import android.os.Handler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesMainThreadHandlerFactory implements Factory<Handler> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMainThreadHandlerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMainThreadHandlerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMainThreadHandlerFactory(applicationModule);
    }

    public static Handler providesMainThreadHandler(ApplicationModule applicationModule) {
        return (Handler) Preconditions.checkNotNullFromProvides(applicationModule.providesMainThreadHandler());
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return providesMainThreadHandler(this.module);
    }
}
